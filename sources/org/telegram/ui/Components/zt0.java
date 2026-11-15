package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class zt0 implements Runnable {
    public final int f42425a;
    public final TLRPC.Document f42426b;
    public final int f42427c;
    public final org.telegram.messenger.gj d;
    public final org.telegram.ui.Cells.q1 f42428e;
    public final TLRPC.TL_messages_stickerSet f42429f;

    public zt0(TLRPC.Document document, int i7, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f42425a = i10;
        this.f42426b = document;
        this.f42427c = i7;
        this.d = gjVar;
        this.f42428e = q1Var;
        this.f42429f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f42425a) {
            case 0:
                TLRPC.Document document = this.f42426b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f42427c;
                org.telegram.messenger.z5.q(i7).a(r10, this.d, this.f42428e);
                org.telegram.messenger.w7.G(i7).W(document, this.f42429f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f42426b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f42427c;
                org.telegram.messenger.z5.q(i10).a(r11, this.d, this.f42428e);
                org.telegram.messenger.w7.G(i10).W(document2, this.f42429f, 1, 1);
                return;
        }
    }
}
