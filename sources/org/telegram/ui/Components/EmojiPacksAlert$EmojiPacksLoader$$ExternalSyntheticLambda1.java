package org.telegram.ui.Components;

public final class EmojiPacksAlert$EmojiPacksLoader$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final EmojiPacksAlert.EmojiPacksLoader f$0;

    public EmojiPacksAlert$EmojiPacksLoader$$ExternalSyntheticLambda1(EmojiPacksAlert.EmojiPacksLoader emojiPacksLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiPacksLoader;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$init$4();
                break;
            default:
                this.f$0.lambda$init$2();
                break;
        }
    }
}
