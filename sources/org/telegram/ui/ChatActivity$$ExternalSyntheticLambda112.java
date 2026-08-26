package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ScrimOptions;

public final class ChatActivity$$ExternalSyntheticLambda112 implements Runnable {
    public final int $r8$classId;
    public final ScrimOptions f$0;

    public ChatActivity$$ExternalSyntheticLambda112(ScrimOptions scrimOptions, int i) {
        this.$r8$classId = i;
        this.f$0 = scrimOptions;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ScrimOptions scrimOptions = this.f$0;
                if (!scrimOptions.dismissing) {
                    scrimOptions.dismissing = true;
                    scrimOptions.animateOpenTo(new ChatActivity$$ExternalSyntheticLambda112(scrimOptions, 2), false);
                    scrimOptions.windowView.invalidate();
                    break;
                }
                break;
            case 1:
                this.f$0.dismiss();
                break;
            case 2:
                ScrimOptions scrimOptions2 = this.f$0;
                scrimOptions2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda112(scrimOptions2, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda112(this.f$0, 5));
                break;
            case 4:
                this.f$0.lambda$dismissFast$3();
                break;
            default:
                this.f$0.lambda$dismiss$1();
                break;
        }
    }
}
