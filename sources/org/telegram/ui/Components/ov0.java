package org.telegram.ui.Components;

import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ov0 implements Runnable {
    public final int f31483a;
    public final TLRPC.Document f31484b;
    public final int f31485c;
    public final MessageObject d;
    public final org.telegram.ui.Cells.s1 f31486e;
    public final TLRPC.TL_messages_stickerSet f31487f;

    public ov0(TLRPC.Document document, int i10, MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f31483a = i11;
        this.f31484b = document;
        this.f31485c = i10;
        this.d = messageObject;
        this.f31486e = s1Var;
        this.f31487f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f31483a) {
            case 0:
                TLRPC.Document document = this.f31484b;
                String attachFileName = FileLoader.getAttachFileName(document);
                int i10 = this.f31485c;
                DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, this.d, this.f31486e);
                FileLoader.getInstance(i10).loadFile(document, this.f31487f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f31484b;
                String attachFileName2 = FileLoader.getAttachFileName(document2);
                int i11 = this.f31485c;
                DownloadController.getInstance(i11).addLoadingFileObserver(attachFileName2, this.d, this.f31486e);
                FileLoader.getInstance(i11).loadFile(document2, this.f31487f, 1, 1);
                return;
        }
    }
}
