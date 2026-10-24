package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class uw0 implements Runnable {
    public final int f31231a;
    public final TLRPC.Document f31232b;
    public final int f31233c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 e;
    public final TLRPC.TL_messages_stickerSet f31234f;

    public uw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f31231a = i11;
        this.f31232b = document;
        this.f31233c = i10;
        this.d = messageObject;
        this.e = t1Var;
        this.f31234f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f31231a) {
            case 0:
                TLRPC.Document document = this.f31232b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f31233c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f31234f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f31232b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f31233c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f31234f, 1, 1);
                return;
        }
    }
}
