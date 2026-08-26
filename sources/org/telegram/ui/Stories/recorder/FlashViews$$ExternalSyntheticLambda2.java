package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

public final class FlashViews$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final FlashViews f$0;
    public final VoIPFragment$$ExternalSyntheticLambda7 f$1;

    public FlashViews$$ExternalSyntheticLambda2(FlashViews flashViews, VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7, int i) {
        this.$r8$classId = i;
        this.f$0 = flashViews;
        this.f$1 = voIPFragment$$ExternalSyntheticLambda7;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FlashViews flashViews = this.f$0;
                flashViews.getClass();
                AndroidUtilities.runOnUIThread(new FlashViews$$ExternalSyntheticLambda2(flashViews, this.f$1, 1), 320L);
                break;
            default:
                FlashViews flashViews2 = this.f$0;
                flashViews2.getClass();
                this.f$1.run(new VoIPFragment$$ExternalSyntheticLambda7(flashViews2, 14));
                break;
        }
    }
}
