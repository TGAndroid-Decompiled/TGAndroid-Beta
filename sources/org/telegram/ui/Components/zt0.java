package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zt0 implements Runnable {
    public final int f41114a;
    public final TLRPC.Document f41115b;
    public final int f41116c;
    public final org.telegram.messenger.ij d;
    public final org.telegram.ui.Cells.q1 f41117e;
    public final TLRPC.TL_messages_stickerSet f41118f;

    public zt0(TLRPC.Document document, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f41114a = i10;
        this.f41115b = document;
        this.f41116c = i7;
        this.d = ijVar;
        this.f41117e = q1Var;
        this.f41118f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f41114a) {
            case 0:
                TLRPC.Document document = this.f41115b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f41116c;
                org.telegram.messenger.z5.q(i7).a(r10, this.d, this.f41117e);
                org.telegram.messenger.w7.G(i7).W(document, this.f41118f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f41115b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f41116c;
                org.telegram.messenger.z5.q(i10).a(r11, this.d, this.f41117e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f41118f, 1, 1);
                return;
        }
    }
}
