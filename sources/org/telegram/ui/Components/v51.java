package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v51 extends s4.r0 {
    public final c61 f31162a;

    public v51(c61 c61Var) {
        this.f31162a = c61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.r0 r0Var = this.f31162a.f25097y;
        if (r0Var != null) {
            r0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c61 c61Var = this.f31162a;
        b61 b61Var = c61Var.f25094s;
        s51 s51Var = c61Var.f25092n;
        s4.r0 r0Var = c61Var.f25097y;
        if (r0Var != null) {
            r0Var.b(s51Var, i10, i11);
        }
        if (i11 > 0 && s51Var.getAdapter() == b61Var && c61Var.J && !b61Var.f24813r && !b61Var.f24814s) {
            if (c61Var.f25093r.N0() >= ((b61Var.f24815w + 1) - ((b61Var.v + 1) * 10)) - 1) {
                c61 c61Var2 = b61Var.f24816x;
                if (c61Var2.J && !b61Var.f24813r && !b61Var.f24814s) {
                    b61Var.f24813r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = b61Var.f24812n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(c61Var2.f25088a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(b61Var, 17));
                }
            }
        }
    }
}
