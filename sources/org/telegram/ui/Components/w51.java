package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class w51 extends s4.r0 {
    public final d61 f31973a;

    public w51(d61 d61Var) {
        this.f31973a = d61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.r0 r0Var = this.f31973a.f25356y;
        if (r0Var != null) {
            r0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        d61 d61Var = this.f31973a;
        c61 c61Var = d61Var.f25353s;
        t51 t51Var = d61Var.f25351n;
        s4.r0 r0Var = d61Var.f25356y;
        if (r0Var != null) {
            r0Var.b(t51Var, i10, i11);
        }
        if (i11 > 0 && t51Var.getAdapter() == c61Var && d61Var.J && !c61Var.f25112r && !c61Var.f25113s) {
            if (d61Var.f25352r.N0() >= ((c61Var.f25114w + 1) - ((c61Var.v + 1) * 10)) - 1) {
                d61 d61Var2 = c61Var.f25115x;
                if (d61Var2.J && !c61Var.f25112r && !c61Var.f25113s) {
                    c61Var.f25112r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = c61Var.f25111n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(d61Var2.f25347a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(c61Var, 17));
                }
            }
        }
    }
}
