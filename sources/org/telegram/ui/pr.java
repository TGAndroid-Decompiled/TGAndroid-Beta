package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final qr f39619a;

    public pr(qr qrVar) {
        this.f39619a = qrVar;
    }

    @Override
    public void a(int i10) {
        qr qrVar = this.f39619a;
        rr rrVar = qrVar.f39867y;
        if (!qrVar.h.e()) {
            int i11 = qrVar.f39863r;
            qrVar.l();
            if (qrVar.f39863r > i11) {
                rrVar.y0(i11);
            }
            if (!qrVar.f39864s && qrVar.f39863r == 0 && i10 != 0) {
                rrVar.f40167b.e(false, true);
            }
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        qr qrVar = this.f39619a;
        TLObject E = qrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return qrVar.f39867y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i s() {
        return null;
    }

    @Override
    public a0.i x() {
        return null;
    }

    @Override
    public boolean z(int i10) {
        return true;
    }

    @Override
    public void F(ArrayList arrayList) {
    }
}
