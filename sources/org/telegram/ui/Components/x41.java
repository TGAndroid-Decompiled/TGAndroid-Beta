package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x41 extends f2.z0 {
    public final e51 f30543a;

    public x41(e51 e51Var) {
        this.f30543a = e51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        f2.z0 z0Var = this.f30543a.f24475y;
        if (z0Var != null) {
            z0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        e51 e51Var = this.f30543a;
        d51 d51Var = e51Var.f24472s;
        u41 u41Var = e51Var.f24470n;
        f2.z0 z0Var = e51Var.f24475y;
        if (z0Var != null) {
            z0Var.b(u41Var, i10, i11);
        }
        if (i11 > 0 && u41Var.getAdapter() == d51Var && e51Var.G && !d51Var.f24169r && !d51Var.f24170s) {
            if (e51Var.f24471r.N0() >= ((d51Var.f24171w + 1) - ((d51Var.v + 1) * 10)) - 1) {
                e51 e51Var2 = d51Var.f24172x;
                if (e51Var2.G && !d51Var.f24169r && !d51Var.f24170s) {
                    d51Var.f24169r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = d51Var.f24168n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(e51Var2.f24466a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(d51Var, 17));
                }
            }
        }
    }
}
