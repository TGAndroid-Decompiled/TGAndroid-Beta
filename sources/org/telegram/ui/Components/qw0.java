package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class qw0 implements Runnable {
    public final int f29776a;
    public final TLRPC.Document f29777b;
    public final int f29778c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 e;
    public final TLRPC.TL_messages_stickerSet f29779f;

    public qw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f29776a = i11;
        this.f29777b = document;
        this.f29778c = i10;
        this.d = messageObject;
        this.e = u1Var;
        this.f29779f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f29776a) {
            case 0:
                TLRPC.Document document = this.f29777b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f29778c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f29779f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f29777b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f29778c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f29779f, 1, 1);
                return;
        }
    }
}
