package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class tw0 implements Runnable {
    public final int f31249a;
    public final TLRPC.Document f31250b;
    public final int f31251c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 f31252e;
    public final TLRPC.TL_messages_stickerSet f31253f;

    public tw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f31249a = i11;
        this.f31250b = document;
        this.f31251c = i10;
        this.d = messageObject;
        this.f31252e = u1Var;
        this.f31253f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f31249a) {
            case 0:
                TLRPC.Document document = this.f31250b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f31251c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f31252e);
                FileLoader.getInstance(i10).loadFile(document, this.f31253f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f31250b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f31251c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f31252e);
                FileLoader.getInstance(i11).loadFile(document2, this.f31253f, 1, 1);
                return;
        }
    }
}
