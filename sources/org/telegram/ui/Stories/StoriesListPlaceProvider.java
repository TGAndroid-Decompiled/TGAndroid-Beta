package org.telegram.ui.Stories;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ProfileChannelCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ReactedUserHolderView;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.StatisticPostInfoCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.FillLastLinearLayoutManager;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda60;

public final class StoriesListPlaceProvider implements StoryViewer.PlaceProvider {
    public int addBottomClip;
    public final int[] clipPoint;
    public boolean hasPaginationParams;
    public boolean hiddedStories;
    public final boolean isHiddenArchive;
    public LoadNextInterface loadNextInterface;
    public boolean onlySelfStories;
    public boolean onlyUnreadStories;
    public final ProfileChannelCell profileChannelCell;
    public final RecyclerListView recyclerListView;

    public interface AvatarOverlaysView {
        boolean drawAvatarOverlays(Canvas canvas);
    }

    public interface ClippedView {
        void updateClip(int[] iArr);
    }

    public interface LoadNextInterface {
        void loadNext(boolean z);
    }

    public StoriesListPlaceProvider(RecyclerListView recyclerListView, boolean z) {
        this.clipPoint = new int[2];
        this.recyclerListView = recyclerListView;
        this.isHiddenArchive = z;
        this.profileChannelCell = null;
    }

    @Override
    public final boolean findView(long j, int i, int i2, int i3, StoryViewer.TransitionViewHolder transitionViewHolder) {
        StoryViewer.HolderClip holderClip = null;
        transitionViewHolder.view = null;
        transitionViewHolder.avatarImage = null;
        transitionViewHolder.storyImage = null;
        transitionViewHolder.drawAbove = null;
        RecyclerListView recyclerListView = this.recyclerListView;
        DialogStoriesCell dialogStoriesCell = (recyclerListView == null || !(recyclerListView.getParent() instanceof DialogStoriesCell)) ? null : (DialogStoriesCell) recyclerListView.getParent();
        ViewGroup viewGroup = (dialogStoriesCell == null || dialogStoriesCell.isExpanded()) ? recyclerListView : dialogStoriesCell.listViewMini;
        ProfileChannelCell profileChannelCell = this.profileChannelCell;
        if (profileChannelCell != null) {
            viewGroup = profileChannelCell;
        }
        if (viewGroup != null) {
            int i4 = 0;
            while (i4 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof DialogStoriesCell.StoryCell) {
                    DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) childAt;
                    if (storyCell.dialogId == j) {
                        transitionViewHolder.view = childAt;
                        transitionViewHolder.avatarImage = storyCell.avatarImage;
                        transitionViewHolder.params = storyCell.params;
                        transitionViewHolder.radialProgressUpload = storyCell.radialProgress;
                        DialogStoriesCell dialogStoriesCell2 = (DialogStoriesCell) storyCell.getParent().getParent();
                        transitionViewHolder.clipParent = dialogStoriesCell2;
                        transitionViewHolder.clipBottom = 0.0f;
                        transitionViewHolder.clipTop = 0.0f;
                        transitionViewHolder.alpha = 1.0f;
                        if (storyCell.isFail && dialogStoriesCell2.isExpanded()) {
                            transitionViewHolder.drawClip = new GiftSheet$$ExternalSyntheticLambda6(new Path(), 27);
                            return true;
                        }
                        transitionViewHolder.drawClip = holderClip;
                        return true;
                    }
                } else if (childAt instanceof DialogCell) {
                    DialogCell dialogCell = (DialogCell) childAt;
                    long dialogId = dialogCell.getDialogId();
                    boolean z = this.isHiddenArchive;
                    if ((dialogId == j && !z) || (z && dialogCell.isDialogFolder())) {
                        transitionViewHolder.view = childAt;
                        transitionViewHolder.params = dialogCell.storyParams;
                        transitionViewHolder.avatarImage = dialogCell.avatarImage;
                        transitionViewHolder.clipParent = (View) dialogCell.getParent();
                        if (z) {
                            transitionViewHolder.crossfadeToAvatarImage = dialogCell.avatarImage;
                            boolean z2 = dialogCell.storyParams.drawnLive;
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
                } else if ((childAt instanceof SharedPhotoVideoCell2) && recyclerListView != null) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                    MessageObject messageObject = sharedPhotoVideoCell2.getMessageObject();
                    if ((sharedPhotoVideoCell2.getStyle() == 1 && sharedPhotoVideoCell2.storyId == i2) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i2 && messageObject.storyItem.dialogId == j)) {
                        RecyclerListView.FastScroll fastScroll = recyclerListView.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        transitionViewHolder.view = childAt;
                        transitionViewHolder.storyImage = sharedPhotoVideoCell2.imageReceiver;
                        transitionViewHolder.drawAbove = new RichEditor$$ExternalSyntheticLambda60(sharedPhotoVideoCell2, fastScroll, iArr, 13);
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
                    if (reactedUserHolderView.dialogId != j) {
                        continue;
                    } else {
                        BackupImageView backupImageView2 = reactedUserHolderView.storyPreviewView;
                        boolean z3 = (backupImageView2 == null || backupImageView2.getImageReceiver() == null || backupImageView2.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (reactedUserHolderView.storyId == i2 && z3) {
                            transitionViewHolder.view = backupImageView2;
                            transitionViewHolder.storyImage = backupImageView2.getImageReceiver();
                            transitionViewHolder.clipParent = (View) reactedUserHolderView.getParent();
                            float alphaInternal = reactedUserHolderView.getAlphaInternal() * reactedUserHolderView.getAlpha();
                            transitionViewHolder.alpha = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                transitionViewHolder.bgPaint = paint;
                                paint.setColor(Theme.getColor(Theme.key_dialogBackground, reactedUserHolderView.getResourcesProvider()));
                            }
                            updateClip(transitionViewHolder);
                            return true;
                        }
                        if (!z3) {
                            ReactedUserHolderView.AnonymousClass2 anonymousClass2 = reactedUserHolderView.avatarView;
                            transitionViewHolder.view = anonymousClass2;
                            transitionViewHolder.params = reactedUserHolderView.params;
                            transitionViewHolder.avatarImage = anonymousClass2.getImageReceiver();
                            transitionViewHolder.clipParent = (View) reactedUserHolderView.getParent();
                            float alphaInternal2 = reactedUserHolderView.getAlphaInternal() * reactedUserHolderView.getAlpha();
                            transitionViewHolder.alpha = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                transitionViewHolder.bgPaint = paint2;
                                paint2.setColor(Theme.getColor(Theme.key_dialogBackground, reactedUserHolderView.getResourcesProvider()));
                            }
                            updateClip(transitionViewHolder);
                            return true;
                        }
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
                } else if (childAt instanceof StatisticPostInfoCell) {
                    StatisticPostInfoCell statisticPostInfoCell = (StatisticPostInfoCell) childAt;
                    if (statisticPostInfoCell.getPostInfo().getId() == i2) {
                        transitionViewHolder.view = statisticPostInfoCell.getImageView();
                        transitionViewHolder.params = statisticPostInfoCell.getStoryAvatarParams();
                        transitionViewHolder.storyImage = statisticPostInfoCell.getImageView().getImageReceiver();
                        transitionViewHolder.clipParent = (View) statisticPostInfoCell.getParent();
                        transitionViewHolder.alpha = 1.0f;
                        updateClip(transitionViewHolder);
                        return true;
                    }
                } else if (childAt instanceof ManageChatUserCell) {
                    ManageChatUserCell manageChatUserCell = (ManageChatUserCell) childAt;
                    if (manageChatUserCell.getStoryItem() != null && manageChatUserCell.getStoryItem().dialogId == j && manageChatUserCell.getStoryItem().messageId == i) {
                        transitionViewHolder.view = manageChatUserCell.getAvatarImageView();
                        transitionViewHolder.params = manageChatUserCell.getStoryAvatarParams();
                        transitionViewHolder.avatarImage = manageChatUserCell.getAvatarImageView().getImageReceiver();
                        transitionViewHolder.clipParent = (View) manageChatUserCell.getParent();
                        transitionViewHolder.alpha = 1.0f;
                        updateClip(transitionViewHolder);
                        return true;
                    }
                } else {
                    continue;
                }
                i4++;
                holderClip = null;
            }
        }
        return false;
    }

    @Override
    public final void loadNext(boolean z) {
        LoadNextInterface loadNextInterface = this.loadNextInterface;
        if (loadNextInterface != null) {
            loadNextInterface.loadNext(z);
        }
    }

    @Override
    public final void preLayout(long j, int i, Runnable runnable) {
        FillLastLinearLayoutManager fillLastLinearLayoutManager;
        RecyclerListView recyclerListView = this.recyclerListView;
        if (recyclerListView != null && (recyclerListView.getParent() instanceof DialogStoriesCell)) {
            DialogStoriesCell dialogStoriesCell = (DialogStoriesCell) recyclerListView.getParent();
            if (dialogStoriesCell.scrollTo(j)) {
                dialogStoriesCell.afterNextLayout(runnable);
                return;
            } else {
                ((StoryViewer$$ExternalSyntheticLambda2) runnable).run();
                return;
            }
        }
        int i2 = 0;
        if (recyclerListView == null || !(recyclerListView.getParent() instanceof SelfStoryViewsPage)) {
            if (this.isHiddenArchive) {
                StoriesController storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList = storiesController.hiddenListStories;
                storiesController.fixDeletedAndNonContactsStories(arrayList);
                Collections.sort(arrayList, storiesController.peerStoriesComparator);
                NotificationCenter.getInstance(storiesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            ((StoryViewer$$ExternalSyntheticLambda2) runnable).run();
            return;
        }
        SelfStoryViewsPage selfStoryViewsPage = (SelfStoryViewsPage) recyclerListView.getParent();
        SelfStoryViewsPage.ListAdapter listAdapter = selfStoryViewsPage.listAdapter;
        if (listAdapter != null && listAdapter.items != null && (fillLastLinearLayoutManager = selfStoryViewsPage.layoutManager) != null) {
            while (true) {
                SelfStoryViewsPage.ListAdapter listAdapter2 = selfStoryViewsPage.listAdapter;
                if (i2 >= listAdapter2.items.size()) {
                    i2 = -1;
                    break;
                }
                SelfStoryViewsPage.Item item = (SelfStoryViewsPage.Item) listAdapter2.items.get(i2);
                if (item != null) {
                    TL_stories.StoryReaction storyReaction = item.reaction;
                    if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                        if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j && tL_storyReactionPublicRepost.story.id == i) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i2++;
            }
            if (i2 >= 0) {
                int iFindFirstVisibleItemPosition = fillLastLinearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = fillLastLinearLayoutManager.findLastVisibleItemPosition();
                if (i2 < iFindFirstVisibleItemPosition || i2 > iFindLastVisibleItemPosition) {
                    fillLastLinearLayoutManager.scrollToPositionWithOffset(i2, AndroidUtilities.dp(60.0f));
                    recyclerListView.post(runnable);
                    return;
                }
            }
        }
        ((StoryViewer$$ExternalSyntheticLambda2) runnable).run();
    }

    public final void updateClip(StoryViewer.TransitionViewHolder transitionViewHolder) {
        View view = transitionViewHolder.clipParent;
        if (view == 0) {
            return;
        }
        if (view instanceof ClippedView) {
            int[] iArr = this.clipPoint;
            ((ClippedView) view).updateClip(iArr);
            transitionViewHolder.clipTop = iArr[0];
            transitionViewHolder.clipBottom = iArr[1] - this.addBottomClip;
            return;
        }
        if (view instanceof BlurredRecyclerView) {
            transitionViewHolder.clipTop = ((BlurredRecyclerView) view).blurTopPadding;
            transitionViewHolder.clipBottom = (view.getMeasuredHeight() - transitionViewHolder.clipParent.getPaddingBottom()) - this.addBottomClip;
        } else {
            transitionViewHolder.clipTop = view.getPaddingTop();
            transitionViewHolder.clipBottom = (transitionViewHolder.clipParent.getMeasuredHeight() - transitionViewHolder.clipParent.getPaddingBottom()) - this.addBottomClip;
        }
    }

    public StoriesListPlaceProvider(ProfileChannelCell profileChannelCell) {
        this.clipPoint = new int[2];
        this.profileChannelCell = profileChannelCell;
        this.recyclerListView = null;
    }
}
