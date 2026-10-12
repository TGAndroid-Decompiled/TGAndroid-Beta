package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j61 extends s4.t0 {
    public final q61 f27377a;

    public j61(q61 q61Var) {
        this.f27377a = q61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.t0 t0Var = this.f27377a.f29725y;
        if (t0Var != null) {
            t0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        q61 q61Var = this.f27377a;
        p61 p61Var = q61Var.f29722s;
        g61 g61Var = q61Var.f29720n;
        s4.t0 t0Var = q61Var.f29725y;
        if (t0Var != null) {
            t0Var.b(g61Var, i10, i11);
        }
        if (i11 > 0 && g61Var.getAdapter() == p61Var && q61Var.J && !p61Var.f29434r && !p61Var.f29435s) {
            if (q61Var.f29721r.N0() >= ((p61Var.f29436w + 1) - ((p61Var.v + 1) * 10)) - 1) {
                q61 q61Var2 = p61Var.f29437x;
                if (q61Var2.J && !p61Var.f29434r && !p61Var.f29435s) {
                    p61Var.f29434r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = p61Var.f29433n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(q61Var2.f29715a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(p61Var, 17));
                }
            }
        }
    }
}
