package org.telegram.ui.Cells;

import org.telegram.ui.Components.RLottieDrawable;
public final class ChatActionCell$$ExternalSyntheticLambda2 implements Runnable {
    public final RLottieDrawable f$0;

    public ChatActionCell$$ExternalSyntheticLambda2(RLottieDrawable rLottieDrawable) {
        this.f$0 = rLottieDrawable;
    }

    @Override
    public final void run() {
        this.f$0.start();
    }
}
