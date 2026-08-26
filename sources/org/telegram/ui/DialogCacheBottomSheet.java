package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.BinaryBitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StorageDiagramView;
import org.telegram.ui.Storage.CacheModel;

public final class DialogCacheBottomSheet extends BottomSheetWithRecyclerListView {
    public CacheControlActivity.ClearCacheButton button;
    public final BinaryBitmap cacheDelegate;
    public final CacheModel cacheModel;
    public final AnonymousClass3 cachedMediaLayout;
    public final CheckBoxCell[] checkBoxes;
    public final AnonymousClass2 circleDiagramView;
    public final StorageDiagramView.ClearViewData[] clearViewData;
    public final long dialogId;
    public final CacheControlActivity.DialogFileEntities entities;
    public final LinearLayout linearLayout;

    public final class AnonymousClass2 extends StorageDiagramView {
        public final BinaryBitmap val$delegate;

        public AnonymousClass2(Context context, long j, BinaryBitmap binaryBitmap) {
            super(context);
            this.val$delegate = binaryBitmap;
            this.dialogId = Long.valueOf(j);
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.scaleSize = 1.5f;
            ImageReceiver imageReceiver = new ImageReceiver();
            this.avatarImageReceiver = imageReceiver;
            imageReceiver.setParentView(this);
            if (j == Long.MAX_VALUE) {
                this.dialogText = LocaleController.getString(R.string.CacheOtherChats);
                avatarDrawable.setAvatarType(14);
                imageReceiver.setForUserOrChat(null, avatarDrawable);
            } else {
                String dialogPhotoTitle = DialogObject.setDialogPhotoTitle(imageReceiver, avatarDrawable, MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(j));
                this.dialogText = dialogPhotoTitle;
                this.dialogText = Emoji.replaceEmoji(dialogPhotoTitle, null, false);
            }
        }
    }

    public final class AnonymousClass3 extends CachedMediaLayout {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, Context context, BaseFragment baseFragment, int i) {
            super(context, baseFragment);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((DialogCacheBottomSheet) this.this$0).contentHeight - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, 1073741824));
                    break;
                default:
                    super.onMeasure(i, OKLCH.m(View.MeasureSpec.getSize(i2) - (ActionBar.getCurrentActionBarHeight() / 2), 12.0f, 1073741824));
                    break;
            }
        }

        public void showActionMode(boolean z) {
            CacheControlActivity cacheControlActivity = CacheControlActivity.this;
            if (!z) {
                ((BaseFragment) cacheControlActivity).actionBar.hideActionMode$1();
            } else {
                cacheControlActivity.updateActionBar(true);
                ((BaseFragment) cacheControlActivity).actionBar.showActionMode(null, null);
            }
        }
    }

    public DialogCacheBottomSheet(CacheControlActivity cacheControlActivity, CacheControlActivity.DialogFileEntities dialogFileEntities, CacheModel cacheModel, BinaryBitmap binaryBitmap) {
        String string;
        int i;
        long j;
        long j2;
        super(cacheControlActivity.getParentActivity(), cacheControlActivity, false, false, !cacheModel.isEmpty(), null);
        this.clearViewData = new StorageDiagramView.ClearViewData[8];
        this.checkBoxes = new CheckBoxCell[8];
        this.cacheDelegate = binaryBitmap;
        this.entities = dialogFileEntities;
        this.cacheModel = cacheModel;
        this.dialogId = dialogFileEntities.dialogId;
        this.allowNestedScroll = false;
        updateTitle$1();
        setAllowNestedScroll(true);
        this.topPadding = 0.2f;
        Activity parentActivity = cacheControlActivity.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(getContext(), dialogFileEntities.dialogId, binaryBitmap);
        this.circleDiagramView = anonymousClass2;
        linearLayout.addView(anonymousClass2, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 16));
        CheckBoxCell checkBoxCell = null;
        for (int i2 = 0; i2 < 8; i2++) {
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
            CacheControlActivity.FileEntities fileEntities = (CacheControlActivity.FileEntities) dialogFileEntities.entitiesByType.get(i2);
            if (fileEntities != null) {
                j = 0;
                j2 = fileEntities.totalSize;
            } else {
                j = 0;
                j2 = 0;
            }
            if (j2 > j) {
                this.clearViewData[i2] = new StorageDiagramView.ClearViewData();
                StorageDiagramView.ClearViewData clearViewData = this.clearViewData[i2];
                clearViewData.size = j2;
                clearViewData.colorKey = i;
                int i3 = i;
                CheckBoxCell checkBoxCell2 = new CheckBoxCell(parentActivity, 4, 21, false, null);
                checkBoxCell2.setTag(Integer.valueOf(i2));
                checkBoxCell2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                this.linearLayout.addView(checkBoxCell2, LayoutHelper.createLinear(-1, 50));
                checkBoxCell2.setText(string, AndroidUtilities.formatFileSize(j2), true, true, false);
                checkBoxCell2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
                int i4 = Theme.key_checkboxCheck;
                CheckBox2 checkBox2 = checkBoxCell2.checkBoxRound;
                if (checkBox2 != null) {
                    checkBox2.checkBoxBase.setColor(i3, i3, i4);
                }
                checkBoxCell2.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(1, this, cacheModel));
                this.checkBoxes[i2] = checkBoxCell2;
                checkBoxCell = checkBoxCell2;
            } else {
                this.clearViewData[i2] = null;
                this.checkBoxes[i2] = null;
            }
        }
        if (checkBoxCell != null) {
            checkBoxCell.setNeedDivider(false);
        }
        AnonymousClass2 anonymousClass3 = this.circleDiagramView;
        StorageDiagramView.ClearViewData[] clearViewDataArr = this.clearViewData;
        anonymousClass3.data = clearViewDataArr;
        anonymousClass3.cacheModel = cacheModel;
        anonymousClass3.invalidate();
        anonymousClass3.drawingPercentage = new float[clearViewDataArr.length];
        anonymousClass3.animateToPercentage = new float[clearViewDataArr.length];
        anonymousClass3.startFromPercentage = new float[clearViewDataArr.length];
        anonymousClass3.update(false);
        if (anonymousClass3.enabledCount > 1) {
            anonymousClass3.singleProgress = 0.0f;
        } else {
            anonymousClass3.singleProgress = 1.0f;
        }
        AnonymousClass3 anonymousClass4 = new AnonymousClass3(this, getContext(), cacheControlActivity, 0);
        this.cachedMediaLayout = anonymousClass4;
        anonymousClass4.setBottomPadding(AndroidUtilities.dp(80.0f));
        anonymousClass4.setCacheModel(cacheModel);
        anonymousClass4.setDelegate(new PhotoViewer.AnonymousClass14(4, this, cacheModel));
        BottomSheetWithRecyclerListView.AnonymousClass1 anonymousClass1 = this.nestedSizeNotifierLayout;
        if (anonymousClass1 != null) {
            anonymousClass1.setChildLayout(anonymousClass4);
        } else {
            createButton$1();
            this.linearLayout.addView(this.button, LayoutHelper.createLinear(-1, 72, 80));
        }
        if (this.button != null) {
            this.button.setSize(this.circleDiagramView.calculateSize(), true);
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public final int getItemCount() {
                return DialogCacheBottomSheet.this.cacheModel.isEmpty() ? 1 : 3;
            }

            @Override
            public final int getItemViewType(int i) {
                return i;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                DialogCacheBottomSheet dialogCacheBottomSheet = DialogCacheBottomSheet.this;
                if (i == 0) {
                    view = dialogCacheBottomSheet.linearLayout;
                } else if (i == 2) {
                    view = dialogCacheBottomSheet.cachedMediaLayout;
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((BottomSheet) dialogCacheBottomSheet).backgroundPaddingLeft;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((BottomSheet) dialogCacheBottomSheet).backgroundPaddingLeft;
                    view.setLayoutParams(layoutParams);
                } else {
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(viewGroup.getContext(), 24, null);
                    textInfoPrivacyCell.setFixedSize(12);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(null, Theme.key_windowBackgroundGray, false)), Theme.getThemedDrawableByKey(viewGroup.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable.fullSize = true;
                    textInfoPrivacyCell.setBackgroundDrawable(combinedDrawable);
                    view = textInfoPrivacyCell;
                }
                return new RecyclerListView.Holder(view);
            }
        };
    }

    public final void createButton$1() {
        CacheControlActivity.ClearCacheButton clearCacheButton = new CacheControlActivity.ClearCacheButton(getContext());
        this.button = clearCacheButton;
        clearCacheButton.button.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 16));
        AnonymousClass2 anonymousClass2 = this.circleDiagramView;
        if (anonymousClass2 != null) {
            this.button.setSize(anonymousClass2.calculateSize(), true);
        }
    }

    @Override
    public final CharSequence getTitle() {
        return this.baseFragment.getMessagesController().getFullName(this.dialogId);
    }

    @Override
    public final void onViewCreated(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        this.recyclerListView.addOnScrollListener(new LocationActivity.AnonymousClass10(this, 16));
        if (this.nestedSizeNotifierLayout != null) {
            createButton$1();
            sizeNotifierFrameLayout.addView(this.button, LayoutHelper.createFrame(-1, 72, 80));
        }
    }
}
