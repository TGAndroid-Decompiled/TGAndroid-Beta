package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class yt0 implements Runnable {
    public final int f40708a;
    public final TLRPC.Document f40709b;
    public final int f40710c;
    public final org.telegram.messenger.ij d;
    public final org.telegram.ui.Cells.q1 f40711e;
    public final TLRPC.TL_messages_stickerSet f40712f;

    public yt0(TLRPC.Document document, int i7, org.telegram.messenger.ij ijVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f40708a = i10;
        this.f40709b = document;
        this.f40710c = i7;
        this.d = ijVar;
        this.f40711e = q1Var;
        this.f40712f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f40708a) {
            case 0:
                TLRPC.Document document = this.f40709b;
                String r10 = org.telegram.messenger.w7.r(null, document);
                int i7 = this.f40710c;
                org.telegram.messenger.z5.q(i7).a(r10, this.d, this.f40711e);
                org.telegram.messenger.w7.G(i7).X(document, this.f40712f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f40709b;
                String r11 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f40710c;
                org.telegram.messenger.z5.q(i10).a(r11, this.d, this.f40711e);
                org.telegram.messenger.w7.G(i10).X(document2, this.f40712f, 1, 1);
                return;
        }
    }
}
