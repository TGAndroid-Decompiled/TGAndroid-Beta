package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class jr implements org.telegram.ui.Cells.x4, pf.i1 {

    public final kr f39480a;

    @Override
    public boolean D0(int i10) {
        return true;
    }

    @Override
    public a0.h J() {
        return null;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.y4 y4Var, boolean z10) {
        int iIntValue = ((Integer) y4Var.getTag()).intValue();
        kr krVar = this.f39480a;
        TLObject tLObjectE = krVar.E(iIntValue);
        if (!(tLObjectE instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        return krVar.f39845y.h0((TLRPC.ChannelParticipant) tLObjectE, !z10, y4Var);
    }

    @Override
    public a0.h h0() {
        return null;
    }

    @Override
    public void i(int i10) {
        kr krVar = this.f39480a;
        lr lrVar = krVar.f39845y;
        if (krVar.h.e()) {
            return;
        }
        int i11 = krVar.f39841r;
        krVar.l();
        if (krVar.f39841r > i11) {
            lrVar.y0(i11);
        }
        if (krVar.f39842s || krVar.f39841r != 0 || i10 == 0) {
            return;
        }
        lrVar.f40182b.e(false, true);
    }

    @Override
    public void V0(ArrayList arrayList) {
    }
}
