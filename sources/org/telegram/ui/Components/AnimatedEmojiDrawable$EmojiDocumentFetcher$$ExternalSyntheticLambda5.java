package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;

public final class AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final AnimatedEmojiDrawable.EmojiDocumentFetcher f$0;
    public final ArrayList f$1;
    public final HashSet f$2;

    public AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda5(AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher, ArrayList arrayList, HashSet hashSet, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiDocumentFetcher;
        this.f$1 = arrayList;
        this.f$2 = hashSet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processDatabaseResult$2(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$processDatabaseResult$3(this.f$1, this.f$2);
                break;
        }
    }
}
