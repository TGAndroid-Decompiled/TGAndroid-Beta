package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class dx0 implements Runnable {
    public final int f27560a;
    public final TLRPC.Document f27561b;
    public final int f27562c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.s1 e;
    public final TLRPC.TL_messages_stickerSet f27563f;

    public dx0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f27560a = i11;
        this.f27561b = document;
        this.f27562c = i10;
        this.d = messageObject;
        this.e = s1Var;
        this.f27563f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f27560a) {
            case 0:
                TLRPC.Document document = this.f27561b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f27562c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f27563f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f27561b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f27562c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f27563f, 1, 1);
                return;
        }
    }
}
