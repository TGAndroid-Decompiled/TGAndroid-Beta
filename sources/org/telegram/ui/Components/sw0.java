package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class sw0 implements Runnable {
    public final int f30880a;
    public final TLRPC.Document f30881b;
    public final int f30882c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 f30883e;
    public final TLRPC.TL_messages_stickerSet f30884f;

    public sw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f30880a = i11;
        this.f30881b = document;
        this.f30882c = i10;
        this.d = messageObject;
        this.f30883e = u1Var;
        this.f30884f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f30880a) {
            case 0:
                TLRPC.Document document = this.f30881b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f30882c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f30883e);
                FileLoader.getInstance(i10).loadFile(document, this.f30884f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f30881b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f30882c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f30883e);
                FileLoader.getInstance(i11).loadFile(document2, this.f30884f, 1, 1);
                return;
        }
    }
}
