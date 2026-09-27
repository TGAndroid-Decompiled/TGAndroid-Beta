package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class or implements org.telegram.ui.Cells.a5, gg.b2 {
    public final pr f36245a;

    public or(pr prVar) {
        this.f36245a = prVar;
    }

    @Override
    public void a(int i10) {
        pr prVar = this.f36245a;
        qr qrVar = prVar.f36527y;
        if (!prVar.h.e()) {
            int i11 = prVar.f36523r;
            prVar.l();
            if (prVar.f36523r > i11) {
                qrVar.y0(i11);
            }
            if (!prVar.f36524s && prVar.f36523r == 0 && i10 != 0) {
                qrVar.f36820b.e(false, true);
            }
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        pr prVar = this.f36245a;
        TLObject E = prVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return prVar.f36527y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i l() {
        return null;
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public void F(ArrayList arrayList) {
    }
}
