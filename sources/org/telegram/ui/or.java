package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class or implements org.telegram.ui.Cells.a5, gg.b2 {
    public final pr f35947a;

    public or(pr prVar) {
        this.f35947a = prVar;
    }

    @Override
    public a0.i F() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        pr prVar = this.f35947a;
        TLObject E = prVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return prVar.f36173y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public void h(int i10) {
        pr prVar = this.f35947a;
        qr qrVar = prVar.f36173y;
        if (!prVar.h.e()) {
            int i11 = prVar.f36169r;
            prVar.l();
            if (prVar.f36169r > i11) {
                qrVar.y0(i11);
            }
            if (!prVar.f36170s && prVar.f36169r == 0 && i10 != 0) {
                qrVar.f36548b.e(false, true);
            }
        }
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public void Q(ArrayList arrayList) {
    }
}
