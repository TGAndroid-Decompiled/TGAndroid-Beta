package org.telegram.ui;

import android.view.View;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class ChannelColorActivity$$ExternalSyntheticLambda0 implements Consumer {
    public final int $r8$classId;
    public final ChannelColorActivity f$0;

    public ChannelColorActivity$$ExternalSyntheticLambda0(ChannelColorActivity channelColorActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelColorActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.getClass();
                ChannelColorActivity.updateColors((View) obj);
                break;
            case 1:
                this.f$0.lambda$showLimit$13((ChannelBoostsController.CanApplyBoost) obj);
                break;
            default:
                this.f$0.updateBoostsAndLevels((TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
