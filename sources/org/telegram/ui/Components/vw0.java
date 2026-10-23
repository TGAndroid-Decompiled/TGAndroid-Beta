package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class vw0 implements Runnable {
    public final int f32067a;
    public final TLRPC.Document f32068b;
    public final int f32069c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 e;
    public final TLRPC.TL_messages_stickerSet f32070f;

    public vw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f32067a = i11;
        this.f32068b = document;
        this.f32069c = i10;
        this.d = messageObject;
        this.e = t1Var;
        this.f32070f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f32067a) {
            case 0:
                TLRPC.Document document = this.f32068b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f32069c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f32070f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f32068b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f32069c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f32070f, 1, 1);
                return;
        }
    }
}
