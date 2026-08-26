package org.telegram.ui.Stars;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;

public final class StarGiftSheet$$ExternalSyntheticLambda105 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;

    public StarGiftSheet$$ExternalSyntheticLambda105(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) this.f$0).lambda$toggleWear$22((TL_stories.TL_premium_boostsStatus) this.f$1, this.f$2, (MessagesController) this.f$3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                ((DialogStoriesCell) this.f$0).lambda$openStoryRecorder$14((AlertDialog) this.f$1, this.f$2, (DialogStoriesCell.StoryCell) this.f$3, (Boolean) obj);
                break;
            case 2:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                StoriesController storiesController = (StoriesController) this.f$0;
                storiesController.getClass();
                Consumer consumer = (Consumer) this.f$1;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = ((MessagesController) this.f$3).getBoostsController();
                    long j = this.f$2;
                    boostsController.userCanBoostChannel(j, tL_premium_boostsStatus, new StarGiftSheet$$ExternalSyntheticLambda105(storiesController, consumer, j, tL_premium_boostsStatus));
                    consumer.accept(Boolean.FALSE);
                } else {
                    consumer.accept(Boolean.FALSE);
                }
                break;
            default:
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                StoriesController storiesController2 = (StoriesController) this.f$0;
                storiesController2.getClass();
                Consumer consumer2 = (Consumer) this.f$3;
                if (canApplyBoost != null) {
                    BaseFragment lastFragment = LaunchActivity.getLastFragment();
                    long j2 = this.f$2;
                    LimitReachedBottomSheet.openBoostsForPostingStories(lastFragment, j2, canApplyBoost, (TL_stories.TL_premium_boostsStatus) this.f$1, storiesController2.canPostStories(j2) ? new RichEditor$$ExternalSyntheticLambda48(storiesController2, j2, 15) : null);
                    consumer2.accept(Boolean.FALSE);
                } else {
                    consumer2.accept(Boolean.FALSE);
                }
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda105(StoriesController storiesController, Consumer consumer, long j, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.$r8$classId = 3;
        this.f$0 = storiesController;
        this.f$3 = consumer;
        this.f$2 = j;
        this.f$1 = tL_premium_boostsStatus;
    }

    public StarGiftSheet$$ExternalSyntheticLambda105(StoriesController storiesController, Consumer consumer, MessagesController messagesController, long j) {
        this.$r8$classId = 2;
        this.f$0 = storiesController;
        this.f$1 = consumer;
        this.f$3 = messagesController;
        this.f$2 = j;
    }
}
