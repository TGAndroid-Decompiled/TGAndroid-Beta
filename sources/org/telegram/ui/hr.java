package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements org.telegram.ui.Cells.z4, hg.z1 {
    public final ir f37614a;

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        ir irVar = this.f37614a;
        TLObject E = irVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return irVar.f37965y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        ir irVar = this.f37614a;
        jr jrVar = irVar.f37965y;
        if (!irVar.h.e()) {
            int i11 = irVar.f37961r;
            irVar.l();
            if (irVar.f37961r > i11) {
                jrVar.y0(i11);
            }
            if (!irVar.f37962s && irVar.f37961r == 0 && i10 != 0) {
                jrVar.f38267b.e(false, true);
            }
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void Y(ArrayList arrayList) {
    }
}
