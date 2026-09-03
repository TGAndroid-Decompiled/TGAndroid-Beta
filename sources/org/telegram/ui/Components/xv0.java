package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class xv0 implements Runnable {
    public final int f33184a;
    public final TLRPC.Document f33185b;
    public final int f33186c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 f33187e;
    public final TLRPC.TL_messages_stickerSet f33188f;

    public xv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f33184a = i11;
        this.f33185b = document;
        this.f33186c = i10;
        this.d = messageObject;
        this.f33187e = t1Var;
        this.f33188f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f33184a) {
            case 0:
                TLRPC.Document document = this.f33185b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f33186c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f33187e);
                FileLoader.getInstance(i10).loadFile(document, this.f33188f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f33185b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f33186c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f33187e);
                FileLoader.getInstance(i11).loadFile(document2, this.f33188f, 1, 1);
                return;
        }
    }
}
