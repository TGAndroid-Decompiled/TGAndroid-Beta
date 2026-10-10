package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f61 extends s4.t0 {
    public final m61 f26326a;

    public f61(m61 m61Var) {
        this.f26326a = m61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.t0 t0Var = this.f26326a.f28690y;
        if (t0Var != null) {
            t0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m61 m61Var = this.f26326a;
        l61 l61Var = m61Var.f28687s;
        c61 c61Var = m61Var.f28685n;
        s4.t0 t0Var = m61Var.f28690y;
        if (t0Var != null) {
            t0Var.b(c61Var, i10, i11);
        }
        if (i11 > 0 && c61Var.getAdapter() == l61Var && m61Var.J && !l61Var.f28178r && !l61Var.f28179s) {
            if (m61Var.f28686r.N0() >= ((l61Var.f28180w + 1) - ((l61Var.v + 1) * 10)) - 1) {
                m61 m61Var2 = l61Var.f28181x;
                if (m61Var2.J && !l61Var.f28178r && !l61Var.f28179s) {
                    l61Var.f28178r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = l61Var.f28177n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(m61Var2.f28680a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(l61Var, 17));
                }
            }
        }
    }
}
