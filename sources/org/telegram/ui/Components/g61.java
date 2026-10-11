package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g61 extends s4.t0 {
    public final n61 f26620a;

    public g61(n61 n61Var) {
        this.f26620a = n61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.t0 t0Var = this.f26620a.f28986y;
        if (t0Var != null) {
            t0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        n61 n61Var = this.f26620a;
        m61 m61Var = n61Var.f28983s;
        d61 d61Var = n61Var.f28981n;
        s4.t0 t0Var = n61Var.f28986y;
        if (t0Var != null) {
            t0Var.b(d61Var, i10, i11);
        }
        if (i11 > 0 && d61Var.getAdapter() == m61Var && n61Var.J && !m61Var.f28575r && !m61Var.f28576s) {
            if (n61Var.f28982r.N0() >= ((m61Var.f28577w + 1) - ((m61Var.v + 1) * 10)) - 1) {
                n61 n61Var2 = m61Var.f28578x;
                if (n61Var2.J && !m61Var.f28575r && !m61Var.f28576s) {
                    m61Var.f28575r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = m61Var.f28574n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(n61Var2.f28976a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(m61Var, 17));
                }
            }
        }
    }
}
