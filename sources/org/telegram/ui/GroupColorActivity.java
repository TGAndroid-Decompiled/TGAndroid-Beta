package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChannelColorActivity;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.GroupColorActivity;
public class GroupColorActivity extends ChannelColorActivity {
    private boolean isLoading;
    private ChannelColorActivity.ProfilePreview profilePreview;
    private float profilePreviewPercent;

    @Override
    protected int getMessagePreviewType() {
        return 4;
    }

    @Override
    protected boolean needBoostInfoSection() {
        return true;
    }

    public GroupColorActivity(long j) {
        super(j);
        this.isGroup = true;
    }

    @Override
    protected int getProfileIconLevelMin() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override
    protected int getCustomWallpaperLevelMin() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    @Override
    protected int getWallpaperLevelMin() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override
    protected int getEmojiStatusLevelMin() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override
    protected int getEmojiStickersLevelMin() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override
    protected void updateRows() {
        ChannelColorActivity.Adapter adapter;
        ChannelColorActivity.Adapter adapter2;
        this.rowsCount = 0;
        int i = 0 + 1;
        this.rowsCount = i;
        this.profilePreviewRow = 0;
        int i2 = i + 1;
        this.rowsCount = i2;
        this.profileColorGridRow = i;
        int i3 = i2 + 1;
        this.rowsCount = i3;
        this.profileEmojiRow = i2;
        if (this.selectedProfileEmoji != 0 || this.selectedProfileColor >= 0) {
            boolean z = this.removeProfileColorRow >= 0;
            this.rowsCount = i3 + 1;
            this.removeProfileColorRow = i3;
            if (!z && (adapter = this.adapter) != null) {
                adapter.notifyItemInserted(i3);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
                this.listView.scrollToPosition(0);
            }
        } else {
            int i4 = this.removeProfileColorRow;
            this.removeProfileColorRow = -1;
            if (i4 >= 0 && (adapter2 = this.adapter) != null) {
                adapter2.notifyItemRemoved(i4);
                this.adapter.notifyItemChanged(this.profileEmojiRow);
            }
        }
        int i5 = this.rowsCount;
        int i6 = i5 + 1;
        this.rowsCount = i6;
        this.profileHintRow = i5;
        int i7 = i6 + 1;
        this.rowsCount = i7;
        this.packEmojiRow = i6;
        int i8 = i7 + 1;
        this.rowsCount = i8;
        this.packEmojiHintRow = i7;
        int i9 = i8 + 1;
        this.rowsCount = i9;
        this.statusEmojiRow = i8;
        int i10 = i9 + 1;
        this.rowsCount = i10;
        this.statusHintRow = i9;
        int i11 = i10 + 1;
        this.rowsCount = i11;
        this.messagesPreviewRow = i10;
        int i12 = i11 + 1;
        this.rowsCount = i12;
        this.wallpaperThemesRow = i11;
        int i13 = i12 + 1;
        this.rowsCount = i13;
        this.wallpaperRow = i12;
        this.rowsCount = i13 + 1;
        this.wallpaperHintRow = i13;
    }

    @Override
    public void updateButton(boolean z) {
        super.updateButton(z);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview != null) {
            TextView textView = profilePreview.textInfo1;
            TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = this.boostsStatus;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_stories$TL_premium_boostsStatus != null ? tL_stories$TL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override
    protected int getEmojiPackStrRes() {
        return R.string.GroupEmojiPack;
    }

    @Override
    protected int getEmojiPackInfoStrRes() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override
    protected int getProfileInfoStrRes() {
        return R.string.GroupProfileInfo;
    }

    @Override
    protected int getEmojiStatusStrRes() {
        return R.string.GroupEmojiStatus;
    }

    @Override
    protected int getEmojiStatusInfoStrRes() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override
    protected int getWallpaperStrRes() {
        return R.string.GroupWallpaper;
    }

    @Override
    protected int getWallpaper2InfoStrRes() {
        return R.string.GroupWallpaper2Info;
    }

    @Override
    public View createView(Context context) {
        View createView = super.createView(context);
        updateColors();
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1(createView));
        return createView;
    }

    public class AnonymousClass1 implements ViewTreeObserver.OnGlobalLayoutListener {
        final View val$view;

        AnonymousClass1(View view) {
            this.val$view = view;
        }

        @Override
        public void onGlobalLayout() {
            this.val$view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            GroupColorActivity.this.initProfilePreview();
            GroupColorActivity.this.profilePreview.infoLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    GroupColorActivity.AnonymousClass1.this.lambda$onGlobalLayout$0(view);
                }
            });
        }

        public void lambda$onGlobalLayout$0(View view) {
            GroupColorActivity.this.openBoostDialog();
        }
    }

    public void initProfilePreview() {
        if (this.profilePreview == null) {
            this.profilePreview = (ChannelColorActivity.ProfilePreview) findChildAt(this.profilePreviewRow);
        }
    }

    @Override
    protected void createListView() {
        RecyclerListView recyclerListView = new RecyclerListView(getContext(), this.resourceProvider) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (GroupColorActivity.this.profilePreview == null || GroupColorActivity.this.profilePreviewPercent < 1.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -(GroupColorActivity.this.profilePreview.getMeasuredHeight() - ((BaseFragment) GroupColorActivity.this).actionBar.getMeasuredHeight()));
                GroupColorActivity.this.profilePreview.draw(canvas);
                canvas.restore();
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                GroupColorActivity.this.initProfilePreview();
                int measuredHeight = GroupColorActivity.this.profilePreview.getMeasuredHeight() - ((BaseFragment) GroupColorActivity.this).actionBar.getMeasuredHeight();
                float top = GroupColorActivity.this.profilePreview.getTop() * (-1);
                float f = measuredHeight;
                GroupColorActivity.this.profilePreviewPercent = Math.max(Math.min(1.0f, top / f), 0.0f);
                float min = Math.min(GroupColorActivity.this.profilePreviewPercent * 2.0f, 1.0f);
                float min2 = Math.min(Math.max(GroupColorActivity.this.profilePreviewPercent - 0.45f, 0.0f) * 2.0f, 1.0f);
                GroupColorActivity.this.profilePreview.profileView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                GroupColorActivity.this.profilePreview.infoLayout.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, min));
                GroupColorActivity.this.profilePreview.title.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, min2));
                if (GroupColorActivity.this.profilePreviewPercent >= 1.0f) {
                    GroupColorActivity.this.profilePreview.setTranslationY(top - f);
                } else {
                    GroupColorActivity.this.profilePreview.setTranslationY(0.0f);
                }
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                View findViewByPosition;
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    if (GroupColorActivity.this.profilePreviewPercent < 0.5f || GroupColorActivity.this.profilePreviewPercent >= 1.0f) {
                        if (GroupColorActivity.this.profilePreviewPercent < 0.5f) {
                            View findViewByPosition2 = GroupColorActivity.this.listView.getLayoutManager() != null ? GroupColorActivity.this.listView.getLayoutManager().findViewByPosition(0) : null;
                            if (findViewByPosition2 == null || findViewByPosition2.getTop() >= 0) {
                                return;
                            }
                            GroupColorActivity.this.listView.smoothScrollBy(0, findViewByPosition2.getTop());
                            return;
                        }
                        return;
                    }
                    int bottom = ((BaseFragment) GroupColorActivity.this).actionBar.getBottom();
                    RecyclerView.LayoutManager layoutManager = GroupColorActivity.this.listView.getLayoutManager();
                    if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(0)) == null) {
                        return;
                    }
                    GroupColorActivity.this.listView.smoothScrollBy(0, findViewByPosition.getBottom() - bottom);
                }
            }
        });
    }

    public void openBoostDialog() {
        if (this.boostsStatus == null || this.isLoading) {
            return;
        }
        this.isLoading = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.dialogId, this.boostsStatus, new Consumer() {
            @Override
            public final void accept(Object obj) {
                GroupColorActivity.this.lambda$openBoostDialog$0((ChannelBoostsController.CanApplyBoost) obj);
            }
        });
    }

    public void lambda$openBoostDialog$0(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || getContext() == null) {
            this.isLoading = false;
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(this, getContext(), 19, this.currentAccount, this.resourceProvider) {
            @Override
            public void onOpenAnimationEnd() {
                GroupColorActivity.this.isLoading = false;
            }

            @Override
            public void dismiss() {
                super.dismiss();
                GroupColorActivity.this.isLoading = false;
            }
        };
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        limitReachedBottomSheet.setBoostsStats(this.boostsStatus, true);
        limitReachedBottomSheet.setDialogId(this.dialogId);
        limitReachedBottomSheet.show();
    }

    @Override
    public void updateColors() {
        super.updateColors();
        this.actionBar.setBackgroundColor(0);
        CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourceProvider)), Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow), 0, 0);
        combinedDrawable.setFullsize(true);
        this.buttonContainer.setBackground(combinedDrawable);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview != null) {
            profilePreview.backgroundView.setColor(this.currentAccount, this.selectedProfileColor, false);
            this.profilePreview.profileView.setColor(this.selectedProfileColor, false);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ChannelColorActivity.ProfilePreview profilePreview = this.profilePreview;
        if (profilePreview != null) {
            profilePreview.setTitleSize();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        super.didReceivedNotification(i, i2, objArr);
        if (i == NotificationCenter.chatInfoDidLoad && ((TLRPC$ChatFull) objArr[0]).id == (-this.dialogId)) {
            updateProfilePreview(true);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }
}
