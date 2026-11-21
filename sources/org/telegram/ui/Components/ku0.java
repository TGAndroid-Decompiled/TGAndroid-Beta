package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ku0 implements Runnable {
    public final int f36984a;
    public final TLRPC.Document f36985b;
    public final int f36986c;
    public final org.telegram.messenger.fj d;
    public final org.telegram.ui.Cells.r1 f36987e;
    public final TLRPC.TL_messages_stickerSet f36988f;

    public ku0(TLRPC.Document document, int i7, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.r1 r1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f36984a = i10;
        this.f36985b = document;
        this.f36986c = i7;
        this.d = fjVar;
        this.f36987e = r1Var;
        this.f36988f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f36984a) {
            case 0:
                TLRPC.Document document = this.f36985b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f36986c;
                org.telegram.messenger.a6.q(i7).a(r10, this.d, this.f36987e);
                org.telegram.messenger.w7.G(i7).W(document, this.f36988f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f36985b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f36986c;
                org.telegram.messenger.a6.q(i10).a(r11, this.d, this.f36987e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f36988f, 1, 1);
                return;
        }
    }
}
