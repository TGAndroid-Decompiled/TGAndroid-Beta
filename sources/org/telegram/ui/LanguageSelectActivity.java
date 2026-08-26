package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzki;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
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
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class LanguageSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int autoTranslationPosition;
    public EmptyTextProgressView emptyView;
    public int infoPosition1;
    public int languagesStartsPosition;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public int manualTranslationPosition;
    public ListAdapter searchListViewAdapter;
    public ArrayList searchResult;
    public ArrayList sortedLanguages;
    public ArrayList unofficialLanguages;

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;
        public final boolean search;

        public ListAdapter(Context context, boolean z) {
            this.mContext = context;
            this.search = z;
        }

        @Override
        public final int getItemCount() {
            int i;
            LanguageSelectActivity languageSelectActivity = LanguageSelectActivity.this;
            if (this.search) {
                ArrayList arrayList = languageSelectActivity.searchResult;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            }
            if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
                int i2 = languageSelectActivity.getMessagesController().isTranslationsManualEnabled() ? 3 : 2;
                if (languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() && !languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                    i2++;
                }
                if (languageSelectActivity.getMessagesController().getTranslateController().isFeatureAvailable() || languageSelectActivity.getMessagesController().getTranslateController().isContextTranslateEnabled()) {
                    i2++;
                }
                i = i2 + 1;
            } else {
                i = 1;
            }
            int size = languageSelectActivity.sortedLanguages.size() + i + 1;
            return !languageSelectActivity.unofficialLanguages.isEmpty() ? languageSelectActivity.unofficialLanguages.size() + 1 + size : size;
        }

        @Override
        public final int getItemViewType(int i) {
            int i2;
            if (this.search) {
                return 0;
            }
            LanguageSelectActivity languageSelectActivity = LanguageSelectActivity.this;
            if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled()) {
                int i3 = i - 1;
                if (i == 0) {
                    return 3;
                }
                if (languageSelectActivity.getMessagesController().isTranslationsManualEnabled()) {
                    int i4 = i - 2;
                    if (i3 == 0) {
                        languageSelectActivity.manualTranslationPosition = i;
                        return 2;
                    }
                    i3 = i4;
                } else {
                    languageSelectActivity.manualTranslationPosition = -1;
                }
                if (!languageSelectActivity.getMessagesController().isTranslationsAutoEnabled() || languageSelectActivity.getMessagesController().premiumFeaturesBlocked()) {
                    languageSelectActivity.autoTranslationPosition = -1;
                } else {
                    int i5 = i3 - 1;
                    if (i3 == 0) {
                        languageSelectActivity.autoTranslationPosition = i;
                        return 2;
                    }
                    i3 = i5;
                }
                if (languageSelectActivity.getMessagesController().getTranslateController().isFeatureAvailable() || languageSelectActivity.getMessagesController().getTranslateController().isContextTranslateEnabled()) {
                    int i6 = i3 - 1;
                    if (i3 == 0) {
                        return 4;
                    }
                    i3 = i6;
                }
                i2 = i3 - 1;
                if (i3 == 0) {
                    languageSelectActivity.infoPosition1 = i;
                    return 6;
                }
            } else {
                i2 = i;
            }
            int i7 = i2 - 1;
            if (i2 == 0) {
                return 3;
            }
            if (languageSelectActivity.unofficialLanguages.isEmpty()) {
                if (languageSelectActivity.unofficialLanguages.isEmpty() || i7 != languageSelectActivity.sortedLanguages.size()) {
                    languageSelectActivity.languagesStartsPosition = i - i7;
                    return 0;
                }
            } else if (i7 != languageSelectActivity.unofficialLanguages.size()) {
                if (i7 != languageSelectActivity.sortedLanguages.size() + languageSelectActivity.unofficialLanguages.size() + 1) {
                    if (languageSelectActivity.unofficialLanguages.isEmpty()) {
                    }
                    languageSelectActivity.languagesStartsPosition = i - i7;
                    return 0;
                }
            }
            return 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 4 || i == 5 || i == 2;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            String string;
            int iM = i;
            int i2 = viewHolder.mItemViewType;
            LanguageSelectActivity languageSelectActivity = LanguageSelectActivity.this;
            boolean z2 = this.search;
            LocaleController.LocaleInfo localeInfo = null;
            charSequence = null;
            CharSequence charSequence = null;
            localeInfo = null;
            localeInfo = null;
            localeInfo = null;
            boolean z3 = true;
            View view = viewHolder.itemView;
            switch (i2) {
                case 0:
                    if (!z2) {
                        iM -= languageSelectActivity.languagesStartsPosition;
                    }
                    TextRadioCell textRadioCell = (TextRadioCell) view;
                    textRadioCell.updateRTL();
                    if (z2) {
                        if (iM >= 0 && iM < languageSelectActivity.searchResult.size()) {
                            localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.searchResult.get(iM);
                        }
                        if (iM == languageSelectActivity.searchResult.size() - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else if (languageSelectActivity.unofficialLanguages.isEmpty() || iM < 0 || iM >= languageSelectActivity.unofficialLanguages.size()) {
                        if (!languageSelectActivity.unofficialLanguages.isEmpty()) {
                            iM = zzki.m(1, iM, languageSelectActivity.unofficialLanguages);
                        }
                        if (iM >= 0 && iM < languageSelectActivity.sortedLanguages.size()) {
                            localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.sortedLanguages.get(iM);
                        }
                        if (iM == languageSelectActivity.sortedLanguages.size() - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        localeInfo = (LocaleController.LocaleInfo) languageSelectActivity.unofficialLanguages.get(iM);
                        if (iM == languageSelectActivity.unofficialLanguages.size() - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (localeInfo != null) {
                        if (localeInfo.isLocal()) {
                            textRadioCell.setTextAndValueAndCheck(String.format("%1$s (%2$s)", localeInfo.name, LocaleController.getString(R.string.LanguageCustom)), localeInfo.nameEnglish, !z);
                        } else {
                            textRadioCell.setTextAndValueAndCheck(localeInfo.name, localeInfo.nameEnglish, !z);
                        }
                    }
                    textRadioCell.setChecked(localeInfo == LocaleController.getInstance().getCurrentLocaleInfo());
                    break;
                case 1:
                    if (!z2) {
                        iM--;
                    }
                    ShadowSectionCell shadowSectionCell = (ShadowSectionCell) view;
                    boolean zIsEmpty = languageSelectActivity.unofficialLanguages.isEmpty();
                    Context context = this.mContext;
                    if (zIsEmpty || iM != languageSelectActivity.unofficialLanguages.size()) {
                        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    } else {
                        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    }
                    break;
                case 2:
                    TextCheckCell textCheckCell = (TextCheckCell) view;
                    boolean z4 = textCheckCell.isRTL;
                    boolean z5 = LocaleController.isRTL;
                    if (z4 != z5) {
                        textCheckCell.isRTL = z5;
                        TextView textView = textCheckCell.textView;
                        textView.setGravity((z5 ? 5 : 3) | 16);
                        textCheckCell.removeView(textView);
                        boolean z6 = LocaleController.isRTL;
                        textCheckCell.addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z6 ? 5 : 3) | 48, z6 ? 70.0f : textCheckCell.padding, 0.0f, z6 ? textCheckCell.padding : 70.0f, 0.0f));
                        TextView textView2 = textCheckCell.valueTextView;
                        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                        textCheckCell.removeView(textView2);
                        boolean z7 = LocaleController.isRTL;
                        textCheckCell.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z7 ? 5 : 3) | 48, z7 ? 64.0f : textCheckCell.padding, 36.0f, z7 ? textCheckCell.padding : 64.0f, 0.0f));
                        View view2 = textCheckCell.checkBox;
                        textCheckCell.removeView(view2);
                        textCheckCell.addView(view2, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    }
                    if (iM == languageSelectActivity.manualTranslationPosition) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ShowTranslateButton), languageSelectActivity.getMessagesController().getTranslateController().isContextTranslateEnabled(), true);
                        textCheckCell.setCheckBoxIcon(0);
                    } else if (iM == languageSelectActivity.autoTranslationPosition) {
                        CharSequence string2 = LocaleController.getString(R.string.ShowTranslateChatButton);
                        boolean zIsFeatureAvailable = languageSelectActivity.getMessagesController().getTranslateController().isFeatureAvailable();
                        if (!languageSelectActivity.getMessagesController().getTranslateController().isContextTranslateEnabled() && !languageSelectActivity.getMessagesController().getTranslateController().isFeatureAvailable()) {
                            z3 = false;
                        }
                        textCheckCell.setTextAndCheck(string2, zIsFeatureAvailable, z3);
                        textCheckCell.setCheckBoxIcon(languageSelectActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                    }
                    break;
                case 3:
                    ((HeaderCell) view).setText(LocaleController.getString((iM == 0 && (languageSelectActivity.getMessagesController().isTranslationsManualEnabled() || languageSelectActivity.getMessagesController().isTranslationsAutoEnabled())) ? R.string.TranslateMessages : R.string.Language));
                    break;
                case 4:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                    textSettingsCell.updateRTL();
                    HashSet<String> restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                    String string3 = LocaleController.getString(R.string.DoNotTranslate);
                    try {
                        boolean[] zArr = new boolean[1];
                        if (restrictedLanguages.size() == 0) {
                            string = "";
                        } else if (restrictedLanguages.size() != 1) {
                            StringBuilder sb = new StringBuilder();
                            boolean z8 = true;
                            for (String str : restrictedLanguages) {
                                if (!z8) {
                                    sb.append(", ");
                                }
                                String strCapitalFirst = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str, zArr, null));
                                if (strCapitalFirst != null) {
                                    sb.append(strCapitalFirst);
                                    z8 = false;
                                }
                            }
                            string = sb.toString();
                            try {
                                if (textSettingsCell.getValueTextView().getPaint().measureText(string) <= Math.min((AndroidUtilities.displaySize.x - AndroidUtilities.dp(34.0f)) / 2.0f, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(84.0f)) - textSettingsCell.getTextView().getPaint().measureText(string3))) {
                                }
                            } catch (Exception unused) {
                            }
                            if (charSequence == null) {
                                charSequence = String.format(LocaleController.getPluralString("Languages", restrictedLanguages.size()), Integer.valueOf(restrictedLanguages.size()));
                            }
                            textSettingsCell.setTextAndValue(string3, charSequence, true, false);
                        } else {
                            string = TranslateAlert2.capitalFirst(TranslateAlert2.languageName((String) restrictedLanguages.iterator().next(), zArr, null));
                        }
                        charSequence = string;
                        break;
                    } catch (Exception unused2) {
                    }
                    if (charSequence == null) {
                        charSequence = String.format(LocaleController.getPluralString("Languages", restrictedLanguages.size()), Integer.valueOf(restrictedLanguages.size()));
                    }
                    textSettingsCell.setTextAndValue(string3, charSequence, true, false);
                    break;
                case 5:
                    ((TextSettingsCell) view).updateRTL();
                    break;
                case 6:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    boolean z9 = textInfoPrivacyCell.isRTL;
                    boolean z10 = LocaleController.isRTL;
                    if (z9 != z10) {
                        textInfoPrivacyCell.isRTL = z10;
                        int i3 = z10 ? 5 : 3;
                        CheckBoxCell.AnonymousClass2 anonymousClass2 = textInfoPrivacyCell.textView;
                        anonymousClass2.setGravity(i3);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass2.getLayoutParams();
                        layoutParams.gravity = (LocaleController.isRTL ? 5 : 3) | 48;
                        anonymousClass2.setLayoutParams(layoutParams);
                    }
                    if (iM == languageSelectActivity.infoPosition1) {
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
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textRadioCell;
            Context context = this.mContext;
            if (i == 0) {
                textRadioCell = new TextRadioCell(context);
            } else if (i == 2) {
                textRadioCell = new TextCheckCell(context);
            } else if (i == 3) {
                textRadioCell = new HeaderCell(context);
            } else if (i == 4 || i == 5) {
                textRadioCell = new TextSettingsCell(context, 0, null);
            } else {
                textRadioCell = i != 6 ? new ShadowSectionCell(context, (Object) null) : new TextInfoPrivacyCell(context, 24, null);
            }
            return new RecyclerListView.Holder(textRadioCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof TextRadioCell) {
                ((TextRadioCell) view).updateRTL();
            }
        }
    }

    public LanguageSelectActivity() {
        super(null);
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 27));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 12);
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
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setEmptyView(this.emptyView);
        zzku.m(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                View view;
                LanguageSelectActivity languageSelectActivity = LanguageSelectActivity.this;
                languageSelectActivity.listView.invalidate();
                RecyclerListView recyclerListView2 = languageSelectActivity.listView;
                int i = recyclerListView2.selectorPosition;
                if (i == -1 || (view = recyclerListView2.selectorView) == null) {
                    return;
                }
                recyclerListView2.positionSelector$1(i, view);
                recyclerListView2.invalidate();
            }
        };
        defaultItemAnimator.setDurations(400L);
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        this.listView.setItemAnimator(defaultItemAnimator);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 18));
        this.listView.setOnItemLongClickListener(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 29));
        this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 26));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.suggestedLangpack || this.listAdapter == null) {
            return;
        }
        fillLanguages();
        AndroidUtilities.runOnUIThread(new LanguageSelectActivity$$ExternalSyntheticLambda0(this, 2));
    }

    public final void fillLanguages() {
        TableModel$$ExternalSyntheticLambda0 tableModel$$ExternalSyntheticLambda0 = new TableModel$$ExternalSyntheticLambda0(LocaleController.getInstance().getCurrentLocaleInfo(), 8);
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
        Collections.sort(this.sortedLanguages, tableModel$$ExternalSyntheticLambda0);
        Collections.sort(this.unofficialLanguages, tableModel$$ExternalSyntheticLambda0);
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
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView2"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"checkImage"}, null, null, -1, null, Theme.key_featuredStickers_addedIcon));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$0$4$2() {
        this.actionBar.closeSearchField(true);
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.setTitleAnimated(string, true, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyItemRangeChanged(0, listAdapter.getItemCount(), null);
        }
    }

    public final void lambda$createView$2(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void lambda$createView$4(int i, View view) {
        LocaleController.LocaleInfo localeInfo;
        int size = i;
        try {
            boolean z = true;
            TextCheckCell textCheckCell = null;
            if (view instanceof TextCheckCell) {
                boolean z2 = getMessagesController().getTranslateController().isContextTranslateEnabled() || getMessagesController().getTranslateController().isFeatureAvailable();
                if (size == this.manualTranslationPosition) {
                    boolean z3 = !getMessagesController().getTranslateController().isContextTranslateEnabled();
                    getMessagesController().getTranslateController().setContextTranslateEnabled(z3);
                    ((TextCheckCell) view).setChecked(z3);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (size == this.autoTranslationPosition) {
                    boolean zIsFeatureAvailable = getMessagesController().getTranslateController().isFeatureAvailable();
                    boolean z4 = !zIsFeatureAvailable;
                    if (!zIsFeatureAvailable && !getUserConfig().isPremium()) {
                        showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), getCurrentAccount(), false, 13, false, null));
                        return;
                    } else {
                        getMessagesController().getTranslateController().setChatTranslateEnabled(z4);
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((TextCheckCell) view).setChecked(z4);
                    }
                }
                boolean z5 = getMessagesController().getTranslateController().isContextTranslateEnabled() || getMessagesController().getTranslateController().isFeatureAvailable();
                if (z5 != z2) {
                    int i2 = this.autoTranslationPosition;
                    if (i2 < 0) {
                        i2 = this.manualTranslationPosition;
                    }
                    for (int i3 = 0; i3 < this.listView.getChildCount(); i3++) {
                        View childAt = this.listView.getChildAt(i3);
                        this.listView.getClass();
                        if (RecyclerView.getChildAdapterPosition(childAt) == i2 && (childAt instanceof TextCheckCell)) {
                            textCheckCell = (TextCheckCell) childAt;
                        }
                    }
                    if (textCheckCell != null) {
                        textCheckCell.setDivider(z5);
                    }
                    if (z5) {
                        this.listAdapter.mObservable.notifyItemRangeInserted(i2 + 1, 1);
                        return;
                    } else {
                        this.listAdapter.mObservable.notifyItemRangeRemoved(i2 + 1, 1);
                        return;
                    }
                }
                return;
            }
            if (view instanceof TextSettingsCell) {
                presentFragment(new RestrictedLanguagesSelectActivity());
                return;
            }
            if (getParentActivity() != null && this.parentLayout != null && (view instanceof TextRadioCell)) {
                boolean z6 = this.listView.getAdapter() == this.searchListViewAdapter;
                if (!z6) {
                    size -= this.languagesStartsPosition;
                }
                if (z6) {
                    localeInfo = (LocaleController.LocaleInfo) this.searchResult.get(size);
                } else if (this.unofficialLanguages.isEmpty() || size < 0 || size >= this.unofficialLanguages.size()) {
                    if (!this.unofficialLanguages.isEmpty()) {
                        size -= this.unofficialLanguages.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) this.sortedLanguages.get(size);
                } else {
                    localeInfo = (LocaleController.LocaleInfo) this.unofficialLanguages.get(size);
                }
                LocaleController.LocaleInfo localeInfo2 = localeInfo;
                if (localeInfo2 != null) {
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    if (currentLocaleInfo != localeInfo2) {
                        z = false;
                    }
                    AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                    if (!z) {
                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
                    }
                    getMessagesController().getTranslateController().reset();
                    int iApplyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, this.currentAccount, new PhotoViewer$$ExternalSyntheticLambda89(this, alertDialog, z, 23));
                    if (iApplyLanguage != 0) {
                        alertDialog.setOnCancelListener(new ChatEditActivity$$ExternalSyntheticLambda52(this, iApplyLanguage, 6));
                    }
                    String str = localeInfo2.pluralLangCode;
                    String str2 = currentLocaleInfo.pluralLangCode;
                    HashSet restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                    HashSet hashSet = new HashSet(restrictedLanguages);
                    if (restrictedLanguages.contains(str2) && !restrictedLanguages.contains(str)) {
                        Collection.EL.removeIf(hashSet, new LanguageSelectActivity$$ExternalSyntheticLambda9(str2, 0));
                    }
                    if (str != null && !"null".equals(str)) {
                        hashSet.add(str);
                    }
                    RestrictedLanguagesSelectActivity.updateRestrictedLanguages(Boolean.FALSE, hashSet);
                    MessagesController.getInstance(this.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
                    MessagesController.getInstance(this.currentAccount).getTranslateController().cleanup();
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$createView$5(LocaleController.LocaleInfo localeInfo) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, this.currentAccount)) {
            fillLanguages();
            ArrayList arrayList = this.searchResult;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.mObservable.notifyChanged();
            }
            ListAdapter listAdapter2 = this.searchListViewAdapter;
            if (listAdapter2 != null) {
                listAdapter2.mObservable.notifyChanged();
            }
        }
    }

    public final boolean lambda$createView$6$1(int i, View view) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (getParentActivity() != null && this.parentLayout != null && (view instanceof TextRadioCell)) {
                boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
                if (!z) {
                    i -= this.languagesStartsPosition;
                }
                if (z) {
                    localeInfo = (LocaleController.LocaleInfo) this.searchResult.get(i);
                } else if (this.unofficialLanguages.isEmpty() || i < 0 || i >= this.unofficialLanguages.size()) {
                    if (!this.unofficialLanguages.isEmpty()) {
                        i -= this.unofficialLanguages.size() + 1;
                    }
                    localeInfo = (LocaleController.LocaleInfo) this.sortedLanguages.get(i);
                } else {
                    localeInfo = (LocaleController.LocaleInfo) this.unofficialLanguages.get(i);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = LocaleController.getString(R.string.DeleteLocalizationTitle);
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name));
                    builder.setPositiveButton(LocaleController.getString(R.string.Delete), new DialogsActivity$$ExternalSyntheticLambda89(14, this, localeInfo));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    showDialog(alertDialog);
                    TextView textView = (TextView) alertDialog.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                        return true;
                    }
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$onBecomeFullyVisible$9() {
        if (this.isPaused) {
            return;
        }
        if (this.actionBar != null) {
            String string = LocaleController.getString(R.string.Language);
            if (!TextUtils.equals(this.actionBar.getTitle(), string)) {
                this.actionBar.setTitleAnimated(string, true, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyItemRangeChanged(0, listAdapter.getItemCount(), null);
        }
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new LanguageSelectActivity$$ExternalSyntheticLambda0(this, 0));
    }

    @Override
    public final boolean onFragmentCreate() {
        fillLanguages();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount, false);
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
