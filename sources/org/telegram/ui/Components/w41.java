package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w41 extends f2.a1 {
    public final d51 f32643a;

    public w41(d51 d51Var) {
        this.f32643a = d51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        f2.a1 a1Var = this.f32643a.f26196y;
        if (a1Var != null) {
            a1Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        d51 d51Var = this.f32643a;
        c51 c51Var = d51Var.f26193s;
        t41 t41Var = d51Var.f26191n;
        f2.a1 a1Var = d51Var.f26196y;
        if (a1Var != null) {
            a1Var.b(t41Var, i10, i11);
        }
        if (i11 > 0 && t41Var.getAdapter() == c51Var && d51Var.G && !c51Var.f25777r && !c51Var.f25778s) {
            if (d51Var.f26192r.N0() >= ((c51Var.f25779w + 1) - ((c51Var.v + 1) * 10)) - 1) {
                d51 d51Var2 = c51Var.f25780x;
                if (d51Var2.G && !c51Var.f25777r && !c51Var.f25778s) {
                    c51Var.f25777r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = c51Var.f25776n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(d51Var2.f26186a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(c51Var, 17));
                }
            }
        }
    }
}
