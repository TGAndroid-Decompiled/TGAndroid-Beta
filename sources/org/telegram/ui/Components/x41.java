package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x41 extends s4.s0 {
    public final e51 f29889a;

    public x41(e51 e51Var) {
        this.f29889a = e51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f29889a.f23548y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        e51 e51Var = this.f29889a;
        d51 d51Var = e51Var.f23545s;
        u41 u41Var = e51Var.f23543n;
        s4.s0 s0Var = e51Var.f23548y;
        if (s0Var != null) {
            s0Var.b(u41Var, i10, i11);
        }
        if (i11 > 0 && u41Var.getAdapter() == d51Var && e51Var.J && !d51Var.f23221r && !d51Var.f23222s) {
            if (e51Var.f23544r.N0() >= ((d51Var.f23223w + 1) - ((d51Var.v + 1) * 10)) - 1) {
                e51 e51Var2 = d51Var.f23224x;
                if (e51Var2.J && !d51Var.f23221r && !d51Var.f23222s) {
                    d51Var.f23221r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = d51Var.f23220n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(e51Var2.f23539a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(d51Var, 17));
                }
            }
        }
    }
}
