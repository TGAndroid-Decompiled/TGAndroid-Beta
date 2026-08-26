package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.recorder.HintView2;

public final class StarGiftSheet$$ExternalSyntheticLambda114 implements Runnable {
    public final int $r8$classId;
    public final HintView2 f$0;

    public StarGiftSheet$$ExternalSyntheticLambda114(HintView2 hintView2, int i) {
        this.$r8$classId = i;
        this.f$0 = hintView2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
            case 1:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
            default:
                AndroidUtilities.removeFromParent(this.f$0);
                break;
        }
    }
}
