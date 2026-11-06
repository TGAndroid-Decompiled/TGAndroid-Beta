package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f31 extends v4.s0 {
    public final n31 f33464a;

    public f31(n31 n31Var) {
        this.f33464a = n31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.s0 s0Var = this.f33464a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        n31 n31Var = this.f33464a;
        m31 m31Var = n31Var.f36238s;
        c31 c31Var = n31Var.f36236n;
        v4.s0 s0Var = n31Var.D;
        if (s0Var != null) {
            s0Var.b(c31Var, i7, i10);
        }
        if (i10 > 0 && c31Var.getAdapter() == m31Var && n31Var.J && !m31Var.f35863r && !m31Var.f35864s) {
            if (n31Var.f36237r.N0() >= ((m31Var.f35866x + 1) - ((m31Var.f35865w + 1) * 10)) - 1) {
                n31 n31Var2 = m31Var.f35867y;
                if (n31Var2.J && !m31Var.f35863r && !m31Var.f35864s) {
                    m31Var.f35863r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = m31Var.f35862n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(n31Var2.f36231a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(m31Var, 16));
                }
            }
        }
    }
}
