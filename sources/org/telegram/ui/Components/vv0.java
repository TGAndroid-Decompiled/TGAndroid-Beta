package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vv0 implements Runnable {
    public final int f32014a;
    public final TLRPC.Document f32015b;
    public final int f32016c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 f32017e;
    public final TLRPC.TL_messages_stickerSet f32018f;

    public vv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f32014a = i11;
        this.f32015b = document;
        this.f32016c = i10;
        this.d = messageObject;
        this.f32017e = t1Var;
        this.f32018f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f32014a) {
            case 0:
                TLRPC.Document document = this.f32015b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f32016c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f32017e);
                FileLoader.getInstance(i10).loadFile(document, this.f32018f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f32015b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f32016c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f32017e);
                FileLoader.getInstance(i11).loadFile(document2, this.f32018f, 1, 1);
                return;
        }
    }
}
