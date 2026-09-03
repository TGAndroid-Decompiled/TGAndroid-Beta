package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class pk implements y4 {
    public final int f27876a;
    public final al f27877b;
    public final TLRPC.TL_messageMediaVenue f27878c;

    public pk(al alVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f27876a = i10;
        this.f27877b = alVar;
        this.f27878c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z4) {
        switch (this.f27876a) {
            case 0:
                al alVar = this.f27877b;
                alVar.f23421u0.b(this.f27878c, alVar.f23422v0, z4, i10, 0L);
                alVar.f24282b.dismiss(true);
                return;
            default:
                al alVar2 = this.f27877b;
                alVar2.f23421u0.b(this.f27878c, alVar2.f23422v0, z4, i10, 0L);
                alVar2.f24282b.dismiss(true);
                return;
        }
    }
}
