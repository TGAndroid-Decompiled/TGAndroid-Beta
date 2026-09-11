package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vv0 implements Runnable {
    public final int f31987a;
    public final TLRPC.Document f31988b;
    public final int f31989c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 f31990e;
    public final TLRPC.TL_messages_stickerSet f31991f;

    public vv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f31987a = i11;
        this.f31988b = document;
        this.f31989c = i10;
        this.d = messageObject;
        this.f31990e = t1Var;
        this.f31991f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f31987a) {
            case 0:
                TLRPC.Document document = this.f31988b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f31989c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f31990e);
                FileLoader.getInstance(i10).loadFile(document, this.f31991f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f31988b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f31989c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f31990e);
                FileLoader.getInstance(i11).loadFile(document2, this.f31991f, 1, 1);
                return;
        }
    }
}
