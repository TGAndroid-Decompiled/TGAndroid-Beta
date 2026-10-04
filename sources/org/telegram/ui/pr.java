package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final qr f39529a;

    public pr(qr qrVar) {
        this.f39529a = qrVar;
    }

    @Override
    public void a(int i10) {
        qr qrVar = this.f39529a;
        rr rrVar = qrVar.f39800y;
        if (!qrVar.h.e()) {
            int i11 = qrVar.f39796r;
            qrVar.l();
            if (qrVar.f39796r > i11) {
                rrVar.y0(i11);
            }
            if (!qrVar.f39797s && qrVar.f39796r == 0 && i10 != 0) {
                rrVar.f40186b.e(false, true);
            }
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        qr qrVar = this.f39529a;
        TLObject E = qrVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return qrVar.f39800y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i w() {
        return null;
    }

    @Override
    public a0.i y() {
        return null;
    }

    @Override
    public boolean z(int i10) {
        return true;
    }

    @Override
    public void C(ArrayList arrayList) {
    }
}
