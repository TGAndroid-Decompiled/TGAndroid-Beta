package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e61 extends s4.t0 {
    public final l61 f25973a;

    public e61(l61 l61Var) {
        this.f25973a = l61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.t0 t0Var = this.f25973a.f28313y;
        if (t0Var != null) {
            t0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        l61 l61Var = this.f25973a;
        k61 k61Var = l61Var.f28310s;
        b61 b61Var = l61Var.f28308n;
        s4.t0 t0Var = l61Var.f28313y;
        if (t0Var != null) {
            t0Var.b(b61Var, i10, i11);
        }
        if (i11 > 0 && b61Var.getAdapter() == k61Var && l61Var.J && !k61Var.f27859r && !k61Var.f27860s) {
            if (l61Var.f28309r.N0() >= ((k61Var.f27861w + 1) - ((k61Var.v + 1) * 10)) - 1) {
                l61 l61Var2 = k61Var.f27862x;
                if (l61Var2.J && !k61Var.f27859r && !k61Var.f27860s) {
                    k61Var.f27859r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = k61Var.f27858n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(l61Var2.f28303a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(k61Var, 17));
                }
            }
        }
    }
}
