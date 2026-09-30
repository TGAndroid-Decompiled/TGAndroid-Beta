package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class kw0 implements Runnable {
    public final int f25831a;
    public final TLRPC.Document f25832b;
    public final int f25833c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 e;
    public final TLRPC.TL_messages_stickerSet f25834f;

    public kw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f25831a = i11;
        this.f25832b = document;
        this.f25833c = i10;
        this.d = messageObject;
        this.e = u1Var;
        this.f25834f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f25831a) {
            case 0:
                TLRPC.Document document = this.f25832b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f25833c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.e);
                FileLoader.getInstance(i10).loadFile(document, this.f25834f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f25832b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f25833c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.e);
                FileLoader.getInstance(i11).loadFile(document2, this.f25834f, 1, 1);
                return;
        }
    }
}
