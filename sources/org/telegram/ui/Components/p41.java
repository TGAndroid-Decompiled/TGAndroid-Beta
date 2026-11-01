package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p41 extends s4.s0 {
    public final x41 f29355a;

    public p41(x41 x41Var) {
        this.f29355a = x41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f29355a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        x41 x41Var = this.f29355a;
        w41 w41Var = x41Var.f32417s;
        m41 m41Var = x41Var.f32415n;
        s4.s0 s0Var = x41Var.D;
        if (s0Var != null) {
            s0Var.b(m41Var, i10, i11);
        }
        if (i11 > 0 && m41Var.getAdapter() == w41Var && x41Var.J && !w41Var.f32078r && !w41Var.f32079s) {
            if (x41Var.f32416r.N0() >= ((w41Var.f32081x + 1) - ((w41Var.f32080w + 1) * 10)) - 1) {
                x41 x41Var2 = w41Var.f32082y;
                if (x41Var2.J && !w41Var.f32078r && !w41Var.f32079s) {
                    w41Var.f32078r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = w41Var.f32077n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(x41Var2.f32411a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(w41Var, 16));
                }
            }
        }
    }
}
