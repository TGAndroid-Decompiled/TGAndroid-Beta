package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n51 extends s4.s0 {
    public final u51 f26590a;

    public n51(u51 u51Var) {
        this.f26590a = u51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f26590a.f28772y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u51 u51Var = this.f26590a;
        t51 t51Var = u51Var.f28769s;
        k51 k51Var = u51Var.f28767n;
        s4.s0 s0Var = u51Var.f28772y;
        if (s0Var != null) {
            s0Var.b(k51Var, i10, i11);
        }
        if (i11 > 0 && k51Var.getAdapter() == t51Var && u51Var.J && !t51Var.f28430r && !t51Var.f28431s) {
            if (u51Var.f28768r.N0() >= ((t51Var.f28432w + 1) - ((t51Var.v + 1) * 10)) - 1) {
                u51 u51Var2 = t51Var.f28433x;
                if (u51Var2.J && !t51Var.f28430r && !t51Var.f28431s) {
                    t51Var.f28430r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = t51Var.f28429n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(u51Var2.f28763a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(t51Var, 17));
                }
            }
        }
    }
}
