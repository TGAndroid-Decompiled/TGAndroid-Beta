package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class cv0 implements Runnable {
    public final int f25259a;
    public final TLRPC.Document f25260b;
    public final int f25261c;
    public final org.telegram.messenger.kj d;
    public final org.telegram.ui.Cells.q1 e;
    public final TLRPC.TL_messages_stickerSet f25262f;

    public cv0(TLRPC.Document document, int i10, org.telegram.messenger.kj kjVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i11) {
        this.f25259a = i11;
        this.f25260b = document;
        this.f25261c = i10;
        this.d = kjVar;
        this.e = q1Var;
        this.f25262f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f25259a) {
            case 0:
                TLRPC.Document document = this.f25260b;
                String r10 = org.telegram.messenger.b8.r(null, document);
                int i10 = this.f25261c;
                org.telegram.messenger.b6.q(i10).a(r10, this.d, this.e);
                org.telegram.messenger.b8.G(i10).X(document, this.f25262f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f25260b;
                String r11 = org.telegram.messenger.b8.r(null, document2);
                int i11 = this.f25261c;
                org.telegram.messenger.b6.q(i11).a(r11, this.d, this.e);
                org.telegram.messenger.b8.G(i11).X(document2, this.f25262f, 1, 1);
                return;
        }
    }
}
