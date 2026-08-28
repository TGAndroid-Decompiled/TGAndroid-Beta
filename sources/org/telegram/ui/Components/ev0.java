package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ev0 implements Runnable {
    public final int f28184a;
    public final TLRPC.Document f28185b;
    public final int f28186c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 f28187e;
    public final TLRPC.TL_messages_stickerSet f28188f;

    public ev0(TLRPC.Document document, int i9, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f28184a = i10;
        this.f28185b = document;
        this.f28186c = i9;
        this.d = messageObject;
        this.f28187e = t1Var;
        this.f28188f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f28184a) {
            case 0:
                TLRPC.Document document = this.f28185b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i9 = this.f28186c;
                DownloadController.getInstance(i9).addLoadingFileObserver(attachFileName, this.d, this.f28187e);
                FileLoader.getInstance(i9).loadFile(document, this.f28188f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f28185b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i10 = this.f28186c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName2, this.d, this.f28187e);
                FileLoader.getInstance(i10).loadFile(document2, this.f28188f, 1, 1);
                return;
        }
    }
}
