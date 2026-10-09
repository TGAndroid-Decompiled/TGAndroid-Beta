package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class zw0 implements Runnable {
    public final int f33667a;
    public final TLRPC.Document f33668b;
    public final int f33669c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 f33670e;
    public final TLRPC.TL_messages_stickerSet f33671f;

    public zw0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f33667a = i11;
        this.f33668b = document;
        this.f33669c = i10;
        this.d = messageObject;
        this.f33670e = u1Var;
        this.f33671f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f33667a) {
            case 0:
                TLRPC.Document document = this.f33668b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f33669c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f33670e);
                FileLoader.getInstance(i10).loadFile(document, this.f33671f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f33668b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f33669c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f33670e);
                FileLoader.getInstance(i11).loadFile(document2, this.f33671f, 1, 1);
                return;
        }
    }
}
