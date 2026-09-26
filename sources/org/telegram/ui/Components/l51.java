package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l51 extends s4.s0 {
    public final s51 f25973a;

    public l51(s51 s51Var) {
        this.f25973a = s51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f25973a.f28169y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s51 s51Var = this.f25973a;
        r51 r51Var = s51Var.f28166s;
        i51 i51Var = s51Var.f28164n;
        s4.s0 s0Var = s51Var.f28169y;
        if (s0Var != null) {
            s0Var.b(i51Var, i10, i11);
        }
        if (i11 > 0 && i51Var.getAdapter() == r51Var && s51Var.J && !r51Var.f27836r && !r51Var.f27837s) {
            if (s51Var.f28165r.N0() >= ((r51Var.f27838w + 1) - ((r51Var.v + 1) * 10)) - 1) {
                s51 s51Var2 = r51Var.f27839x;
                if (s51Var2.J && !r51Var.f27836r && !r51Var.f27837s) {
                    r51Var.f27836r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = r51Var.f27835n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(s51Var2.f28160a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(r51Var, 17));
                }
            }
        }
    }
}
