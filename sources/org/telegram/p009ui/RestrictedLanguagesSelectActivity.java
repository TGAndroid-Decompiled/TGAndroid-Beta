package org.telegram.p009ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.LanguageCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextCheckbox2Cell;
import org.telegram.p009ui.Components.EmptyTextProgressView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import p008j$.util.Collection$EL;
import p008j$.util.function.Predicate;

public class RestrictedLanguagesSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private EmptyTextProgressView emptyView;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private SharedPreferences.OnSharedPreferenceChangeListener listener;
    private SharedPreferences preferences;
    private ListAdapter searchListViewAdapter;
    private ArrayList<LocaleController.LocaleInfo> searchResult;
    private Timer searchTimer;
    private boolean searchWas;
    private boolean searching;
    private HashSet<String> selectedLanguages = null;
    private ArrayList<LocaleController.LocaleInfo> sortedLanguages;

    public static HashSet<String> getRestrictedLanguages() {
        return new HashSet<>(MessagesController.getGlobalMainSettings().getStringSet("translate_button_restricted_languages", new HashSet()));
    }

    @Override
    public boolean onFragmentCreate() {
        this.preferences = MessagesController.getGlobalMainSettings();
        this.selectedLanguages = getRestrictedLanguages();
        SharedPreferences sharedPreferences = this.preferences;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public int langPos(String str) {
                if (str == null) {
                    return -1;
                }
                ArrayList arrayList = RestrictedLanguagesSelectActivity.this.searching ? RestrictedLanguagesSelectActivity.this.searchResult : RestrictedLanguagesSelectActivity.this.sortedLanguages;
                if (arrayList == null) {
                    return -1;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    if (str.equals(((LocaleController.LocaleInfo) arrayList.get(i)).pluralLangCode)) {
                        return i;
                    }
                }
                return -1;
            }

            @Override
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                RestrictedLanguagesSelectActivity.this.preferences = sharedPreferences2;
                HashSet<String> restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                if (!(RestrictedLanguagesSelectActivity.this.listView == null || RestrictedLanguagesSelectActivity.this.listView.getAdapter() == null)) {
                    RecyclerView.Adapter adapter = RestrictedLanguagesSelectActivity.this.listView.getAdapter();
                    int i = !RestrictedLanguagesSelectActivity.this.searching ? 1 : 0;
                    Iterator it = RestrictedLanguagesSelectActivity.this.selectedLanguages.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (!restrictedLanguages.contains(str2)) {
                            adapter.notifyItemChanged(langPos(str2) + i);
                        }
                    }
                    Iterator<String> it2 = restrictedLanguages.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (!RestrictedLanguagesSelectActivity.this.selectedLanguages.contains(next)) {
                            adapter.notifyItemChanged(langPos(next) + i);
                        }
                    }
                }
                RestrictedLanguagesSelectActivity.this.selectedLanguages = restrictedLanguages;
            }
        };
        this.listener = onSharedPreferenceChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        fillLanguages();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.preferences.unregisterOnSharedPreferenceChangeListener(this.listener);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override
    public View createView(Context context) {
        this.searching = false;
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("DoNotTranslate", C0952R.string.DoNotTranslate));
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    RestrictedLanguagesSelectActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.createMenu().addItem(0, C0952R.C0953drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
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
        }).setSearchFieldHint(LocaleController.getString("Search", C0952R.string.Search));
        this.listAdapter = new ListAdapter(context, false);
        this.searchListViewAdapter = new ListAdapter(context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString("NoResult", C0952R.string.NoResult));
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
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                boolean lambda$createView$3;
                lambda$createView$3 = RestrictedLanguagesSelectActivity.this.lambda$createView$3(view, i);
                return lambda$createView$3;
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
        LocaleController.LocaleInfo localeInfo;
        if (getParentActivity() != null && this.parentLayout != null && (view instanceof TextCheckbox2Cell)) {
            boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
            if (!z) {
                i--;
            }
            if (z) {
                localeInfo = this.searchResult.get(i);
            } else {
                localeInfo = this.sortedLanguages.get(i);
            }
            if (localeInfo != null) {
                LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                final String str = localeInfo.pluralLangCode;
                if (str == null || !str.equals(currentLocaleInfo.pluralLangCode)) {
                    boolean contains = this.selectedLanguages.contains(str);
                    HashSet hashSet = new HashSet(this.selectedLanguages);
                    if (contains) {
                        Collection$EL.removeIf(hashSet, new Predicate() {
                            @Override
                            public Predicate and(Predicate predicate) {
                                return predicate.getClass();
                            }

                            @Override
                            public Predicate negate() {
                                return Predicate.CC.$default$negate(this);
                            }

                            @Override
                            public Predicate mo11or(Predicate predicate) {
                                return predicate.getClass();
                            }

                            @Override
                            public final boolean test(Object obj) {
                                boolean lambda$createView$0;
                                lambda$createView$0 = RestrictedLanguagesSelectActivity.lambda$createView$0(str, (String) obj);
                                return lambda$createView$0;
                            }
                        });
                    } else {
                        hashSet.add(str);
                    }
                    if (hashSet.size() != 1 || !hashSet.contains(currentLocaleInfo.pluralLangCode)) {
                        this.preferences.edit().putStringSet("translate_button_restricted_languages", hashSet).apply();
                    } else {
                        this.preferences.edit().remove("translate_button_restricted_languages").apply();
                    }
                } else {
                    AndroidUtilities.shakeView(((TextCheckbox2Cell) view).checkbox, 2.0f, 0);
                }
            }
        }
    }

    public static boolean lambda$createView$0(String str, String str2) {
        return str2 != null && str2.equals(str);
    }

    public boolean lambda$createView$3(View view, int i) {
        final LocaleController.LocaleInfo localeInfo;
        if (!(getParentActivity() == null || this.parentLayout == null || !(view instanceof TextCheckbox2Cell))) {
            boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
            if (!z) {
                i--;
            }
            if (z) {
                localeInfo = this.searchResult.get(i);
            } else {
                localeInfo = this.sortedLanguages.get(i);
            }
            if (!(localeInfo == null || localeInfo.pathToFile == null || (localeInfo.isRemote() && localeInfo.serverIndex != Integer.MAX_VALUE))) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("DeleteLocalizationTitle", C0952R.string.DeleteLocalizationTitle));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", C0952R.string.DeleteLocalizationText, localeInfo.name)));
                builder.setPositiveButton(LocaleController.getString("Delete", C0952R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        RestrictedLanguagesSelectActivity.this.lambda$createView$2(localeInfo, dialogInterface, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                AlertDialog create = builder.create();
                showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
                return true;
            }
        }
        return false;
    }

    public void lambda$createView$2(LocaleController.LocaleInfo localeInfo, DialogInterface dialogInterface, int i) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, this.currentAccount)) {
            fillLanguages();
            ArrayList<LocaleController.LocaleInfo> arrayList = this.searchResult;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
            ListAdapter listAdapter2 = this.searchListViewAdapter;
            if (listAdapter2 != null) {
                listAdapter2.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.suggestedLangpack && this.listAdapter != null) {
            fillLanguages();
            this.listAdapter.notifyDataSetChanged();
        }
    }

    private void fillLanguages() {
        final LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        Comparator restrictedLanguagesSelectActivity$$ExternalSyntheticLambda2 = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$fillLanguages$4;
                lambda$fillLanguages$4 = RestrictedLanguagesSelectActivity.lambda$fillLanguages$4(LocaleController.LocaleInfo.this, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
                return lambda$fillLanguages$4;
            }
        };
        this.sortedLanguages = new ArrayList<>();
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i);
            if (!(localeInfo == null || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                this.sortedLanguages.add(localeInfo);
            }
        }
        Collections.sort(this.sortedLanguages, restrictedLanguagesSelectActivity$$ExternalSyntheticLambda2);
    }

    public static int lambda$fillLanguages$4(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, LocaleController.LocaleInfo localeInfo3) {
        if (localeInfo2 == localeInfo) {
            return -1;
        }
        if (localeInfo3 == localeInfo) {
            return 1;
        }
        int i = localeInfo2.serverIndex;
        int i2 = localeInfo3.serverIndex;
        if (i == i2) {
            return localeInfo2.name.compareTo(localeInfo3.name);
        }
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
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
            FileLog.m30e(e);
        }
        processSearch(str);
    }

    private void processSearch(String str) {
        if (str.trim().toLowerCase().length() == 0) {
            updateSearchResults(new ArrayList<>());
            return;
        }
        System.currentTimeMillis();
        ArrayList<LocaleController.LocaleInfo> arrayList = new ArrayList<>();
        int size = this.sortedLanguages.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = this.sortedLanguages.get(i);
            if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo);
            }
        }
        updateSearchResults(arrayList);
    }

    private void updateSearchResults(final ArrayList<LocaleController.LocaleInfo> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                RestrictedLanguagesSelectActivity.this.lambda$updateSearchResults$5(arrayList);
            }
        });
    }

    public void lambda$updateSearchResults$5(ArrayList arrayList) {
        this.searchResult = arrayList;
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
            if (!this.search) {
                return RestrictedLanguagesSelectActivity.this.sortedLanguages.size() + 1;
            }
            if (RestrictedLanguagesSelectActivity.this.searchResult == null) {
                return 0;
            }
            return RestrictedLanguagesSelectActivity.this.searchResult.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            TextCheckbox2Cell textCheckbox2Cell;
            if (i == 0) {
                TextCheckbox2Cell textCheckbox2Cell2 = new TextCheckbox2Cell(this.mContext);
                textCheckbox2Cell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textCheckbox2Cell = textCheckbox2Cell2;
            } else if (i != 2) {
                view = new ShadowSectionCell(this.mContext);
                return new RecyclerListView.Holder(view);
            } else {
                HeaderCell headerCell = new HeaderCell(this.mContext);
                headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                headerCell.setText(LocaleController.getString("ChooseLanguages", C0952R.string.ChooseLanguages));
                textCheckbox2Cell = headerCell;
            }
            view = textCheckbox2Cell;
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.RestrictedLanguagesSelectActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemViewType(int i) {
            if (!this.search) {
                i--;
            }
            return i == -1 ? 2 : 0;
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
}
