package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.StorageDiagramView;
import org.telegram.ui.Storage.CacheModel;

public class DialogCacheBottomSheet extends BottomSheetWithRecyclerListView {
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

    public DialogCacheBottomSheet(CacheControlActivity cacheControlActivity, CacheControlActivity.DialogFileEntities dialogFileEntities, final CacheModel cacheModel, final Delegate delegate) {
        String string;
        int i;
        long j;
        long j2;
        super(cacheControlActivity, false, false, !cacheModel.isEmpty(), null);
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
        StorageDiagramView storageDiagramView = new StorageDiagramView(getContext(), dialogFileEntities.dialogId) {
            @Override
            public void onAvatarClick() {
                delegate.onAvatarClick();
            }
        };
        this.circleDiagramView = storageDiagramView;
        this.linearLayout.addView(storageDiagramView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 16));
        CheckBoxCell checkBoxCell = null;
        int i2 = 0;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            if (i2 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i = Theme.key_statisticChartLine_lightblue;
            } else if (i2 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i = Theme.key_statisticChartLine_blue;
            } else if (i2 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i = Theme.key_statisticChartLine_green;
            } else if (i2 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i = Theme.key_statisticChartLine_red;
            } else if (i2 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i = Theme.key_statisticChartLine_lightgreen;
            } else if (i2 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i = Theme.key_statisticChartLine_orange;
            } else if (i2 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i = Theme.key_statisticChartLine_indigo;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i = Theme.key_statisticChartLine_purple;
            }
            CacheControlActivity.FileEntities fileEntities = dialogFileEntities.entitiesByType.get(i2);
            if (fileEntities != null) {
                j = 0;
                j2 = fileEntities.totalSize;
            } else {
                j = 0;
                j2 = 0;
            }
            if (j2 > j) {
                this.clearViewData[i2] = new StorageDiagramView.ClearViewData(this.circleDiagramView);
                StorageDiagramView.ClearViewData clearViewData = this.clearViewData[i2];
                clearViewData.size = j2;
                clearViewData.colorKey = i;
                int i4 = i;
                CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 4, 21, false, null);
                checkBoxCell2.setTag(Integer.valueOf(i2));
                checkBoxCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                this.linearLayout.addView(checkBoxCell2, LayoutHelper.createLinear(-1, 50));
                checkBoxCell2.setText(string, AndroidUtilities.formatFileSize(j2), true, true, false);
                checkBoxCell2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                int i5 = Theme.key_checkboxCheck;
                CheckBox2 checkBox2 = checkBoxCell2.checkBoxRound;
                if (checkBox2 != null) {
                    checkBox2.setColor(i4, i4, i5);
                }
                checkBoxCell2.setOnClickListener(new ArticleViewer$$ExternalSyntheticLambda53(24, this, cacheModel));
                this.checkBoxes[i2] = checkBoxCell2;
                checkBoxCell = checkBoxCell2;
            } else {
                this.clearViewData[i2] = null;
                this.checkBoxes[i2] = null;
            }
            i2++;
        }
        if (checkBoxCell != null) {
            checkBoxCell.setNeedDivider(false);
        }
        this.circleDiagramView.setData(cacheModel, this.clearViewData);
        CachedMediaLayout cachedMediaLayout = new CachedMediaLayout(getContext(), cacheControlActivity) {
            @Override
            public void onMeasure(int i6, int i7) {
                super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec((((BottomSheetWithRecyclerListView) DialogCacheBottomSheet.this).contentHeight - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
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
            public void dismiss() {
                DialogCacheBottomSheet.this.lambda$showGiftOfferSheet$15();
            }

            @Override
            public void onItemSelected(CacheControlActivity.DialogFileEntities dialogFileEntities2, CacheModel.FileInfo fileInfo, boolean z) {
                if (fileInfo != null) {
                    cacheModel.toggleSelect(fileInfo);
                    DialogCacheBottomSheet.this.cachedMediaLayout.updateVisibleRows();
                    DialogCacheBottomSheet.this.syncCheckBoxes();
                    DialogCacheBottomSheet.this.button.setSize(true, DialogCacheBottomSheet.this.circleDiagramView.updateDescription());
                    DialogCacheBottomSheet.this.circleDiagramView.update(true);
                }
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

    private void createButton() {
        CacheControlActivity.ClearCacheButton clearCacheButton = new CacheControlActivity.ClearCacheButton(getContext());
        this.button = clearCacheButton;
        clearCacheButton.button.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 9));
        StorageDiagramView storageDiagramView = this.circleDiagramView;
        if (storageDiagramView != null) {
            this.button.setSize(true, storageDiagramView.calculateSize());
        }
    }

    public void lambda$createButton$1(AlertDialog alertDialog, int i) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$createButton$2(AlertDialog alertDialog, int i) {
        lambda$showGiftOfferSheet$15();
        this.cacheDelegate.cleanupDialogFiles(this.entities, this.clearViewData, this.cacheModel);
    }

    public void lambda$createButton$3(View view) {
        final int i = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.ClearCache));
        builder.setMessage(LocaleController.getString(R.string.ClearCacheForChat));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener(this) {
            public final DialogCacheBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$createButton$1(alertDialog, i2);
                        break;
                    default:
                        this.f$0.lambda$createButton$2(alertDialog, i2);
                        break;
                }
            }
        });
        final int i2 = 1;
        builder.setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener(this) {
            public final DialogCacheBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$createButton$1(alertDialog, i3);
                        break;
                    default:
                        this.f$0.lambda$createButton$2(alertDialog, i3);
                        break;
                }
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.redPositive();
    }

    public void lambda$new$0(CacheModel cacheModel, View view) {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            StorageDiagramView.ClearViewData[] clearViewDataArr = this.clearViewData;
            if (i >= clearViewDataArr.length) {
                break;
            }
            StorageDiagramView.ClearViewData clearViewData = clearViewDataArr[i];
            i++;
        }
        CheckBoxCell checkBoxCell = (CheckBoxCell) view;
        int iIntValue = ((Integer) checkBoxCell.getTag()).intValue();
        StorageDiagramView.ClearViewData clearViewData2 = this.clearViewData[iIntValue];
        clearViewData2.setClear(!clearViewData2.clear);
        checkBoxCell.setChecked(this.clearViewData[iIntValue].clear, true);
        boolean z = this.clearViewData[iIntValue].clear;
        if (iIntValue == 0) {
            arrayList = cacheModel.media;
            cacheModel.allPhotosSelected = z;
        } else if (iIntValue == 1) {
            arrayList = cacheModel.media;
            cacheModel.allVideosSelected = z;
        } else if (iIntValue == 2) {
            arrayList = cacheModel.documents;
            cacheModel.allDocumentsSelected = z;
        } else if (iIntValue == 3) {
            arrayList = cacheModel.music;
            cacheModel.allMusicSelected = z;
        } else if (iIntValue == 4) {
            arrayList = cacheModel.voice;
            cacheModel.allVoiceSelected = z;
        } else if (iIntValue == 7) {
            arrayList = cacheModel.stories;
        } else {
            cacheModel.getClass();
            arrayList = null;
        }
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((CacheModel.FileInfo) arrayList.get(i2)).type == iIntValue) {
                    if (z) {
                        if (!cacheModel.selectedFiles.contains(arrayList.get(i2))) {
                            cacheModel.selectedFiles.add((CacheModel.FileInfo) arrayList.get(i2));
                            cacheModel.incSize((CacheModel.FileInfo) arrayList.get(i2), true);
                        }
                    } else if (cacheModel.selectedFiles.contains(arrayList.get(i2))) {
                        cacheModel.selectedFiles.remove(arrayList.get(i2));
                        cacheModel.incSize((CacheModel.FileInfo) arrayList.get(i2), false);
                    }
                }
            }
        }
        this.cachedMediaLayout.update();
        this.button.setSize(true, this.circleDiagramView.updateDescription());
        this.circleDiagramView.update(true);
    }

    public void syncCheckBoxes() {
        CheckBoxCell checkBoxCell = this.checkBoxes[0];
        if (checkBoxCell != null) {
            StorageDiagramView.ClearViewData clearViewData = this.clearViewData[0];
            boolean z = this.cacheModel.allPhotosSelected;
            clearViewData.clear = z;
            checkBoxCell.setChecked(z, true);
        }
        CheckBoxCell checkBoxCell2 = this.checkBoxes[1];
        if (checkBoxCell2 != null) {
            StorageDiagramView.ClearViewData clearViewData2 = this.clearViewData[1];
            boolean z2 = this.cacheModel.allVideosSelected;
            clearViewData2.clear = z2;
            checkBoxCell2.setChecked(z2, true);
        }
        CheckBoxCell checkBoxCell3 = this.checkBoxes[2];
        if (checkBoxCell3 != null) {
            StorageDiagramView.ClearViewData clearViewData3 = this.clearViewData[2];
            boolean z3 = this.cacheModel.allDocumentsSelected;
            clearViewData3.clear = z3;
            checkBoxCell3.setChecked(z3, true);
        }
        CheckBoxCell checkBoxCell4 = this.checkBoxes[3];
        if (checkBoxCell4 != null) {
            StorageDiagramView.ClearViewData clearViewData4 = this.clearViewData[3];
            boolean z4 = this.cacheModel.allMusicSelected;
            clearViewData4.clear = z4;
            checkBoxCell4.setChecked(z4, true);
        }
        CheckBoxCell checkBoxCell5 = this.checkBoxes[4];
        if (checkBoxCell5 != null) {
            StorageDiagramView.ClearViewData clearViewData5 = this.clearViewData[4];
            boolean z5 = this.cacheModel.allVoiceSelected;
            clearViewData5.clear = z5;
            checkBoxCell5.setChecked(z5, true);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public int getItemCount() {
                return DialogCacheBottomSheet.this.cacheModel.isEmpty() ? 1 : 3;
            }

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
                    view = DialogCacheBottomSheet.this.linearLayout;
                } else if (i == 2) {
                    view = DialogCacheBottomSheet.this.cachedMediaLayout;
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((BottomSheet) DialogCacheBottomSheet.this).backgroundPaddingLeft;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((BottomSheet) DialogCacheBottomSheet.this).backgroundPaddingLeft;
                    view.setLayoutParams(layoutParams);
                } else {
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(viewGroup.getContext(), 24, null);
                    textInfoPrivacyCell.setFixedSize(12);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundGray, false)), Theme.getThemedDrawableByKey(viewGroup.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable.setFullsize(true);
                    textInfoPrivacyCell.setBackgroundDrawable(combinedDrawable);
                    view = textInfoPrivacyCell;
                }
                return new RecyclerListView.Holder(view);
            }
        };
    }

    @Override
    public CharSequence getTitle() {
        return getBaseFragment().getMessagesController().getFullName(this.dialogId);
    }

    @Override
    public void onViewCreated(FrameLayout frameLayout) {
        super.onViewCreated(frameLayout);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                DialogCacheBottomSheet dialogCacheBottomSheet = DialogCacheBottomSheet.this;
                NestedSizeNotifierLayout nestedSizeNotifierLayout = dialogCacheBottomSheet.nestedSizeNotifierLayout;
                if (nestedSizeNotifierLayout != null) {
                    dialogCacheBottomSheet.setShowShadow(!nestedSizeNotifierLayout.isPinnedToTop());
                }
            }
        });
        if (this.nestedSizeNotifierLayout != null) {
            createButton();
            frameLayout.addView(this.button, LayoutHelper.createFrame(-1, 72, 80));
        }
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
