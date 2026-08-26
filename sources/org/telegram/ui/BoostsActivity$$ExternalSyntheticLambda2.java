package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class BoostsActivity$$ExternalSyntheticLambda2 implements Consumer {
    public final int $r8$classId;
    public final BoostsActivity f$0;

    public BoostsActivity$$ExternalSyntheticLambda2(BoostsActivity boostsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = boostsActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadStatistic$1((TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                this.f$0.lambda$loadCanApplyBoosts$2((ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }
}
