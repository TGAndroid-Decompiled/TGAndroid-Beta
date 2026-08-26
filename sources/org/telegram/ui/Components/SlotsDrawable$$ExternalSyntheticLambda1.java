package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;

public final class SlotsDrawable$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final TLRPC.Document f$0;
    public final int f$1;
    public final MessageObject f$2;
    public final ChatMessageCell f$3;
    public final TLRPC.TL_messages_stickerSet f$4;

    public SlotsDrawable$$ExternalSyntheticLambda1(TLRPC.Document document, int i, MessageObject messageObject, ChatMessageCell chatMessageCell, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i2) {
        this.$r8$classId = i2;
        this.f$0 = document;
        this.f$1 = i;
        this.f$2 = messageObject;
        this.f$3 = chatMessageCell;
        this.f$4 = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f$4;
                SlotsDrawable.lambda$setDiceNumber$6(this.f$0, this.f$1, this.f$2, this.f$3, tL_messages_stickerSet);
                break;
            default:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.f$4;
                SlotsDrawable.lambda$setBaseDice$1(this.f$0, this.f$1, this.f$2, this.f$3, tL_messages_stickerSet2);
                break;
        }
    }
}
