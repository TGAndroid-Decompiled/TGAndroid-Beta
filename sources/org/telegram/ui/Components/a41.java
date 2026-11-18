package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a41 extends v4.u0 {
    public final h41 f33249a;

    public a41(h41 h41Var) {
        this.f33249a = h41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.u0 u0Var = this.f33249a.E;
        if (u0Var != null) {
            u0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        h41 h41Var = this.f33249a;
        g41 g41Var = h41Var.f35721s;
        x31 x31Var = h41Var.f35719n;
        v4.u0 u0Var = h41Var.E;
        if (u0Var != null) {
            u0Var.b(x31Var, i7, i10);
        }
        if (i10 > 0 && x31Var.getAdapter() == g41Var && h41Var.K && !g41Var.f35331r && !g41Var.f35332s) {
            if (h41Var.f35720r.N0() >= ((g41Var.f35334x + 1) - ((g41Var.f35333w + 1) * 10)) - 1) {
                h41 h41Var2 = g41Var.f35335y;
                if (h41Var2.K && !g41Var.f35331r && !g41Var.f35332s) {
                    g41Var.f35331r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = g41Var.f35330n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(h41Var2.f35714a).sendRequest(tL_messages_getOldFeaturedStickers, new e2(g41Var, 16));
                }
            }
        }
    }
}
