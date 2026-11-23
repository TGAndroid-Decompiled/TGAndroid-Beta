package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ku0 implements Runnable {
    public final int f36987a;
    public final TLRPC.Document f36988b;
    public final int f36989c;
    public final org.telegram.messenger.gj d;
    public final org.telegram.ui.Cells.r1 f36990e;
    public final TLRPC.TL_messages_stickerSet f36991f;

    public ku0(TLRPC.Document document, int i7, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.r1 r1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f36987a = i10;
        this.f36988b = document;
        this.f36989c = i7;
        this.d = gjVar;
        this.f36990e = r1Var;
        this.f36991f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f36987a) {
            case 0:
                TLRPC.Document document = this.f36988b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f36989c;
                org.telegram.messenger.a6.q(i7).a(r10, this.d, this.f36990e);
                org.telegram.messenger.w7.G(i7).W(document, this.f36991f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f36988b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f36989c;
                org.telegram.messenger.a6.q(i10).a(r11, this.d, this.f36990e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f36991f, 1, 1);
                return;
        }
    }
}
