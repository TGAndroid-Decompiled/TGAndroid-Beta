package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nr implements org.telegram.ui.Cells.a5, tf.j1 {
    public final or f36712a;

    public nr(or orVar) {
        this.f36712a = orVar;
    }

    @Override
    public a0.h I() {
        return null;
    }

    @Override
    public boolean Q(int i10) {
        return true;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        int intValue = ((Integer) b5Var.getTag()).intValue();
        or orVar = this.f36712a;
        TLObject E = orVar.E(intValue);
        if (E instanceof TLRPC.ChannelParticipant) {
            return orVar.f36967y.h0((TLRPC.ChannelParticipant) E, !z4, b5Var);
        }
        return false;
    }

    @Override
    public void g(int i10) {
        or orVar = this.f36712a;
        pr prVar = orVar.f36967y;
        if (!orVar.h.e()) {
            int i11 = orVar.f36963r;
            orVar.l();
            if (orVar.f36963r > i11) {
                prVar.y0(i11);
            }
            if (!orVar.f36964s && orVar.f36963r == 0 && i10 != 0) {
                prVar.f37447b.e(false, true);
            }
        }
    }

    @Override
    public a0.h t() {
        return null;
    }

    @Override
    public void T(ArrayList arrayList) {
    }
}
