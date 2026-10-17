package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class qw0 implements Runnable {
    public final int f29770a;
    public final TLRPC.Document f29771b;
    public final int f29772c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 e;
    public final TLRPC.TL_messages_stickerSet f29773f;

    public qw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f29770a = i11;
        this.f29771b = document;
        this.f29772c = i10;
        this.d = messageObject;
        this.e = u1Var;
        this.f29773f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f29770a) {
            case 0:
                TLRPC.Document document = this.f29771b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f29772c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f29773f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f29771b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f29772c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f29773f, 1, 1);
                return;
        }
    }
}
