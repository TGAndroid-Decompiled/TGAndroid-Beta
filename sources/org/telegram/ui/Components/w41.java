package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w41 extends s4.s0 {
    public final d51 f29515a;

    public w41(d51 d51Var) {
        this.f29515a = d51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f29515a.f23249y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        d51 d51Var = this.f29515a;
        c51 c51Var = d51Var.f23246s;
        t41 t41Var = d51Var.f23244n;
        s4.s0 s0Var = d51Var.f23249y;
        if (s0Var != null) {
            s0Var.b(t41Var, i10, i11);
        }
        if (i11 > 0 && t41Var.getAdapter() == c51Var && d51Var.J && !c51Var.f22938r && !c51Var.f22939s) {
            if (d51Var.f23245r.N0() >= ((c51Var.f22940w + 1) - ((c51Var.v + 1) * 10)) - 1) {
                d51 d51Var2 = c51Var.f22941x;
                if (d51Var2.J && !c51Var.f22938r && !c51Var.f22939s) {
                    c51Var.f22938r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = c51Var.f22937n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(d51Var2.f23240a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(c51Var, 17));
                }
            }
        }
    }
}
