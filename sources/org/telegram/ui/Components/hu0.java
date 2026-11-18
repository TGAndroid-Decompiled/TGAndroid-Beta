package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class hu0 implements Runnable {
    public final int f35980a;
    public final TLRPC.Document f35981b;
    public final int f35982c;
    public final org.telegram.messenger.fj d;
    public final org.telegram.ui.Cells.q1 f35983e;
    public final TLRPC.TL_messages_stickerSet f35984f;

    public hu0(TLRPC.Document document, int i7, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f35980a = i10;
        this.f35981b = document;
        this.f35982c = i7;
        this.d = fjVar;
        this.f35983e = q1Var;
        this.f35984f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f35980a) {
            case 0:
                TLRPC.Document document = this.f35981b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f35982c;
                org.telegram.messenger.a6.q(i7).a(r10, this.d, this.f35983e);
                org.telegram.messenger.w7.G(i7).W(document, this.f35984f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f35981b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f35982c;
                org.telegram.messenger.a6.q(i10).a(r11, this.d, this.f35983e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f35984f, 1, 1);
                return;
        }
    }
}
