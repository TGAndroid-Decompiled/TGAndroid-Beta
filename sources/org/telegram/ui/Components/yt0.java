package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yt0 implements Runnable {
    public final int f40749a;
    public final TLRPC.Document f40750b;
    public final int f40751c;
    public final org.telegram.messenger.ij d;
    public final org.telegram.ui.Cells.q1 f40752e;
    public final TLRPC.TL_messages_stickerSet f40753f;

    public yt0(TLRPC.Document document, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f40749a = i10;
        this.f40750b = document;
        this.f40751c = i7;
        this.d = ijVar;
        this.f40752e = q1Var;
        this.f40753f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f40749a) {
            case 0:
                TLRPC.Document document = this.f40750b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f40751c;
                org.telegram.messenger.z5.q(i7).a(r10, this.d, this.f40752e);
                org.telegram.messenger.w7.G(i7).W(document, this.f40753f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f40750b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f40751c;
                org.telegram.messenger.z5.q(i10).a(r11, this.d, this.f40752e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f40753f, 1, 1);
                return;
        }
    }
}
