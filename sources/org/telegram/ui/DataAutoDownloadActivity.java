package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.MaxFileSizeCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckBoxCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;

public final class DataAutoDownloadActivity extends BaseFragment {
    public boolean animateChecked;
    public int autoDownloadSectionRow;
    public int currentPresetNum;
    public final int currentType;
    public final DownloadController.Preset defaultPreset;
    public int filesRow;
    public final DownloadController.Preset highPreset;
    public final String key;
    public final String key2;
    public ListAdapter listAdapter;
    public RecyclerListView listView;
    public final DownloadController.Preset lowPreset;
    public final DownloadController.Preset mediumPreset;
    public int photosRow;
    public final ArrayList presets;
    public int rowCount;
    public int selectedPreset;
    public int storiesRow;
    public int typeHeaderRow;
    public final DownloadController.Preset typePreset;
    public int typeSectionRow;
    public int usageHeaderRow;
    public int usageProgressRow;
    public int usageSectionRow;
    public int videosRow;
    public boolean wereAnyChanges;

    public final class AnonymousClass3 extends MaxFileSizeCell {
        public final AnimatorSet[] val$animatorSet;
        public final TextCheckCell[] val$checkCell;
        public final TextInfoPrivacyCell val$infoCell;
        public final int val$position;

        public AnonymousClass3(Activity activity, int i, TextInfoPrivacyCell textInfoPrivacyCell, TextCheckCell[] textCheckCellArr, AnimatorSet[] animatorSetArr) {
            super(activity);
            this.val$position = i;
            this.val$infoCell = textInfoPrivacyCell;
            this.val$checkCell = textCheckCellArr;
            this.val$animatorSet = animatorSetArr;
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return DataAutoDownloadActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            DataAutoDownloadActivity dataAutoDownloadActivity = DataAutoDownloadActivity.this;
            dataAutoDownloadActivity.getClass();
            if (i == 0) {
                return 0;
            }
            if (i == dataAutoDownloadActivity.usageSectionRow) {
                return 1;
            }
            if (i == dataAutoDownloadActivity.usageHeaderRow || i == dataAutoDownloadActivity.typeHeaderRow) {
                return 2;
            }
            if (i == dataAutoDownloadActivity.usageProgressRow) {
                return 3;
            }
            return (i == dataAutoDownloadActivity.photosRow || i == dataAutoDownloadActivity.videosRow || i == dataAutoDownloadActivity.filesRow || i == dataAutoDownloadActivity.storiesRow) ? 4 : 5;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            DataAutoDownloadActivity dataAutoDownloadActivity = DataAutoDownloadActivity.this;
            return adapterPosition == dataAutoDownloadActivity.photosRow || adapterPosition == dataAutoDownloadActivity.videosRow || adapterPosition == dataAutoDownloadActivity.filesRow || adapterPosition == dataAutoDownloadActivity.storiesRow;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            DownloadController.Preset currentWiFiPreset;
            int i2;
            StringBuilder sb;
            int i3 = viewHolder.mItemViewType;
            DataAutoDownloadActivity dataAutoDownloadActivity = DataAutoDownloadActivity.this;
            View view = viewHolder.itemView;
            if (i3 == 0) {
                TextCheckCell textCheckCell = (TextCheckCell) view;
                if (i == 0) {
                    textCheckCell.setDrawCheckRipple(true);
                    String string3 = LocaleController.getString(R.string.AutoDownloadMedia);
                    DownloadController.Preset preset = dataAutoDownloadActivity.typePreset;
                    textCheckCell.setTextAndCheck(string3, preset.enabled, false);
                    textCheckCell.setTag(Integer.valueOf(preset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    textCheckCell.setBackgroundColor(Theme.getColor(null, preset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
                    return;
                }
                return;
            }
            if (i3 == 2) {
                HeaderCell headerCell = (HeaderCell) view;
                if (i == dataAutoDownloadActivity.usageHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                    return;
                } else {
                    if (i == dataAutoDownloadActivity.typeHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                        return;
                    }
                    return;
                }
            }
            if (i3 == 3) {
                dataAutoDownloadActivity.updatePresetChoseView((SlideChooseView) view);
                return;
            }
            int i4 = dataAutoDownloadActivity.currentType;
            int i5 = -1;
            if (i3 != 4) {
                if (i3 != 5) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                if (i == dataAutoDownloadActivity.typeSectionRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                    textInfoPrivacyCell.setFixedSize(0);
                    textInfoPrivacyCell.setImportantForAccessibility(1);
                    return;
                } else {
                    if (i == dataAutoDownloadActivity.autoDownloadSectionRow) {
                        if (dataAutoDownloadActivity.usageHeaderRow != -1) {
                            textInfoPrivacyCell.setText(null);
                            textInfoPrivacyCell.setFixedSize(12);
                            textInfoPrivacyCell.setImportantForAccessibility(4);
                            return;
                        }
                        if (i4 == 0) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                        } else if (i4 == 1) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                        } else if (i4 == 2) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                        }
                        textInfoPrivacyCell.setImportantForAccessibility(1);
                        return;
                    }
                    return;
                }
            }
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            notificationsCheckCell.setDrawLine(true);
            if (i == dataAutoDownloadActivity.photosRow) {
                string2 = LocaleController.getString(R.string.AutoDownloadPhotos);
                i5 = 1;
            } else if (i == dataAutoDownloadActivity.videosRow) {
                string2 = LocaleController.getString(R.string.AutoDownloadVideos);
                i5 = 4;
            } else {
                if (i == dataAutoDownloadActivity.storiesRow) {
                    string = LocaleController.getString(R.string.AutoDownloadStories);
                    notificationsCheckCell.setDrawLine(false);
                } else {
                    string = LocaleController.getString(R.string.AutoDownloadFiles);
                    i5 = 8;
                }
                string2 = string;
            }
            if (i4 == 0) {
                currentWiFiPreset = DownloadController.getInstance(((BaseFragment) dataAutoDownloadActivity).currentAccount).getCurrentMobilePreset();
            } else {
                currentWiFiPreset = i4 == 1 ? DownloadController.getInstance(((BaseFragment) dataAutoDownloadActivity).currentAccount).getCurrentWiFiPreset() : DownloadController.getInstance(((BaseFragment) dataAutoDownloadActivity).currentAccount).getCurrentRoamingPreset();
            }
            long j = currentWiFiPreset.sizes[DownloadController.typeToIndex(i5)];
            StringBuilder sb2 = new StringBuilder();
            if (i != dataAutoDownloadActivity.storiesRow) {
                int i6 = 0;
                i2 = 0;
                while (true) {
                    int[] iArr = currentWiFiPreset.mask;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    if ((iArr[i6] & i5) != 0) {
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        if (i6 == 0) {
                            sb2.append(LocaleController.getString(R.string.AutoDownloadContacts));
                        } else if (i6 == 1) {
                            sb2.append(LocaleController.getString(R.string.AutoDownloadPm));
                        } else if (i6 == 2) {
                            sb2.append(LocaleController.getString(R.string.AutoDownloadGroups));
                        } else if (i6 == 3) {
                            sb2.append(LocaleController.getString(R.string.AutoDownloadChannels));
                        }
                        i2++;
                    }
                    i6++;
                }
                if (i2 == 4) {
                    sb2.setLength(0);
                    if (i == dataAutoDownloadActivity.photosRow) {
                        sb2.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                    } else {
                        sb2.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j)));
                    }
                } else if (i2 == 0) {
                    sb2.append(LocaleController.getString(R.string.AutoDownloadOff));
                } else {
                    sb = i == dataAutoDownloadActivity.photosRow ? new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb2.toString())) : new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j), sb2.toString()));
                }
                sb = sb2;
            } else if (currentWiFiPreset.preloadStories) {
                sb = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb2.toString()));
                i2 = 1;
            } else {
                sb = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb2.toString()));
                i2 = 0;
            }
            if (dataAutoDownloadActivity.animateChecked) {
                notificationsCheckCell.setChecked(i2 != 0);
            }
            notificationsCheckCell.setTextAndValueAndIconAndCheck(string2, sb, 0, i2 != 0, 0, true, i != dataAutoDownloadActivity.storiesRow, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            Context context = this.mContext;
            if (i == 0) {
                TextCheckCell textCheckCell = new TextCheckCell(context);
                textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                textCheckCell.setTypeface(AndroidUtilities.bold());
                textCheckCell.setHeight(56);
                shadowSectionCell = textCheckCell;
            } else if (i == 1) {
                shadowSectionCell = new ShadowSectionCell(context, (Object) null);
            } else if (i == 2) {
                shadowSectionCell = new HeaderCell(context);
            } else if (i != 3) {
                shadowSectionCell = i != 4 ? new TextInfoPrivacyCell(context, 24, null) : new NotificationsCheckCell(context);
            } else {
                SlideChooseView slideChooseView = new SlideChooseView(context, null);
                slideChooseView.setCallback(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 13));
                shadowSectionCell = slideChooseView;
            }
            return zzkl.m(shadowSectionCell, shadowSectionCell);
        }
    }

    public DataAutoDownloadActivity(int i) {
        super(null);
        this.presets = new ArrayList();
        this.selectedPreset = 1;
        this.currentType = i;
        DownloadController.Preset preset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.lowPreset = preset;
        DownloadController.Preset preset2 = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.mediumPreset = preset2;
        DownloadController.Preset preset3 = DownloadController.getInstance(this.currentAccount).highPreset;
        this.highPreset = preset3;
        if (i == 0) {
            this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.typePreset = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.defaultPreset = preset2;
            this.key = "mobilePreset";
            this.key2 = "currentMobilePreset";
            return;
        }
        if (i == 1) {
            this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.typePreset = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.defaultPreset = preset3;
            this.key = "wifiPreset";
            this.key2 = "currentWifiPreset";
            return;
        }
        this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
        this.typePreset = DownloadController.getInstance(this.currentAccount).roamingPreset;
        this.defaultPreset = preset;
        this.key = "roamingPreset";
        this.key2 = "currentRoamingPreset";
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnMobileData));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnWiFiData));
        } else if (i == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AutoDownloadOnRoamingData));
        }
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 11));
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        zzku.m(this.listView);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 12));
        return this.fragmentView;
    }

    public final void fillPresets() {
        ArrayList arrayList = this.presets;
        arrayList.clear();
        DownloadController.Preset preset = this.lowPreset;
        arrayList.add(preset);
        DownloadController.Preset preset2 = this.mediumPreset;
        arrayList.add(preset2);
        DownloadController.Preset preset3 = this.highPreset;
        arrayList.add(preset3);
        DownloadController.Preset preset4 = this.typePreset;
        if (!preset4.equals(preset) && !preset4.equals(preset2) && !preset4.equals(preset3)) {
            arrayList.add(preset4);
        }
        Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(26));
        int i = this.currentPresetNum;
        if (i == 0 || (i == 3 && preset4.equals(preset))) {
            this.selectedPreset = arrayList.indexOf(preset);
        } else {
            int i2 = this.currentPresetNum;
            if (i2 == 1 || (i2 == 3 && preset4.equals(preset2))) {
                this.selectedPreset = arrayList.indexOf(preset2);
            } else {
                int i3 = this.currentPresetNum;
                if (i3 == 2 || (i3 == 3 && preset4.equals(preset3))) {
                    this.selectedPreset = arrayList.indexOf(preset3);
                } else {
                    this.selectedPreset = arrayList.indexOf(preset4);
                }
            }
        }
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(this.usageProgressRow);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                if (view instanceof SlideChooseView) {
                    updatePresetChoseView((SlideChooseView) view);
                    return;
                }
            }
            this.listAdapter.notifyItemChanged(this.usageProgressRow);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, NotificationsCheckCell.class, SlideChooseView.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 262160, new Class[]{TextCheckCell.class}, null, null, null, Theme.key_windowBackgroundChecked));
        arrayList.add(new ThemeDescription(this.listView, 262160, new Class[]{TextCheckCell.class}, null, null, null, Theme.key_windowBackgroundUnchecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundCheckText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackBlue));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackBlueChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackBlueThumb));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackBlueThumbChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackBlueSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackBlueSelectorChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        int i = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i));
        int i2 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, Theme.key_windowBackgroundWhiteGrayText));
        return arrayList;
    }

    public final void lambda$createView$3(TextCheckBoxCell[] textCheckBoxCellArr, int i, MaxFileSizeCell[] maxFileSizeCellArr, int i2, TextCheckCell[] textCheckCellArr, int i3, String str, String str2, BottomSheet.Builder builder, View view) {
        int i4 = this.currentPresetNum;
        DownloadController.Preset preset = this.typePreset;
        if (i4 != 3) {
            if (i4 == 0) {
                preset.set(this.lowPreset);
            } else if (i4 == 1) {
                preset.set(this.mediumPreset);
            } else if (i4 == 2) {
                preset.set(this.highPreset);
            }
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (textCheckBoxCellArr[i5].checkBox.isChecked) {
                int[] iArr = preset.mask;
                iArr[i5] = iArr[i5] | i;
            } else {
                int[] iArr2 = preset.mask;
                iArr2[i5] = iArr2[i5] & (~i);
            }
        }
        MaxFileSizeCell maxFileSizeCell = maxFileSizeCellArr[0];
        if (maxFileSizeCell != null) {
            maxFileSizeCell.getSize();
            preset.sizes[i2] = (int) maxFileSizeCellArr[0].getSize();
        }
        TextCheckCell textCheckCell = textCheckCellArr[0];
        if (textCheckCell != null) {
            int i6 = this.videosRow;
            Switch r9 = textCheckCell.checkBox;
            if (i3 == i6) {
                preset.preloadVideo = r9.isChecked;
            } else {
                preset.preloadMusic = r9.isChecked;
            }
        }
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
        editorEdit.putString(str, preset.toString());
        this.currentPresetNum = 3;
        editorEdit.putInt(str2, 3);
        int i7 = this.currentType;
        if (i7 == 0) {
            DownloadController.getInstance(this.currentAccount).currentMobilePreset = this.currentPresetNum;
        } else if (i7 == 1) {
            DownloadController.getInstance(this.currentAccount).currentWifiPreset = this.currentPresetNum;
        } else {
            DownloadController.getInstance(this.currentAccount).currentRoamingPreset = this.currentPresetNum;
        }
        editorEdit.commit();
        builder.bottomSheet.dismissRunnable.run();
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(view);
        if (viewHolderFindContainingViewHolder != null) {
            this.animateChecked = true;
            this.listAdapter.onBindViewHolder(viewHolderFindContainingViewHolder, i3);
            this.animateChecked = false;
        }
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
        this.wereAnyChanges = true;
        fillPresets();
    }

    public final void lambda$createView$4(final View view, float f, int i) {
        int i2;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z;
        final TextCheckCell[] textCheckCellArr;
        ?? r0;
        ArrayList arrayList;
        TextCheckCell[] textCheckCellArr2;
        AnimatorSet[] animatorSetArr;
        boolean z2;
        int i3 = i;
        DownloadController.Preset preset = this.highPreset;
        DownloadController.Preset preset2 = this.mediumPreset;
        DownloadController.Preset preset3 = this.lowPreset;
        int i4 = this.currentType;
        DownloadController.Preset preset4 = this.typePreset;
        if (i3 == 0) {
            int i5 = this.currentPresetNum;
            if (i5 != 3) {
                if (i5 == 0) {
                    preset4.set(preset3);
                } else if (i5 == 1) {
                    preset4.set(preset2);
                } else if (i5 == 2) {
                    preset4.set(preset);
                }
            }
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean z3 = textCheckCell.checkBox.isChecked;
            if (z3 || !preset4.enabled) {
                preset4.enabled = !preset4.enabled;
            } else {
                System.arraycopy(this.defaultPreset.mask, 0, preset4.mask, 0, 4);
            }
            view.setTag(Integer.valueOf(preset4.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
            boolean z4 = !z3;
            textCheckCell.setBackgroundColorAnimated(Theme.getColor(null, preset4.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false), z4);
            updateRows$25();
            if (preset4.enabled) {
                this.listAdapter.mObservable.notifyItemRangeInserted(this.autoDownloadSectionRow + 1, 9);
            } else {
                this.listAdapter.mObservable.notifyItemRangeRemoved(this.autoDownloadSectionRow + 1, 9);
            }
            this.listAdapter.notifyItemChanged(this.autoDownloadSectionRow);
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
            editorEdit.putString(this.key, preset4.toString());
            this.currentPresetNum = 3;
            editorEdit.putInt(this.key2, 3);
            if (i4 == 0) {
                DownloadController.getInstance(this.currentAccount).currentMobilePreset = this.currentPresetNum;
            } else if (i4 == 1) {
                DownloadController.getInstance(this.currentAccount).currentWifiPreset = this.currentPresetNum;
            } else {
                DownloadController.getInstance(this.currentAccount).currentRoamingPreset = this.currentPresetNum;
            }
            editorEdit.commit();
            textCheckCell.setChecked(z4);
            DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
            this.wereAnyChanges = true;
            return;
        }
        if ((i3 == this.photosRow || i3 == this.videosRow || i3 == this.filesRow || i3 == this.storiesRow) && view.isEnabled()) {
            if (i3 == this.photosRow) {
                i2 = 1;
            } else if (i3 == this.videosRow) {
                i2 = 4;
            } else {
                i2 = i3 == this.storiesRow ? -1 : 8;
            }
            final int iTypeToIndex = DownloadController.typeToIndex(i2);
            if (i4 == 0) {
                currentRoamingPreset = DownloadController.getInstance(this.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i4 == 1) {
                currentRoamingPreset = DownloadController.getInstance(this.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(this.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            boolean z5 = notificationsCheckCell.checkBox.isChecked;
            if (i3 == this.storiesRow || ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset5 = currentRoamingPreset;
                int i6 = i2;
                String str3 = str;
                String str4 = str2;
                int i7 = this.currentPresetNum;
                if (i7 != 3) {
                    if (i7 == 0) {
                        preset4.set(preset3);
                    } else if (i7 == 1) {
                        preset4.set(preset2);
                    } else if (i7 == 2) {
                        preset4.set(preset);
                    }
                }
                if (i3 != this.storiesRow) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= preset4.mask.length) {
                            z = false;
                            break;
                        } else {
                            if ((preset5.mask[i8] & i6) != 0) {
                                z = true;
                                break;
                            }
                            i8++;
                        }
                    }
                    int i9 = 0;
                    while (true) {
                        int[] iArr = preset4.mask;
                        if (i9 >= iArr.length) {
                            break;
                        }
                        if (z5) {
                            iArr[i9] = iArr[i9] & (~i6);
                        } else if (!z) {
                            iArr[i9] = iArr[i9] | i6;
                        }
                        i9++;
                    }
                } else {
                    preset4.preloadStories = !z5;
                }
                SharedPreferences.Editor editorEdit2 = MessagesController.getMainSettings(this.currentAccount).edit();
                editorEdit2.putString(str3, preset4.toString());
                this.currentPresetNum = 3;
                editorEdit2.putInt(str4, 3);
                if (i4 == 0) {
                    DownloadController.getInstance(this.currentAccount).currentMobilePreset = this.currentPresetNum;
                } else if (i4 == 1) {
                    DownloadController.getInstance(this.currentAccount).currentWifiPreset = this.currentPresetNum;
                } else {
                    DownloadController.getInstance(this.currentAccount).currentRoamingPreset = this.currentPresetNum;
                }
                editorEdit2.commit();
                notificationsCheckCell.setChecked(!z5);
                RecyclerListView recyclerListView = this.listView;
                View viewFindContainingItemView = recyclerListView.findContainingItemView(view);
                RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : recyclerListView.getChildViewHolder(viewFindContainingItemView);
                if (childViewHolder != null) {
                    this.listAdapter.onBindViewHolder(childViewHolder, i3);
                }
                DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
                this.wereAnyChanges = true;
                fillPresets();
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            final BottomSheet.Builder builder = new BottomSheet.Builder(getParentActivity(), null);
            BottomSheet bottomSheet = builder.bottomSheet;
            bottomSheet.applyTopPadding = false;
            bottomSheet.applyBottomPadding = false;
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            bottomSheet.customView = linearLayout;
            HeaderCell headerCell = new HeaderCell(getParentActivity(), Theme.key_dialogTextBlue2, 21, 15, false);
            if (i3 == this.photosRow) {
                headerCell.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
            } else if (i3 == this.videosRow) {
                headerCell.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
            } else {
                headerCell.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
            }
            linearLayout.addView(headerCell, LayoutHelper.createFrame(-2.0f, -1));
            MaxFileSizeCell[] maxFileSizeCellArr = new MaxFileSizeCell[1];
            TextCheckCell[] textCheckCellArr3 = new TextCheckCell[1];
            AnimatorSet[] animatorSetArr2 = new AnimatorSet[1];
            TextCheckBoxCell[] textCheckBoxCellArr = new TextCheckBoxCell[4];
            int i10 = 0;
            for (int i11 = 4; i10 < i11; i11 = 4) {
                TextCheckBoxCell textCheckBoxCell = new TextCheckBoxCell(getParentActivity());
                textCheckBoxCellArr[i10] = textCheckBoxCell;
                TextView textView = textCheckBoxCell.textView;
                CheckBoxSquare checkBoxSquare = textCheckBoxCell.checkBox;
                if (i10 == 0) {
                    String string = LocaleController.getString(R.string.AutodownloadContacts);
                    animatorSetArr = animatorSetArr2;
                    boolean z6 = (currentRoamingPreset.mask[0] & i2) != 0;
                    textView.setText(string);
                    checkBoxSquare.setChecked(z6, false);
                    textCheckBoxCell.needDivider = true;
                    textCheckBoxCell.setWillNotDraw(false);
                } else {
                    animatorSetArr = animatorSetArr2;
                    if (i10 == 1) {
                        String string2 = LocaleController.getString(R.string.AutodownloadPrivateChats);
                        boolean z7 = (currentRoamingPreset.mask[1] & i2) != 0;
                        textView.setText(string2);
                        checkBoxSquare.setChecked(z7, false);
                        textCheckBoxCell.needDivider = true;
                        textCheckBoxCell.setWillNotDraw(false);
                    } else {
                        if (i10 == 2) {
                            String string3 = LocaleController.getString(R.string.AutodownloadGroupChats);
                            boolean z8 = (currentRoamingPreset.mask[2] & i2) != 0;
                            textView.setText(string3);
                            checkBoxSquare.setChecked(z8, false);
                            textCheckBoxCell.needDivider = true;
                            textCheckBoxCell.setWillNotDraw(false);
                        } else {
                            String string4 = LocaleController.getString(R.string.AutodownloadChannels);
                            boolean z9 = (currentRoamingPreset.mask[3] & i2) != 0;
                            boolean z10 = i3 != this.photosRow;
                            textView.setText(string4);
                            z2 = false;
                            checkBoxSquare.setChecked(z9, false);
                            textCheckBoxCell.needDivider = z10;
                            textCheckBoxCell.setWillNotDraw(!z10);
                        }
                        textCheckBoxCellArr[i10].setBackgroundDrawable(Theme.getSelectorDrawable(z2));
                        TextCheckBoxCell textCheckBoxCell2 = textCheckBoxCellArr[i10];
                        int i12 = i3;
                        TextCheckBoxCell[] textCheckBoxCellArr2 = textCheckBoxCellArr;
                        DownloadController.Preset preset6 = currentRoamingPreset;
                        AnimatorSet[] animatorSetArr3 = animatorSetArr;
                        DataAutoDownloadActivity$$ExternalSyntheticLambda2 dataAutoDownloadActivity$$ExternalSyntheticLambda2 = new DataAutoDownloadActivity$$ExternalSyntheticLambda2(this, textCheckBoxCell, textCheckBoxCellArr2, i12, maxFileSizeCellArr, textCheckCellArr3, animatorSetArr3);
                        i3 = i12;
                        textCheckBoxCell2.setOnClickListener(dataAutoDownloadActivity$$ExternalSyntheticLambda2);
                        linearLayout.addView(textCheckBoxCellArr2[i10], LayoutHelper.createFrame(50.0f, -1));
                        i10++;
                        animatorSetArr2 = animatorSetArr3;
                        currentRoamingPreset = preset6;
                        textCheckBoxCellArr = textCheckBoxCellArr2;
                        maxFileSizeCellArr = maxFileSizeCellArr;
                    }
                }
                z2 = false;
                textCheckBoxCellArr[i10].setBackgroundDrawable(Theme.getSelectorDrawable(z2));
                TextCheckBoxCell textCheckBoxCell3 = textCheckBoxCellArr[i10];
                int i13 = i3;
                TextCheckBoxCell[] textCheckBoxCellArr3 = textCheckBoxCellArr;
                DownloadController.Preset preset7 = currentRoamingPreset;
                AnimatorSet[] animatorSetArr4 = animatorSetArr;
                DataAutoDownloadActivity$$ExternalSyntheticLambda2 dataAutoDownloadActivity$$ExternalSyntheticLambda3 = new DataAutoDownloadActivity$$ExternalSyntheticLambda2(this, textCheckBoxCell, textCheckBoxCellArr3, i13, maxFileSizeCellArr, textCheckCellArr3, animatorSetArr4);
                i3 = i13;
                textCheckBoxCell3.setOnClickListener(dataAutoDownloadActivity$$ExternalSyntheticLambda3);
                linearLayout.addView(textCheckBoxCellArr3[i10], LayoutHelper.createFrame(50.0f, -1));
                i10++;
                animatorSetArr2 = animatorSetArr4;
                currentRoamingPreset = preset7;
                textCheckBoxCellArr = textCheckBoxCellArr3;
                maxFileSizeCellArr = maxFileSizeCellArr;
            }
            final MaxFileSizeCell[] maxFileSizeCellArr2 = maxFileSizeCellArr;
            final TextCheckBoxCell[] textCheckBoxCellArr4 = textCheckBoxCellArr;
            DownloadController.Preset preset8 = currentRoamingPreset;
            AnimatorSet[] animatorSetArr5 = animatorSetArr2;
            if (i3 != this.photosRow) {
                TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(getParentActivity(), 24, null);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(getParentActivity(), i3, textInfoPrivacyCell, textCheckCellArr3, animatorSetArr5);
                maxFileSizeCellArr2[0] = anonymousClass3;
                anonymousClass3.setSize(preset8.sizes[iTypeToIndex]);
                linearLayout.addView(maxFileSizeCellArr2[0], LayoutHelper.createLinear(-1, 50));
                View textCheckCell2 = new TextCheckCell(21, getParentActivity(), null, true);
                textCheckCellArr2[0] = textCheckCell2;
                linearLayout.addView(textCheckCell2, LayoutHelper.createLinear(-1, 48));
                textCheckCellArr2[0].setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(textCheckCellArr2, 13));
                textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
                if (i3 == this.videosRow) {
                    textCheckCellArr2 = textCheckCellArr3;
                    maxFileSizeCellArr2[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                    textCheckCellArr2[0].setTextAndCheck(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset8.preloadVideo, false);
                    textInfoPrivacyCell.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset8.sizes[iTypeToIndex])));
                    textCheckCellArr = textCheckCellArr2;
                } else {
                    textCheckCellArr2 = textCheckCellArr3;
                    maxFileSizeCellArr2[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                    textCheckCellArr2[0].setTextAndCheck(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset8.preloadMusic, false);
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                    textCheckCellArr = textCheckCellArr2;
                }
            } else {
                maxFileSizeCellArr2[0] = null;
                textCheckCellArr3[0] = null;
                View view2 = new View(getParentActivity());
                view2.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                textCheckCellArr = textCheckCellArr3;
            }
            if (i3 == this.videosRow) {
                int i14 = 0;
                while (true) {
                    if (i14 >= 4) {
                        r0 = 0;
                        arrayList = null;
                        maxFileSizeCellArr2[0].setEnabled(null, false);
                        textCheckCellArr[0].setEnabled(null, false);
                        break;
                    }
                    if (textCheckBoxCellArr4[i14].checkBox.isChecked) {
                        r0 = 0;
                        arrayList = null;
                        break;
                    }
                    i14++;
                }
                if (preset8.sizes[iTypeToIndex] <= 2097152) {
                    textCheckCellArr[r0].setEnabled(arrayList, r0);
                }
            }
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 52));
            TextView textView2 = new TextView(getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i15 = Theme.key_dialogTextBlue2;
            textView2.setTextColor(Theme.getColor(null, i15, false));
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, 36, 51));
            textView2.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(builder, 14));
            TextView textView3 = new TextView(getParentActivity());
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(Theme.getColor(null, i15, false));
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView3, LayoutHelper.createFrame(-2, 36, 53));
            final int i16 = i3;
            final int i17 = i2;
            final String str5 = str;
            final String str6 = str2;
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    BottomSheet.Builder builder2 = builder;
                    this.f$0.lambda$createView$3(textCheckBoxCellArr4, i17, maxFileSizeCellArr2, iTypeToIndex, textCheckCellArr, i16, str5, str6, builder2, view);
                }
            });
            showDialog(bottomSheet);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        fillPresets();
        updateRows$25();
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.wereAnyChanges) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.currentType);
            this.wereAnyChanges = false;
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void updatePresetChoseView(SlideChooseView slideChooseView) {
        ArrayList arrayList = this.presets;
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            DownloadController.Preset preset = (DownloadController.Preset) arrayList.get(i);
            if (preset == this.lowPreset) {
                strArr[i] = LocaleController.getString(R.string.AutoDownloadLow);
            } else if (preset == this.mediumPreset) {
                strArr[i] = LocaleController.getString(R.string.AutoDownloadMedium);
            } else if (preset == this.highPreset) {
                strArr[i] = LocaleController.getString(R.string.AutoDownloadHigh);
            } else {
                strArr[i] = LocaleController.getString(R.string.AutoDownloadCustom);
            }
        }
        slideChooseView.setOptions(this.selectedPreset, null, strArr);
    }

    public final void updateRows$25() {
        this.rowCount = 2;
        this.autoDownloadSectionRow = 1;
        if (!this.typePreset.enabled) {
            this.usageHeaderRow = -1;
            this.usageProgressRow = -1;
            this.usageSectionRow = -1;
            this.typeHeaderRow = -1;
            this.photosRow = -1;
            this.videosRow = -1;
            this.filesRow = -1;
            this.storiesRow = -1;
            this.typeSectionRow = -1;
            return;
        }
        this.usageHeaderRow = 2;
        this.usageProgressRow = 3;
        this.usageSectionRow = 4;
        this.typeHeaderRow = 5;
        this.photosRow = 6;
        this.videosRow = 7;
        this.filesRow = 8;
        this.storiesRow = 9;
        this.rowCount = 11;
        this.typeSectionRow = 10;
    }
}
