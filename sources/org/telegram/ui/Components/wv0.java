package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class wv0 implements Runnable {
    public final int f29795a;
    public final TLRPC.Document f29796b;
    public final int f29797c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 e;
    public final TLRPC.TL_messages_stickerSet f29798f;

    public wv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f29795a = i11;
        this.f29796b = document;
        this.f29797c = i10;
        this.d = messageObject;
        this.e = t1Var;
        this.f29798f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f29795a) {
            case 0:
                TLRPC.Document document = this.f29796b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f29797c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f29798f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f29796b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f29797c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f29798f, 1, 1);
                return;
        }
    }
}
