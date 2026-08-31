package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class or implements org.telegram.ui.Cells.a5, uf.j1 {
    public final pr f39824a;

    public or(pr prVar) {
        this.f39824a = prVar;
    }

    @Override
    public a0.h K() {
        return null;
    }

    @Override
    public boolean R(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        pr prVar = this.f39824a;
        TLObject E = prVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return prVar.f40148y.h0((TLRPC.ChannelParticipant) E, !z4, b5Var);
        }
        return false;
    }

    @Override
    public void g(int i10) {
        pr prVar = this.f39824a;
        qr qrVar = prVar.f40148y;
        if (!prVar.h.e()) {
            int i11 = prVar.f40144r;
            prVar.l();
            if (prVar.f40144r > i11) {
                qrVar.y0(i11);
            }
            if (!prVar.f40145s && prVar.f40144r == 0 && i10 != 0) {
                qrVar.f40602b.e(false, true);
            }
        }
    }

    @Override
    public a0.h y() {
        return null;
    }

    @Override
    public void V(ArrayList arrayList) {
    }
}
