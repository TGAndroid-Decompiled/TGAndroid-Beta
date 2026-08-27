package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class gv0 implements Runnable {

    public final int f28829a;

    public final TLRPC.Document f28830b;

    public final int f28831c;
    public final MessageObject d;

    public final org.telegram.ui.Cells.s1 f28832e;

    public final TLRPC.TL_messages_stickerSet f28833f;

    public gv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f28829a = i11;
        this.f28830b = document;
        this.f28831c = i10;
        this.d = messageObject;
        this.f28832e = s1Var;
        this.f28833f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f28829a) {
            case 0:
                TLRPC.Document document = this.f28830b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f28831c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f28832e);
                FileLoader.getInstance(i10).loadFile(document, this.f28833f, 1, 1);
                break;
            default:
                TLRPC.Document document2 = this.f28830b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f28831c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f28832e);
                FileLoader.getInstance(i11).loadFile(document2, this.f28833f, 1, 1);
                break;
        }
    }
}
