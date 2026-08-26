package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ChatMessageCell;

public final class SlotsDrawable$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final TLRPC.Document f$0;
    public final int f$1;
    public final MessageObject f$2;
    public final ChatMessageCell f$3;
    public final TLRPC.TL_messages_stickerSet f$4;

    public SlotsDrawable$$ExternalSyntheticLambda3(TLRPC.Document document, int i, MessageObject messageObject, ChatMessageCell chatMessageCell, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i2) {
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
                TLRPC.Document document = this.f$0;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i = this.f$1;
                DownloadController.getInstance(i).addLoadingFileObserver(attachFileName, this.f$2, this.f$3);
                FileLoader.getInstance(i).loadFile(document, this.f$4, 1, 1);
                break;
            default:
                TLRPC.Document document2 = this.f$0;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i2 = this.f$1;
                DownloadController.getInstance(i2).addLoadingFileObserver(attachFileName2, this.f$2, this.f$3);
                FileLoader.getInstance(i2).loadFile(document2, this.f$4, 1, 1);
                break;
        }
    }
}
