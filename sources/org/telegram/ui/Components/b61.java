package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b61 extends s4.r0 {
    public final i61 f24965a;

    public b61(i61 i61Var) {
        this.f24965a = i61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.r0 r0Var = this.f24965a.f27228y;
        if (r0Var != null) {
            r0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i61 i61Var = this.f24965a;
        h61 h61Var = i61Var.f27225s;
        y51 y51Var = i61Var.f27223n;
        s4.r0 r0Var = i61Var.f27228y;
        if (r0Var != null) {
            r0Var.b(y51Var, i10, i11);
        }
        if (i11 > 0 && y51Var.getAdapter() == h61Var && i61Var.J && !h61Var.f26806r && !h61Var.f26807s) {
            if (i61Var.f27224r.N0() >= ((h61Var.f26808w + 1) - ((h61Var.v + 1) * 10)) - 1) {
                i61 i61Var2 = h61Var.f26809x;
                if (i61Var2.J && !h61Var.f26806r && !h61Var.f26807s) {
                    h61Var.f26806r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = h61Var.f26805n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(i61Var2.f27219a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(h61Var, 17));
                }
            }
        }
    }
}
