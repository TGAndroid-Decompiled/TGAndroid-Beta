package org.telegram.ui.Cells;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.AnimatedEmojiDrawable;

public final class StickerSetCell$$ExternalSyntheticLambda5 implements AnimatedEmojiDrawable.ReceivedDocument {
    public final int $r8$classId;
    public final Object f$0;

    public StickerSetCell$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void run(TLRPC.Document document) {
        switch (this.$r8$classId) {
            case 0:
                StickerSetCell stickerSetCell = (StickerSetCell) this.f$0;
                stickerSetCell.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(2, stickerSetCell, document));
                break;
            case 1:
                AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) this.f$0;
                animatedEmojiDrawable.document = document;
                animatedEmojiDrawable.initDocument(false);
                break;
            default:
                AnimatedEmojiDrawable animatedEmojiDrawable2 = (AnimatedEmojiDrawable) this.f$0;
                animatedEmojiDrawable2.document = document;
                animatedEmojiDrawable2.initDocument(false);
                break;
        }
    }
}
