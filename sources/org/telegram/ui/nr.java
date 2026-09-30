package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nr implements org.telegram.ui.Cells.a5, gg.b2 {
    public final or f36102a;

    public nr(or orVar) {
        this.f36102a = orVar;
    }

    @Override
    public void a(int i10) {
        or orVar = this.f36102a;
        pr prVar = orVar.f36442y;
        if (!orVar.h.e()) {
            int i11 = orVar.f36438r;
            orVar.l();
            if (orVar.f36438r > i11) {
                prVar.y0(i11);
            }
            if (!orVar.f36439s && orVar.f36438r == 0 && i10 != 0) {
                prVar.f36712b.e(false, true);
            }
        }
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        or orVar = this.f36102a;
        TLObject E = orVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return orVar.f36442y.h0((TLRPC.ChannelParticipant) E, !z10, b5Var);
        }
        return false;
    }

    @Override
    public a0.i i() {
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
