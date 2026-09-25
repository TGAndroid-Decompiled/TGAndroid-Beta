package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k51 extends s4.s0 {
    public final r51 f25665a;

    public k51(r51 r51Var) {
        this.f25665a = r51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f25665a.f27881y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        r51 r51Var = this.f25665a;
        q51 q51Var = r51Var.f27878s;
        h51 h51Var = r51Var.f27876n;
        s4.s0 s0Var = r51Var.f27881y;
        if (s0Var != null) {
            s0Var.b(h51Var, i10, i11);
        }
        if (i11 > 0 && h51Var.getAdapter() == q51Var && r51Var.J && !q51Var.f27517r && !q51Var.f27518s) {
            if (r51Var.f27877r.N0() >= ((q51Var.f27519w + 1) - ((q51Var.v + 1) * 10)) - 1) {
                r51 r51Var2 = q51Var.f27520x;
                if (r51Var2.J && !q51Var.f27517r && !q51Var.f27518s) {
                    q51Var.f27517r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = q51Var.f27516n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(r51Var2.f27872a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(q51Var, 17));
                }
            }
        }
    }
}
