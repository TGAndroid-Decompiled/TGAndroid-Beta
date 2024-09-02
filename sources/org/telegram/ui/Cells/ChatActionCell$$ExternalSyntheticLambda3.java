package org.telegram.ui.Cells;

import org.telegram.ui.Components.RLottieDrawable;

public final class ChatActionCell$$ExternalSyntheticLambda3 implements Runnable {
    public final RLottieDrawable f$0;

    public ChatActionCell$$ExternalSyntheticLambda3(RLottieDrawable rLottieDrawable) {
        this.f$0 = rLottieDrawable;
    }

    @Override
    public final void run() {
        this.f$0.restart();
    }
}
