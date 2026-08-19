package org.telegram.ui;

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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
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
    private String key;
    private String key2;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private int photosRow;
    private int rowCount;
    private int storiesRow;
    private int typeHeaderRow;
    private DownloadController.Preset typePreset;
    private int typeSectionRow;
    private int usageHeaderRow;
    private int usageProgressRow;
    private int usageSectionRow;
    private int videosRow;
    private boolean wereAnyChanges;
    private ArrayList presets = new ArrayList();
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

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        fillPresets();
        updateRows();
        return true;
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
        if (iNavigationLayout != null && iNavigationLayout.isLayersLayout()) {
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
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setVerticalScrollBarEnabled(false);
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
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
                DataAutoDownloadActivity.$r8$lambda$mb03u8E9z4yCpdV_s5ZvVeoBPMQ(this.f$0, view, i2, f, f2);
            }
        });
        return this.fragmentView;
    }

    public static void $r8$lambda$mb03u8E9z4yCpdV_s5ZvVeoBPMQ(final DataAutoDownloadActivity dataAutoDownloadActivity, final View view, int i, float f, float f2) {
        int i2;
        DownloadController.Preset currentRoamingPreset;
        String str;
        String str2;
        boolean z;
        int i3;
        ArrayList arrayList;
        final TextCheckCell[] textCheckCellArr;
        ?? r15;
        ArrayList arrayList2;
        final TextCheckCell[] textCheckCellArr2;
        boolean z2;
        final int i4 = i;
        boolean z3 = false;
        int i5 = 2;
        if (i4 == dataAutoDownloadActivity.autoDownloadRow) {
            int i6 = dataAutoDownloadActivity.currentPresetNum;
            if (i6 != 3) {
                if (i6 == 0) {
                    dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.lowPreset);
                } else if (i6 == 1) {
                    dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.mediumPreset);
                } else if (i6 == 2) {
                    dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.highPreset);
                }
            }
            TextCheckCell textCheckCell = (TextCheckCell) view;
            boolean zIsChecked = textCheckCell.isChecked();
            if (!zIsChecked) {
                DownloadController.Preset preset = dataAutoDownloadActivity.typePreset;
                if (preset.enabled) {
                    System.arraycopy(dataAutoDownloadActivity.defaultPreset.mask, 0, preset.mask, 0, 4);
                } else {
                    DownloadController.Preset preset2 = dataAutoDownloadActivity.typePreset;
                    preset2.enabled = !preset2.enabled;
                }
            } else {
                DownloadController.Preset preset3 = dataAutoDownloadActivity.typePreset;
                preset3.enabled = !preset3.enabled;
            }
            view.setTag(Integer.valueOf(dataAutoDownloadActivity.typePreset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
            boolean z4 = !zIsChecked;
            textCheckCell.setBackgroundColorAnimated(z4, Theme.getColor(dataAutoDownloadActivity.typePreset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
            dataAutoDownloadActivity.updateRows();
            if (dataAutoDownloadActivity.typePreset.enabled) {
                dataAutoDownloadActivity.listAdapter.notifyItemRangeInserted(dataAutoDownloadActivity.autoDownloadSectionRow + 1, 9);
            } else {
                dataAutoDownloadActivity.listAdapter.notifyItemRangeRemoved(dataAutoDownloadActivity.autoDownloadSectionRow + 1, 9);
            }
            dataAutoDownloadActivity.listAdapter.notifyItemChanged(dataAutoDownloadActivity.autoDownloadSectionRow);
            SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
            editorEdit.putString(dataAutoDownloadActivity.key, dataAutoDownloadActivity.typePreset.toString());
            String str3 = dataAutoDownloadActivity.key2;
            dataAutoDownloadActivity.currentPresetNum = 3;
            editorEdit.putInt(str3, 3);
            int i7 = dataAutoDownloadActivity.currentType;
            if (i7 == 0) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.currentPresetNum;
            } else if (i7 == 1) {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.currentPresetNum;
            } else {
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.currentPresetNum;
            }
            editorEdit.commit();
            textCheckCell.setChecked(z4);
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
            dataAutoDownloadActivity.wereAnyChanges = true;
            return;
        }
        if ((i4 == dataAutoDownloadActivity.photosRow || i4 == dataAutoDownloadActivity.videosRow || i4 == dataAutoDownloadActivity.filesRow || i4 == dataAutoDownloadActivity.storiesRow) && view.isEnabled()) {
            if (i4 == dataAutoDownloadActivity.photosRow) {
                i2 = 1;
            } else if (i4 == dataAutoDownloadActivity.videosRow) {
                i2 = 4;
            } else {
                i2 = i4 == dataAutoDownloadActivity.storiesRow ? -1 : 8;
            }
            final int iTypeToIndex = DownloadController.typeToIndex(i2);
            int i8 = dataAutoDownloadActivity.currentType;
            if (i8 == 0) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentMobilePreset();
                str = "mobilePreset";
                str2 = "currentMobilePreset";
            } else if (i8 == 1) {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentWiFiPreset();
                str = "wifiPreset";
                str2 = "currentWifiPreset";
            } else {
                currentRoamingPreset = DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).getCurrentRoamingPreset();
                str = "roamingPreset";
                str2 = "currentRoamingPreset";
            }
            final String str4 = str;
            final String str5 = str2;
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            boolean zIsChecked2 = notificationsCheckCell.isChecked();
            if (i4 == dataAutoDownloadActivity.storiesRow || ((LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f)))) {
                DownloadController.Preset preset4 = currentRoamingPreset;
                int i9 = i2;
                int i10 = 0;
                int i11 = dataAutoDownloadActivity.currentPresetNum;
                if (i11 != 3) {
                    if (i11 == 0) {
                        dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.lowPreset);
                    } else if (i11 == 1) {
                        dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.mediumPreset);
                    } else if (i11 == 2) {
                        dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.highPreset);
                    }
                }
                if (i4 != dataAutoDownloadActivity.storiesRow) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= dataAutoDownloadActivity.typePreset.mask.length) {
                            z = false;
                            break;
                        } else {
                            if ((preset4.mask[i12] & i9) != 0) {
                                z = true;
                                break;
                            }
                            i12++;
                        }
                    }
                    while (true) {
                        int[] iArr = dataAutoDownloadActivity.typePreset.mask;
                        if (i10 >= iArr.length) {
                            break;
                        }
                        if (zIsChecked2) {
                            iArr[i10] = iArr[i10] & (~i9);
                        } else if (!z) {
                            iArr[i10] = iArr[i10] | i9;
                        }
                        i10++;
                    }
                } else {
                    dataAutoDownloadActivity.typePreset.preloadStories = !zIsChecked2;
                }
                SharedPreferences.Editor editorEdit2 = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
                editorEdit2.putString(str4, dataAutoDownloadActivity.typePreset.toString());
                dataAutoDownloadActivity.currentPresetNum = 3;
                editorEdit2.putInt(str5, 3);
                int i13 = dataAutoDownloadActivity.currentType;
                if (i13 == 0) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.currentPresetNum;
                } else if (i13 == 1) {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.currentPresetNum;
                } else {
                    DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.currentPresetNum;
                }
                editorEdit2.commit();
                notificationsCheckCell.setChecked(!zIsChecked2);
                RecyclerView.ViewHolder viewHolderFindContainingViewHolder = dataAutoDownloadActivity.listView.findContainingViewHolder(view);
                if (viewHolderFindContainingViewHolder != null) {
                    dataAutoDownloadActivity.listAdapter.onBindViewHolder(viewHolderFindContainingViewHolder, i4);
                }
                DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
                dataAutoDownloadActivity.wereAnyChanges = true;
                dataAutoDownloadActivity.fillPresets();
                return;
            }
            if (dataAutoDownloadActivity.getParentActivity() == null) {
                return;
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(dataAutoDownloadActivity.getParentActivity());
            builder.setApplyTopPadding(false);
            builder.setApplyBottomPadding(false);
            LinearLayout linearLayout = new LinearLayout(dataAutoDownloadActivity.getParentActivity());
            linearLayout.setOrientation(1);
            builder.setCustomView(linearLayout);
            HeaderCell headerCell = new HeaderCell(dataAutoDownloadActivity.getParentActivity(), Theme.key_dialogTextBlue2, 21, 15, false);
            if (i4 == dataAutoDownloadActivity.photosRow) {
                headerCell.setText(LocaleController.getString(R.string.AutoDownloadPhotosTitle));
            } else if (i4 == dataAutoDownloadActivity.videosRow) {
                headerCell.setText(LocaleController.getString(R.string.AutoDownloadVideosTitle));
            } else {
                headerCell.setText(LocaleController.getString(R.string.AutoDownloadFilesTitle));
            }
            linearLayout.addView(headerCell, LayoutHelper.createFrame(-1, -2.0f));
            final MaxFileSizeCell[] maxFileSizeCellArr = new MaxFileSizeCell[1];
            final TextCheckCell[] textCheckCellArr3 = new TextCheckCell[1];
            final AnimatorSet[] animatorSetArr = new AnimatorSet[1];
            TextCheckBoxCell[] textCheckBoxCellArr = new TextCheckBoxCell[4];
            int i14 = 0;
            for (int i15 = 4; i14 < i15; i15 = 4) {
                BottomSheet.Builder builder2 = builder;
                final TextCheckBoxCell textCheckBoxCell = new TextCheckBoxCell(dataAutoDownloadActivity.getParentActivity(), true, z3);
                textCheckBoxCellArr[i14] = textCheckBoxCell;
                if (i14 == 0) {
                    z2 = false;
                    textCheckBoxCell.setTextAndCheck(LocaleController.getString(R.string.AutodownloadContacts), (currentRoamingPreset.mask[0] & i2) != 0, true);
                } else {
                    z2 = false;
                    if (i14 == 1) {
                        textCheckBoxCell.setTextAndCheck(LocaleController.getString(R.string.AutodownloadPrivateChats), (currentRoamingPreset.mask[1] & i2) != 0, true);
                    } else if (i14 == i5) {
                        textCheckBoxCell.setTextAndCheck(LocaleController.getString(R.string.AutodownloadGroupChats), (currentRoamingPreset.mask[i5] & i2) != 0, true);
                    } else {
                        textCheckBoxCell.setTextAndCheck(LocaleController.getString(R.string.AutodownloadChannels), (currentRoamingPreset.mask[3] & i2) != 0, i4 != dataAutoDownloadActivity.photosRow);
                    }
                }
                textCheckBoxCellArr[i14].setBackgroundDrawable(Theme.getSelectorDrawable(z2));
                TextCheckBoxCell textCheckBoxCell2 = textCheckBoxCellArr[i14];
                DownloadController.Preset preset5 = currentRoamingPreset;
                LinearLayout linearLayout2 = linearLayout;
                final int i16 = i4;
                final TextCheckBoxCell[] textCheckBoxCellArr2 = textCheckBoxCellArr;
                View.OnClickListener onClickListener = new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        DataAutoDownloadActivity.$r8$lambda$J0F8187ubyHq7DfG5L4HQincKOs(this.f$0, textCheckBoxCell, textCheckBoxCellArr2, i16, maxFileSizeCellArr, textCheckCellArr3, animatorSetArr, view2);
                    }
                };
                i4 = i16;
                textCheckBoxCell2.setOnClickListener(onClickListener);
                linearLayout2.addView(textCheckBoxCellArr2[i14], LayoutHelper.createFrame(-1, 50.0f));
                i14++;
                maxFileSizeCellArr = maxFileSizeCellArr;
                builder = builder2;
                linearLayout = linearLayout2;
                textCheckBoxCellArr = textCheckBoxCellArr2;
                z3 = false;
                i5 = 2;
                animatorSetArr = animatorSetArr;
                currentRoamingPreset = preset5;
            }
            DownloadController.Preset preset6 = currentRoamingPreset;
            final BottomSheet.Builder builder3 = builder;
            final AnimatorSet[] animatorSetArr2 = animatorSetArr;
            final TextCheckBoxCell[] textCheckBoxCellArr3 = textCheckBoxCellArr;
            ViewGroup viewGroup = linearLayout;
            final MaxFileSizeCell[] maxFileSizeCellArr2 = maxFileSizeCellArr;
            if (i4 != dataAutoDownloadActivity.photosRow) {
                final TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(dataAutoDownloadActivity.getParentActivity());
                MaxFileSizeCell maxFileSizeCell = new MaxFileSizeCell(dataAutoDownloadActivity.getParentActivity()) {
                    @Override
                    protected void didChangedSizeValue(int i17) {
                        if (i4 == DataAutoDownloadActivity.this.videosRow) {
                            textInfoPrivacyCell.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(i17)));
                            boolean z5 = i17 > 2097152;
                            if (z5 != textCheckCellArr3[0].isEnabled()) {
                                ArrayList arrayList3 = new ArrayList();
                                textCheckCellArr3[0].setEnabled(z5, arrayList3);
                                AnimatorSet animatorSet = animatorSetArr2[0];
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    animatorSetArr2[0] = null;
                                }
                                animatorSetArr2[0] = new AnimatorSet();
                                animatorSetArr2[0].playTogether(arrayList3);
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
                i3 = i2;
                arrayList = null;
                maxFileSizeCell.setSize(preset6.sizes[iTypeToIndex]);
                viewGroup.addView(maxFileSizeCellArr2[0], LayoutHelper.createLinear(-1, 50));
                View textCheckCell2 = new TextCheckCell(dataAutoDownloadActivity.getParentActivity(), 21, true);
                textCheckCellArr2[0] = textCheckCell2;
                viewGroup.addView(textCheckCell2, LayoutHelper.createLinear(-1, 48));
                textCheckCellArr2[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        DataAutoDownloadActivity.$r8$lambda$DVrpoLY_LuS88H0712WO4Bwwpfo(textCheckCellArr2, view2);
                    }
                });
                textInfoPrivacyCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
                viewGroup.addView(textInfoPrivacyCell, LayoutHelper.createLinear(-1, -2));
                if (i4 == dataAutoDownloadActivity.videosRow) {
                    textCheckCellArr2 = textCheckCellArr3;
                    maxFileSizeCellArr2[0].setText(LocaleController.getString(R.string.AutoDownloadMaxVideoSize));
                    textCheckCellArr2[0].setTextAndCheck(LocaleController.getString(R.string.AutoDownloadPreloadVideo), preset6.preloadVideo, false);
                    textInfoPrivacyCell.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(preset6.sizes[iTypeToIndex])));
                    textCheckCellArr = textCheckCellArr2;
                } else {
                    textCheckCellArr2 = textCheckCellArr3;
                    maxFileSizeCellArr2[0].setText(LocaleController.getString(R.string.AutoDownloadMaxFileSize));
                    textCheckCellArr2[0].setTextAndCheck(LocaleController.getString(R.string.AutoDownloadPreloadMusic), preset6.preloadMusic, false);
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadPreloadMusicInfo));
                    textCheckCellArr = textCheckCellArr2;
                }
            } else {
                i3 = i2;
                arrayList = null;
                maxFileSizeCellArr2[0] = null;
                textCheckCellArr3[0] = null;
                View view2 = new View(dataAutoDownloadActivity.getParentActivity());
                view2.setBackgroundColor(Theme.getColor(Theme.key_divider));
                viewGroup.addView(view2, new LinearLayout.LayoutParams(-1, 1));
                textCheckCellArr = textCheckCellArr3;
            }
            if (i4 == dataAutoDownloadActivity.videosRow) {
                int i17 = 0;
                while (true) {
                    if (i17 < 4) {
                        if (textCheckBoxCellArr3[i17].isChecked()) {
                            arrayList2 = arrayList;
                            r15 = 0;
                            break;
                        }
                        i17++;
                    } else {
                        r15 = 0;
                        arrayList2 = arrayList;
                        maxFileSizeCellArr2[0].setEnabled(false, arrayList2);
                        textCheckCellArr[0].setEnabled(false, arrayList2);
                        break;
                    }
                }
                if (preset6.sizes[iTypeToIndex] <= 2097152) {
                    textCheckCellArr[r15].setEnabled(r15, arrayList2);
                }
            }
            FrameLayout frameLayout = new FrameLayout(dataAutoDownloadActivity.getParentActivity());
            frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            viewGroup.addView(frameLayout, LayoutHelper.createLinear(-1, 52));
            TextView textView = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView.setTextSize(1, 14.0f);
            int i18 = Theme.key_dialogTextBlue2;
            textView.setTextColor(Theme.getColor(i18));
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
            textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView, LayoutHelper.createFrame(-2, 36, 51));
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    builder3.getDismissRunnable().run();
                }
            });
            TextView textView2 = new TextView(dataAutoDownloadActivity.getParentActivity());
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(i18));
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setText(LocaleController.getString(R.string.Save).toUpperCase());
            textView2.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, 36, 53));
            final int i19 = i4;
            final int i20 = i3;
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    DataAutoDownloadActivity.$r8$lambda$QzH0Mk6Wfo2nHhxYYRk9W9PaUVo(this.f$0, textCheckBoxCellArr3, i20, maxFileSizeCellArr2, iTypeToIndex, textCheckCellArr, i19, str4, str5, builder3, view, view3);
                }
            });
            dataAutoDownloadActivity.showDialog(builder3.create());
        }
    }

    public static void $r8$lambda$J0F8187ubyHq7DfG5L4HQincKOs(DataAutoDownloadActivity dataAutoDownloadActivity, TextCheckBoxCell textCheckBoxCell, TextCheckBoxCell[] textCheckBoxCellArr, int i, MaxFileSizeCell[] maxFileSizeCellArr, TextCheckCell[] textCheckCellArr, final AnimatorSet[] animatorSetArr, View view) {
        dataAutoDownloadActivity.getClass();
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
            if (i != dataAutoDownloadActivity.videosRow || maxFileSizeCellArr[0].isEnabled() == z) {
                return;
            }
            ArrayList arrayList = new ArrayList();
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

    public static void $r8$lambda$DVrpoLY_LuS88H0712WO4Bwwpfo(TextCheckCell[] textCheckCellArr, View view) {
        TextCheckCell textCheckCell = textCheckCellArr[0];
        textCheckCell.setChecked(!textCheckCell.isChecked());
    }

    public static void $r8$lambda$QzH0Mk6Wfo2nHhxYYRk9W9PaUVo(DataAutoDownloadActivity dataAutoDownloadActivity, TextCheckBoxCell[] textCheckBoxCellArr, int i, MaxFileSizeCell[] maxFileSizeCellArr, int i2, TextCheckCell[] textCheckCellArr, int i3, String str, String str2, BottomSheet.Builder builder, View view, View view2) {
        int i4 = dataAutoDownloadActivity.currentPresetNum;
        if (i4 != 3) {
            if (i4 == 0) {
                dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.lowPreset);
            } else if (i4 == 1) {
                dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.mediumPreset);
            } else if (i4 == 2) {
                dataAutoDownloadActivity.typePreset.set(dataAutoDownloadActivity.highPreset);
            }
        }
        for (int i5 = 0; i5 < 4; i5++) {
            if (textCheckBoxCellArr[i5].isChecked()) {
                int[] iArr = dataAutoDownloadActivity.typePreset.mask;
                iArr[i5] = iArr[i5] | i;
            } else {
                int[] iArr2 = dataAutoDownloadActivity.typePreset.mask;
                iArr2[i5] = iArr2[i5] & (~i);
            }
        }
        MaxFileSizeCell maxFileSizeCell = maxFileSizeCellArr[0];
        if (maxFileSizeCell != null) {
            maxFileSizeCell.getSize();
            dataAutoDownloadActivity.typePreset.sizes[i2] = (int) maxFileSizeCellArr[0].getSize();
        }
        TextCheckCell textCheckCell = textCheckCellArr[0];
        if (textCheckCell != null) {
            if (i3 == dataAutoDownloadActivity.videosRow) {
                dataAutoDownloadActivity.typePreset.preloadVideo = textCheckCell.isChecked();
            } else {
                dataAutoDownloadActivity.typePreset.preloadMusic = textCheckCell.isChecked();
            }
        }
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(dataAutoDownloadActivity.currentAccount).edit();
        editorEdit.putString(str, dataAutoDownloadActivity.typePreset.toString());
        dataAutoDownloadActivity.currentPresetNum = 3;
        editorEdit.putInt(str2, 3);
        int i6 = dataAutoDownloadActivity.currentType;
        if (i6 == 0) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentMobilePreset = dataAutoDownloadActivity.currentPresetNum;
        } else if (i6 == 1) {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentWifiPreset = dataAutoDownloadActivity.currentPresetNum;
        } else {
            DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).currentRoamingPreset = dataAutoDownloadActivity.currentPresetNum;
        }
        editorEdit.commit();
        builder.getDismissRunnable().run();
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = dataAutoDownloadActivity.listView.findContainingViewHolder(view);
        if (viewHolderFindContainingViewHolder != null) {
            dataAutoDownloadActivity.animateChecked = true;
            dataAutoDownloadActivity.listAdapter.onBindViewHolder(viewHolderFindContainingViewHolder, i3);
            dataAutoDownloadActivity.animateChecked = false;
        }
        DownloadController.getInstance(dataAutoDownloadActivity.currentAccount).checkAutodownloadSettings();
        dataAutoDownloadActivity.wereAnyChanges = true;
        dataAutoDownloadActivity.fillPresets();
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
        Collections.sort(this.presets, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return DataAutoDownloadActivity.$r8$lambda$ChB6XYg_q_avlxVIMtdo7gbjLdU((DownloadController.Preset) obj, (DownloadController.Preset) obj2);
            }
        });
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
            this.listAdapter.notifyItemChanged(this.usageProgressRow);
        }
    }

    public static int $r8$lambda$ChB6XYg_q_avlxVIMtdo7gbjLdU(DownloadController.Preset preset, DownloadController.Preset preset2) {
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

    private void updateRows() {
        this.autoDownloadRow = 0;
        this.rowCount = 2;
        this.autoDownloadSectionRow = 1;
        if (this.typePreset.enabled) {
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
            return;
        }
        this.usageHeaderRow = -1;
        this.usageProgressRow = -1;
        this.usageSectionRow = -1;
        this.typeHeaderRow = -1;
        this.photosRow = -1;
        this.videosRow = -1;
        this.filesRow = -1;
        this.storiesRow = -1;
        this.typeSectionRow = -1;
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return DataAutoDownloadActivity.this.rowCount;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String string2;
            DownloadController.Preset currentWiFiPreset;
            int i2;
            StringBuilder sb;
            StringBuilder sb2;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                TextCheckCell textCheckCell = (TextCheckCell) viewHolder.itemView;
                if (i == DataAutoDownloadActivity.this.autoDownloadRow) {
                    textCheckCell.setDrawCheckRipple(true);
                    textCheckCell.setTextAndCheck(LocaleController.getString(R.string.AutoDownloadMedia), DataAutoDownloadActivity.this.typePreset.enabled, false);
                    textCheckCell.setTag(Integer.valueOf(DataAutoDownloadActivity.this.typePreset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    textCheckCell.setBackgroundColor(Theme.getColor(DataAutoDownloadActivity.this.typePreset.enabled ? Theme.key_windowBackgroundChecked : Theme.key_windowBackgroundUnchecked));
                    return;
                }
                return;
            }
            if (itemViewType == 2) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i != DataAutoDownloadActivity.this.usageHeaderRow) {
                    if (i == DataAutoDownloadActivity.this.typeHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.AutoDownloadTypes));
                        return;
                    }
                    return;
                }
                headerCell.setText(LocaleController.getString(R.string.AutoDownloadDataUsage));
                return;
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
                if (i != DataAutoDownloadActivity.this.typeSectionRow) {
                    if (i == DataAutoDownloadActivity.this.autoDownloadSectionRow) {
                        if (DataAutoDownloadActivity.this.usageHeaderRow == -1) {
                            if (DataAutoDownloadActivity.this.currentType != 0) {
                                if (DataAutoDownloadActivity.this.currentType != 1) {
                                    if (DataAutoDownloadActivity.this.currentType == 2) {
                                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnRoamingDataInfo));
                                    }
                                } else {
                                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnWiFiDataInfo));
                                }
                            } else {
                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadOnMobileDataInfo));
                            }
                            textInfoPrivacyCell.setImportantForAccessibility(1);
                            return;
                        }
                        textInfoPrivacyCell.setText(null);
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setImportantForAccessibility(4);
                        return;
                    }
                    return;
                }
                textInfoPrivacyCell.setText(LocaleController.getString(R.string.AutoDownloadAudioInfo));
                textInfoPrivacyCell.setFixedSize(0);
                textInfoPrivacyCell.setImportantForAccessibility(1);
                return;
            }
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
            notificationsCheckCell.setDrawLine(true);
            if (i != DataAutoDownloadActivity.this.photosRow) {
                if (i != DataAutoDownloadActivity.this.videosRow) {
                    if (i == DataAutoDownloadActivity.this.storiesRow) {
                        string = LocaleController.getString(R.string.AutoDownloadStories);
                        notificationsCheckCell.setDrawLine(false);
                    } else {
                        string = LocaleController.getString(R.string.AutoDownloadFiles);
                        i3 = 8;
                    }
                    string2 = string;
                } else {
                    string2 = LocaleController.getString(R.string.AutoDownloadVideos);
                    i3 = 4;
                }
            } else {
                string2 = LocaleController.getString(R.string.AutoDownloadPhotos);
                i3 = 1;
            }
            if (DataAutoDownloadActivity.this.currentType == 0) {
                currentWiFiPreset = DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).getCurrentMobilePreset();
            } else {
                currentWiFiPreset = DataAutoDownloadActivity.this.currentType == 1 ? DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).getCurrentWiFiPreset() : DownloadController.getInstance(((BaseFragment) DataAutoDownloadActivity.this).currentAccount).getCurrentRoamingPreset();
            }
            long j = currentWiFiPreset.sizes[DownloadController.typeToIndex(i3)];
            StringBuilder sb3 = new StringBuilder();
            if (i != DataAutoDownloadActivity.this.storiesRow) {
                int i4 = 0;
                i2 = 0;
                while (true) {
                    int[] iArr = currentWiFiPreset.mask;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    if ((iArr[i4] & i3) != 0) {
                        if (sb3.length() != 0) {
                            sb3.append(", ");
                        }
                        if (i4 == 0) {
                            sb3.append(LocaleController.getString(R.string.AutoDownloadContacts));
                        } else if (i4 == 1) {
                            sb3.append(LocaleController.getString(R.string.AutoDownloadPm));
                        } else if (i4 == 2) {
                            sb3.append(LocaleController.getString(R.string.AutoDownloadGroups));
                        } else if (i4 == 3) {
                            sb3.append(LocaleController.getString(R.string.AutoDownloadChannels));
                        }
                        i2++;
                    }
                    i4++;
                }
                if (i2 == 4) {
                    sb3.setLength(0);
                    if (i == DataAutoDownloadActivity.this.photosRow) {
                        sb3.append(LocaleController.getString(R.string.AutoDownloadOnAllChats));
                    } else {
                        sb3.append(LocaleController.formatString("AutoDownloadUpToOnAllChats", R.string.AutoDownloadUpToOnAllChats, AndroidUtilities.formatFileSize(j)));
                    }
                } else if (i2 != 0) {
                    if (i == DataAutoDownloadActivity.this.photosRow) {
                        sb = new StringBuilder(LocaleController.formatString("AutoDownloadOnFor", R.string.AutoDownloadOnFor, sb3.toString()));
                    } else {
                        sb = new StringBuilder(LocaleController.formatString("AutoDownloadOnUpToFor", R.string.AutoDownloadOnUpToFor, AndroidUtilities.formatFileSize(j), sb3.toString()));
                    }
                    sb2 = sb;
                } else {
                    sb3.append(LocaleController.getString(R.string.AutoDownloadOff));
                }
                sb2 = sb3;
            } else if (currentWiFiPreset.preloadStories) {
                sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOn", R.string.AutoDownloadOn, sb3.toString()));
                i2 = 1;
            } else {
                sb2 = new StringBuilder(LocaleController.formatString("AutoDownloadOff", R.string.AutoDownloadOff, sb3.toString()));
                i2 = 0;
            }
            if (DataAutoDownloadActivity.this.animateChecked) {
                notificationsCheckCell.setChecked(i2 != 0);
            }
            notificationsCheckCell.setTextAndValueAndCheck(string2, sb2, i2 != 0, 0, true, i != DataAutoDownloadActivity.this.storiesRow);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == DataAutoDownloadActivity.this.photosRow || adapterPosition == DataAutoDownloadActivity.this.videosRow || adapterPosition == DataAutoDownloadActivity.this.filesRow || adapterPosition == DataAutoDownloadActivity.this.storiesRow;
        }

        public static void $r8$lambda$GyoEd10YRE39OZnL2vNvE9bQdlc(ListAdapter listAdapter, int i) {
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
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            if (i == 0) {
                TextCheckCell textCheckCell = new TextCheckCell(this.mContext);
                textCheckCell.setColors(Theme.key_windowBackgroundCheckText, Theme.key_switchTrackBlue, Theme.key_switchTrackBlueChecked, Theme.key_switchTrackBlueThumb, Theme.key_switchTrackBlueThumbChecked);
                textCheckCell.setTypeface(AndroidUtilities.bold());
                textCheckCell.setHeight(56);
                shadowSectionCell = textCheckCell;
            } else if (i == 1) {
                shadowSectionCell = new ShadowSectionCell(this.mContext);
            } else if (i == 2) {
                shadowSectionCell = new HeaderCell(this.mContext);
            } else if (i == 3) {
                SlideChooseView slideChooseView = new SlideChooseView(this.mContext);
                slideChooseView.setCallback(new SlideChooseView.Callback() {
                    @Override
                    public final void onOptionSelected(int i2) {
                        DataAutoDownloadActivity.ListAdapter.$r8$lambda$GyoEd10YRE39OZnL2vNvE9bQdlc(this.f$0, i2);
                    }

                    @Override
                    public void onTouchEnd() {
                        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
                    }
                });
                shadowSectionCell = slideChooseView;
            } else if (i == 4) {
                shadowSectionCell = new NotificationsCheckCell(this.mContext);
            } else {
                shadowSectionCell = new TextInfoPrivacyCell(this.mContext);
            }
            shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(shadowSectionCell);
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
    }

    public void updatePresetChoseView(SlideChooseView slideChooseView) {
        String[] strArr = new String[this.presets.size()];
        for (int i = 0; i < this.presets.size(); i++) {
            DownloadController.Preset preset = (DownloadController.Preset) this.presets.get(i);
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

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, NotificationsCheckCell.class, SlideChooseView.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCheckCell.class}, null, null, null, Theme.key_windowBackgroundChecked));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCheckCell.class}, null, null, null, Theme.key_windowBackgroundUnchecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundCheckText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackBlue));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackBlueChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackBlueThumb));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackBlueThumbChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackBlueSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackBlueSelectorChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        int i = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        int i2 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SlideChooseView.class}, null, null, null, Theme.key_windowBackgroundWhiteGrayText));
        return arrayList;
    }
}
