package org.telegram.ui.Cells;

import org.telegram.ui.Components.RLottieDrawable;

public final class ChatActionCell$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final RLottieDrawable f$0;

    public ChatActionCell$$ExternalSyntheticLambda16(RLottieDrawable rLottieDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = rLottieDrawable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.restart();
                break;
            default:
                this.f$0.start();
                break;
        }
    }
}
