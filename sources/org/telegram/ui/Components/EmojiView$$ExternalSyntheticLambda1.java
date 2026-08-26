package org.telegram.ui.Components;

public final class EmojiView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final EmojiView f$0;

    public EmojiView$$ExternalSyntheticLambda1(EmojiView emojiView, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidateBlurCaptures();
                break;
            case 1:
                this.f$0.lambda$new$17();
                break;
            case 2:
                this.f$0.lambda$new$28();
                break;
            case 3:
                this.f$0.lambda$new$18();
                break;
            case 4:
                this.f$0.lambda$new$19();
                break;
            case 5:
                this.f$0.lambda$sendEmoji$0();
                break;
            case 6:
                this.f$0.lambda$new$4();
                break;
            case 7:
                this.f$0.openPremiumAnimatedEmojiFeature();
                break;
            case 8:
                this.f$0.lambda$onOpen$25();
                break;
            default:
                this.f$0.lambda$onAttachedToWindow$26();
                break;
        }
    }
}
