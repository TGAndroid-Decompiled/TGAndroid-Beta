package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ju0 implements Runnable {
    public final int f36516a;
    public final TLRPC.Document f36517b;
    public final int f36518c;
    public final org.telegram.messenger.fj d;
    public final org.telegram.ui.Cells.r1 f36519e;
    public final TLRPC.TL_messages_stickerSet f36520f;

    public ju0(TLRPC.Document document, int i7, org.telegram.messenger.fj fjVar, org.telegram.ui.Cells.r1 r1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f36516a = i10;
        this.f36517b = document;
        this.f36518c = i7;
        this.d = fjVar;
        this.f36519e = r1Var;
        this.f36520f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f36516a) {
            case 0:
                TLRPC.Document document = this.f36517b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f36518c;
                org.telegram.messenger.a6.q(i7).a(r10, this.d, this.f36519e);
                org.telegram.messenger.w7.G(i7).W(document, this.f36520f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f36517b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f36518c;
                org.telegram.messenger.a6.q(i10).a(r11, this.d, this.f36519e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f36520f, 1, 1);
                return;
        }
    }
}
