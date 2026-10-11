package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ax0 implements Runnable {
    public final int f24697a;
    public final TLRPC.Document f24698b;
    public final int f24699c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 f24700e;
    public final TLRPC.TL_messages_stickerSet f24701f;

    public ax0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f24697a = i11;
        this.f24698b = document;
        this.f24699c = i10;
        this.d = messageObject;
        this.f24700e = u1Var;
        this.f24701f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f24697a) {
            case 0:
                TLRPC.Document document = this.f24698b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f24699c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f24700e);
                FileLoader.getInstance(i10).loadFile(document, this.f24701f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f24698b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f24699c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f24700e);
                FileLoader.getInstance(i11).loadFile(document2, this.f24701f, 1, 1);
                return;
        }
    }
}
