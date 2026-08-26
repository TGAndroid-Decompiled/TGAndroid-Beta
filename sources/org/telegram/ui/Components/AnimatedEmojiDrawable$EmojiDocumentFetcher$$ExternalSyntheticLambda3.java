package org.telegram.ui.Components;

import java.util.ArrayList;

public final class AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final AnimatedEmojiDrawable.EmojiDocumentFetcher f$0;
    public final ArrayList f$1;

    public AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda3(AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiDocumentFetcher;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadFromDatabase$1(this.f$1);
                break;
            default:
                this.f$0.lambda$putToStorage$7(this.f$1);
                break;
        }
    }
}
