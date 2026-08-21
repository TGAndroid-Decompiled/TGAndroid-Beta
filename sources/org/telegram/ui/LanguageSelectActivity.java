package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.function.Predicate;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextRadioCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TranslateAlert2;

public class LanguageSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private EmptyTextProgressView emptyView;
    private int infoPosition1;
    private int languagesStartsPosition;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private ActionBarMenuItem searchItem;
    private ListAdapter searchListViewAdapter;
    private ArrayList searchResult;
    private boolean searchWas;
    private boolean searching;
    private ArrayList sortedLanguages;
    private ArrayList unofficialLanguages;
    private int settingsFromPosition = -1;
    private int settingsToPosition = -1;
    private int manualTranslationPosition = -1;
    private int autoTranslationPosition = -1;
    private int doNotTranslatePosition = -1;

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onFragmentCreate() {
        fillLanguages();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override
    public View createView(Context context) {
        this.searching = false;
        this.searchWas = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isRightLayout()) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    LanguageSelectActivity.this.finishFragment();
                }
            }
        });
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                LanguageSelectActivity.this.searching = true;
            }

            @Override
            public void onSearchCollapse() {
                LanguageSelectActivity.this.search(null);
                LanguageSelectActivity.this.searching = false;
                LanguageSelectActivity.this.searchWas = false;
                if (LanguageSelectActivity.this.listView != null) {
                    LanguageSelectActivity.this.emptyView.setVisibility(8);
                    LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.listAdapter);
                }
            }

            @Override
            public void onTextChanged(EditText editText) {
                String string = editText.getText().toString();
                LanguageSelectActivity.this.search(string);
                if (string.length() != 0) {
                    LanguageSelectActivity.this.searchWas = true;
                    if (LanguageSelectActivity.this.listView != null) {
                        LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.searchListViewAdapter);
                        return;
                    }
                    return;
                }
                LanguageSelectActivity.this.searching = false;
                LanguageSelectActivity.this.searchWas = false;
                if (LanguageSelectActivity.this.listView != null) {
                    LanguageSelectActivity.this.emptyView.setVisibility(8);
                    LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.listAdapter);
                }
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.listAdapter = new ListAdapter(context, false);
        this.searchListViewAdapter = new ListAdapter(context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
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
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                LanguageSelectActivity.this.listView.invalidate();
                LanguageSelectActivity.this.listView.updateSelector();
            }
        };
        defaultItemAnimator.setDurations(400L);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.listView.setItemAnimator(defaultItemAnimator);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                LanguageSelectActivity.$r8$lambda$VwWD0TLST9FQVPPl1gX3WWTnqGg(this.f$0, view, i);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                return LanguageSelectActivity.$r8$lambda$alXUWLNsA1jGQ0KCopCOVKfYbeU(this.f$0, view, i);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AndroidUtilities.hideKeyboard(LanguageSelectActivity.this.getParentActivity().getCurrentFocus());
                }
            }
        });
        return this.fragmentView;
    }

    public static void $r8$lambda$VwWD0TLST9FQVPPl1gX3WWTnqGg(final LanguageSelectActivity languageSelectActivity, View view, int i) {
        LocaleController.LocaleInfo localeInfo;
        languageSelectActivity.getClass();
        try {
            final boolean z = true;
            if (view instanceof TextCheckCell) {
                boolean z2 = languageSelectActivity.getContextValue() || languageSelectActivity.getChatValue();
                if (i == languageSelectActivity.manualTranslationPosition) {
                    boolean z3 = !languageSelectActivity.getContextValue();
                    languageSelectActivity.getMessagesController().getTranslateController().setContextTranslateEnabled(z3);
                    ((TextCheckCell) view).setChecked(z3);
                    NotificationCenter.getInstance(languageSelectActivity.currentAccount).postNotificationName(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (i == languageSelectActivity.autoTranslationPosition) {
                    boolean chatValue = languageSelectActivity.getChatValue();
                    boolean z4 = !chatValue;
                    if (!chatValue && !languageSelectActivity.getUserConfig().isPremium()) {
                        languageSelectActivity.showDialog(new PremiumFeatureBottomSheet(languageSelectActivity, 13, false));
                        return;
                    } else {
                        languageSelectActivity.getMessagesController().getTranslateController().setChatTranslateEnabled(z4);
                        NotificationCenter.getInstance(languageSelectActivity.currentAccount).postNotificationName(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((TextCheckCell) view).setChecked(z4);
                    }
                }
                boolean z5 = languageSelectActivity.getContextValue() || languageSelectActivity.getChatValue();
                if (z5 != z2) {
                    int i2 = languageSelectActivity.autoTranslationPosition;
                    if (i2 < 0) {
                        i2 = languageSelectActivity.manualTranslationPosition;
                    }
                    TextCheckCell textCheckCell = null;
                    for (int i3 = 0; i3 < languageSelectActivity.listView.getChildCount(); i3++) {
                        View childAt = languageSelectActivity.listView.getChildAt(i3);
                        if (languageSelectActivity.listView.getChildAdapterPosition(childAt) == i2 && (childAt instanceof TextCheckCell)) {
                            textCheckCell = (TextCheckCell) childAt;
                        }
                    }
                    if (textCheckCell != null) {
                        textCheckCell.setDivider(z5);
                    }
                    if (z5) {
                        languageSelectActivity.listAdapter.notifyItemInserted(i2 + 1);
                        return;
                    } else {
                        languageSelectActivity.listAdapter.notifyItemRemoved(i2 + 1);
                        return;
                    }
                }
                return;
            }
            if (view instanceof TextSettingsCell) {
                languageSelectActivity.presentFragment(new RestrictedLanguagesSelectActivity());
                return;
            }
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof TextRadioCell)) {
                boolean z6 = languageSelectActivity.listView.getAdapter() == languageSelectActivity.searchListViewAdapter;
                if (!z6) {
                    i -= languageSelectActivity.languagesStartsPosition;
                }
                if (z6) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.searchResult.get(i);
                } else if (!languageSelectActivity.unofficialLanguages.isEmpty() && i >= 0 && i < languageSelectActivity.unofficialLanguages.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.unofficialLanguages.get(i);
                } else {
                    if (!languageSelectActivity.unofficialLanguages.isEmpty()) {
                        i -= languageSelectActivity.unofficialLanguages.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.sortedLanguages.get(i);
                }
                LocaleController.LocaleInfo localeInfo2 = localeInfo;
                if (localeInfo2 != null) {
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    if (currentLocaleInfo != localeInfo2) {
                        z = false;
                    }
                    final AlertDialog alertDialog = new AlertDialog(languageSelectActivity.getContext(), 3);
                    if (!z) {
                        alertDialog.showDelayed(500L);
                    }
                    languageSelectActivity.getMessagesController().getTranslateController().reset();
                    final int iApplyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, languageSelectActivity.currentAccount, new Runnable() {
                        @Override
                        public final void run() {
                            LanguageSelectActivity.$r8$lambda$HCh4amaV5Bczi73xUmgNfiacZr0(this.f$0, alertDialog, z);
                        }
                    });
                    if (iApplyLanguage != 0) {
                        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                            @Override
                            public final void onCancel(DialogInterface dialogInterface) {
                                ConnectionsManager.getInstance(this.f$0.currentAccount).cancelRequest(iApplyLanguage, true);
                            }
                        });
                    }
                    String str = localeInfo2.pluralLangCode;
                    final String str2 = currentLocaleInfo.pluralLangCode;
                    HashSet restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                    HashSet hashSet = new HashSet(restrictedLanguages);
                    if (restrictedLanguages.contains(str2) && !restrictedLanguages.contains(str)) {
                        Collection.EL.removeIf(hashSet, new Predicate() {
                            public Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            public Predicate negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override
                            public final boolean test(Object obj) {
                                return LanguageSelectActivity.m3343$r8$lambda$mPoukI7YM3gn8zCN1ToTeZn9SI(str2, (String) obj);
                            }
                        });
                    }
                    if (str != null && !"null".equals(str)) {
                        hashSet.add(str);
                    }
                    RestrictedLanguagesSelectActivity.updateRestrictedLanguages(hashSet, Boolean.FALSE);
                    MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
                    MessagesController.getInstance(languageSelectActivity.currentAccount).getTranslateController().cleanup();
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$HCh4amaV5Bczi73xUmgNfiacZr0(final LanguageSelectActivity languageSelectActivity, AlertDialog alertDialog, boolean z) {
        languageSelectActivity.getClass();
        alertDialog.dismiss();
        if (z) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LanguageSelectActivity.m3342$r8$lambda$iqThVjWIji3sgJXpW1Cb6s6d7U(this.f$0);
            }
        }, 10L);
    }

    public static void m3342$r8$lambda$iqThVjWIji3sgJXpW1Cb6s6d7U(LanguageSelectActivity languageSelectActivity) {
        languageSelectActivity.actionBar.closeSearchField();
        languageSelectActivity.updateLanguage();
    }

    public static boolean m3343$r8$lambda$mPoukI7YM3gn8zCN1ToTeZn9SI(String str, String str2) {
        return str2 != null && str2.equals(str);
    }

    public static boolean $r8$lambda$alXUWLNsA1jGQ0KCopCOVKfYbeU(final LanguageSelectActivity languageSelectActivity, View view, int i) {
        final LocaleController.LocaleInfo localeInfo;
        languageSelectActivity.getClass();
        try {
            if (languageSelectActivity.getParentActivity() != null && languageSelectActivity.parentLayout != null && (view instanceof TextRadioCell)) {
                boolean z = languageSelectActivity.listView.getAdapter() == languageSelectActivity.searchListViewAdapter;
                if (!z) {
                    i -= languageSelectActivity.languagesStartsPosition;
                }
                if (z) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.searchResult.get(i);
                } else if (!languageSelectActivity.unofficialLanguages.isEmpty() && i >= 0 && i < languageSelectActivity.unofficialLanguages.size()) {
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.unofficialLanguages.get(i);
                } else {
                    if (!languageSelectActivity.unofficialLanguages.isEmpty()) {
                        i -= languageSelectActivity.unofficialLanguages.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.sortedLanguages.get(i);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(languageSelectActivity.getParentActivity());
                    builder.setTitle(LocaleController.getString(R.string.DeleteLocalizationTitle));
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name)));
                    builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i2) {
                            LanguageSelectActivity.m3344$r8$lambda$qeLaUgj2LpYsPe4F6TWW1i7ByY(this.f$0, localeInfo, alertDialog, i2);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    AlertDialog alertDialogCreate = builder.create();
                    languageSelectActivity.showDialog(alertDialogCreate);
                    TextView textView = (TextView) alertDialogCreate.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m3344$r8$lambda$qeLaUgj2LpYsPe4F6TWW1i7ByY(LanguageSelectActivity languageSelectActivity, LocaleController.LocaleInfo localeInfo, AlertDialog alertDialog, int i) {
        languageSelectActivity.getClass();
        if (LocaleController.getInstance().deleteLanguage(localeInfo, languageSelectActivity.currentAccount)) {
            languageSelectActivity.fillLanguages();
            ArrayList arrayList = languageSelectActivity.searchResult;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            ListAdapter listAdapter = languageSelectActivity.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
            ListAdapter listAdapter2 = languageSelectActivity.searchListViewAdapter;
            if (listAdapter2 != null) {
                listAdapter2.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.suggestedLangpack || this.listAdapter == null) {
            return;
        }
        fillLanguages();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.listAdapter.notifyDataSetChanged();
            }
        });
    }

    private void fillLanguages() {
        final LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        Comparator comparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return LanguageSelectActivity.m3341$r8$lambda$_FbdPmeWIkGDvFCvZ_P2xG0b2M(currentLocaleInfo, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
            }
        };
        this.sortedLanguages = new ArrayList();
        this.unofficialLanguages = new ArrayList(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.sortedLanguages.add(localeInfo);
            } else {
                this.unofficialLanguages.add(localeInfo);
            }
        }
        Collections.sort(this.sortedLanguages, comparator);
        Collections.sort(this.unofficialLanguages, comparator);
    }

    public static int m3341$r8$lambda$_FbdPmeWIkGDvFCvZ_P2xG0b2M(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, LocaleController.LocaleInfo localeInfo3) {
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
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new Runnable() {
            @Override
            public final void run() {
                LanguageSelectActivity.$r8$lambda$t7_hq5XPK5zjqVv79DMvDwuCuqY(this.f$0);
            }
        });
    }

    public static void $r8$lambda$t7_hq5XPK5zjqVv79DMvDwuCuqY(LanguageSelectActivity languageSelectActivity) {
        if (languageSelectActivity.isPaused) {
            return;
        }
        languageSelectActivity.updateLanguage();
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
            this.searching = false;
            this.searchResult = null;
            if (this.listView != null) {
                this.emptyView.setVisibility(8);
                this.listView.setAdapter(this.listAdapter);
                return;
            }
            return;
        }
        processSearch(str);
    }

    private void updateLanguage() {
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.setTitleAnimated(string, true, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyItemRangeChanged(0, listAdapter.getItemCount());
        }
    }

    private void processSearch(final String str) {
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LanguageSelectActivity.$r8$lambda$swV0XwFoFGkFlBtJnXOEZ1ApbN4(this.f$0, str);
            }
        });
    }

    public static void $r8$lambda$swV0XwFoFGkFlBtJnXOEZ1ApbN4(LanguageSelectActivity languageSelectActivity, String str) {
        languageSelectActivity.getClass();
        if (str.trim().toLowerCase().length() == 0) {
            languageSelectActivity.updateSearchResults(new ArrayList());
            return;
        }
        System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        int size = languageSelectActivity.unofficialLanguages.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.unofficialLanguages.get(i);
            if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo);
            }
        }
        int size2 = languageSelectActivity.sortedLanguages.size();
        for (int i2 = 0; i2 < size2; i2++) {
            LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity.sortedLanguages.get(i2);
            if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo2);
            }
        }
        languageSelectActivity.updateSearchResults(arrayList);
    }

    private void updateSearchResults(final ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LanguageSelectActivity.$r8$lambda$37MHR5Vz4zim4AMCgsLqUcpMqdk(this.f$0, arrayList);
            }
        });
    }

    public static void $r8$lambda$37MHR5Vz4zim4AMCgsLqUcpMqdk(LanguageSelectActivity languageSelectActivity, ArrayList arrayList) {
        languageSelectActivity.searchResult = arrayList;
        languageSelectActivity.searchListViewAdapter.notifyDataSetChanged();
    }

    public boolean getContextValue() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public boolean getChatValue() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private boolean search;

        public ListAdapter(Context context, boolean z) {
            this.mContext = context;
            this.search = z;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 4 || itemViewType == 5 || itemViewType == 2;
        }

        @Override
        public int getItemCount() {
            int i;
            if (this.search) {
                if (LanguageSelectActivity.this.searchResult == null) {
                    return 0;
                }
                return LanguageSelectActivity.this.searchResult.size();
            }
            if (LanguageSelectActivity.this.getMessagesController().isTranslationsManualEnabled() || LanguageSelectActivity.this.getMessagesController().isTranslationsAutoEnabled()) {
                int i2 = LanguageSelectActivity.this.getMessagesController().isTranslationsManualEnabled() ? 3 : 2;
                if (LanguageSelectActivity.this.getMessagesController().isTranslationsAutoEnabled() && !LanguageSelectActivity.this.getMessagesController().premiumFeaturesBlocked()) {
                    i2++;
                }
                if (LanguageSelectActivity.this.getChatValue() || LanguageSelectActivity.this.getContextValue()) {
                    i2++;
                }
                i = i2 + 1;
            } else {
                i = 1;
            }
            int size = i + 1 + LanguageSelectActivity.this.sortedLanguages.size();
            return !LanguageSelectActivity.this.unofficialLanguages.isEmpty() ? size + LanguageSelectActivity.this.unofficialLanguages.size() + 1 : size;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textRadioCell;
            if (i == 0) {
                textRadioCell = new TextRadioCell(this.mContext);
            } else if (i == 2) {
                textRadioCell = new TextCheckCell(this.mContext);
            } else if (i == 3) {
                textRadioCell = new HeaderCell(this.mContext);
            } else if (i == 4 || i == 5) {
                textRadioCell = new TextSettingsCell(this.mContext);
            } else if (i == 6) {
                textRadioCell = new TextInfoPrivacyCell(this.mContext);
            } else {
                textRadioCell = new ShadowSectionCell(this.mContext);
            }
            return new RecyclerListView.Holder(textRadioCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof TextRadioCell) {
                ((TextRadioCell) view).updateRTL();
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            LocaleController.LocaleInfo localeInfo = null;
            charSequenceCapitalFirst = null;
            CharSequence charSequenceCapitalFirst = null;
            localeInfo = null;
            localeInfo = null;
            localeInfo = null;
            boolean z2 = true;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    if (!this.search) {
                        i -= LanguageSelectActivity.this.languagesStartsPosition;
                    }
                    TextRadioCell textRadioCell = (TextRadioCell) viewHolder.itemView;
                    textRadioCell.updateRTL();
                    if (this.search) {
                        if (i >= 0 && i < LanguageSelectActivity.this.searchResult.size()) {
                            localeInfo = (LocaleController.LocaleInfo) LanguageSelectActivity.this.searchResult.get(i);
                        }
                        if (i == LanguageSelectActivity.this.searchResult.size() - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else if (LanguageSelectActivity.this.unofficialLanguages.isEmpty() || i < 0 || i >= LanguageSelectActivity.this.unofficialLanguages.size()) {
                        if (!LanguageSelectActivity.this.unofficialLanguages.isEmpty()) {
                            i -= LanguageSelectActivity.this.unofficialLanguages.size() + 1;
                        }
                        if (i >= 0 && i < LanguageSelectActivity.this.sortedLanguages.size()) {
                            localeInfo = (LocaleController.LocaleInfo) LanguageSelectActivity.this.sortedLanguages.get(i);
                        }
                        if (i == LanguageSelectActivity.this.sortedLanguages.size() - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        localeInfo = (LocaleController.LocaleInfo) LanguageSelectActivity.this.unofficialLanguages.get(i);
                        if (i == LanguageSelectActivity.this.unofficialLanguages.size() - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (localeInfo != null) {
                        if (localeInfo.isLocal()) {
                            textRadioCell.setTextAndValueAndCheck(String.format("%1$s (%2$s)", localeInfo.name, LocaleController.getString(R.string.LanguageCustom)), localeInfo.nameEnglish, false, false, !z);
                        } else {
                            textRadioCell.setTextAndValueAndCheck(localeInfo.name, localeInfo.nameEnglish, false, false, !z);
                        }
                    }
                    textRadioCell.setChecked(localeInfo == LocaleController.getInstance().getCurrentLocaleInfo());
                    break;
                case 1:
                    if (!this.search) {
                        i--;
                    }
                    ShadowSectionCell shadowSectionCell = (ShadowSectionCell) viewHolder.itemView;
                    if (!LanguageSelectActivity.this.unofficialLanguages.isEmpty() && i == LanguageSelectActivity.this.unofficialLanguages.size()) {
                        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    } else {
                        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    }
                    break;
                case 2:
                    TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                    textCheckCell.updateRTL();
                    if (i == LanguageSelectActivity.this.manualTranslationPosition) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ShowTranslateButton), LanguageSelectActivity.this.getContextValue(), true);
                        textCheckCell.setCheckBoxIcon(0);
                    } else if (i == LanguageSelectActivity.this.autoTranslationPosition) {
                        String string = LocaleController.getString(R.string.ShowTranslateChatButton);
                        boolean chatValue = LanguageSelectActivity.this.getChatValue();
                        if (!LanguageSelectActivity.this.getContextValue() && !LanguageSelectActivity.this.getChatValue()) {
                            z2 = false;
                        }
                        textCheckCell.setTextAndCheck(string, chatValue, z2);
                        textCheckCell.setCheckBoxIcon(LanguageSelectActivity.this.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    }
                    break;
                case 3:
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString((i == 0 && (LanguageSelectActivity.this.getMessagesController().isTranslationsManualEnabled() || LanguageSelectActivity.this.getMessagesController().isTranslationsAutoEnabled())) ? R.string.TranslateMessages : R.string.Language));
                    break;
                case 4:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    textSettingsCell.updateRTL();
                    HashSet<String> restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                    String string2 = LocaleController.getString(R.string.DoNotTranslate);
                    try {
                        boolean[] zArr = new boolean[1];
                        if (restrictedLanguages.size() == 0) {
                            charSequenceCapitalFirst = "";
                        } else if (restrictedLanguages.size() == 1) {
                            charSequenceCapitalFirst = TranslateAlert2.capitalFirst(TranslateAlert2.languageName((String) restrictedLanguages.iterator().next(), zArr));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            boolean z3 = true;
                            for (String str : restrictedLanguages) {
                                if (!z3) {
                                    sb.append(", ");
                                }
                                String strCapitalFirst = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str, zArr));
                                if (strCapitalFirst != null) {
                                    sb.append(strCapitalFirst);
                                    z3 = false;
                                }
                            }
                            String string3 = sb.toString();
                            try {
                                if (textSettingsCell.getValueTextView().getPaint().measureText(string3) <= Math.min((AndroidUtilities.displaySize.x - AndroidUtilities.dp(34.0f)) / 2.0f, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(84.0f)) - textSettingsCell.getTextView().getPaint().measureText(string2))) {
                                    charSequenceCapitalFirst = string3;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    if (charSequenceCapitalFirst == null) {
                        charSequenceCapitalFirst = String.format(LocaleController.getPluralString("Languages", restrictedLanguages.size()), Integer.valueOf(restrictedLanguages.size()));
                    }
                    textSettingsCell.setTextAndValue(string2, charSequenceCapitalFirst, true, false);
                    break;
                case 5:
                    ((TextSettingsCell) viewHolder.itemView).updateRTL();
                    break;
                case 6:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    textInfoPrivacyCell.updateRTL();
                    if (i == LanguageSelectActivity.this.infoPosition1) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.TranslateMessagesInfo1));
                        textInfoPrivacyCell.setTopPadding(11);
                        textInfoPrivacyCell.setBottomPadding(16);
                    } else {
                        textInfoPrivacyCell.setTopPadding(0);
                        textInfoPrivacyCell.setBottomPadding(16);
                    }
                    break;
            }
        }

        @Override
        public int getItemViewType(int i) {
            int i2;
            if (this.search) {
                return 0;
            }
            if (LanguageSelectActivity.this.getMessagesController().isTranslationsManualEnabled() || LanguageSelectActivity.this.getMessagesController().isTranslationsAutoEnabled()) {
                LanguageSelectActivity.this.settingsFromPosition = 0;
                int i3 = i - 1;
                if (i == 0) {
                    return 3;
                }
                if (LanguageSelectActivity.this.getMessagesController().isTranslationsManualEnabled()) {
                    int i4 = i - 2;
                    if (i3 == 0) {
                        LanguageSelectActivity.this.manualTranslationPosition = i;
                        return 2;
                    }
                    i3 = i4;
                } else {
                    LanguageSelectActivity.this.manualTranslationPosition = -1;
                }
                if (!LanguageSelectActivity.this.getMessagesController().isTranslationsAutoEnabled() || LanguageSelectActivity.this.getMessagesController().premiumFeaturesBlocked()) {
                    LanguageSelectActivity.this.autoTranslationPosition = -1;
                } else {
                    int i5 = i3 - 1;
                    if (i3 == 0) {
                        LanguageSelectActivity.this.autoTranslationPosition = i;
                        return 2;
                    }
                    i3 = i5;
                }
                if (LanguageSelectActivity.this.getChatValue() || LanguageSelectActivity.this.getContextValue()) {
                    LanguageSelectActivity.this.doNotTranslatePosition = i;
                    int i6 = i3 - 1;
                    if (i3 == 0) {
                        return 4;
                    }
                    i3 = i6;
                }
                LanguageSelectActivity.this.settingsToPosition = (i - i3) - 1;
                i2 = i3 - 1;
                if (i3 == 0) {
                    LanguageSelectActivity.this.infoPosition1 = i;
                    return 6;
                }
            } else {
                LanguageSelectActivity.this.settingsFromPosition = -1;
                LanguageSelectActivity.this.settingsToPosition = -1;
                i2 = i;
            }
            int i7 = i2 - 1;
            if (i2 == 0) {
                return 3;
            }
            if ((!LanguageSelectActivity.this.unofficialLanguages.isEmpty() && (i7 == LanguageSelectActivity.this.unofficialLanguages.size() || i7 == LanguageSelectActivity.this.unofficialLanguages.size() + LanguageSelectActivity.this.sortedLanguages.size() + 1)) || (LanguageSelectActivity.this.unofficialLanguages.isEmpty() && i7 == LanguageSelectActivity.this.sortedLanguages.size())) {
                return 1;
            }
            LanguageSelectActivity.this.languagesStartsPosition = i - i7;
            return 0;
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{LanguageCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"checkImage"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addedIcon));
        return arrayList;
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
