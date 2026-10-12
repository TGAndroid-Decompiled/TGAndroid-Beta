package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class fx0 implements Runnable {
    public final int f26180a;
    public final TLRPC.Document f26181b;
    public final int f26182c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.u1 f26183e;
    public final TLRPC.TL_messages_stickerSet f26184f;

    public fx0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f26180a = i11;
        this.f26181b = document;
        this.f26182c = i10;
        this.d = messageObject;
        this.f26183e = u1Var;
        this.f26184f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f26180a) {
            case 0:
                TLRPC.Document document = this.f26181b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f26182c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f26183e);
                FileLoader.getInstance(i10).loadFile(document, this.f26184f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f26181b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f26182c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f26183e);
                FileLoader.getInstance(i11).loadFile(document2, this.f26184f, 1, 1);
                return;
        }
    }
}
