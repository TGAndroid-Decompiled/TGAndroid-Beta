package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoryViewer;
public class StoriesListPlaceProvider implements StoryViewer.PlaceProvider {
    int[] clipPoint = new int[2];
    public boolean hasPaginationParams;
    public boolean hiddedStories;
    private boolean isHiddenArchive;
    LoadNextInterface loadNextInterface;
    public boolean onlySelfStories;
    public boolean onlyUnreadStories;
    private final RecyclerListView recyclerListView;

    public interface AvatarOverlaysView {
        boolean drawAvatarOverlays(Canvas canvas);
    }

    public interface ClippedView {
        void updateClip(int[] iArr);
    }

    public interface LoadNextInterface {
        void loadNext(boolean z);
    }

    public static StoriesListPlaceProvider of(RecyclerListView recyclerListView) {
        return of(recyclerListView, false);
    }

    public static StoriesListPlaceProvider of(RecyclerListView recyclerListView, boolean z) {
        return new StoriesListPlaceProvider(recyclerListView, z);
    }

    public StoriesListPlaceProvider with(LoadNextInterface loadNextInterface) {
        this.loadNextInterface = loadNextInterface;
        return this;
    }

    public StoriesListPlaceProvider(RecyclerListView recyclerListView, boolean z) {
        this.recyclerListView = recyclerListView;
        this.isHiddenArchive = z;
    }

    @Override
    public void preLayout(long j, int i, Runnable runnable) {
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView != null && (recyclerListView.getParent() instanceof DialogStoriesCell)) {
            DialogStoriesCell dialogStoriesCell = (DialogStoriesCell) this.recyclerListView.getParent();
            if (dialogStoriesCell.scrollTo(j)) {
                dialogStoriesCell.afterNextLayout(runnable);
                return;
            } else {
                runnable.run();
                return;
            }
        }
        if (this.isHiddenArchive) {
            MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().sortHiddenStories();
        }
        runnable.run();
    }

    @Override
    public boolean findView(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
        transitionViewHolder.view = null;
        transitionViewHolder.avatarImage = null;
        transitionViewHolder.storyImage = null;
        transitionViewHolder.drawAbove = null;
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView == null) {
            return false;
        }
        DialogStoriesCell dialogStoriesCell = recyclerListView.getParent() instanceof DialogStoriesCell ? (DialogStoriesCell) this.recyclerListView.getParent() : null;
        RecyclerListView recyclerListView2 = this.recyclerListView;
        if (dialogStoriesCell != null && !dialogStoriesCell.isExpanded()) {
            recyclerListView2 = dialogStoriesCell.listViewMini;
        }
        for (int i4 = 0; i4 < recyclerListView2.getChildCount(); i4++) {
            View childAt = recyclerListView2.getChildAt(i4);
            if (childAt instanceof DialogStoriesCell.StoryCell) {
                DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) childAt;
                if (storyCell.dialogId == j) {
                    transitionViewHolder.view = childAt;
                    transitionViewHolder.avatarImage = storyCell.avatarImage;
                    transitionViewHolder.params = storyCell.params;
                    transitionViewHolder.radialProgressUpload = storyCell.radialProgress;
                    transitionViewHolder.clipParent = (DialogStoriesCell) storyCell.getParent().getParent();
                    transitionViewHolder.clipBottom = 0.0f;
                    transitionViewHolder.clipTop = 0.0f;
                    transitionViewHolder.alpha = 1.0f;
                    return true;
                }
            } else if (childAt instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) childAt;
                if (dialogCell.getDialogId() == j || (this.isHiddenArchive && dialogCell.isDialogFolder())) {
                    transitionViewHolder.view = childAt;
                    transitionViewHolder.params = dialogCell.storyParams;
                    transitionViewHolder.avatarImage = dialogCell.avatarImage;
                    transitionViewHolder.clipParent = (View) dialogCell.getParent();
                    if (this.isHiddenArchive) {
                        transitionViewHolder.crossfadeToAvatarImage = dialogCell.avatarImage;
                    }
                    transitionViewHolder.alpha = 1.0f;
                    updateClip(transitionViewHolder);
                    return true;
                }
            } else if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                if (chatMessageCell.getMessageObject().getId() == i) {
                    transitionViewHolder.view = childAt;
                    if (i3 == 1 || i3 == 2) {
                        transitionViewHolder.storyImage = chatMessageCell.getPhotoImage();
                    } else {
                        transitionViewHolder.storyImage = chatMessageCell.replyImageReceiver;
                    }
                    transitionViewHolder.clipParent = (View) chatMessageCell.getParent();
                    transitionViewHolder.alpha = 1.0f;
                    updateClip(transitionViewHolder);
                    return true;
                }
            } else if (childAt instanceof ChatActionCell) {
                ChatActionCell chatActionCell = (ChatActionCell) childAt;
                if (chatActionCell.getMessageObject().getId() == i) {
                    transitionViewHolder.view = childAt;
                    if (chatActionCell.getMessageObject().messageOwner.media.storyItem.noforwards) {
                        transitionViewHolder.avatarImage = chatActionCell.getPhotoImage();
                    } else {
                        transitionViewHolder.storyImage = chatActionCell.getPhotoImage();
                    }
                    transitionViewHolder.clipParent = (View) chatActionCell.getParent();
                    transitionViewHolder.alpha = 1.0f;
                    updateClip(transitionViewHolder);
                    return true;
                }
            } else if (childAt instanceof SharedPhotoVideoCell2) {
                final SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                MessageObject messageObject = sharedPhotoVideoCell2.getMessageObject();
                if ((sharedPhotoVideoCell2.getStyle() == 1 && sharedPhotoVideoCell2.storyId == i2) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i2 && messageObject.storyItem.dialogId == j)) {
                    final RecyclerListView.FastScroll fastScroll = recyclerListView2.getFastScroll();
                    final int[] iArr = new int[2];
                    if (fastScroll != null) {
                        fastScroll.getLocationInWindow(iArr);
                    }
                    transitionViewHolder.view = childAt;
                    transitionViewHolder.storyImage = sharedPhotoVideoCell2.imageReceiver;
                    transitionViewHolder.drawAbove = new StoryViewer.HolderDrawAbove() {
                        @Override
                        public final void draw(Canvas canvas, RectF rectF, float f) {
                            StoriesListPlaceProvider.lambda$findView$0(SharedPhotoVideoCell2.this, fastScroll, iArr, canvas, rectF, f);
                        }
                    };
                    transitionViewHolder.clipParent = (View) sharedPhotoVideoCell2.getParent();
                    transitionViewHolder.alpha = 1.0f;
                    updateClip(transitionViewHolder);
                    return true;
                }
            } else if (childAt instanceof UserCell) {
                UserCell userCell = (UserCell) childAt;
                if (userCell.getDialogId() == j) {
                    BackupImageView backupImageView = userCell.avatarImageView;
                    transitionViewHolder.view = backupImageView;
                    transitionViewHolder.params = userCell.storyParams;
                    transitionViewHolder.avatarImage = backupImageView.getImageReceiver();
                    transitionViewHolder.clipParent = (View) userCell.getParent();
                    transitionViewHolder.alpha = 1.0f;
                    updateClip(transitionViewHolder);
                    return true;
                }
            } else if (childAt instanceof ReactedUserHolderView) {
                ReactedUserHolderView reactedUserHolderView = (ReactedUserHolderView) childAt;
                if (reactedUserHolderView.dialogId == j) {
                    BackupImageView backupImageView2 = reactedUserHolderView.avatarView;
                    transitionViewHolder.view = backupImageView2;
                    transitionViewHolder.params = reactedUserHolderView.params;
                    transitionViewHolder.avatarImage = backupImageView2.getImageReceiver();
                    transitionViewHolder.clipParent = (View) reactedUserHolderView.getParent();
                    float alpha = reactedUserHolderView.getAlpha() * reactedUserHolderView.getAlphaInternal();
                    transitionViewHolder.alpha = alpha;
                    if (alpha < 1.0f) {
                        Paint paint = new Paint(1);
                        transitionViewHolder.bgPaint = paint;
                        paint.setColor(Theme.getColor(Theme.key_dialogBackground, reactedUserHolderView.getResourcesProvider()));
                    }
                    updateClip(transitionViewHolder);
                    return true;
                }
            } else if (childAt instanceof ProfileSearchCell) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) childAt;
                if (profileSearchCell.getDialogId() == j) {
                    transitionViewHolder.view = profileSearchCell;
                    transitionViewHolder.params = profileSearchCell.avatarStoryParams;
                    transitionViewHolder.avatarImage = profileSearchCell.avatarImage;
                    transitionViewHolder.clipParent = (View) profileSearchCell.getParent();
                    transitionViewHolder.alpha = 1.0f;
                    updateClip(transitionViewHolder);
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public static void lambda$findView$0(SharedPhotoVideoCell2 sharedPhotoVideoCell2, RecyclerListView.FastScroll fastScroll, int[] iArr, Canvas canvas, RectF rectF, float f) {
        sharedPhotoVideoCell2.drawDuration(canvas, rectF, f);
        if (fastScroll != null && fastScroll.isVisible && fastScroll.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            fastScroll.draw(canvas);
            canvas.restore();
        }
    }

    private void updateClip(StoryViewer.TransitionViewHolder transitionViewHolder) {
        View view = transitionViewHolder.clipParent;
        if (view == null) {
            return;
        }
        if (view instanceof ClippedView) {
            ((ClippedView) view).updateClip(this.clipPoint);
            int[] iArr = this.clipPoint;
            transitionViewHolder.clipTop = iArr[0];
            transitionViewHolder.clipBottom = iArr[1];
        } else if (view instanceof BlurredRecyclerView) {
            transitionViewHolder.clipTop = ((BlurredRecyclerView) view).blurTopPadding;
            transitionViewHolder.clipBottom = view.getMeasuredHeight() - transitionViewHolder.clipParent.getPaddingBottom();
        } else {
            transitionViewHolder.clipTop = view.getPaddingTop();
            transitionViewHolder.clipBottom = transitionViewHolder.clipParent.getMeasuredHeight() - transitionViewHolder.clipParent.getPaddingBottom();
        }
    }

    @Override
    public void loadNext(boolean z) {
        LoadNextInterface loadNextInterface = this.loadNextInterface;
        if (loadNextInterface != null) {
            loadNextInterface.loadNext(z);
        }
    }

    public StoryViewer.PlaceProvider setPaginationParaments(boolean z, boolean z2, boolean z3) {
        this.hiddedStories = z;
        this.onlyUnreadStories = z2;
        this.onlySelfStories = z3;
        this.hasPaginationParams = true;
        return this;
    }
}
