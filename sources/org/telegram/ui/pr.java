package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pr implements org.telegram.ui.Cells.z4, tf.i1 {
    public final qr f37215a;

    public pr(qr qrVar) {
        this.f37215a = qrVar;
    }

    @Override
    public a0.h H0() {
        return null;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z4) {
        int intValue = ((Integer) a5Var.getTag()).intValue();
        qr qrVar = this.f37215a;
        TLObject E = qrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return qrVar.f37464y.h0((TLRPC.ChannelParticipant) E, !z4, a5Var);
        }
        return false;
    }

    @Override
    public void k(int i10) {
        qr qrVar = this.f37215a;
        rr rrVar = qrVar.f37464y;
        if (!qrVar.h.e()) {
            int i11 = qrVar.f37460r;
            qrVar.l();
            if (qrVar.f37460r > i11) {
                rrVar.y0(i11);
            }
            if (!qrVar.f37461s && qrVar.f37460r == 0 && i10 != 0) {
                rrVar.f37958b.e(false, true);
            }
        }
    }

    @Override
    public boolean t1(int i10) {
        return true;
    }

    @Override
    public void J1(ArrayList arrayList) {
    }
}
