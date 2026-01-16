package org.telegram.ui.Components;

public final class EmojiView$$ExternalSyntheticLambda24 implements Runnable {
    public final EmojiView f$0;

    public EmojiView$$ExternalSyntheticLambda24(EmojiView emojiView) {
        this.f$0 = emojiView;
    }

    @Override
    public final void run() {
        this.f$0.invalidateBlurCaptures();
    }
}
