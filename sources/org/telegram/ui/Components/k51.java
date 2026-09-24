package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k51 extends s4.s0 {
    public final r51 f25646a;

    public k51(r51 r51Var) {
        this.f25646a = r51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f25646a.f27872y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        r51 r51Var = this.f25646a;
        q51 q51Var = r51Var.f27869s;
        h51 h51Var = r51Var.f27867n;
        s4.s0 s0Var = r51Var.f27872y;
        if (s0Var != null) {
            s0Var.b(h51Var, i10, i11);
        }
        if (i11 > 0 && h51Var.getAdapter() == q51Var && r51Var.J && !q51Var.f27510r && !q51Var.f27511s) {
            if (r51Var.f27868r.N0() >= ((q51Var.f27512w + 1) - ((q51Var.v + 1) * 10)) - 1) {
                r51 r51Var2 = q51Var.f27513x;
                if (r51Var2.J && !q51Var.f27510r && !q51Var.f27511s) {
                    q51Var.f27510r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = q51Var.f27509n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(r51Var2.f27863a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(q51Var, 17));
                }
            }
        }
    }
}
