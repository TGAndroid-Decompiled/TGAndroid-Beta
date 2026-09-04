package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w41 extends s4.s0 {
    public final d51 f32122a;

    public w41(d51 d51Var) {
        this.f32122a = d51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f32122a.f25239y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        d51 d51Var = this.f32122a;
        c51 c51Var = d51Var.f25236s;
        t41 t41Var = d51Var.f25234n;
        s4.s0 s0Var = d51Var.f25239y;
        if (s0Var != null) {
            s0Var.b(t41Var, i10, i11);
        }
        if (i11 > 0 && t41Var.getAdapter() == c51Var && d51Var.J && !c51Var.f24899r && !c51Var.f24900s) {
            if (d51Var.f25235r.N0() >= ((c51Var.f24901w + 1) - ((c51Var.v + 1) * 10)) - 1) {
                d51 d51Var2 = c51Var.f24902x;
                if (d51Var2.J && !c51Var.f24899r && !c51Var.f24900s) {
                    c51Var.f24899r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = c51Var.f24898n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(d51Var2.f25229a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(c51Var, 17));
                }
            }
        }
    }
}
