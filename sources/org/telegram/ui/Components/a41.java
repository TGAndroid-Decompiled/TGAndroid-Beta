package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a41 extends f2.d1 {
    public final h41 f26661a;

    public a41(h41 h41Var) {
        this.f26661a = h41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i9) {
        f2.d1 d1Var = this.f26661a.f28977y;
        if (d1Var != null) {
            d1Var.a(recyclerView, i9);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        h41 h41Var = this.f26661a;
        g41 g41Var = h41Var.f28974s;
        x31 x31Var = h41Var.f28972n;
        f2.d1 d1Var = h41Var.f28977y;
        if (d1Var != null) {
            d1Var.b(x31Var, i9, i10);
        }
        if (i10 > 0 && x31Var.getAdapter() == g41Var && h41Var.F && !g41Var.f28647r && !g41Var.f28648s) {
            if (h41Var.f28973r.N0() >= ((g41Var.f28649w + 1) - ((g41Var.v + 1) * 10)) - 1) {
                h41 h41Var2 = g41Var.f28650x;
                if (h41Var2.F && !g41Var.f28647r && !g41Var.f28648s) {
                    g41Var.f28647r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = g41Var.f28646n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(h41Var2.f28967a).sendRequest(tL_messages_getOldFeaturedStickers, new w1(g41Var, 17));
                }
            }
        }
    }
}
