package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i61 extends s4.u0 {
    public final p61 f29200a;

    public i61(p61 p61Var) {
        this.f29200a = p61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.u0 u0Var = this.f29200a.f31458y;
        if (u0Var != null) {
            u0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p61 p61Var = this.f29200a;
        o61 o61Var = p61Var.f31455s;
        f61 f61Var = p61Var.f31453n;
        s4.u0 u0Var = p61Var.f31458y;
        if (u0Var != null) {
            u0Var.b(f61Var, i10, i11);
        }
        if (i11 > 0 && f61Var.getAdapter() == o61Var && p61Var.J && !o61Var.f31212r && !o61Var.f31213s) {
            if (p61Var.f31454r.N0() >= ((o61Var.f31214w + 1) - ((o61Var.v + 1) * 10)) - 1) {
                p61 p61Var2 = o61Var.f31215x;
                if (p61Var2.J && !o61Var.f31212r && !o61Var.f31213s) {
                    o61Var.f31212r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = o61Var.f31211n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(p61Var2.f31449a).sendRequest(tL_messages_getOldFeaturedStickers, new b2(o61Var, 17));
                }
            }
        }
    }
}
