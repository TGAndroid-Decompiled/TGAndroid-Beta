package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j61 extends s4.u0 {
    public final q61 f29528a;

    public j61(q61 q61Var) {
        this.f29528a = q61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.u0 u0Var = this.f29528a.f31812y;
        if (u0Var != null) {
            u0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        q61 q61Var = this.f29528a;
        p61 p61Var = q61Var.f31809s;
        g61 g61Var = q61Var.f31807n;
        s4.u0 u0Var = q61Var.f31812y;
        if (u0Var != null) {
            u0Var.b(g61Var, i10, i11);
        }
        if (i11 > 0 && g61Var.getAdapter() == p61Var && q61Var.J && !p61Var.f31513r && !p61Var.f31514s) {
            if (q61Var.f31808r.N0() >= ((p61Var.f31515w + 1) - ((p61Var.v + 1) * 10)) - 1) {
                q61 q61Var2 = p61Var.f31516x;
                if (q61Var2.J && !p61Var.f31513r && !p61Var.f31514s) {
                    p61Var.f31513r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = p61Var.f31512n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(q61Var2.f31803a).sendRequest(tL_messages_getOldFeaturedStickers, new b2(p61Var, 17));
                }
            }
        }
    }
}
