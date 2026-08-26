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
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import com.google.common.collect.Maps;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
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

public final class RestrictedLanguagesSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static boolean gotRestrictedLanguages;
    public static HashSet restrictedLanguages;
    public ArrayList allLanguages;
    public EmptyTextProgressView emptyView;
    public HashSet firstSelectedLanguages;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public ListAdapter searchListViewAdapter;
    public ArrayList searchResult;
    public HashSet selectedLanguages;
    public int separatorRow;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;
        public final boolean search;

        public ListAdapter(Context context, boolean z) {
            this.mContext = context;
            this.search = z;
        }

        @Override
        public final int getItemCount() {
            RestrictedLanguagesSelectActivity restrictedLanguagesSelectActivity = RestrictedLanguagesSelectActivity.this;
            if (!this.search) {
                return restrictedLanguagesSelectActivity.allLanguages.size() + (restrictedLanguagesSelectActivity.separatorRow >= 0 ? 1 : 0);
            }
            ArrayList arrayList = restrictedLanguagesSelectActivity.searchResult;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return (!this.search && i == RestrictedLanguagesSelectActivity.this.separatorRow) ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                return;
            }
            TextCheckbox2Cell textCheckbox2Cell = (TextCheckbox2Cell) view;
            RestrictedLanguagesSelectActivity restrictedLanguagesSelectActivity = RestrictedLanguagesSelectActivity.this;
            TranslateController.Language language = null;
            if (this.search) {
                if (i >= 0 && i < restrictedLanguagesSelectActivity.searchResult.size()) {
                    language = (TranslateController.Language) restrictedLanguagesSelectActivity.searchResult.get(i);
                }
                z = i == restrictedLanguagesSelectActivity.searchResult.size() - 1;
            } else {
                int i3 = restrictedLanguagesSelectActivity.separatorRow;
                if (i3 >= 0 && i > i3) {
                    i--;
                }
                if (i >= 0 && i < restrictedLanguagesSelectActivity.allLanguages.size()) {
                    TranslateController.Language language2 = (TranslateController.Language) restrictedLanguagesSelectActivity.allLanguages.get(i);
                    if (i == restrictedLanguagesSelectActivity.allLanguages.size() - 1) {
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
            textCheckbox2Cell.setChecked(restrictedLanguagesSelectActivity.selectedLanguages.contains(language.code));
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCheckbox2Cell;
            Context context = this.mContext;
            if (i == 0) {
                textCheckbox2Cell = new TextCheckbox2Cell(context);
            } else if (i != 2) {
                textCheckbox2Cell = new ShadowSectionCell(context, (Object) null);
            } else {
                HeaderCell headerCell = new HeaderCell(context);
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
        final int i = 1;
        final int i2 = 0;
        boolean z2 = MessagesController.getGlobalMainSettings().getBoolean("translate_button_restricted_languages_changed", false);
        final int i3 = 2;
        if (MessagesController.getGlobalMainSettings().getInt("translate_button_restricted_languages_version", 0) != 2 || (z && !z2)) {
            LinkEditActivity$$ExternalSyntheticLambda9 linkEditActivity$$ExternalSyntheticLambda9 = new LinkEditActivity$$ExternalSyntheticLambda9(6);
            final HashSet hashSet = new HashSet();
            Utilities.doCallbacks(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    switch (i2) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (TranslateAlert2.languageName(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (TranslateAlert2.languageName(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
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
                                            if (TranslateAlert2.languageName(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    switch (i) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (TranslateAlert2.languageName(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (TranslateAlert2.languageName(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
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
                                            if (TranslateAlert2.languageName(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    switch (i3) {
                        case 0:
                            HashSet hashSet2 = hashSet;
                            Runnable runnable = (Runnable) obj;
                            try {
                                String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
                                if (TranslateAlert2.languageName(str, null, null) != null) {
                                    hashSet2.add(str);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            runnable.run();
                            break;
                        case 1:
                            HashSet hashSet3 = hashSet;
                            Runnable runnable2 = (Runnable) obj;
                            try {
                                String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                                if (TranslateAlert2.languageName(language, null, null) != null) {
                                    hashSet3.add(language);
                                }
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            runnable2.run();
                            break;
                        default:
                            HashSet hashSet4 = hashSet;
                            Runnable runnable3 = (Runnable) obj;
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
                                            if (TranslateAlert2.languageName(locale, null, null) != null) {
                                                hashSet4.add(locale);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e3) {
                                FileLog.e(e3);
                            }
                            runnable3.run();
                            break;
                    }
                }
            }, new OAuthSheet$$ExternalSyntheticLambda13(23, linkEditActivity$$ExternalSyntheticLambda9, hashSet));
        }
    }

    public static HashSet getRestrictedLanguages() {
        if (!gotRestrictedLanguages) {
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", null);
            restrictedLanguages = stringSet != null ? new HashSet(stringSet) : null;
            gotRestrictedLanguages = true;
        }
        if (restrictedLanguages == null) {
            String[] strArr = {LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode};
            HashSet hashSetNewHashSetWithExpectedSize = Maps.newHashSetWithExpectedSize(1);
            Collections.addAll(hashSetNewHashSetWithExpectedSize, strArr);
            restrictedLanguages = hashSetNewHashSetWithExpectedSize;
        }
        return restrictedLanguages;
    }

    public static void updateRestrictedLanguages(Boolean bool, HashSet hashSet) {
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
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.DoNotTranslate));
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 20));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 17);
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.listAdapter = new ListAdapter(context, false);
        this.searchListViewAdapter = new ListAdapter(context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.showTextView();
        this.emptyView.setShowAtCenter(true);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.listView.setEmptyView(this.emptyView);
        zzku.m(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 4));
        this.listView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 7));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.suggestedLangpack || this.listAdapter == null) {
            return;
        }
        fillLanguages$1();
        this.listAdapter.mObservable.notifyChanged();
    }

    public final void fillLanguages$1() {
        this.allLanguages = TranslateController.getLanguages();
        String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.firstSelectedLanguages);
        TranslateController.Language language = null;
        int i = 0;
        while (i < this.allLanguages.size()) {
            TranslateController.Language language2 = (TranslateController.Language) this.allLanguages.get(i);
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

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$1$5(int i, View view) {
        TranslateController.Language language;
        int adapterPosition;
        int adapterPosition2;
        ArrayList arrayList;
        if (getParentActivity() == null || this.parentLayout == null || !(view instanceof TextCheckbox2Cell)) {
            return;
        }
        boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
        if (!z || (arrayList = this.searchResult) == null) {
            int i2 = this.separatorRow;
            if (i2 >= 0 && i > i2) {
                i--;
            }
            language = (i < 0 || i >= this.allLanguages.size()) ? null : (TranslateController.Language) this.allLanguages.get(i);
        } else {
            language = (TranslateController.Language) arrayList.get(i);
        }
        if (language == null || language.code == null) {
            return;
        }
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String str = language.code;
        if (this.selectedLanguages.contains(str)) {
            Collection.EL.removeIf(this.selectedLanguages, new LanguageSelectActivity$$ExternalSyntheticLambda9(str, 2));
        } else {
            this.selectedLanguages.add(str);
        }
        if (this.selectedLanguages.size() == 1 && this.selectedLanguages.contains(currentLocaleInfo.pluralLangCode)) {
            updateRestrictedLanguages(null, null);
        } else {
            updateRestrictedLanguages(Boolean.TRUE, this.selectedLanguages);
        }
        if (z) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < this.searchResult.size()) {
                if (TextUtils.equals(str, ((TranslateController.Language) this.searchResult.get(i3)).code)) {
                    RecyclerView.Adapter adapter = this.listView.getAdapter();
                    for (int i5 = 0; i5 < this.listView.getChildCount(); i5++) {
                        RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(this.listView.getChildAt(i5));
                        if (childViewHolder != null && (adapterPosition2 = childViewHolder.getAdapterPosition()) != -1 && adapterPosition2 == i4) {
                            adapter.onBindViewHolder(childViewHolder, i4);
                            break;
                        }
                    }
                }
                i3++;
                i4++;
            }
        } else {
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.allLanguages.size()) {
                if (i7 == this.separatorRow) {
                    i7++;
                }
                if (TextUtils.equals(str, ((TranslateController.Language) this.allLanguages.get(i6)).code)) {
                    RecyclerView.Adapter adapter2 = this.listView.getAdapter();
                    for (int i8 = 0; i8 < this.listView.getChildCount(); i8++) {
                        RecyclerView.ViewHolder childViewHolder2 = this.listView.getChildViewHolder(this.listView.getChildAt(i8));
                        if (childViewHolder2 != null && (adapterPosition = childViewHolder2.getAdapterPosition()) != -1 && adapterPosition == i7) {
                            adapter2.onBindViewHolder(childViewHolder2, i7);
                            break;
                        }
                    }
                }
                i6++;
                i7++;
            }
        }
        MessagesController.getInstance(this.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
    }

    @Override
    public final boolean onFragmentCreate() {
        this.firstSelectedLanguages = getRestrictedLanguages();
        this.selectedLanguages = getRestrictedLanguages();
        fillLanguages$1();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }
}
