package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements org.telegram.ui.Cells.z4, hg.z1 {
    public final gr f37062a;

    @Override
    public a0.h G() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        gr grVar = this.f37062a;
        TLObject E = grVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return grVar.f37401y.h0((TLRPC.ChannelParticipant) E, !z10, a5Var);
        }
        return false;
    }

    @Override
    public void f(int i10) {
        gr grVar = this.f37062a;
        hr hrVar = grVar.f37401y;
        if (!grVar.h.e()) {
            int i11 = grVar.f37397r;
            grVar.l();
            if (grVar.f37397r > i11) {
                hrVar.y0(i11);
            }
            if (!grVar.f37398s && grVar.f37397r == 0 && i10 != 0) {
                hrVar.f37718b.e(false, true);
            }
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void S(ArrayList arrayList) {
    }
}
