package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Maps;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckbox2Cell;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TranslateAlert2;

public class RestrictedLanguagesSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int LAST_DO_NOT_TRANSLATE_VERSION = 2;
    private static boolean gotRestrictedLanguages;
    private static HashSet<String> restrictedLanguages;
    private ArrayList<TranslateController.Language> allLanguages;
    private EmptyTextProgressView emptyView;
    private HashSet<String> firstSelectedLanguages;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private ListAdapter searchListViewAdapter;
    private ArrayList<TranslateController.Language> searchResult;
    private HashSet<String> selectedLanguages;
    private int separatorRow;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private boolean search;

        public ListAdapter(Context context, boolean z) {
            this.mContext = context;
            this.search = z;
        }

        @Override
        public int getItemCount() {
            if (!this.search) {
                return RestrictedLanguagesSelectActivity.this.allLanguages.size() + (RestrictedLanguagesSelectActivity.this.separatorRow >= 0 ? 1 : 0);
            }
            if (RestrictedLanguagesSelectActivity.this.searchResult == null) {
                return 0;
            }
            return RestrictedLanguagesSelectActivity.this.searchResult.size();
        }

        @Override
        public int getItemViewType(int i) {
            return (!this.search && i == RestrictedLanguagesSelectActivity.this.separatorRow) ? 1 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                return;
            }
            TextCheckbox2Cell textCheckbox2Cell = (TextCheckbox2Cell) viewHolder.itemView;
            TranslateController.Language language = null;
            if (this.search) {
                if (i >= 0 && i < RestrictedLanguagesSelectActivity.this.searchResult.size()) {
                    language = (TranslateController.Language) RestrictedLanguagesSelectActivity.this.searchResult.get(i);
                }
                z = i == RestrictedLanguagesSelectActivity.this.searchResult.size() - 1;
            } else {
                if (RestrictedLanguagesSelectActivity.this.separatorRow >= 0 && i > RestrictedLanguagesSelectActivity.this.separatorRow) {
                    i--;
                }
                if (i >= 0 && i < RestrictedLanguagesSelectActivity.this.allLanguages.size()) {
                    TranslateController.Language language2 = (TranslateController.Language) RestrictedLanguagesSelectActivity.this.allLanguages.get(i);
                    if (i == RestrictedLanguagesSelectActivity.this.allLanguages.size() - 1) {
                        language = language2;
                    } else {
                        language = language2;
                    }
                }
            }
            if (language == null) {
                return;
            }
            String str = language.ownDisplayName;
            if (str == null) {
                str = language.displayName;
            }
            textCheckbox2Cell.setTextAndValue(str, language.displayName, false, !z);
            textCheckbox2Cell.setChecked(RestrictedLanguagesSelectActivity.this.selectedLanguages.contains(language.code));
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCheckbox2Cell;
            if (i == 0) {
                textCheckbox2Cell = new TextCheckbox2Cell(this.mContext);
            } else if (i != 2) {
                textCheckbox2Cell = new ShadowSectionCell(this.mContext, null, 0);
            } else {
                HeaderCell headerCell = new HeaderCell(this.mContext);
                headerCell.setText(LocaleController.getString(R.string.ChooseLanguages));
                textCheckbox2Cell = headerCell;
            }
            return new RecyclerListView.Holder(textCheckbox2Cell);
        }
    }

    public RestrictedLanguagesSelectActivity() {
        super(null);
        this.separatorRow = -1;
    }

    public static void checkRestrictedLanguages(boolean z) {
        boolean z2 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) != 2 || (z && !z2)) {
            getExtendedDoNotTranslate(new LinkEditActivity$$ExternalSyntheticLambda14(2));
        }
    }

    public static void cleanup() {
        invalidateRestrictedLanguages();
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        checkRestrictedLanguages(false);
    }

    private void fillLanguages() {
        this.allLanguages = TranslateController.getLanguages();
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.firstSelectedLanguages);
        TranslateController.Language language = null;
        int i = 0;
        while (i < this.allLanguages.size()) {
            TranslateController.Language language2 = this.allLanguages.get(i);
            if (TextUtils.equals(language2.code, str)) {
                arrayList2.remove(language2.code);
                this.allLanguages.remove(i);
                i--;
                language = language2;
            } else if (this.firstSelectedLanguages.contains(language2.code)) {
                arrayList.add(language2);
                arrayList2.remove(language2.code);
                this.allLanguages.remove(i);
                i--;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            TranslateController.Language language3 = new TranslateController.Language();
            String str2 = (String) arrayList2.get(i2);
            language3.code = str2;
            String upperCase = str2.toUpperCase();
            language3.displayName = upperCase;
            language3.ownDisplayName = upperCase;
            language3.q = language3.code.toLowerCase();
            arrayList.add(language3);
        }
        this.separatorRow = 0;
        this.allLanguages.addAll(0, arrayList);
        this.separatorRow = arrayList.size() + this.separatorRow;
        if (language != null) {
            this.allLanguages.add(0, language);
            this.separatorRow++;
        }
        if (this.separatorRow <= 0) {
            this.separatorRow = -1;
        }
    }

    public static void getExtendedDoNotTranslate(Utilities.Callback<HashSet<String>> callback) {
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        if (callback == null) {
            return;
        }
        final HashSet hashSet = new HashSet();
        Utilities.doCallbacks(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i3) {
                    case 0:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$3(hashSet, (Runnable) obj);
                        break;
                    case 1:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$4(hashSet, (Runnable) obj);
                        break;
                    default:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$5(hashSet, (Runnable) obj);
                        break;
                }
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i2) {
                    case 0:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$3(hashSet, (Runnable) obj);
                        break;
                    case 1:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$4(hashSet, (Runnable) obj);
                        break;
                    default:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$5(hashSet, (Runnable) obj);
                        break;
                }
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                switch (i) {
                    case 0:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$3(hashSet, (Runnable) obj);
                        break;
                    case 1:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$4(hashSet, (Runnable) obj);
                        break;
                    default:
                        RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$5(hashSet, (Runnable) obj);
                        break;
                }
            }
        }, new OAuthSheet$$ExternalSyntheticLambda1(29, callback, hashSet));
    }

    public static HashSet<String> getRestrictedLanguages() {
        if (!gotRestrictedLanguages) {
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            restrictedLanguages = stringSet != null ? new HashSet<>(stringSet) : null;
            gotRestrictedLanguages = true;
        }
        if (restrictedLanguages == null) {
            String[] strArr = {LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode};
            HashSet<String> hashSetNewHashSetWithExpectedSize = Maps.newHashSetWithExpectedSize(1);
            Collections.addAll(hashSetNewHashSetWithExpectedSize, strArr);
            restrictedLanguages = hashSetNewHashSetWithExpectedSize;
        }
        return restrictedLanguages;
    }

    public static void invalidateRestrictedLanguages() {
        gotRestrictedLanguages = false;
    }

    public static void lambda$checkRestrictedLanguages$2(HashSet hashSet) {
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        hashSet.addAll(getRestrictedLanguages());
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
            editorEdit.remove("translate_button_restricted_languages");
        } else {
            editorEdit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        editorEdit.putInt("translate_button_restricted_languages_version", 2).apply();
        invalidateRestrictedLanguages();
        for (int i = 0; i < 4; i++) {
            try {
                MessagesController.getInstance(i).getTranslateController().checkRestrictedLanguagesUpdate();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean lambda$createView$0(String str, String str2) {
        return str2 != null && str2.equals(str);
    }

    public void lambda$createView$1(View view, int i) {
        TranslateController.Language language;
        ArrayList<TranslateController.Language> arrayList;
        if (getParentActivity() == null || this.parentLayout == null || !(view instanceof TextCheckbox2Cell)) {
            return;
        }
        int i2 = 0;
        boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
        if (!z || (arrayList = this.searchResult) == null) {
            int i3 = this.separatorRow;
            if (i3 >= 0 && i > i3) {
                i--;
            }
            language = (i < 0 || i >= this.allLanguages.size()) ? null : this.allLanguages.get(i);
        } else {
            language = arrayList.get(i);
        }
        if (language == null || language.code == null) {
            return;
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String str = language.code;
        if (this.selectedLanguages.contains(str)) {
            Collection.EL.removeIf(this.selectedLanguages, new ChatActivity$$ExternalSyntheticLambda425(str, 3));
        } else {
            this.selectedLanguages.add(str);
        }
        if (this.selectedLanguages.size() == 1 && this.selectedLanguages.contains(currentLocaleInfo.pluralLangCode)) {
            updateRestrictedLanguages(null, null);
        } else {
            updateRestrictedLanguages(this.selectedLanguages, Boolean.TRUE);
        }
        if (z) {
            int i4 = 0;
            while (i2 < this.searchResult.size()) {
                if (TextUtils.equals(str, this.searchResult.get(i2).code)) {
                    rebind(i4);
                }
                i2++;
                i4++;
            }
        } else {
            int i5 = 0;
            while (i2 < this.allLanguages.size()) {
                if (i5 == this.separatorRow) {
                    i5++;
                }
                if (TextUtils.equals(str, this.allLanguages.get(i2).code)) {
                    rebind(i5);
                }
                i2++;
                i5++;
            }
        }
        MessagesController.getInstance(this.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
    }

    public static void lambda$getExtendedDoNotTranslate$3(HashSet hashSet, Runnable runnable) {
        try {
            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
            if (TranslateAlert2.languageName(str) != null) {
                hashSet.add(str);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        runnable.run();
    }

    public static void lambda$getExtendedDoNotTranslate$4(HashSet hashSet, Runnable runnable) {
        try {
            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
            if (TranslateAlert2.languageName(language) != null) {
                hashSet.add(language);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        runnable.run();
    }

    public static void lambda$getExtendedDoNotTranslate$5(HashSet hashSet, Runnable runnable) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
            Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
            while (it.hasNext()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (locale != null && locale.contains("_")) {
                            locale = locale.split("_")[0];
                        }
                        if (TranslateAlert2.languageName(locale) != null) {
                            hashSet.add(locale);
                        }
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        runnable.run();
    }

    private void processSearch(String str) {
        String lowerCase = str.trim().toLowerCase();
        ArrayList<TranslateController.Language> arrayList = this.searchResult;
        if (arrayList == null) {
            this.searchResult = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        for (int i = 0; i < this.allLanguages.size(); i++) {
            TranslateController.Language language = this.allLanguages.get(i);
            if (language.q.startsWith(lowerCase)) {
                this.searchResult.add(0, language);
            } else if (language.q.contains(lowerCase)) {
                this.searchResult.add(language);
            }
        }
        this.searchListViewAdapter.notifyDataSetChanged();
    }

    private void rebind(int i) {
        int adapterPosition;
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(this.listView.getChildAt(i2));
            if (childViewHolder != null && (adapterPosition = childViewHolder.getAdapterPosition()) != -1 && adapterPosition == i) {
                adapter.onBindViewHolder(childViewHolder, i);
                return;
            }
        }
    }

    public static boolean toggleLanguage(String str, boolean z) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        HashSet<String> restrictedLanguages2 = getRestrictedLanguages();
        if (z) {
            restrictedLanguages2.add(lowerCase);
        } else {
            restrictedLanguages2.remove(lowerCase);
        }
        if (restrictedLanguages2.size() == 1 && restrictedLanguages2.contains(currentLocaleInfo.pluralLangCode)) {
            updateRestrictedLanguages(null, Boolean.FALSE);
        } else {
            updateRestrictedLanguages(restrictedLanguages2, Boolean.FALSE);
        }
        TranslateController.invalidateSuggestedLanguageCodes();
        return true;
    }

    public static void updateRestrictedLanguages(HashSet<String> hashSet, Boolean bool) {
        restrictedLanguages = hashSet;
        gotRestrictedLanguages = true;
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        if (hashSet == null) {
            editorEdit.remove("translate_button_restricted_languages");
        } else {
            editorEdit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        if (bool == null) {
            editorEdit.remove("translate_button_restricted_languages_changed");
        } else if (bool.booleanValue()) {
            editorEdit.putBoolean("translate_button_restricted_languages_changed", true);
        }
        editorEdit.apply();
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.DoNotTranslate));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    RestrictedLanguagesSelectActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                RestrictedLanguagesSelectActivity.this.search(null);
                if (RestrictedLanguagesSelectActivity.this.listView != null) {
                    RestrictedLanguagesSelectActivity.this.emptyView.setVisibility(8);
                    RestrictedLanguagesSelectActivity.this.listView.setAdapter(RestrictedLanguagesSelectActivity.this.listAdapter);
                }
            }

            @Override
            public void onSearchExpand() {
            }

            @Override
            public void onTextChanged(EditText editText) {
                String string = editText.getText().toString();
                RestrictedLanguagesSelectActivity.this.search(string);
                if (string.length() != 0) {
                    if (RestrictedLanguagesSelectActivity.this.listView != null) {
                        RestrictedLanguagesSelectActivity.this.listView.setAdapter(RestrictedLanguagesSelectActivity.this.searchListViewAdapter);
                    }
                } else if (RestrictedLanguagesSelectActivity.this.listView != null) {
                    RestrictedLanguagesSelectActivity.this.emptyView.setVisibility(8);
                    RestrictedLanguagesSelectActivity.this.listView.setAdapter(RestrictedLanguagesSelectActivity.this.listAdapter);
                }
            }
        }).setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.listAdapter = new ListAdapter(context, false);
        this.searchListViewAdapter = new ListAdapter(context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.showTextView();
        this.emptyView.setShowAtCenter(true);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.listView.setEmptyView(this.emptyView);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda11(this, 5));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AndroidUtilities.hideKeyboard(RestrictedLanguagesSelectActivity.this.getParentActivity().getCurrentFocus());
                }
            }
        });
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.suggestedLangpack || this.listAdapter == null) {
            return;
        }
        fillLanguages();
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{LanguageCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView2"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"checkImage"}, null, null, -1, null, Theme.key_featuredStickers_addedIcon));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onFragmentCreate() {
        this.firstSelectedLanguages = getRestrictedLanguages();
        this.selectedLanguages = getRestrictedLanguages();
        fillLanguages();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void search(String str) {
        if (str == null) {
            this.searchResult = null;
        } else {
            processSearch(str);
        }
    }
}
