package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class xv0 implements Runnable {
    public final int f30740a;
    public final TLRPC.Document f30741b;
    public final int f30742c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 e;
    public final TLRPC.TL_messages_stickerSet f30743f;

    public xv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f30740a = i11;
        this.f30741b = document;
        this.f30742c = i10;
        this.d = messageObject;
        this.e = t1Var;
        this.f30743f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f30740a) {
            case 0:
                TLRPC.Document document = this.f30741b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f30742c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f30743f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f30741b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f30742c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f30743f, 1, 1);
                return;
        }
    }
}
