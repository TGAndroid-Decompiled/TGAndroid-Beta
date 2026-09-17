package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vv0 implements Runnable {
    public final int f31988a;
    public final TLRPC.Document f31989b;
    public final int f31990c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 f31991e;
    public final TLRPC.TL_messages_stickerSet f31992f;

    public vv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f31988a = i11;
        this.f31989b = document;
        this.f31990c = i10;
        this.d = messageObject;
        this.f31991e = t1Var;
        this.f31992f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f31988a) {
            case 0:
                TLRPC.Document document = this.f31989b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f31990c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f31991e);
                FileLoader.getInstance(i10).loadFile(document, this.f31992f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f31989b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f31990c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f31991e);
                FileLoader.getInstance(i11).loadFile(document2, this.f31992f, 1, 1);
                return;
        }
    }
}
