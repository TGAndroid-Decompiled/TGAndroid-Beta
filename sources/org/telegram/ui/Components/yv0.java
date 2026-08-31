package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class yv0 implements Runnable {
    public final int f33586a;
    public final TLRPC.Document f33587b;
    public final int f33588c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.t1 f33589e;
    public final TLRPC.TL_messages_stickerSet f33590f;

    public yv0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f33586a = i11;
        this.f33587b = document;
        this.f33588c = i10;
        this.d = messageObject;
        this.f33589e = t1Var;
        this.f33590f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f33586a) {
            case 0:
                TLRPC.Document document = this.f33587b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f33588c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f33589e);
                FileLoader.getInstance(i10).loadFile(document, this.f33590f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f33587b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f33588c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f33589e);
                FileLoader.getInstance(i11).loadFile(document2, this.f33590f, 1, 1);
                return;
        }
    }
}
