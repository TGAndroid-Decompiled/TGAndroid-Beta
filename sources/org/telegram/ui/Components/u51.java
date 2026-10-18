package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u51 extends s4.r0 {
    public final b61 f30900a;

    public u51(b61 b61Var) {
        this.f30900a = b61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.r0 r0Var = this.f30900a.f24828y;
        if (r0Var != null) {
            r0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b61 b61Var = this.f30900a;
        a61 a61Var = b61Var.f24825s;
        r51 r51Var = b61Var.f24823n;
        s4.r0 r0Var = b61Var.f24828y;
        if (r0Var != null) {
            r0Var.b(r51Var, i10, i11);
        }
        if (i11 > 0 && r51Var.getAdapter() == a61Var && b61Var.J && !a61Var.f24512r && !a61Var.f24513s) {
            if (b61Var.f24824r.N0() >= ((a61Var.f24514w + 1) - ((a61Var.v + 1) * 10)) - 1) {
                b61 b61Var2 = a61Var.f24515x;
                if (b61Var2.J && !a61Var.f24512r && !a61Var.f24513s) {
                    a61Var.f24512r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = a61Var.f24511n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(b61Var2.f24819a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(a61Var, 17));
                }
            }
        }
    }
}
