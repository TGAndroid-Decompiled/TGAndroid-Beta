package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w51 extends s4.s0 {
    public final d61 f32524a;

    public w51(d61 d61Var) {
        this.f32524a = d61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f32524a.f25693y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        d61 d61Var = this.f32524a;
        c61 c61Var = d61Var.f25690s;
        t51 t51Var = d61Var.f25688n;
        s4.s0 s0Var = d61Var.f25693y;
        if (s0Var != null) {
            s0Var.b(t51Var, i10, i11);
        }
        if (i11 > 0 && t51Var.getAdapter() == c61Var && d61Var.J && !c61Var.f25279r && !c61Var.f25280s) {
            if (d61Var.f25689r.N0() >= ((c61Var.f25281w + 1) - ((c61Var.v + 1) * 10)) - 1) {
                d61 d61Var2 = c61Var.f25282x;
                if (d61Var2.J && !c61Var.f25279r && !c61Var.f25280s) {
                    c61Var.f25279r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = c61Var.f25278n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(d61Var2.f25683a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(c61Var, 17));
                }
            }
        }
    }
}
