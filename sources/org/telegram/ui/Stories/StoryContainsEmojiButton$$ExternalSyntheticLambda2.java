package org.telegram.ui.Stories;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class StoryContainsEmojiButton$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final StoryContainsEmojiButton f$0;

    public StoryContainsEmojiButton$$ExternalSyntheticLambda2(StoryContainsEmojiButton storyContainsEmojiButton, int i) {
        this.$r8$classId = i;
        this.f$0 = storyContainsEmojiButton;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$load$4((TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                this.f$0.lambda$load$0((TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
