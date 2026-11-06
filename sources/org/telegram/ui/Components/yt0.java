package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yt0 implements Runnable {
    public final int f40689a;
    public final TLRPC.Document f40690b;
    public final int f40691c;
    public final org.telegram.messenger.ij d;
    public final org.telegram.ui.Cells.q1 f40692e;
    public final TLRPC.TL_messages_stickerSet f40693f;

    public yt0(TLRPC.Document document, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f40689a = i10;
        this.f40690b = document;
        this.f40691c = i7;
        this.d = ijVar;
        this.f40692e = q1Var;
        this.f40693f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f40689a) {
            case 0:
                TLRPC.Document document = this.f40690b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f40691c;
                org.telegram.messenger.z5.q(i7).a(r10, this.d, this.f40692e);
                org.telegram.messenger.w7.G(i7).X(document, this.f40693f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f40690b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f40691c;
                org.telegram.messenger.z5.q(i10).a(r11, this.d, this.f40692e);
                org.telegram.messenger.w7.G(i10).X(document2, this.f40693f, 1, 1);
                return;
        }
    }
}
