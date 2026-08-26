package org.telegram.ui;

import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;

public final class BoostsActivity$$ExternalSyntheticLambda1 implements Consumer {
    public final int $r8$classId;
    public final BoostsActivity f$0;

    public BoostsActivity$$ExternalSyntheticLambda1(BoostsActivity boostsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = boostsActivity;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                break;
            default:
                int i = 10;
                AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(i, this.f$0, (TL_stories.TL_premium_boostsStatus) obj));
                break;
        }
    }
}
