package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

public final class AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final AnimatedEmojiDrawable.EmojiDocumentFetcher f$0;
    public final ArrayList f$1;
    public final HashSet f$2;

    public AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda2(AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher, ArrayList arrayList, HashSet hashSet, int i) {
        this.$r8$classId = i;
        this.f$0 = emojiDocumentFetcher;
        this.f$1 = arrayList;
        this.f$2 = hashSet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher = this.f$0;
                emojiDocumentFetcher.getClass();
                AndroidUtilities.runOnUIThread(new AnimatedEmojiDrawable$EmojiDocumentFetcher$$ExternalSyntheticLambda2(emojiDocumentFetcher, this.f$1, this.f$2, 1));
                break;
            default:
                AnimatedEmojiDrawable.EmojiDocumentFetcher emojiDocumentFetcher2 = this.f$0;
                emojiDocumentFetcher2.processDocuments(this.f$1);
                HashSet hashSet = this.f$2;
                if (!hashSet.isEmpty()) {
                    emojiDocumentFetcher2.loadFromServer(new ArrayList(hashSet));
                }
                break;
        }
    }
}
