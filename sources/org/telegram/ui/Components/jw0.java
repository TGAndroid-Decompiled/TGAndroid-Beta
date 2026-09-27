package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class jw0 implements Runnable {
    public final int f25550a;
    public final TLRPC.Document f25551b;
    public final int f25552c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 e;
    public final TLRPC.TL_messages_stickerSet f25553f;

    public jw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f25550a = i11;
        this.f25551b = document;
        this.f25552c = i10;
        this.d = messageObject;
        this.e = u1Var;
        this.f25553f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f25550a) {
            case 0:
                TLRPC.Document document = this.f25551b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f25552c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f25553f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f25551b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f25552c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f25553f, 1, 1);
                return;
        }
    }
}
