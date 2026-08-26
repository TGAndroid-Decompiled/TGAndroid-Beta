package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Timer;
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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
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
    public static final int VIEW_TYPE_HEADER = 3;
    public static final int VIEW_TYPE_INFO = 6;
    public static final int VIEW_TYPE_LANGUAGE = 0;
    public static final int VIEW_TYPE_SETTINGS = 4;
    public static final int VIEW_TYPE_SETTINGS_2 = 5;
    public static final int VIEW_TYPE_SHADOW = 1;
    public static final int VIEW_TYPE_SWITCH = 2;
    private int autoTranslationPosition;
    private int doNotTranslatePosition;
    private EmptyTextProgressView emptyView;
    private int infoPosition1;
    private int languagesStartsPosition;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int manualTranslationPosition;
    private ActionBarMenuItem searchItem;
    private ListAdapter searchListViewAdapter;
    private ArrayList<LocaleController.LocaleInfo> searchResult;
    private Timer searchTimer;
    private boolean searchWas;
    private boolean searching;
    private int settingsFromPosition;
    private int settingsToPosition;
    private ArrayList<LocaleController.LocaleInfo> sortedLanguages;
    private int translateSettingsBackgroundHeight;
    private ArrayList<LocaleController.LocaleInfo> unofficialLanguages;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private boolean search;

        public ListAdapter(Context context, boolean z) {
            this.mContext = context;
            this.search = z;
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
            int size = LanguageSelectActivity.this.sortedLanguages.size() + i + 1;
            return !LanguageSelectActivity.this.unofficialLanguages.isEmpty() ? LanguageSelectActivity.this.unofficialLanguages.size() + 1 + size : size;
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
            if (LanguageSelectActivity.this.unofficialLanguages.isEmpty()) {
                if (LanguageSelectActivity.this.unofficialLanguages.isEmpty() || i7 != LanguageSelectActivity.this.sortedLanguages.size()) {
                    LanguageSelectActivity.this.languagesStartsPosition = i - i7;
                    return 0;
                }
            } else if (i7 != LanguageSelectActivity.this.unofficialLanguages.size()) {
                if (i7 != LanguageSelectActivity.this.sortedLanguages.size() + LanguageSelectActivity.this.unofficialLanguages.size() + 1) {
                    if (LanguageSelectActivity.this.unofficialLanguages.isEmpty()) {
                    }
                    LanguageSelectActivity.this.languagesStartsPosition = i - i7;
                    return 0;
                }
            }
            return 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == 4 || itemViewType == 5 || itemViewType == 2;
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
                            textRadioCell.setTextAndValueAndCheck(String.format("%1$s (%2$s)", localeInfo.name, LocaleController.getString(R.string.LanguageCustom)), localeInfo.nameEnglish, !z);
                        } else {
                            textRadioCell.setTextAndValueAndCheck(localeInfo.name, localeInfo.nameEnglish, !z);
                        }
                    }
                    textRadioCell.setChecked(localeInfo == LocaleController.getInstance().getCurrentLocaleInfo());
                    break;
                case 1:
                    if (!this.search) {
                        i--;
                    }
                    ShadowSectionCell shadowSectionCell = (ShadowSectionCell) viewHolder.itemView;
                    if (LanguageSelectActivity.this.unofficialLanguages.isEmpty() || i != LanguageSelectActivity.this.unofficialLanguages.size()) {
                        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    } else {
                        shadowSectionCell.setBackgroundDrawable(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
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
                            charSequenceCapitalFirst = TranslateAlert2.capitalFirst(TranslateAlert2.languageName(restrictedLanguages.iterator().next(), zArr));
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
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textRadioCell;
            if (i == 0) {
                textRadioCell = new TextRadioCell(this.mContext);
            } else if (i == 2) {
                textRadioCell = new TextCheckCell(this.mContext);
            } else if (i == 3) {
                textRadioCell = new HeaderCell(this.mContext);
            } else if (i == 4 || i == 5) {
                textRadioCell = new TextSettingsCell(this.mContext, null, 0);
            } else {
                textRadioCell = i != 6 ? new ShadowSectionCell(this.mContext, null, 0) : new TextInfoPrivacyCell(this.mContext, 24, null);
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
    }

    public LanguageSelectActivity() {
        super(null);
        this.settingsFromPosition = -1;
        this.settingsToPosition = -1;
        this.manualTranslationPosition = -1;
        this.autoTranslationPosition = -1;
        this.doNotTranslatePosition = -1;
    }

    private void fillLanguages() {
        StickersActivity$$ExternalSyntheticLambda10 stickersActivity$$ExternalSyntheticLambda10 = new StickersActivity$$ExternalSyntheticLambda10(LocaleController.getInstance().getCurrentLocaleInfo(), 3);
        this.sortedLanguages = new ArrayList<>();
        this.unofficialLanguages = new ArrayList<>(LocaleController.getInstance().unofficialLanguages);
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
        Collections.sort(this.sortedLanguages, stickersActivity$$ExternalSyntheticLambda10);
        Collections.sort(this.unofficialLanguages, stickersActivity$$ExternalSyntheticLambda10);
    }

    public boolean getChatValue() {
        return getMessagesController().getTranslateController().isFeatureAvailable();
    }

    public boolean getContextValue() {
        return getMessagesController().getTranslateController().isContextTranslateEnabled();
    }

    public void lambda$createView$0() {
        this.actionBar.closeSearchField();
        updateLanguage();
    }

    public void lambda$createView$1(AlertDialog alertDialog, boolean z) {
        alertDialog.dismiss();
        if (z) {
            return;
        }
        AndroidUtilities.runOnUIThread(new LanguageSelectActivity$$ExternalSyntheticLambda0(this, 0), 10L);
    }

    public void lambda$createView$2(int i, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public static boolean lambda$createView$3(String str, String str2) {
        return str2 != null && str2.equals(str);
    }

    public void lambda$createView$4(View view, int i) {
        LocaleController.LocaleInfo localeInfo;
        int size = i;
        try {
            boolean z = true;
            TextCheckCell textCheckCell = null;
            if (view instanceof TextCheckCell) {
                boolean z2 = getContextValue() || getChatValue();
                if (size == this.manualTranslationPosition) {
                    boolean z3 = !getContextValue();
                    getMessagesController().getTranslateController().setContextTranslateEnabled(z3);
                    ((TextCheckCell) view).setChecked(z3);
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                } else if (size == this.autoTranslationPosition) {
                    boolean chatValue = getChatValue();
                    boolean z4 = !chatValue;
                    if (!chatValue && !getUserConfig().isPremium()) {
                        showDialog(new PremiumFeatureBottomSheet(this, getContext(), getCurrentAccount(), false, 13, false, null));
                        return;
                    } else {
                        getMessagesController().getTranslateController().setChatTranslateEnabled(z4);
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateSearchSettings, new Object[0]);
                        ((TextCheckCell) view).setChecked(z4);
                    }
                }
                boolean z5 = getContextValue() || getChatValue();
                if (z5 != z2) {
                    int i2 = this.autoTranslationPosition;
                    if (i2 < 0) {
                        i2 = this.manualTranslationPosition;
                    }
                    for (int i3 = 0; i3 < this.listView.getChildCount(); i3++) {
                        View childAt = this.listView.getChildAt(i3);
                        if (this.listView.getChildAdapterPosition(childAt) == i2 && (childAt instanceof TextCheckCell)) {
                            textCheckCell = (TextCheckCell) childAt;
                        }
                    }
                    if (textCheckCell != null) {
                        textCheckCell.setDivider(z5);
                    }
                    if (z5) {
                        this.listAdapter.notifyItemInserted(i2 + 1);
                        return;
                    } else {
                        this.listAdapter.notifyItemRemoved(i2 + 1);
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
                    localeInfo = this.searchResult.get(size);
                } else if (this.unofficialLanguages.isEmpty() || size < 0 || size >= this.unofficialLanguages.size()) {
                    if (!this.unofficialLanguages.isEmpty()) {
                        size -= this.unofficialLanguages.size() + 1;
                    }
                    localeInfo = this.sortedLanguages.get(size);
                } else {
                    localeInfo = this.unofficialLanguages.get(size);
                }
                LocaleController.LocaleInfo localeInfo2 = localeInfo;
                if (localeInfo2 != null) {
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    if (currentLocaleInfo != localeInfo2) {
                        z = false;
                    }
                    AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
                    AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                    if (!z) {
                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
                    }
                    getMessagesController().getTranslateController().reset();
                    int iApplyLanguage = LocaleController.getInstance().applyLanguage(localeInfo2, true, false, false, true, this.currentAccount, new PhotoViewer$$ExternalSyntheticLambda28(this, alertDialog, z, 12));
                    if (iApplyLanguage != 0) {
                        alertDialog.setOnCancelListener(new ChangeBioActivity$$ExternalSyntheticLambda5(this, iApplyLanguage, 5));
                    }
                    String str = localeInfo2.pluralLangCode;
                    String str2 = currentLocaleInfo.pluralLangCode;
                    HashSet<String> restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                    HashSet hashSet = new HashSet(restrictedLanguages);
                    if (restrictedLanguages.contains(str2) && !restrictedLanguages.contains(str)) {
                        Collection.EL.removeIf(hashSet, new ChatActivity$$ExternalSyntheticLambda425(str2, 1));
                    }
                    if (str != null && !"null".equals(str)) {
                        hashSet.add(str);
                    }
                    RestrictedLanguagesSelectActivity.updateRestrictedLanguages(hashSet, Boolean.FALSE);
                    MessagesController.getInstance(this.currentAccount).getTranslateController().checkRestrictedLanguagesUpdate();
                    MessagesController.getInstance(this.currentAccount).getTranslateController().cleanup();
                    TranslateController.invalidateSuggestedLanguageCodes();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$createView$5(LocaleController.LocaleInfo localeInfo, AlertDialog alertDialog, int i) {
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

    public boolean lambda$createView$6(View view, int i) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (getParentActivity() != null && this.parentLayout != null && (view instanceof TextRadioCell)) {
                boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
                if (!z) {
                    i -= this.languagesStartsPosition;
                }
                if (z) {
                    localeInfo = this.searchResult.get(i);
                } else if (this.unofficialLanguages.isEmpty() || i < 0 || i >= this.unofficialLanguages.size()) {
                    if (!this.unofficialLanguages.isEmpty()) {
                        i -= this.unofficialLanguages.size() + 1;
                    }
                    localeInfo = this.sortedLanguages.get(i);
                } else {
                    localeInfo = this.unofficialLanguages.get(i);
                }
                if (localeInfo != null && localeInfo.pathToFile != null && (!localeInfo.isRemote() || localeInfo.serverIndex == Integer.MAX_VALUE)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                    builder.setTitle(LocaleController.getString(R.string.DeleteLocalizationTitle));
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", R.string.DeleteLocalizationText, localeInfo.name)));
                    builder.setPositiveButton(LocaleController.getString(R.string.Delete), new DialogsActivity$$ExternalSyntheticLambda6(15, this, localeInfo));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    AlertDialog alertDialogCreate = builder.create();
                    showDialog(alertDialogCreate);
                    TextView textView = (TextView) alertDialogCreate.getButton(-1);
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

    public void lambda$didReceivedNotification$7() {
        this.listAdapter.notifyDataSetChanged();
    }

    public static int lambda$fillLanguages$8(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, LocaleController.LocaleInfo localeInfo3) {
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

    public void lambda$onBecomeFullyVisible$9() {
        if (this.isPaused) {
            return;
        }
        updateLanguage();
    }

    public void lambda$processSearch$10(String str) {
        if (str.trim().toLowerCase().length() == 0) {
            updateSearchResults(new ArrayList<>());
            return;
        }
        System.currentTimeMillis();
        ArrayList<LocaleController.LocaleInfo> arrayList = new ArrayList<>();
        int size = this.unofficialLanguages.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = this.unofficialLanguages.get(i);
            if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo);
            }
        }
        int size2 = this.sortedLanguages.size();
        for (int i2 = 0; i2 < size2; i2++) {
            LocaleController.LocaleInfo localeInfo2 = this.sortedLanguages.get(i2);
            if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo2);
            }
        }
        updateSearchResults(arrayList);
    }

    public void lambda$updateSearchResults$11(ArrayList arrayList) {
        this.searchResult = arrayList;
        this.searchListViewAdapter.notifyDataSetChanged();
    }

    private void processSearch(String str) {
        Utilities.searchQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda2(12, this, str));
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

    private void updateSearchResults(ArrayList<LocaleController.LocaleInfo> arrayList) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda2(13, this, arrayList));
    }

    @Override
    public View createView(Context context) {
        this.searching = false;
        this.searchWas = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Language));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
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
            public void onSearchExpand() {
                LanguageSelectActivity.this.searching = true;
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
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setEmptyView(this.emptyView);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                LanguageSelectActivity.this.listView.invalidate();
                LanguageSelectActivity.this.listView.updateSelector();
            }
        };
        defaultItemAnimator.setDurations(400L);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 21));
        this.listView.setOnItemLongClickListener(new BoostsActivity$$ExternalSyntheticLambda4(this, 27));
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

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.suggestedLangpack || this.listAdapter == null) {
            return;
        }
        fillLanguages();
        AndroidUtilities.runOnUIThread(new LanguageSelectActivity$$ExternalSyntheticLambda0(this, 1));
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
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
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
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LocaleController.getInstance().checkForcePatchLangpack(this.currentAccount, new LanguageSelectActivity$$ExternalSyntheticLambda0(this, 2));
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
        if (str != null) {
            processSearch(str);
            return;
        }
        this.searching = false;
        this.searchResult = null;
        if (this.listView != null) {
            this.emptyView.setVisibility(8);
            this.listView.setAdapter(this.listAdapter);
        }
    }
}
