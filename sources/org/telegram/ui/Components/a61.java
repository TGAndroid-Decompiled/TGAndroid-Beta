package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a61 extends s4.r0 {
    public final h61 f24637a;

    public a61(h61 h61Var) {
        this.f24637a = h61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.r0 r0Var = this.f24637a.f26887y;
        if (r0Var != null) {
            r0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        h61 h61Var = this.f24637a;
        g61 g61Var = h61Var.f26884s;
        x51 x51Var = h61Var.f26882n;
        s4.r0 r0Var = h61Var.f26887y;
        if (r0Var != null) {
            r0Var.b(x51Var, i10, i11);
        }
        if (i11 > 0 && x51Var.getAdapter() == g61Var && h61Var.J && !g61Var.f26574r && !g61Var.f26575s) {
            if (h61Var.f26883r.N0() >= ((g61Var.f26576w + 1) - ((g61Var.v + 1) * 10)) - 1) {
                h61 h61Var2 = g61Var.f26577x;
                if (h61Var2.J && !g61Var.f26574r && !g61Var.f26575s) {
                    g61Var.f26574r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = g61Var.f26573n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(h61Var2.f26878a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(g61Var, 17));
                }
            }
        }
    }
}
