package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class bv0 implements Runnable {
    public final int f24882a;
    public final TLRPC.Document f24883b;
    public final int f24884c;
    public final org.telegram.messenger.jj d;
    public final org.telegram.ui.Cells.q1 e;
    public final TLRPC.TL_messages_stickerSet f24885f;

    public bv0(TLRPC.Document document, int i10, org.telegram.messenger.jj jjVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f24882a = i11;
        this.f24883b = document;
        this.f24884c = i10;
        this.d = jjVar;
        this.e = q1Var;
        this.f24885f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f24882a) {
            case 0:
                TLRPC.Document document = this.f24883b;
                String r10 = org.telegram.messenger.b8.r(null, document);
                int i10 = this.f24884c;
                org.telegram.messenger.b6.q(i10).a(r10, this.d, this.e);
                org.telegram.messenger.b8.G(i10).X(document, this.f24885f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f24883b;
                String r11 = org.telegram.messenger.b8.r(null, document2);
                int i11 = this.f24884c;
                org.telegram.messenger.b6.q(i11).a(r11, this.d, this.e);
                org.telegram.messenger.b8.G(i11).X(document2, this.f24885f, 1, 1);
                return;
        }
    }
}
