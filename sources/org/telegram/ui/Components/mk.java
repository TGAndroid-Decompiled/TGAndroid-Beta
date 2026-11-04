package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class mk implements r4 {
    public final int f36173a;
    public final uk f36174b;
    public final TLRPC.TL_messageMediaVenue f36175c;

    public mk(uk ukVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i3) {
        this.f36173a = i3;
        this.f36174b = ukVar;
        this.f36175c = tL_messageMediaVenue;
    }

    @Override
    public final void L(int i3, int i10, boolean z10) {
        switch (this.f36173a) {
            case 0:
                uk ukVar = this.f36174b;
                ukVar.f38794o0.d(this.f36175c, ukVar.f38795p0, z10, i3, 0L);
                ukVar.f38416b.a(true);
                return;
            default:
                uk ukVar2 = this.f36174b;
                ukVar2.f38794o0.d(this.f36175c, ukVar2.f38795p0, z10, i3, 0L);
                ukVar2.f38416b.a(true);
                return;
        }
    }
}
