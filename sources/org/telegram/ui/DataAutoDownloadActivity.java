package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
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
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;

public class DataAutoDownloadActivity extends BaseFragment {
    private boolean animateChecked;
    private int autoDownloadRow;
    private int autoDownloadSectionRow;
    private int currentPresetNum;
    private int currentType;
    private DownloadController.Preset defaultPreset;
    private int filesRow;
    private DownloadController.Preset highPreset;
    private String key;
    private String key2;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private DownloadController.Preset lowPreset;
    private DownloadController.Preset mediumPreset;
    private int photosRow;
    private ArrayList<DownloadController.Preset> presets;
    private int rowCount;
    private int selectedPreset;
    private int storiesRow;
    private int typeHeaderRow;
    private DownloadController.Preset typePreset;
    private int typeSectionRow;
    private int usageHeaderRow;
    private int usageProgressRow;
    private int usageSectionRow;
    private int videosRow;
    private boolean wereAnyChanges;

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$onCreateViewHolder$0(int i) {
            DownloadController.Preset preset = (DownloadController.Preset) DataAutoDownloadActivity.this.presets.get(i);
            if (preset == DataAutoDownloadActivity.this.lowPreset) {
                DataAutoDownloadActivity.this.currentPresetNum = 0;
            } else if (preset == DataAutoDownloadActivity.this.mediumPreset) {
                DataAutoDownloadActivity.this.currentPresetNum = 1;
            } else if (preset == DataAutoDownloadActivity.this.highPreset) {
                DataAutoDownloadActivity.this.currentPresetNum = 2;
            } else {
                DataAutoDownloadActivity.this.currentPresetNum = 3;
            }
            if (DataAutoDownloadActivity.this.currentType == 0) {
                DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).currentMobilePreset = DataAutoDownloadActivity.this.currentPresetNum;
            } else if (DataAutoDownloadActivity.this.currentType == 1) {
                DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).currentWifiPreset = DataAutoDownloadActivity.this.currentPresetNum;
            } else {
                DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).currentRoamingPreset = DataAutoDownloadActivity.this.currentPresetNum;
            }
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).edit();
            editorEdit.putInt(DataAutoDownloadActivity.this.key2, DataAutoDownloadActivity.this.currentPresetNum);
            editorEdit.commit();
            DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).checkAutodownloadSettings();
            for (int i2 = 0; i2 < 4; i2++) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = DataAutoDownloadActivity.this.listView.findViewHolderForAdapterPosition(DataAutoDownloadActivity.this.photosRow + i2);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    DataAutoDownloadActivity.this.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, DataAutoDownloadActivity.this.photosRow + i2);
                }
            }
            DataAutoDownloadActivity.this.wereAnyChanges = true;
        }

        @Override
        public int getItemCount() {
            return DataAutoDownloadActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == DataAutoDownloadActivity.this.autoDownloadRow) {
                return 0;
            }
            if (i == DataAutoDownloadActivity.this.usageSectionRow) {
                return 1;
            }
            if (i == DataAutoDownloadActivity.this.usageHeaderRow || i == DataAutoDownloadActivity.this.typeHeaderRow) {
                return 2;
            }
            if (i == DataAutoDownloadActivity.this.usageProgressRow) {
                return 3;
            }
            return (i == DataAutoDownloadActivity.this.photosRow || i == DataAutoDownloadActivity.this.videosRow || i == DataAutoDownloadActivity.this.filesRow || i == DataAutoDownloadActivity.this.storiesRow) ? 4 : 5;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == DataAutoDownloadActivity.this.photosRow || adapterPosition == DataAutoDownloadActivity.this.videosRow || adapterPosition == DataAutoDownloadActivity.this.filesRow || adapterPosition == DataAutoDownloadActivity.this.storiesRow;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            DownloadController.Preset currentWiFiPreset;
            int i2;
            StringBuilder sb;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == DataAutoDownloadActivity.this.autoDownloadRow) {
                    textCheckCell.setDrawCheckRipple(true);
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AutoDownloadMedia), DataAutoDownloadActivity.this.typePreset.enabled, false);
                    textCheckCell.setTag(Integer.valueOf(DataAutoDownloadActivity.this.typePreset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    textCheckCell.setBackgroundColor(Theme.getColor(null, DataAutoDownloadActivity.this.typePreset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
                    return;
                }
                return;
            }
            if (itemViewType == 2) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == DataAutoDownloadActivity.this.usageHeaderRow) {
                    headerCell.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                    return;
                } else {
                    if (i == DataAutoDownloadActivity.this.typeHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                        return;
                    }
                    return;
                }
            }
            if (itemViewType == 3) {
                DataAutoDownloadActivity.this.updatePresetChoseView((SlideChooseView) viewHolder.itemView);
                return;
            }
            int i3 = -1;
            if (itemViewType != 4) {
                if (itemViewType != 5) {
                    return;
                }
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                if (i == DataAutoDownloadActivity.this.typeSectionRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                    textInfoPrivacyCell.setFixedSize(0);
                    textInfoPrivacyCell.setImportantForAccessibility(1);
                    return;
                } else {
                    if (i == DataAutoDownloadActivity.this.autoDownloadSectionRow) {
                        if (DataAutoDownloadActivity.this.usageHeaderRow != -1) {
                            textInfoPrivacyCell.setText(null);
                            textInfoPrivacyCell.setFixedSize(12);
                            textInfoPrivacyCell.setImportantForAccessibility(4);
                            return;
                        }
                        if (DataAutoDownloadActivity.this.currentType == 0) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                        } else if (DataAutoDownloadActivity.this.currentType == 1) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                        } else if (DataAutoDownloadActivity.this.currentType == 2) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                        }
                        textInfoPrivacyCell.setImportantForAccessibility(1);
                        return;
                    }
                    return;
                }
            }
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
            notificationsCheckCell.setDrawLine(true);
            if (i == DataAutoDownloadActivity.this.photosRow) {
                string2 = LocaleController.getString(R.string.AutoDownloadPhotos);
                i3 = 1;
            } else if (i == DataAutoDownloadActivity.this.videosRow) {
                string2 = LocaleController.getString(R.string.AutoDownloadVideos);
                i3 = 4;
            } else {
                if (i == DataAutoDownloadActivity.this.storiesRow) {
                    string = LocaleController.getString(R.string.AutoDownloadStories);
                    notificationsCheckCell.setDrawLine(false);
                } else {
                    string = LocaleController.getString(R.string.AutoDownloadFiles);
                    i3 = 8;
                }
                string2 = string;
            }
            if (DataAutoDownloadActivity.this.currentType == 0) {
                currentWiFiPreset = DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).getCurrentMobilePreset();
            } else {
                currentWiFiPreset = DataAutoDownloadActivity.this.currentType == 1 ? DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).getCurrentWiFiPreset() : DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).getCurrentRoamingPreset();
            }
            long j = currentWiFiPreset.sizes[DownloadController.typeToIndex(i3)];
            StringBuilder sb2 = new StringBuilder();
            if (i != DataAutoDownloadActivity.this.storiesRow) {
                int i4 = 0;
                i2 = 0;
                while (true) {
                    int[] iArr = currentWiFiPreset.mask;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    if ((iArr[i4] & i3) != 0) {
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        if (i4 == 0) {
                            sb2.append(LocaleController.getString(R.string.AutoDownloadContacts));
                        } else if (i4 == 1) {
                            sb2.append(LocaleController.getString(R.string.AutoDownloadPm));
                        } else if (i4 == 2) {
                            sb2.append(LocaleController.getString(R.string.AutoDownloadGroups));
                        } else if (i4 == 3) {
                            sb2.append(LocaleController.getString(R.string.AutoDownloadChannels));
                        }
                        i2++;
                    }
                    i4++;
                }
                if (i2 == 4) {
                    sb2.setLength(0);
                    if (i == DataAutoDownloadActivity.this.photosRow) {
                        sb2.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                    } else {
                        sb2.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j)));
                    }
                } else if (i2 == 0) {
                    sb2.append(LocaleController.getString(R.string.AutoDownloadOff));
                } else {
                    sb = i == DataAutoDownloadActivity.this.photosRow ? new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb2.toString())) : new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j), sb2.toString()));
                }
                sb = sb2;
            } else if (currentWiFiPreset.preloadStories) {
                sb = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb2.toString()));
                i2 = 1;
            } else {
                sb = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb2.toString()));
                i2 = 0;
            }
            if (DataAutoDownloadActivity.this.animateChecked) {
                notificationsCheckCell.setChecked(i2 != 0);
            }
            notificationsCheckCell.setTextAndValueAndCheck(string2, sb, i2 != 0, 0, true, i != DataAutoDownloadActivity.this.storiesRow);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            if (i == 0) {
                TextCheckCell textCheckCell = new TextCheckCell(this.mContext);
                textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                textCheckCell.setTypeface(AndroidUtilities.bold());
                textCheckCell.setHeight(56);
                shadowSectionCell = textCheckCell;
            } else if (i == 1) {
                shadowSectionCell = new ShadowSectionCell(this.mContext, null, 0);
            } else if (i == 2) {
                shadowSectionCell = new HeaderCell(this.mContext);
            } else if (i != 3) {
                shadowSectionCell = i != 4 ? new TextInfoPrivacyCell(this.mContext, 24, null) : new NotificationsCheckCell(this.mContext);
            } else {
                SlideChooseView slideChooseView = new SlideChooseView(this.mContext);
                slideChooseView.setCallback(new PhotoViewer$55$$ExternalSyntheticLambda2(this, 10));
                shadowSectionCell = slideChooseView;
            }
            return zzkd.m(shadowSectionCell, shadowSectionCell, -2);
        }
    }

    public DataAutoDownloadActivity(int i) {
        super(null);
        this.presets = new ArrayList<>();
        this.selectedPreset = 1;
        this.currentType = i;
        this.lowPreset = DownloadController.getInstance(this.currentAccount).lowPreset;
        this.mediumPreset = DownloadController.getInstance(this.currentAccount).mediumPreset;
        this.highPreset = DownloadController.getInstance(this.currentAccount).highPreset;
        int i2 = this.currentType;
        if (i2 == 0) {
            this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.typePreset = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.defaultPreset = this.mediumPreset;
            this.key = "mobilePreset";
            this.key2 = "currentMobilePreset";
            return;
        }
        if (i2 == 1) {
            this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.typePreset = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.defaultPreset = this.highPreset;
            this.key = "wifiPreset";
            this.key2 = "currentWifiPreset";
            return;
        }
        this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
        this.typePreset = DownloadController.getInstance(this.currentAccount).roamingPreset;
        this.defaultPreset = this.lowPreset;
        this.key = "roamingPreset";
        this.key2 = "currentRoamingPreset";
    }

    private void fillPresets() {
        this.presets.clear();
        this.presets.add(this.lowPreset);
        this.presets.add(this.mediumPreset);
        this.presets.add(this.highPreset);
        if (!this.typePreset.equals(this.lowPreset) && !this.typePreset.equals(this.mediumPreset) && !this.typePreset.equals(this.highPreset)) {
            this.presets.add(this.typePreset);
        }
        Collections.sort(this.presets, new OAuthSheet$$ExternalSyntheticLambda10(11));
        int i = this.currentPresetNum;
        if (i == 0 || (i == 3 && this.typePreset.equals(this.lowPreset))) {
            this.selectedPreset = this.presets.indexOf(this.lowPreset);
        } else {
            int i2 = this.currentPresetNum;
            if (i2 == 1 || (i2 == 3 && this.typePreset.equals(this.mediumPreset))) {
                this.selectedPreset = this.presets.indexOf(this.mediumPreset);
            } else {
                int i3 = this.currentPresetNum;
                if (i3 == 2 || (i3 == 3 && this.typePreset.equals(this.highPreset))) {
                    this.selectedPreset = this.presets.indexOf(this.highPreset);
                } else {
                    this.selectedPreset = this.presets.indexOf(this.typePreset);
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
            this.listAdapter.lambda$onBindViewHolder$31(this.usageProgressRow);
        }
    }

    public void lambda$createView$0(TextCheckBoxCell textCheckBoxCell, TextCheckBoxCell[] textCheckBoxCellArr, int i, MaxFileSizeCell[] maxFileSizeCellArr, TextCheckCell[] textCheckCellArr, final AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z = true;
            textCheckBoxCell.setChecked(!textCheckBoxCell.checkBox.isChecked());
            int i2 = 0;
            while (true) {
                if (i2 >= textCheckBoxCellArr.length) {
                    z = false;
                    break;
                } else if (textCheckBoxCellArr[i2].checkBox.isChecked()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i != this.videosRow || maxFileSizeCellArr[0].isEnabled() == z) {
                return;
            }
            ArrayList<Animator> arrayList = new ArrayList<>();
            maxFileSizeCellArr[0].setEnabled(z, arrayList);
            if (maxFileSizeCellArr[0].getSize() > 2097152) {
                textCheckCellArr[0].setEnabled(z, arrayList);
            }
            AnimatorSet animatorSet = animatorSetArr[0];
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSetArr[0] = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[0] = animatorSet2;
            animatorSet2.playTogether(arrayList);
            animatorSetArr[0].addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(animatorSetArr[0])) {
                        animatorSetArr[0] = null;
                    }
                }
            });
            animatorSetArr[0].setDuration(150L);
            animatorSetArr[0].start();
        }
    }

    public static void lambda$createView$1(TextCheckCell[] textCheckCellArr, View view) {
        TextCheckCell textCheckCell = textCheckCellArr[0];
        textCheckCell.setChecked(!textCheckCell.isChecked());
    }

    public static void lambda$createView$2(BottomSheet.Builder builder, View view) {
        builder.bottomSheet.dismissRunnable.run();
    }

    public void lambda$createView$3(TextCheckBoxCell[] textCheckBoxCellArr, int i, MaxFileSizeCell[] maxFileSizeCellArr, int i2, TextCheckCell[] textCheckCellArr, int i3, String str, String str2, BottomSheet.Builder builder, View view, View view2) {
        int i4 = this.currentPresetNum;
        if (i4 != 3) {
            if (i4 == 0) {
                this.typePreset.set(this.lowPreset);
            } else if (i4 == 1) {
                this.typePreset.set(this.mediumPreset);
            } else if (i4 == 2) {
                this.typePreset.set(this.highPreset);
            }
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (textCheckBoxCellArr[i5].checkBox.isChecked()) {
                int[] iArr = this.typePreset.mask;
                iArr[i5] = iArr[i5] | i;
            } else {
                int[] iArr2 = this.typePreset.mask;
                iArr2[i5] = iArr2[i5] & (~i);
            }
        }
        MaxFileSizeCell maxFileSizeCell = maxFileSizeCellArr[0];
        if (maxFileSizeCell != null) {
            maxFileSizeCell.getSize();
            this.typePreset.sizes[i2] = (int) maxFileSizeCellArr[0].getSize();
        }
        TextCheckCell textCheckCell = textCheckCellArr[0];
        if (textCheckCell != null) {
            if (i3 == this.videosRow) {
                this.typePreset.preloadVideo = textCheckCell.isChecked();
            } else {
                this.typePreset.preloadMusic = textCheckCell.isChecked();
            }
        }
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
        editorEdit.putString(str, this.typePreset.toString());
        this.currentPresetNum = 3;
        editorEdit.putInt(str2, 3);
        int i6 = this.currentType;
        if (i6 == 0) {
            DownloadController.getInstance(this.currentAccount).currentMobilePreset = this.currentPresetNum;
        } else if (i6 == 1) {
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

    public void lambda$createView$4(final View view, int i, float f, float f2) {
        int i2;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z;
        final ?? r6;
        ?? r0;
        ArrayList arrayList;
        TextCheckCell[] textCheckCellArr;
        boolean z2;
        final int i3 = i;
        int i4 = 4;
        ?? r14 = 0;
        if (i3 == this.autoDownloadRow) {
            int i5 = this.currentPresetNum;
            if (i5 != 3) {
                if (i5 == 0) {
                    this.typePreset.set(this.lowPreset);
                } else if (i5 == 1) {
                    this.typePreset.set(this.mediumPreset);
                } else if (i5 == 2) {
                    this.typePreset.set(this.highPreset);
                }
            }
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean zIsChecked = textCheckCell.isChecked();
            if (zIsChecked) {
                DownloadController.Preset preset = this.typePreset;
                preset.enabled = !preset.enabled;
            } else {
                DownloadController.Preset preset2 = this.typePreset;
                if (preset2.enabled) {
                    System.arraycopy(this.defaultPreset.mask, 0, preset2.mask, 0, 4);
                } else {
                    DownloadController.Preset preset3 = this.typePreset;
                    preset3.enabled = !preset3.enabled;
                }
            }
            view.setTag(Integer.valueOf(this.typePreset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
            boolean z3 = !zIsChecked;
            textCheckCell.setBackgroundColorAnimated(z3, Theme.getColor(null, this.typePreset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked, false));
            updateRows();
            if (this.typePreset.enabled) {
                this.listAdapter.notifyItemRangeInserted(this.autoDownloadSectionRow + 1, 9);
            } else {
                this.listAdapter.notifyItemRangeRemoved(this.autoDownloadSectionRow + 1, 9);
            }
            this.listAdapter.lambda$onBindViewHolder$31(this.autoDownloadSectionRow);
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(this.currentAccount).edit();
            editorEdit.putString(this.key, this.typePreset.toString());
            String str3 = this.key2;
            this.currentPresetNum = 3;
            editorEdit.putInt(str3, 3);
            int i6 = this.currentType;
            if (i6 == 0) {
                DownloadController.getInstance(this.currentAccount).currentMobilePreset = this.currentPresetNum;
            } else if (i6 == 1) {
                DownloadController.getInstance(this.currentAccount).currentWifiPreset = this.currentPresetNum;
            } else {
                DownloadController.getInstance(this.currentAccount).currentRoamingPreset = this.currentPresetNum;
            }
            editorEdit.commit();
            textCheckCell.setChecked(z3);
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
            int i7 = this.currentType;
            if (i7 == 0) {
                currentRoamingPreset = DownloadController.getInstance(this.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i7 == 1) {
                currentRoamingPreset = DownloadController.getInstance(this.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(this.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            final String str4 = str;
            final String str5 = str2;
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            boolean zIsChecked2 = notificationsCheckCell.isChecked();
            if (i3 == this.storiesRow || ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset4 = currentRoamingPreset;
                int i8 = i2;
                int i9 = this.currentPresetNum;
                if (i9 != 3) {
                    if (i9 == 0) {
                        this.typePreset.set(this.lowPreset);
                    } else if (i9 == 1) {
                        this.typePreset.set(this.mediumPreset);
                    } else if (i9 == 2) {
                        this.typePreset.set(this.highPreset);
                    }
                }
                if (i3 != this.storiesRow) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= this.typePreset.mask.length) {
                            z = false;
                            break;
                        } else {
                            if ((preset4.mask[i10] & i8) != 0) {
                                z = true;
                                break;
                            }
                            i10++;
                        }
                    }
                    int i11 = 0;
                    while (true) {
                        int[] iArr = this.typePreset.mask;
                        if (i11 >= iArr.length) {
                            break;
                        }
                        if (zIsChecked2) {
                            iArr[i11] = iArr[i11] & (~i8);
                        } else if (!z) {
                            iArr[i11] = iArr[i11] | i8;
                        }
                        i11++;
                    }
                } else {
                    this.typePreset.preloadStories = !zIsChecked2;
                }
                SharedPreferences.Editor editorEdit2 = MessagesController.getMainSettings(this.currentAccount).edit();
                editorEdit2.putString(str4, this.typePreset.toString());
                this.currentPresetNum = 3;
                editorEdit2.putInt(str5, 3);
                int i12 = this.currentType;
                if (i12 == 0) {
                    DownloadController.getInstance(this.currentAccount).currentMobilePreset = this.currentPresetNum;
                } else if (i12 == 1) {
                    DownloadController.getInstance(this.currentAccount).currentWifiPreset = this.currentPresetNum;
                } else {
                    DownloadController.getInstance(this.currentAccount).currentRoamingPreset = this.currentPresetNum;
                }
                editorEdit2.commit();
                notificationsCheckCell.setChecked(!zIsChecked2);
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(view);
                if (viewHolderFindContainingViewHolder != null) {
                    this.listAdapter.onBindViewHolder(viewHolderFindContainingViewHolder, i3);
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
            ?? linearLayout = new LinearLayout(getParentActivity());
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
            linearLayout.addView(headerCell, LayoutHelper.createFrame(-1, -2.0f));
            MaxFileSizeCell[] maxFileSizeCellArr = new MaxFileSizeCell[1];
            final TextCheckCell[] textCheckCellArr2 = new TextCheckCell[1];
            AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            char c = 3;
            int i13 = 0;
            ?? r2 = new TextCheckBoxCell[4];
            while (i13 < i4) {
                ?? r21 = r2;
                ?? textCheckBoxCell = new TextCheckBoxCell(getParentActivity());
                r21[i13] = textCheckBoxCell;
                TextView textView = textCheckBoxCell.textView;
                ?? r15 = textCheckBoxCell.checkBox;
                if (i13 == 0) {
                    String string = LocaleController.getString(R.string.AutodownloadContacts);
                    boolean z4 = (currentRoamingPreset.mask[r14] & i2) != 0;
                    textView.setText(string);
                    r15.setChecked(z4, r14);
                    textCheckBoxCell.needDivider = true;
                    textCheckBoxCell.setWillNotDraw(r14);
                } else if (i13 == 1) {
                    String string2 = LocaleController.getString(R.string.AutodownloadPrivateChats);
                    boolean z5 = (currentRoamingPreset.mask[1] & i2) != 0;
                    textView.setText(string2);
                    r15.setChecked(z5, r14);
                    textCheckBoxCell.needDivider = true;
                    textCheckBoxCell.setWillNotDraw(r14);
                } else {
                    if (i13 == 2) {
                        String string3 = LocaleController.getString(R.string.AutodownloadGroupChats);
                        boolean z6 = (currentRoamingPreset.mask[2] & i2) != 0;
                        textView.setText(string3);
                        r15.setChecked(z6, r14);
                        textCheckBoxCell.needDivider = true;
                        textCheckBoxCell.setWillNotDraw(r14);
                    } else {
                        String string4 = LocaleController.getString(R.string.AutodownloadChannels);
                        boolean z7 = (currentRoamingPreset.mask[c] & i2) != 0;
                        boolean z8 = i3 != this.photosRow;
                        textView.setText(string4);
                        z2 = false;
                        r15.setChecked(z7, false);
                        textCheckBoxCell.needDivider = z8;
                        textCheckBoxCell.setWillNotDraw(!z8);
                    }
                    r21[i13].setBackgroundDrawable(Theme.getSelectorDrawable(z2));
                    BottomSheet bottomSheet2 = bottomSheet;
                    int i14 = i3;
                    i3 = i14;
                    r21[i13].setOnClickListener(new DataAutoDownloadActivity$$ExternalSyntheticLambda2((DataAutoDownloadActivity) this, (TextCheckBoxCell) textCheckBoxCell, (TextCheckBoxCell[]) r21, i14, maxFileSizeCellArr, textCheckCellArr2, animatorSetArr));
                    linearLayout.addView(r21[i13], LayoutHelper.createFrame(-1, 50.0f));
                    i13++;
                    maxFileSizeCellArr = maxFileSizeCellArr;
                    bottomSheet = bottomSheet2;
                    r2 = r21;
                    c = 3;
                    i4 = 4;
                    r14 = 0;
                    animatorSetArr = animatorSetArr;
                    currentRoamingPreset = currentRoamingPreset;
                }
                z2 = false;
                r21[i13].setBackgroundDrawable(Theme.getSelectorDrawable(z2));
                BottomSheet bottomSheet3 = bottomSheet;
                int i15 = i3;
                i3 = i15;
                r21[i13].setOnClickListener(new DataAutoDownloadActivity$$ExternalSyntheticLambda2((DataAutoDownloadActivity) this, (TextCheckBoxCell) textCheckBoxCell, (TextCheckBoxCell[]) r21, i15, maxFileSizeCellArr, textCheckCellArr2, animatorSetArr));
                linearLayout.addView(r21[i13], LayoutHelper.createFrame(-1, 50.0f));
                i13++;
                maxFileSizeCellArr = maxFileSizeCellArr;
                bottomSheet = bottomSheet3;
                r2 = r21;
                c = 3;
                i4 = 4;
                r14 = 0;
                animatorSetArr = animatorSetArr;
                currentRoamingPreset = currentRoamingPreset;
            }
            DownloadController.Preset preset5 = currentRoamingPreset;
            final ?? r22 = r2;
            BottomSheet bottomSheet4 = bottomSheet;
            final AnimatorSet[] animatorSetArr2 = animatorSetArr;
            final MaxFileSizeCell[] maxFileSizeCellArr2 = maxFileSizeCellArr;
            if (i3 != this.photosRow) {
                final TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(getParentActivity(), 24, null);
                MaxFileSizeCell maxFileSizeCell = new MaxFileSizeCell(getParentActivity()) {
                    @Override
                    public void didChangedSizeValue(int i16) {
                        if (i3 == DataAutoDownloadActivity.this.videosRow) {
                            textInfoPrivacyCell.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(i16)));
                            boolean z9 = i16 > 2097152;
                            if (z9 != textCheckCellArr2[0].isEnabled()) {
                                ArrayList<Animator> arrayList2 = new ArrayList<>();
                                textCheckCellArr2[0].setEnabled(z9, arrayList2);
                                AnimatorSet animatorSet = animatorSetArr2[0];
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    animatorSetArr2[0] = null;
                                }
                                animatorSetArr2[0] = new AnimatorSet();
                                animatorSetArr2[0].playTogether(arrayList2);
                                animatorSetArr2[0].addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animator) {
                                        if (animator.equals(animatorSetArr2[0])) {
                                            animatorSetArr2[0] = null;
                                        }
                                    }
                                });
                                animatorSetArr2[0].setDuration(150L);
                                animatorSetArr2[0].start();
                            }
                        }
                    }
                };
                maxFileSizeCellArr2[0] = maxFileSizeCell;
                maxFileSizeCell.setSize(preset5.sizes[iTypeToIndex]);
                linearLayout.addView(maxFileSizeCellArr2[0], LayoutHelper.createLinear(-1, 50));
                TextCheckCell textCheckCell2 = new TextCheckCell(getParentActivity(), 21, true, null);
                textCheckCellArr[0] = textCheckCell2;
                linearLayout.addView(textCheckCell2, LayoutHelper.createLinear(-1, 48));
                textCheckCellArr[0].setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(textCheckCellArr, 5));
                textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                linearLayout.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
                if (i3 == this.videosRow) {
                    textCheckCellArr = textCheckCellArr2;
                    maxFileSizeCellArr2[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                    textCheckCellArr[0].setTextAndCheck(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset5.preloadVideo, false);
                    textInfoPrivacyCell.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset5.sizes[iTypeToIndex])));
                    r6 = textCheckCellArr;
                } else {
                    textCheckCellArr = textCheckCellArr2;
                    maxFileSizeCellArr2[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                    textCheckCellArr[0].setTextAndCheck(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset5.preloadMusic, false);
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                    r6 = textCheckCellArr;
                }
            } else {
                maxFileSizeCellArr2[0] = null;
                textCheckCellArr2[0] = null;
                View view2 = new View(getParentActivity());
                view2.setBackgroundColor(Theme.getColor(null, Theme.key_divider, false));
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                r6 = textCheckCellArr2;
            }
            if (i3 == this.videosRow) {
                int i16 = 0;
                while (true) {
                    if (i16 >= 4) {
                        r0 = 0;
                        arrayList = null;
                        maxFileSizeCellArr2[0].setEnabled(false, null);
                        r6[0].setEnabled(false, null);
                        break;
                    }
                    if (r22[i16].checkBox.isChecked()) {
                        r0 = 0;
                        arrayList = null;
                        break;
                    }
                    i16++;
                }
                if (preset5.sizes[iTypeToIndex] <= 2097152) {
                    r6[r0].setEnabled(r0, arrayList);
                }
            }
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 52));
            TextView textView2 = new TextView(getParentActivity());
            textView2.setTextSize(1, 14.0f);
            int i17 = Theme.key_dialogTextBlue2;
            textView2.setTextColor(Theme.getColor(null, i17, false));
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, 36, 51));
            textView2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(builder, 6));
            TextView textView3 = new TextView(getParentActivity());
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(Theme.getColor(null, i17, false));
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView3, LayoutHelper.createFrame(-2, 36, 53));
            final int i18 = i3;
            final int i19 = i2;
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    BottomSheet.Builder builder2 = builder;
                    View view4 = view;
                    this.f$0.lambda$createView$3(r22, i19, maxFileSizeCellArr2, iTypeToIndex, r6, i18, str4, str5, builder2, view4, view3);
                }
            });
            showDialog(bottomSheet4);
        }
    }

    public static int lambda$fillPresets$5(DownloadController.Preset preset, DownloadController.Preset preset2) {
        int iTypeToIndex = DownloadController.typeToIndex(4);
        int iTypeToIndex2 = DownloadController.typeToIndex(8);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int[] iArr = preset.mask;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if ((i2 & 4) != 0) {
                z = true;
            }
            if ((i2 & 8) != 0) {
                z2 = true;
            }
            if (z && z2) {
                break;
            }
            i++;
        }
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int[] iArr2 = preset2.mask;
            if (i3 >= iArr2.length) {
                break;
            }
            int i4 = iArr2[i3];
            if ((i4 & 4) != 0) {
                z3 = true;
            }
            if ((i4 & 8) != 0) {
                z4 = true;
            }
            if (z3 && z4) {
                break;
            }
            i3++;
        }
        long j = (z ? preset.sizes[iTypeToIndex] : 0L) + (z2 ? preset.sizes[iTypeToIndex2] : 0L) + (preset.preloadStories ? 1L : 0L);
        long j2 = (z3 ? preset2.sizes[iTypeToIndex] : 0L) + (z4 ? preset2.sizes[iTypeToIndex2] : 0L) + (preset2.preloadStories ? 1L : 0L);
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void updatePresetChoseView(SlideChooseView slideChooseView) {
        String[] strArr = new String[this.presets.size()];
        for (int i = 0; i < this.presets.size(); i++) {
            DownloadController.Preset preset = this.presets.get(i);
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
        slideChooseView.setOptions(this.selectedPreset, strArr);
    }

    private void updateRows() {
        this.autoDownloadRow = 0;
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

    @Override
    public View createView(Context context) {
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
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    DataAutoDownloadActivity.this.finishFragment();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda4(this, 16));
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        fillPresets();
        updateRows();
        return true;
    }

    @Override
    public void onPause() {
        super.onPause();
        if (this.wereAnyChanges) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.currentType);
            this.wereAnyChanges = false;
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
}
