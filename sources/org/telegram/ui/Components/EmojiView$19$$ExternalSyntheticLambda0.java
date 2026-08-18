package org.telegram.ui.Components;

public final class EmojiView$19$$ExternalSyntheticLambda0 implements Runnable {
    public final EmojiView.SearchRunnable f$0;

    public EmojiView$19$$ExternalSyntheticLambda0(EmojiView.SearchRunnable searchRunnable) {
        this.f$0 = searchRunnable;
    }

    @Override
    public final void run() {
        this.f$0.loadNext();
    }
}
