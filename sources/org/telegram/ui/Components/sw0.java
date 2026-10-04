package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class sw0 implements Runnable {
    public final int f30881a;
    public final TLRPC.Document f30882b;
    public final int f30883c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 f30884e;
    public final TLRPC.TL_messages_stickerSet f30885f;

    public sw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f30881a = i11;
        this.f30882b = document;
        this.f30883c = i10;
        this.d = messageObject;
        this.f30884e = u1Var;
        this.f30885f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f30881a) {
            case 0:
                TLRPC.Document document = this.f30882b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f30883c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f30884e);
                FileLoader.getInstance(i10).loadFile(document, this.f30885f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f30882b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f30883c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f30884e);
                FileLoader.getInstance(i11).loadFile(document2, this.f30885f, 1, 1);
                return;
        }
    }
}
