package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection$EL;
import j$.util.function.Predicate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Timer;
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
    private ArrayList<TranslateController.Language> allLanguages;
    private EmptyTextProgressView emptyView;
    private HashSet<String> firstSelectedLanguages;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private SharedPreferences preferences;
    private ListAdapter searchListViewAdapter;
    private ArrayList<TranslateController.Language> searchResult;
    private Timer searchTimer;
    private boolean searchWas;
    private boolean searching;
    private HashSet<String> selectedLanguages;
    private int separatorRow = -1;

    public static HashSet<String> getRestrictedLanguages() {
        return new HashSet<>(MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", new HashSet(Arrays.asList(LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode))));
    }

    @Override
    public boolean onFragmentCreate() {
        this.preferences = MessagesController.getGlobalMainSettings();
        this.firstSelectedLanguages = getRestrictedLanguages();
        this.selectedLanguages = getRestrictedLanguages();
        fillLanguages();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
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

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    public static boolean toggleLanguage(String str, boolean z) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        HashSet<String> restrictedLanguages = getRestrictedLanguages();
        if (!z) {
            restrictedLanguages.remove(lowerCase);
        } else {
            restrictedLanguages.add(lowerCase);
        }
        if (restrictedLanguages.size() == 1 && restrictedLanguages.contains(currentLocaleInfo.pluralLangCode)) {
            MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages").commit();
        } else {
            MessagesController.getGlobalMainSettings().edit().putStringSet("translate_button_restricted_languages", restrictedLanguages).commit();
        }
        TranslateController.invalidateSuggestedLanguageCodes();
        return true;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("DoNotTranslate", R.string.DoNotTranslate));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    RestrictedLanguagesSelectActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                RestrictedLanguagesSelectActivity.this.searching = true;
            }

            @Override
            public void onSearchCollapse() {
                RestrictedLanguagesSelectActivity.this.search(null);
                RestrictedLanguagesSelectActivity.this.searching = false;
                RestrictedLanguagesSelectActivity.this.searchWas = false;
                if (RestrictedLanguagesSelectActivity.this.listView != null) {
                    RestrictedLanguagesSelectActivity.this.emptyView.setVisibility(8);
                    RestrictedLanguagesSelectActivity.this.listView.setAdapter(RestrictedLanguagesSelectActivity.this.listAdapter);
                }
            }

            @Override
            public void onTextChanged(EditText editText) {
                String obj = editText.getText().toString();
                RestrictedLanguagesSelectActivity.this.search(obj);
                if (obj.length() != 0) {
                    RestrictedLanguagesSelectActivity.this.searchWas = true;
                    if (RestrictedLanguagesSelectActivity.this.listView != null) {
                        RestrictedLanguagesSelectActivity.this.listView.setAdapter(RestrictedLanguagesSelectActivity.this.searchListViewAdapter);
                        return;
                    }
                    return;
                }
                RestrictedLanguagesSelectActivity.this.searching = false;
                RestrictedLanguagesSelectActivity.this.searchWas = false;
                if (RestrictedLanguagesSelectActivity.this.listView != null) {
                    RestrictedLanguagesSelectActivity.this.emptyView.setVisibility(8);
                    RestrictedLanguagesSelectActivity.this.listView.setAdapter(RestrictedLanguagesSelectActivity.this.listAdapter);
                }
            }
        }).setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        this.listAdapter = new ListAdapter(context, false);
        this.searchListViewAdapter = new ListAdapter(context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString("NoResult", R.string.NoResult));
        this.emptyView.showTextView();
        this.emptyView.setShowAtCenter(true);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setEmptyView(this.emptyView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                RestrictedLanguagesSelectActivity.this.lambda$createView$1(view, i);
            }
        });
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

    public void lambda$createView$1(View view, int i) {
        ArrayList<TranslateController.Language> arrayList;
        if (getParentActivity() == null || this.parentLayout == null || !(view instanceof TextCheckbox2Cell)) {
            return;
        }
        int i2 = 0;
        boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
        TranslateController.Language language = null;
        if (z && (arrayList = this.searchResult) != null) {
            language = arrayList.get(i);
        } else {
            int i3 = this.separatorRow;
            if (i3 >= 0 && i > i3) {
                i--;
            }
            if (i >= 0 && i < this.allLanguages.size()) {
                language = this.allLanguages.get(i);
            }
        }
        if (language == null || language.code == null) {
            return;
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        final String str = language.code;
        if (this.selectedLanguages.contains(str)) {
            Collection$EL.removeIf(this.selectedLanguages, new Predicate() {
                @Override
                public Predicate and(Predicate predicate) {
                    return Objects.requireNonNull(predicate);
                }

                @Override
                public Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override
                public Predicate or(Predicate predicate) {
                    return Objects.requireNonNull(predicate);
                }

                @Override
                public final boolean test(Object obj) {
                    boolean lambda$createView$0;
                    lambda$createView$0 = RestrictedLanguagesSelectActivity.lambda$createView$0(str, (String) obj);
                    return lambda$createView$0;
                }
            });
        } else {
            this.selectedLanguages.add(str);
        }
        if (this.selectedLanguages.size() == 1 && this.selectedLanguages.contains(currentLocaleInfo.pluralLangCode)) {
            this.preferences.edit().remove("translate_button_restricted_languages").remove("translate_button_restricted_languages_changed").apply();
        } else {
            this.preferences.edit().putStringSet("translate_button_restricted_languages", this.selectedLanguages).putBoolean("translate_button_restricted_languages_changed", true).apply();
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

    public static boolean lambda$createView$0(String str, String str2) {
        return str2 != null && str2.equals(str);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.suggestedLangpack || this.listAdapter == null) {
            return;
        }
        fillLanguages();
        this.listAdapter.notifyDataSetChanged();
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
        this.separatorRow += arrayList.size();
        if (language != null) {
            this.allLanguages.add(0, language);
            this.separatorRow++;
        }
        if (this.separatorRow <= 0) {
            this.separatorRow = -1;
        }
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
            return;
        }
        try {
            Timer timer = this.searchTimer;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        processSearch(str);
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

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private boolean search;

        public ListAdapter(Context context, boolean z) {
            this.mContext = context;
            this.search = z;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public int getItemCount() {
            if (this.search) {
                if (RestrictedLanguagesSelectActivity.this.searchResult == null) {
                    return 0;
                }
                return RestrictedLanguagesSelectActivity.this.searchResult.size();
            }
            return (RestrictedLanguagesSelectActivity.this.separatorRow >= 0 ? 1 : 0) + RestrictedLanguagesSelectActivity.this.allLanguages.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextCheckbox2Cell textCheckbox2Cell;
            View view;
            if (i == 0) {
                TextCheckbox2Cell textCheckbox2Cell2 = new TextCheckbox2Cell(this.mContext);
                textCheckbox2Cell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCheckbox2Cell = textCheckbox2Cell2;
            } else if (i == 2) {
                HeaderCell headerCell = new HeaderCell(this.mContext);
                headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell.setText(LocaleController.getString("ChooseLanguages", R.string.ChooseLanguages));
                textCheckbox2Cell = headerCell;
            } else {
                view = new ShadowSectionCell(this.mContext);
                return new RecyclerListView.Holder(view);
            }
            view = textCheckbox2Cell;
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.RestrictedLanguagesSelectActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemViewType(int i) {
            return (!this.search && i == RestrictedLanguagesSelectActivity.this.separatorRow) ? 1 : 0;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{LanguageCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "actionBarDefaultSearch"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "actionBarDefaultSearchPlaceholder"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "emptyListPlaceholder"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"checkImage"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_addedIcon"));
        return arrayList;
    }

    public static void cleanup() {
        MessagesController.getGlobalMainSettings().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        checkRestrictedLanguages(false);
    }

    public static void checkRestrictedLanguages(boolean z) {
        boolean z2 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) != 2 || (z && !z2)) {
            getExtendedDoNotTranslate(RestrictedLanguagesSelectActivity$$ExternalSyntheticLambda6.INSTANCE);
        }
    }

    public static void lambda$checkRestrictedLanguages$2(HashSet hashSet) {
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        hashSet.addAll(getRestrictedLanguages());
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        if (hashSet.size() == 1 && TextUtils.equals((CharSequence) hashSet.iterator().next(), str)) {
            edit.remove("translate_button_restricted_languages");
        } else {
            edit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        edit.putInt("translate_button_restricted_languages_version", 2).apply();
        for (int i = 0; i < 4; i++) {
            try {
                MessagesController.getInstance(i).getTranslateController().checkRestrictedLanguagesUpdate();
            } catch (Exception unused) {
            }
        }
    }

    public static void getExtendedDoNotTranslate(final Utilities.Callback<HashSet<String>> callback) {
        if (callback == null) {
            return;
        }
        final HashSet hashSet = new HashSet();
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        Utilities.doCallbacks(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$3(hashSet, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$4(hashSet, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$5(hashMap, hashMap2, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                RestrictedLanguagesSelectActivity.lambda$getExtendedDoNotTranslate$6(hashSet, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Runnable runnable = (Runnable) obj;
                Utilities.Callback.this.run(hashSet);
            }
        });
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

    public static void lambda$getExtendedDoNotTranslate$5(HashMap hashMap, HashMap hashMap2, Runnable runnable) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
            ArrayList arrayList = new ArrayList();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                if (split.length >= 3) {
                    hashMap.put(split[2], split[1]);
                    if (hashMap2.containsKey(split[0]) && !"7".equals(split[0])) {
                        arrayList.add(split[0]);
                        hashMap2.remove(split[0]);
                    } else if (!arrayList.contains(split[0])) {
                        hashMap2.put(split[0], split[1]);
                    }
                }
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        runnable.run();
    }

    public static void lambda$getExtendedDoNotTranslate$6(HashSet hashSet, Runnable runnable) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
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
}
