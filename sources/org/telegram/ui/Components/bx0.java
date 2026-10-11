package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bx0 implements Runnable {
    public final int f25034a;
    public final TLRPC.Document f25035b;
    public final int f25036c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 f25037e;
    public final TLRPC.TL_messages_stickerSet f25038f;

    public bx0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f25034a = i11;
        this.f25035b = document;
        this.f25036c = i10;
        this.d = messageObject;
        this.f25037e = u1Var;
        this.f25038f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f25034a) {
            case 0:
                TLRPC.Document document = this.f25035b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f25036c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f25037e);
                FileLoader.getInstance(i10).loadFile(document, this.f25038f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f25035b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f25036c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f25037e);
                FileLoader.getInstance(i11).loadFile(document2, this.f25038f, 1, 1);
                return;
        }
    }
}
