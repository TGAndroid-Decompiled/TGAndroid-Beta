package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr implements org.telegram.ui.Cells.e5, ig.z1 {
    public final lr f40908a;

    @Override
    public a0.h U() {
        return null;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        int intValue = ((Integer) f5Var.getTag()).intValue();
        lr lrVar = this.f40908a;
        TLObject E = lrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return lrVar.f41244y.i0((TLRPC.ChannelParticipant) E, !z10, f5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        lr lrVar = this.f40908a;
        mr mrVar = lrVar.f41244y;
        if (!lrVar.h.e()) {
            int i11 = lrVar.f41240r;
            lrVar.l();
            if (lrVar.f41240r > i11) {
                mrVar.z0(i11);
            }
            if (!lrVar.f41241s && lrVar.f41240r == 0 && i10 != 0) {
                mrVar.f41505b.e(false, true);
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
