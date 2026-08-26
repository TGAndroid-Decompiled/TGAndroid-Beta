package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class ChatEditActivity$$ExternalSyntheticLambda65 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;

    public ChatEditActivity$$ExternalSyntheticLambda65(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = j;
        this.f$2 = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        long j = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ChatEditActivity) obj4).lambda$createView$15((AlertDialog) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f$3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                ((StarGiftSheet) obj4).lambda$toggleWear$22((TL_stories.TL_premium_boostsStatus) obj2, this.f$3, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 2:
                DialogStoriesCell dialogStoriesCell = (DialogStoriesCell) obj4;
                dialogStoriesCell.getClass();
                ((AlertDialog) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    StoryRecorder storyRecorder = StoryRecorder.getInstance(dialogStoriesCell.fragment.getParentActivity(), dialogStoriesCell.currentAccount);
                    storyRecorder.selectedDialogId = j;
                    StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
                    if (anonymousClass8 != null) {
                        anonymousClass8.setDialogId(j);
                    }
                    storyRecorder.canChangePeer = false;
                    storyRecorder.open(StoryRecorder.SourceView.fromStoryCell((DialogStoriesCell.StoryCell) obj2));
                }
                break;
            case 3:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                StoriesController storiesController = (StoriesController) obj4;
                storiesController.getClass();
                Consumer consumer = (Consumer) obj3;
                if (tL_premium_boostsStatus2 != null) {
                    ChannelBoostsController boostsController = ((MessagesController) obj2).getBoostsController();
                    long j2 = this.f$3;
                    boostsController.userCanBoostChannel(j2, tL_premium_boostsStatus2, new ChatEditActivity$$ExternalSyntheticLambda65(storiesController, consumer, j2, tL_premium_boostsStatus2, 4));
                    consumer.accept(Boolean.FALSE);
                } else {
                    consumer.accept(Boolean.FALSE);
                }
                break;
            default:
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                StoriesController storiesController2 = (StoriesController) obj4;
                storiesController2.getClass();
                Consumer consumer2 = (Consumer) obj3;
                if (canApplyBoost != null) {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    LinkManager$3$$ExternalSyntheticLambda0 linkManager$3$$ExternalSyntheticLambda0 = storiesController2.canPostStories(j) ? new LinkManager$3$$ExternalSyntheticLambda0(storiesController2, j, 24) : null;
                    int i = LimitReachedBottomSheet.$r8$clinit;
                    if (lastFragment != null && (tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj2) != null && lastFragment.getContext() != null) {
                        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(18, lastFragment.getCurrentAccount(), lastFragment.getContext(), lastFragment, lastFragment.getResourceProvider());
                        limitReachedBottomSheet.canApplyBoost = canApplyBoost;
                        limitReachedBottomSheet.updateButton$2();
                        limitReachedBottomSheet.updatePremiumButtonText();
                        limitReachedBottomSheet.boostsStatus = tL_premium_boostsStatus;
                        limitReachedBottomSheet.isCurrentChat = true;
                        limitReachedBottomSheet.updateRows$7();
                        limitReachedBottomSheet.dialogId = j;
                        limitReachedBottomSheet.updateRows$7();
                        limitReachedBottomSheet.statisticClickRunnable = linkManager$3$$ExternalSyntheticLambda0;
                        limitReachedBottomSheet.show();
                    }
                    consumer2.accept(Boolean.FALSE);
                } else {
                    consumer2.accept(Boolean.FALSE);
                }
                break;
        }
    }

    public ChatEditActivity$$ExternalSyntheticLambda65(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = j;
    }

    public ChatEditActivity$$ExternalSyntheticLambda65(StarGiftSheet starGiftSheet, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j, MessagesController messagesController) {
        this.$r8$classId = 1;
        this.f$0 = starGiftSheet;
        this.f$2 = tL_premium_boostsStatus;
        this.f$3 = j;
        this.f$1 = messagesController;
    }
}
