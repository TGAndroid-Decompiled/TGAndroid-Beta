package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

public final class AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final AnimatedEmojiDrawable.EmojiDocumentFetcher f$0;
    public final ArrayList f$1;
    public final TLObject f$2;

    public AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda0(AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher, ArrayList arrayList, TLObject tLObject, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiDocumentFetcher;
        this.f$1 = arrayList;
        this.f$2 = tLObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadFromServer$4(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$loadFromServer$5(this.f$1, this.f$2);
                break;
        }
    }
}
