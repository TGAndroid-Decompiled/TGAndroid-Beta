package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class wk implements b5 {
    public final int f29730a;
    public final gl f29731b;
    public final TLRPC.TL_messageMediaVenue f29732c;

    public wk(gl glVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10) {
        this.f29730a = i10;
        this.f29731b = glVar;
        this.f29732c = tL_messageMediaVenue;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        switch (this.f29730a) {
            case 0:
                gl glVar = this.f29731b;
                glVar.f24412x0.b(this.f29732c, glVar.f24414y0, z10, i10, 0L);
                glVar.f26461b.dismiss(true);
                return;
            default:
                gl glVar2 = this.f29731b;
                glVar2.f24412x0.b(this.f29732c, glVar2.f24414y0, z10, i10, 0L);
                glVar2.f26461b.dismiss(true);
                return;
        }
    }
}
