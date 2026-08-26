package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.ChatMessageCell;

public final class LaunchActivity$$ExternalSyntheticLambda130 implements Consumer {
    public final int $r8$classId = 1;
    public final LaunchActivity f$0;
    public final Browser.Progress f$1;
    public final Runnable f$2;
    public final Object f$3;
    public final Long f$4;
    public final ChatMessageCell f$5;

    public LaunchActivity$$ExternalSyntheticLambda130(LaunchActivity launchActivity, Browser.Progress progress, Long l, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChatMessageCell chatMessageCell, Runnable runnable) {
        this.f$0 = launchActivity;
        this.f$1 = progress;
        this.f$4 = l;
        this.f$3 = tL_premium_boostsStatus;
        this.f$5 = chatMessageCell;
        this.f$2 = runnable;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                LaunchActivity launchActivity = this.f$0;
                Long l = this.f$4;
                launchActivity.lambda$processBoostDialog$125(this.f$1, this.f$2, (ChannelBoostsController) this.f$3, l, this.f$5, (TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                LaunchActivity launchActivity2 = this.f$0;
                Long l2 = this.f$4;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.f$3;
                ChatMessageCell chatMessageCell = this.f$5;
                launchActivity2.lambda$processBoostDialog$124(this.f$1, l2, tL_premium_boostsStatus, chatMessageCell, this.f$2, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda130(LaunchActivity launchActivity, Browser.Progress progress, Runnable runnable, ChannelBoostsController channelBoostsController, Long l, ChatMessageCell chatMessageCell) {
        this.f$0 = launchActivity;
        this.f$1 = progress;
        this.f$2 = runnable;
        this.f$3 = channelBoostsController;
        this.f$4 = l;
        this.f$5 = chatMessageCell;
    }
}
