package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yt0 implements Runnable {
    public final int f40720a;
    public final TLRPC.Document f40721b;
    public final int f40722c;
    public final org.telegram.messenger.ij d;
    public final org.telegram.ui.Cells.q1 f40723e;
    public final TLRPC.TL_messages_stickerSet f40724f;

    public yt0(TLRPC.Document document, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f40720a = i10;
        this.f40721b = document;
        this.f40722c = i7;
        this.d = ijVar;
        this.f40723e = q1Var;
        this.f40724f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f40720a) {
            case 0:
                TLRPC.Document document = this.f40721b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f40722c;
                org.telegram.messenger.z5.q(i7).a(r10, this.d, this.f40723e);
                org.telegram.messenger.w7.G(i7).W(document, this.f40724f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f40721b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f40722c;
                org.telegram.messenger.z5.q(i10).a(r11, this.d, this.f40723e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f40724f, 1, 1);
                return;
        }
    }
}
