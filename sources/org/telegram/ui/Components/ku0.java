package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ku0 implements Runnable {
    public final int f36954a;
    public final TLRPC.Document f36955b;
    public final int f36956c;
    public final org.telegram.messenger.gj d;
    public final org.telegram.ui.Cells.r1 f36957e;
    public final TLRPC.TL_messages_stickerSet f36958f;

    public ku0(TLRPC.Document document, int i7, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.r1 r1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f36954a = i10;
        this.f36955b = document;
        this.f36956c = i7;
        this.d = gjVar;
        this.f36957e = r1Var;
        this.f36958f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f36954a) {
            case 0:
                TLRPC.Document document = this.f36955b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f36956c;
                org.telegram.messenger.a6.q(i7).a(r10, this.d, this.f36957e);
                org.telegram.messenger.w7.G(i7).W(document, this.f36958f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f36955b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f36956c;
                org.telegram.messenger.a6.q(i10).a(r11, this.d, this.f36957e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f36958f, 1, 1);
                return;
        }
    }
}
