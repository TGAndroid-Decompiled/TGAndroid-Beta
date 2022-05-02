package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.MaxFileSizeCell;
import org.telegram.p009ui.Cells.NotificationsCheckCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextCheckBoxCell;
import org.telegram.p009ui.Cells.TextCheckCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.SlideChooseView;
import org.telegram.p009ui.DataAutoDownloadActivity;

public class DataAutoDownloadActivity extends BaseFragment {
    private boolean animateChecked;
    private int autoDownloadRow;
    private int autoDownloadSectionRow;
    private int currentPresetNum;
    private int currentType;
    private DownloadController.Preset defaultPreset;
    private int filesRow;
    private String key;
    private String key2;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int photosRow;
    private int rowCount;
    private int typeHeaderRow;
    private DownloadController.Preset typePreset;
    private int typeSectionRow;
    private int usageHeaderRow;
    private int usageProgressRow;
    private int usageSectionRow;
    private int videosRow;
    private boolean wereAnyChanges;
    private ArrayList<DownloadController.Preset> presets = new ArrayList<>();
    private int selectedPreset = 1;
    private DownloadController.Preset lowPreset = DownloadController.getInstance(this.currentAccount).lowPreset;
    private DownloadController.Preset mediumPreset = DownloadController.getInstance(this.currentAccount).mediumPreset;
    private DownloadController.Preset highPreset = DownloadController.getInstance(this.currentAccount).highPreset;

    public DataAutoDownloadActivity(int i) {
        this.currentType = i;
        int i2 = this.currentType;
        if (i2 == 0) {
            this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentMobilePreset;
            this.typePreset = DownloadController.getInstance(this.currentAccount).mobilePreset;
            this.defaultPreset = this.mediumPreset;
            this.key = "mobilePreset";
            this.key2 = "currentMobilePreset";
        } else if (i2 == 1) {
            this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentWifiPreset;
            this.typePreset = DownloadController.getInstance(this.currentAccount).wifiPreset;
            this.defaultPreset = this.highPreset;
            this.key = "wifiPreset";
            this.key2 = "currentWifiPreset";
        } else {
            this.currentPresetNum = DownloadController.getInstance(this.currentAccount).currentRoamingPreset;
            this.typePreset = DownloadController.getInstance(this.currentAccount).roamingPreset;
            this.defaultPreset = this.lowPreset;
            this.key = "roamingPreset";
            this.key2 = "currentRoamingPreset";
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        fillPresets();
        updateRows();
        return true;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        int i = this.currentType;
        if (i == 0) {
            this.actionBar.setTitle(LocaleController.getString("AutoDownloadOnMobileData", C0952R.string.AutoDownloadOnMobileData));
        } else if (i == 1) {
            this.actionBar.setTitle(LocaleController.getString("AutoDownloadOnWiFiData", C0952R.string.AutoDownloadOnWiFiData));
        } else if (i == 2) {
            this.actionBar.setTitle(LocaleController.getString("AutoDownloadOnRoamingData", C0952R.string.AutoDownloadOnRoamingData));
        }
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
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
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        ((FrameLayout) this.fragmentView).addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i2) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i2);
            }

            @Override
            public void onDoubleTap(View view, int i2, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i2, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i2, float f, float f2) {
                DataAutoDownloadActivity.this.lambda$createView$4(view, i2, f, f2);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$4(final android.view.View r30, final int r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.DataAutoDownloadActivity.lambda$createView$4(android.view.View, int, float, float):void");
    }

    public void lambda$createView$0(TextCheckBoxCell textCheckBoxCell, TextCheckBoxCell[] textCheckBoxCellArr, int i, MaxFileSizeCell[] maxFileSizeCellArr, TextCheckCell[] textCheckCellArr, final AnimatorSet[] animatorSetArr, View view) {
        if (view.isEnabled()) {
            boolean z = true;
            textCheckBoxCell.setChecked(!textCheckBoxCell.isChecked());
            int i2 = 0;
            while (true) {
                if (i2 >= textCheckBoxCellArr.length) {
                    z = false;
                    break;
                } else if (textCheckBoxCellArr[i2].isChecked()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i == this.videosRow && maxFileSizeCellArr[0].isEnabled() != z) {
                ArrayList<Animator> arrayList = new ArrayList<>();
                maxFileSizeCellArr[0].setEnabled(z, arrayList);
                if (maxFileSizeCellArr[0].getSize() > 2097152) {
                    textCheckCellArr[0].setEnabled(z, arrayList);
                }
                if (animatorSetArr[0] != null) {
                    animatorSetArr[0].cancel();
                    animatorSetArr[0] = null;
                }
                animatorSetArr[0] = new AnimatorSet();
                animatorSetArr[0].playTogether(arrayList);
                animatorSetArr[0].addListener(new AnimatorListenerAdapter(this) {
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
    }

    public static void lambda$createView$1(TextCheckCell[] textCheckCellArr, View view) {
        textCheckCellArr[0].setChecked(!textCheckCellArr[0].isChecked());
    }

    public static void lambda$createView$2(BottomSheet.Builder builder, View view) {
        builder.getDismissRunnable().run();
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
            if (textCheckBoxCellArr[i5].isChecked()) {
                int[] iArr = this.typePreset.mask;
                iArr[i5] = iArr[i5] | i;
            } else {
                int[] iArr2 = this.typePreset.mask;
                iArr2[i5] = iArr2[i5] & (i ^ (-1));
            }
        }
        if (maxFileSizeCellArr[0] != null) {
            maxFileSizeCellArr[0].getSize();
            this.typePreset.sizes[i2] = (int) maxFileSizeCellArr[0].getSize();
        }
        if (textCheckCellArr[0] != null) {
            if (i3 == this.videosRow) {
                this.typePreset.preloadVideo = textCheckCellArr[0].isChecked();
            } else {
                this.typePreset.preloadMusic = textCheckCellArr[0].isChecked();
            }
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(this.currentAccount).edit();
        edit.putString(str, this.typePreset.toString());
        this.currentPresetNum = 3;
        edit.putInt(str2, 3);
        int i6 = this.currentType;
        if (i6 == 0) {
            DownloadController.getInstance(this.currentAccount).currentMobilePreset = this.currentPresetNum;
        } else if (i6 == 1) {
            DownloadController.getInstance(this.currentAccount).currentWifiPreset = this.currentPresetNum;
        } else {
            DownloadController.getInstance(this.currentAccount).currentRoamingPreset = this.currentPresetNum;
        }
        edit.commit();
        builder.getDismissRunnable().run();
        RecyclerView.ViewHolder findContainingViewHolder = this.listView.findContainingViewHolder(view);
        if (findContainingViewHolder != null) {
            this.animateChecked = true;
            this.listAdapter.onBindViewHolder(findContainingViewHolder, i3);
            this.animateChecked = false;
        }
        DownloadController.getInstance(this.currentAccount).checkAutodownloadSettings();
        this.wereAnyChanges = true;
        fillPresets();
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (this.wereAnyChanges) {
            DownloadController.getInstance(this.currentAccount).savePresetToServer(this.currentType);
            this.wereAnyChanges = false;
        }
    }

    private void fillPresets() {
        this.presets.clear();
        this.presets.add(this.lowPreset);
        this.presets.add(this.mediumPreset);
        this.presets.add(this.highPreset);
        if (!this.typePreset.equals(this.lowPreset) && !this.typePreset.equals(this.mediumPreset) && !this.typePreset.equals(this.highPreset)) {
            this.presets.add(this.typePreset);
        }
        Collections.sort(this.presets, DataAutoDownloadActivity$$ExternalSyntheticLambda4.INSTANCE);
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
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(this.usageProgressRow);
            if (findViewHolderForAdapterPosition != null) {
                View view = findViewHolderForAdapterPosition.itemView;
                if (view instanceof SlideChooseView) {
                    updatePresetChoseView((SlideChooseView) view);
                    return;
                }
            }
            this.listAdapter.notifyItemChanged(this.usageProgressRow);
        }
    }

    public static int lambda$fillPresets$5(DownloadController.Preset preset, DownloadController.Preset preset2) {
        int typeToIndex = DownloadController.typeToIndex(4);
        int typeToIndex2 = DownloadController.typeToIndex(8);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int[] iArr = preset.mask;
            if (i < iArr.length) {
                if ((iArr[i] & 4) != 0) {
                    z = true;
                }
                if ((iArr[i] & 8) != 0) {
                    z2 = true;
                }
                if (z && z2) {
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            int[] iArr2 = preset2.mask;
            if (i2 < iArr2.length) {
                if ((iArr2[i2] & 4) != 0) {
                    z3 = true;
                }
                if ((iArr2[i2] & 8) != 0) {
                    z4 = true;
                }
                if (z3 && z4) {
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        int i3 = (z ? preset.sizes[typeToIndex] : 0) + (z2 ? preset.sizes[typeToIndex2] : 0);
        int i4 = (z3 ? preset2.sizes[typeToIndex] : 0) + (z4 ? preset2.sizes[typeToIndex2] : 0);
        if (i3 > i4) {
            return 1;
        }
        return i3 < i4 ? -1 : 0;
    }

    private void updateRows() {
        this.rowCount = 0;
        int i = 0 + 1;
        this.rowCount = i;
        this.autoDownloadRow = 0;
        int i2 = i + 1;
        this.rowCount = i2;
        this.autoDownloadSectionRow = i;
        if (this.typePreset.enabled) {
            int i3 = i2 + 1;
            this.rowCount = i3;
            this.usageHeaderRow = i2;
            int i4 = i3 + 1;
            this.rowCount = i4;
            this.usageProgressRow = i3;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.usageSectionRow = i4;
            int i6 = i5 + 1;
            this.rowCount = i6;
            this.typeHeaderRow = i5;
            int i7 = i6 + 1;
            this.rowCount = i7;
            this.photosRow = i6;
            int i8 = i7 + 1;
            this.rowCount = i8;
            this.videosRow = i7;
            int i9 = i8 + 1;
            this.rowCount = i9;
            this.filesRow = i8;
            this.rowCount = i9 + 1;
            this.typeSectionRow = i9;
            return;
        }
        this.usageHeaderRow = -1;
        this.usageProgressRow = -1;
        this.usageSectionRow = -1;
        this.typeHeaderRow = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.typeSectionRow = -1;
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return DataAutoDownloadActivity.this.rowCount;
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r17, int r18) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.DataAutoDownloadActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == DataAutoDownloadActivity.this.photosRow || adapterPosition == DataAutoDownloadActivity.this.videosRow || adapterPosition == DataAutoDownloadActivity.this.filesRow;
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
            SharedPreferences.Editor edit = MessagesController.getMainSettings(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).edit();
            edit.putInt(DataAutoDownloadActivity.this.key2, DataAutoDownloadActivity.this.currentPresetNum);
            edit.commit();
            DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).checkAutodownloadSettings();
            for (int i2 = 0; i2 < 3; i2++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = DataAutoDownloadActivity.this.listView.findViewHolderForAdapterPosition(DataAutoDownloadActivity.this.photosRow + i2);
                if (findViewHolderForAdapterPosition != null) {
                    DataAutoDownloadActivity.this.listAdapter.onBindViewHolder(findViewHolderForAdapterPosition, DataAutoDownloadActivity.this.photosRow + i2);
                }
            }
            DataAutoDownloadActivity.this.wereAnyChanges = true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TextInfoPrivacyCell textInfoPrivacyCell;
            if (i == 0) {
                TextCheckCell textCheckCell = new TextCheckCell(this.mContext);
                textCheckCell.setColors("windowBackgroundCheckText", "switchTrackBlue", "switchTrackBlueChecked", "switchTrackBlueThumb", "switchTrackBlueThumbChecked");
                textCheckCell.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                textCheckCell.setHeight(56);
                textInfoPrivacyCell = textCheckCell;
            } else if (i == 1) {
                textInfoPrivacyCell = new ShadowSectionCell(this.mContext);
            } else if (i == 2) {
                HeaderCell headerCell = new HeaderCell(this.mContext);
                headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textInfoPrivacyCell = headerCell;
            } else if (i == 3) {
                SlideChooseView slideChooseView = new SlideChooseView(this.mContext);
                slideChooseView.setCallback(new SlideChooseView.Callback() {
                    @Override
                    public final void onOptionSelected(int i2) {
                        DataAutoDownloadActivity.ListAdapter.this.lambda$onCreateViewHolder$0(i2);
                    }

                    @Override
                    public void onTouchEnd() {
                        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
                    }
                });
                slideChooseView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textInfoPrivacyCell = slideChooseView;
            } else if (i != 4) {
                TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(this.mContext);
                textInfoPrivacyCell2.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                textInfoPrivacyCell = textInfoPrivacyCell2;
            } else {
                NotificationsCheckCell notificationsCheckCell = new NotificationsCheckCell(this.mContext);
                notificationsCheckCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                textInfoPrivacyCell = notificationsCheckCell;
            }
            textInfoPrivacyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(textInfoPrivacyCell);
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
            return (i == DataAutoDownloadActivity.this.photosRow || i == DataAutoDownloadActivity.this.videosRow || i == DataAutoDownloadActivity.this.filesRow) ? 4 : 5;
        }
    }

    public void updatePresetChoseView(SlideChooseView slideChooseView) {
        String[] strArr = new String[this.presets.size()];
        for (int i = 0; i < this.presets.size(); i++) {
            DownloadController.Preset preset = this.presets.get(i);
            if (preset == this.lowPreset) {
                strArr[i] = LocaleController.getString("AutoDownloadLow", C0952R.string.AutoDownloadLow);
            } else if (preset == this.mediumPreset) {
                strArr[i] = LocaleController.getString("AutoDownloadMedium", C0952R.string.AutoDownloadMedium);
            } else if (preset == this.highPreset) {
                strArr[i] = LocaleController.getString("AutoDownloadHigh", C0952R.string.AutoDownloadHigh);
            } else {
                strArr[i] = LocaleController.getString("AutoDownloadCustom", C0952R.string.AutoDownloadCustom);
            }
        }
        slideChooseView.setOptions(this.selectedPreset, strArr);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, NotificationsCheckCell.class, SlideChooseView.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCheckCell.class}, null, null, null, "windowBackgroundChecked"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCheckCell.class}, null, null, null, "windowBackgroundUnchecked"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundCheckText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackBlue"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackBlueChecked"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackBlueThumb"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackBlueThumbChecked"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackBlueSelector"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackBlueSelectorChecked"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "switchTrackChecked"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, "switchTrack"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, "switchTrackChecked"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, "windowBackgroundWhiteGrayText"));
        return arrayList;
    }
}
