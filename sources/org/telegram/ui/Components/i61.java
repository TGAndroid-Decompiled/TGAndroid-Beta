package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i61 extends s4.u0 {
    public final p61 f29202a;

    public i61(p61 p61Var) {
        this.f29202a = p61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.u0 u0Var = this.f29202a.f31460y;
        if (u0Var != null) {
            u0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p61 p61Var = this.f29202a;
        o61 o61Var = p61Var.f31457s;
        f61 f61Var = p61Var.f31455n;
        s4.u0 u0Var = p61Var.f31460y;
        if (u0Var != null) {
            u0Var.b(f61Var, i10, i11);
        }
        if (i11 > 0 && f61Var.getAdapter() == o61Var && p61Var.J && !o61Var.f31214r && !o61Var.f31215s) {
            if (p61Var.f31456r.N0() >= ((o61Var.f31216w + 1) - ((o61Var.v + 1) * 10)) - 1) {
                p61 p61Var2 = o61Var.f31217x;
                if (p61Var2.J && !o61Var.f31214r && !o61Var.f31215s) {
                    o61Var.f31214r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = o61Var.f31213n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(p61Var2.f31451a).sendRequest(tL_messages_getOldFeaturedStickers, new b2(o61Var, 17));
                }
            }
        }
    }
}
