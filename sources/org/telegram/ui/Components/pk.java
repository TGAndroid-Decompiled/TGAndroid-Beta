package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pk implements y4 {
    public final int f27881a;
    public final al f27882b;
    public final TLRPC.TL_messageMediaVenue f27883c;

    public pk(al alVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f27881a = i10;
        this.f27882b = alVar;
        this.f27883c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z4) {
        switch (this.f27881a) {
            case 0:
                al alVar = this.f27882b;
                alVar.f23440u0.d(this.f27883c, alVar.f23441v0, z4, i10, 0L);
                alVar.f24278b.dismiss(true);
                return;
            default:
                al alVar2 = this.f27882b;
                alVar2.f23440u0.d(this.f27883c, alVar2.f23441v0, z4, i10, 0L);
                alVar2.f24278b.dismiss(true);
                return;
        }
    }
}
