package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f61 extends s4.t0 {
    public final m61 f26368a;

    public f61(m61 m61Var) {
        this.f26368a = m61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.t0 t0Var = this.f26368a.f28766y;
        if (t0Var != null) {
            t0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m61 m61Var = this.f26368a;
        l61 l61Var = m61Var.f28763s;
        c61 c61Var = m61Var.f28761n;
        s4.t0 t0Var = m61Var.f28766y;
        if (t0Var != null) {
            t0Var.b(c61Var, i10, i11);
        }
        if (i11 > 0 && c61Var.getAdapter() == l61Var && m61Var.J && !l61Var.f28215r && !l61Var.f28216s) {
            if (m61Var.f28762r.N0() >= ((l61Var.f28217w + 1) - ((l61Var.v + 1) * 10)) - 1) {
                m61 m61Var2 = l61Var.f28218x;
                if (m61Var2.J && !l61Var.f28215r && !l61Var.f28216s) {
                    l61Var.f28215r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = l61Var.f28214n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(m61Var2.f28756a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(l61Var, 17));
                }
            }
        }
    }
}
