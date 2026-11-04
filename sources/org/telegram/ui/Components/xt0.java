package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class xt0 implements Runnable {
    public final int f40475a;
    public final TLRPC.Document f40476b;
    public final int f40477c;
    public final org.telegram.messenger.zi d;
    public final org.telegram.ui.Cells.q1 f40478e;
    public final TLRPC.TL_messages_stickerSet f40479f;

    public xt0(TLRPC.Document document, int i3, org.telegram.messenger.zi ziVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f40475a = i10;
        this.f40476b = document;
        this.f40477c = i3;
        this.d = ziVar;
        this.f40478e = q1Var;
        this.f40479f = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f40475a) {
            case 0:
                TLRPC.Document document = this.f40476b;
                String r5 = org.telegram.messenger.w7.r(null, document);
                int i3 = this.f40477c;
                org.telegram.messenger.z5.q(i3).a(r5, this.d, this.f40478e);
                org.telegram.messenger.w7.G(i3).X(document, this.f40479f, 1, 1);
                return;
            default:
                TLRPC.Document document2 = this.f40476b;
                String r9 = org.telegram.messenger.w7.r(null, document2);
                int i10 = this.f40477c;
                org.telegram.messenger.z5.q(i10).a(r9, this.d, this.f40478e);
                org.telegram.messenger.w7.G(i10).X(document2, this.f40479f, 1, 1);
                return;
        }
    }
}
