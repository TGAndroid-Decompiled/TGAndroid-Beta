package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v51 extends s4.r0 {
    public final c61 f31164a;

    public v51(c61 c61Var) {
        this.f31164a = c61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.r0 r0Var = this.f31164a.f25099y;
        if (r0Var != null) {
            r0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c61 c61Var = this.f31164a;
        b61 b61Var = c61Var.f25096s;
        s51 s51Var = c61Var.f25094n;
        s4.r0 r0Var = c61Var.f25099y;
        if (r0Var != null) {
            r0Var.b(s51Var, i10, i11);
        }
        if (i11 > 0 && s51Var.getAdapter() == b61Var && c61Var.J && !b61Var.f24815r && !b61Var.f24816s) {
            if (c61Var.f25095r.N0() >= ((b61Var.f24817w + 1) - ((b61Var.v + 1) * 10)) - 1) {
                c61 c61Var2 = b61Var.f24818x;
                if (c61Var2.J && !b61Var.f24815r && !b61Var.f24816s) {
                    b61Var.f24815r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = b61Var.f24814n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(c61Var2.f25090a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(b61Var, 17));
                }
            }
        }
    }
}
