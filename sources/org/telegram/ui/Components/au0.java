package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class au0 implements Runnable {
    public final int f31977a;
    public final TLRPC.Document f31978b;
    public final int f31979c;
    public final org.telegram.messenger.ij d;
    public final org.telegram.ui.Cells.q1 f31980e;
    public final TLRPC.TL_messages_stickerSet f31981f;

    public au0(TLRPC.Document document, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f31977a = i10;
        this.f31978b = document;
        this.f31979c = i7;
        this.d = ijVar;
        this.f31980e = q1Var;
        this.f31981f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f31977a) {
            case 0:
                TLRPC.Document document = this.f31978b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f31979c;
                org.telegram.messenger.z5.q(i7).a(r10, this.d, this.f31980e);
                org.telegram.messenger.w7.G(i7).W(document, this.f31981f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f31978b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f31979c;
                org.telegram.messenger.z5.q(i10).a(r11, this.d, this.f31980e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f31981f, 1, 1);
                return;
        }
    }
}
