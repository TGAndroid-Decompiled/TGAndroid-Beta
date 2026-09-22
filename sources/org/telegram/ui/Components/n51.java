package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n51 extends s4.s0 {
    public final u51 f26641a;

    public n51(u51 u51Var) {
        this.f26641a = u51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f26641a.f28676y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u51 u51Var = this.f26641a;
        t51 t51Var = u51Var.f28673s;
        k51 k51Var = u51Var.f28671n;
        s4.s0 s0Var = u51Var.f28676y;
        if (s0Var != null) {
            s0Var.b(k51Var, i10, i11);
        }
        if (i11 > 0 && k51Var.getAdapter() == t51Var && u51Var.J && !t51Var.f28401r && !t51Var.f28402s) {
            if (u51Var.f28672r.N0() >= ((t51Var.f28403w + 1) - ((t51Var.v + 1) * 10)) - 1) {
                u51 u51Var2 = t51Var.f28404x;
                if (u51Var2.J && !t51Var.f28401r && !t51Var.f28402s) {
                    t51Var.f28401r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = t51Var.f28400n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(u51Var2.f28667a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(t51Var, 17));
                }
            }
        }
    }
}
