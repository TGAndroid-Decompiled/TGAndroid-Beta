package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ir implements org.telegram.ui.Cells.e5, ig.z1 {
    public final jr f40342a;

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        int intValue = ((Integer) f5Var.getTag()).intValue();
        jr jrVar = this.f40342a;
        TLObject E = jrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return jrVar.f40726y.i0((TLRPC.ChannelParticipant) E, !z10, f5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        jr jrVar = this.f40342a;
        kr krVar = jrVar.f40726y;
        if (!jrVar.h.e()) {
            int i11 = jrVar.f40722r;
            jrVar.l();
            if (jrVar.f40722r > i11) {
                krVar.z0(i11);
            }
            if (!jrVar.f40723s && jrVar.f40722r == 0 && i10 != 0) {
                krVar.f41004b.e(false, true);
            }
        }
    }

    @Override
    public boolean k0(int i10) {
        return true;
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void p0(ArrayList arrayList) {
    }
}
