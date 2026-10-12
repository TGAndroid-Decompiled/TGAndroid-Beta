package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a61 extends s4.r0 {
    public final h61 f23456a;

    public a61(h61 h61Var) {
        this.f23456a = h61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.r0 r0Var = this.f23456a.f25527y;
        if (r0Var != null) {
            r0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        h61 h61Var = this.f23456a;
        g61 g61Var = h61Var.f25524s;
        x51 x51Var = h61Var.f25522n;
        s4.r0 r0Var = h61Var.f25527y;
        if (r0Var != null) {
            r0Var.b(x51Var, i10, i11);
        }
        if (i11 > 0 && x51Var.getAdapter() == g61Var && h61Var.J && !g61Var.f25201r && !g61Var.f25202s) {
            if (h61Var.f25523r.N0() >= ((g61Var.f25203w + 1) - ((g61Var.v + 1) * 10)) - 1) {
                h61 h61Var2 = g61Var.f25204x;
                if (h61Var2.J && !g61Var.f25201r && !g61Var.f25202s) {
                    g61Var.f25201r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = g61Var.f25200n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(h61Var2.f25518a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(g61Var, 17));
                }
            }
        }
    }
}
