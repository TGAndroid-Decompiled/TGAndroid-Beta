package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.CachedMediaLayout;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StorageDiagramView;
import org.telegram.ui.Storage.CacheModel;
public class DilogCacheBottomSheet extends BottomSheetWithRecyclerListView {
    private CacheControlActivity.ClearCacheButton button;
    private final Delegate cacheDelegate;
    private final CacheModel cacheModel;
    CachedMediaLayout cachedMediaLayout;
    CheckBoxCell[] checkBoxes;
    private final StorageDiagramView circleDiagramView;
    private StorageDiagramView.ClearViewData[] clearViewData;
    long dialogId;
    CacheControlActivity.DialogFileEntities entities;
    LinearLayout linearLayout;

    public interface Delegate {
        void cleanupDialogFiles(CacheControlActivity.DialogFileEntities dialogFileEntities, StorageDiagramView.ClearViewData[] clearViewDataArr, CacheModel cacheModel);

        void onAvatarClick();
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    protected CharSequence getTitle() {
        return getBaseFragment().getMessagesController().getFullName(this.dialogId);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter() {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public int getItemViewType(int i) {
                return i;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                if (i == 0) {
                    view = DilogCacheBottomSheet.this.linearLayout;
                } else if (i == 2) {
                    view = DilogCacheBottomSheet.this.cachedMediaLayout;
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((BottomSheet) DilogCacheBottomSheet.this).backgroundPaddingLeft;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((BottomSheet) DilogCacheBottomSheet.this).backgroundPaddingLeft;
                    view.setLayoutParams(layoutParams);
                } else {
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(viewGroup.getContext());
                    textInfoPrivacyCell.setFixedSize(12);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(viewGroup.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable.setFullsize(true);
                    textInfoPrivacyCell.setBackgroundDrawable(combinedDrawable);
                    view = textInfoPrivacyCell;
                }
                return new RecyclerListView.Holder(view);
            }

            @Override
            public int getItemCount() {
                return DilogCacheBottomSheet.this.cacheModel.isEmpty() ? 1 : 3;
            }
        };
    }

    public DilogCacheBottomSheet(CacheControlActivity cacheControlActivity, CacheControlActivity.DialogFileEntities dialogFileEntities, final CacheModel cacheModel, final Delegate delegate) {
        super(cacheControlActivity, false, false, !cacheModel.isEmpty(), null);
        String string;
        int i;
        int i2 = 1;
        this.clearViewData = new StorageDiagramView.ClearViewData[8];
        this.checkBoxes = new CheckBoxCell[8];
        this.cacheDelegate = delegate;
        this.entities = dialogFileEntities;
        this.cacheModel = cacheModel;
        this.dialogId = dialogFileEntities.dialogId;
        this.allowNestedScroll = false;
        updateTitle();
        setAllowNestedScroll(true);
        this.topPadding = 0.2f;
        Context context = cacheControlActivity.getContext();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        StorageDiagramView storageDiagramView = new StorageDiagramView(this, getContext(), dialogFileEntities.dialogId) {
            @Override
            public void onAvatarClick() {
                delegate.onAvatarClick();
            }
        };
        this.circleDiagramView = storageDiagramView;
        this.linearLayout.addView(storageDiagramView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 16));
        CheckBoxCell checkBoxCell = null;
        int i3 = 0;
        for (int i4 = 8; i3 < i4; i4 = 8) {
            if (i3 == 0) {
                string = LocaleController.getString("LocalPhotoCache", R.string.LocalPhotoCache);
                i = Theme.key_statisticChartLine_lightblue;
            } else if (i3 == i2) {
                string = LocaleController.getString("LocalVideoCache", R.string.LocalVideoCache);
                i = Theme.key_statisticChartLine_blue;
            } else if (i3 == 2) {
                string = LocaleController.getString("LocalDocumentCache", R.string.LocalDocumentCache);
                i = Theme.key_statisticChartLine_green;
            } else if (i3 == 3) {
                string = LocaleController.getString("LocalMusicCache", R.string.LocalMusicCache);
                i = Theme.key_statisticChartLine_red;
            } else if (i3 == 4) {
                string = LocaleController.getString("LocalAudioCache", R.string.LocalAudioCache);
                i = Theme.key_statisticChartLine_lightgreen;
            } else if (i3 == 5) {
                string = LocaleController.getString("LocalStickersCache", R.string.LocalStickersCache);
                i = Theme.key_statisticChartLine_orange;
            } else if (i3 == 7) {
                string = LocaleController.getString("LocalStoriesCache", R.string.LocalStoriesCache);
                i = Theme.key_statisticChartLine_indigo;
            } else {
                string = LocaleController.getString("LocalMiscellaneousCache", R.string.LocalMiscellaneousCache);
                i = Theme.key_statisticChartLine_purple;
            }
            CacheControlActivity.FileEntities fileEntities = dialogFileEntities.entitiesByType.get(i3);
            long j = fileEntities != null ? fileEntities.totalSize : 0L;
            if (j > 0) {
                this.clearViewData[i3] = new StorageDiagramView.ClearViewData(this.circleDiagramView);
                StorageDiagramView.ClearViewData[] clearViewDataArr = this.clearViewData;
                clearViewDataArr[i3].size = j;
                clearViewDataArr[i3].colorKey = i;
                checkBoxCell = new CheckBoxCell(context, 4, 21, null);
                checkBoxCell.setTag(Integer.valueOf(i3));
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                this.linearLayout.addView(checkBoxCell, LayoutHelper.createLinear(-1, 50));
                checkBoxCell.setText(string, AndroidUtilities.formatFileSize(j), true, true);
                checkBoxCell.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
                checkBoxCell.setCheckBoxColor(i, Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_checkboxCheck);
                checkBoxCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        DilogCacheBottomSheet.this.lambda$new$0(cacheModel, view);
                    }
                });
                this.checkBoxes[i3] = checkBoxCell;
            } else {
                this.clearViewData[i3] = null;
                this.checkBoxes[i3] = null;
            }
            i3++;
            i2 = 1;
        }
        if (checkBoxCell != null) {
            checkBoxCell.setNeedDivider(false);
        }
        this.circleDiagramView.setData(cacheModel, this.clearViewData);
        CachedMediaLayout cachedMediaLayout = new CachedMediaLayout(getContext(), cacheControlActivity) {
            @Override
            public void onMeasure(int i5, int i6) {
                super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec((((BottomSheetWithRecyclerListView) DilogCacheBottomSheet.this).contentHeight - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
            }
        };
        this.cachedMediaLayout = cachedMediaLayout;
        cachedMediaLayout.setBottomPadding(AndroidUtilities.dp(80.0f));
        this.cachedMediaLayout.setCacheModel(cacheModel);
        this.cachedMediaLayout.setDelegate(new CachedMediaLayout.Delegate() {
            @Override
            public void clear() {
            }

            @Override
            public void clearSelection() {
            }

            @Override
            public void onItemSelected(CacheControlActivity.DialogFileEntities dialogFileEntities2, CacheModel.FileInfo fileInfo, boolean z) {
                if (fileInfo != null) {
                    cacheModel.toggleSelect(fileInfo);
                    DilogCacheBottomSheet.this.cachedMediaLayout.updateVisibleRows();
                    DilogCacheBottomSheet.this.syncCheckBoxes();
                    DilogCacheBottomSheet.this.button.setSize(true, DilogCacheBottomSheet.this.circleDiagramView.updateDescription());
                    DilogCacheBottomSheet.this.circleDiagramView.update(true);
                }
            }

            @Override
            public void dismiss() {
                DilogCacheBottomSheet.this.dismiss();
            }
        });
        NestedSizeNotifierLayout nestedSizeNotifierLayout = this.nestedSizeNotifierLayout;
        if (nestedSizeNotifierLayout != null) {
            nestedSizeNotifierLayout.setChildLayout(this.cachedMediaLayout);
        } else {
            createButton();
            this.linearLayout.addView(this.button, LayoutHelper.createLinear(-1, 72, 80));
        }
        if (this.button != null) {
            this.button.setSize(true, this.circleDiagramView.calculateSize());
        }
    }

    public void lambda$new$0(CacheModel cacheModel, View view) {
        int i = 0;
        while (true) {
            StorageDiagramView.ClearViewData[] clearViewDataArr = this.clearViewData;
            if (i < clearViewDataArr.length) {
                if (clearViewDataArr[i] != null) {
                    boolean z = clearViewDataArr[i].clear;
                }
                i++;
            } else {
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                int intValue = ((Integer) checkBoxCell.getTag()).intValue();
                StorageDiagramView.ClearViewData[] clearViewDataArr2 = this.clearViewData;
                clearViewDataArr2[intValue].setClear(!clearViewDataArr2[intValue].clear);
                checkBoxCell.setChecked(this.clearViewData[intValue].clear, true);
                cacheModel.allFilesSelcetedByType(intValue, this.clearViewData[intValue].clear);
                this.cachedMediaLayout.update();
                this.button.setSize(true, this.circleDiagramView.updateDescription());
                this.circleDiagramView.update(true);
                return;
            }
        }
    }

    public void syncCheckBoxes() {
        CheckBoxCell[] checkBoxCellArr = this.checkBoxes;
        if (checkBoxCellArr[0] != null) {
            CheckBoxCell checkBoxCell = checkBoxCellArr[0];
            StorageDiagramView.ClearViewData clearViewData = this.clearViewData[0];
            boolean z = this.cacheModel.allPhotosSelected;
            clearViewData.clear = z;
            checkBoxCell.setChecked(z, true);
        }
        CheckBoxCell[] checkBoxCellArr2 = this.checkBoxes;
        if (checkBoxCellArr2[1] != null) {
            CheckBoxCell checkBoxCell2 = checkBoxCellArr2[1];
            StorageDiagramView.ClearViewData clearViewData2 = this.clearViewData[1];
            boolean z2 = this.cacheModel.allVideosSelected;
            clearViewData2.clear = z2;
            checkBoxCell2.setChecked(z2, true);
        }
        CheckBoxCell[] checkBoxCellArr3 = this.checkBoxes;
        if (checkBoxCellArr3[2] != null) {
            CheckBoxCell checkBoxCell3 = checkBoxCellArr3[2];
            StorageDiagramView.ClearViewData clearViewData3 = this.clearViewData[2];
            boolean z3 = this.cacheModel.allDocumentsSelected;
            clearViewData3.clear = z3;
            checkBoxCell3.setChecked(z3, true);
        }
        CheckBoxCell[] checkBoxCellArr4 = this.checkBoxes;
        if (checkBoxCellArr4[3] != null) {
            CheckBoxCell checkBoxCell4 = checkBoxCellArr4[3];
            StorageDiagramView.ClearViewData clearViewData4 = this.clearViewData[3];
            boolean z4 = this.cacheModel.allMusicSelected;
            clearViewData4.clear = z4;
            checkBoxCell4.setChecked(z4, true);
        }
        CheckBoxCell[] checkBoxCellArr5 = this.checkBoxes;
        if (checkBoxCellArr5[4] != null) {
            CheckBoxCell checkBoxCell5 = checkBoxCellArr5[4];
            StorageDiagramView.ClearViewData clearViewData5 = this.clearViewData[4];
            boolean z5 = this.cacheModel.allVoiceSelected;
            clearViewData5.clear = z5;
            checkBoxCell5.setChecked(z5, true);
        }
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                DilogCacheBottomSheet dilogCacheBottomSheet = DilogCacheBottomSheet.this;
                NestedSizeNotifierLayout nestedSizeNotifierLayout = dilogCacheBottomSheet.nestedSizeNotifierLayout;
                if (nestedSizeNotifierLayout != null) {
                    dilogCacheBottomSheet.setShowShadow(!nestedSizeNotifierLayout.isPinnedToTop());
                }
            }
        });
        if (this.nestedSizeNotifierLayout != null) {
            createButton();
            frameLayout.addView(this.button, LayoutHelper.createFrame(-1, 72, 80));
        }
    }

    private void createButton() {
        CacheControlActivity.ClearCacheButton clearCacheButton = new CacheControlActivity.ClearCacheButton(getContext());
        this.button = clearCacheButton;
        clearCacheButton.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                DilogCacheBottomSheet.this.lambda$createButton$3(view);
            }
        });
        StorageDiagramView storageDiagramView = this.circleDiagramView;
        if (storageDiagramView != null) {
            this.button.setSize(true, storageDiagramView.calculateSize());
        }
    }

    public void lambda$createButton$3(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.getString("ClearCache", R.string.ClearCache));
        builder.setMessage(LocaleController.getString("ClearCacheForChat", R.string.ClearCacheForChat));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                DilogCacheBottomSheet.this.lambda$createButton$1(dialogInterface, i);
            }
        });
        builder.setPositiveButton(LocaleController.getString("Clear", R.string.Clear), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                DilogCacheBottomSheet.this.lambda$createButton$2(dialogInterface, i);
            }
        });
        AlertDialog create = builder.create();
        create.show();
        create.redPositive();
    }

    public void lambda$createButton$1(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    public void lambda$createButton$2(DialogInterface dialogInterface, int i) {
        dismiss();
        this.cacheDelegate.cleanupDialogFiles(this.entities, this.clearViewData, this.cacheModel);
    }
}
