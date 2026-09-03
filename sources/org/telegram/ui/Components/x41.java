package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class x41 extends f2.z0 {
    public final e51 f30476a;

    public x41(e51 e51Var) {
        this.f30476a = e51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        f2.z0 z0Var = this.f30476a.f24488y;
        if (z0Var != null) {
            z0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        e51 e51Var = this.f30476a;
        d51 d51Var = e51Var.f24485s;
        u41 u41Var = e51Var.f24483n;
        f2.z0 z0Var = e51Var.f24488y;
        if (z0Var != null) {
            z0Var.b(u41Var, i10, i11);
        }
        if (i11 > 0 && u41Var.getAdapter() == d51Var && e51Var.G && !d51Var.f24175r && !d51Var.f24176s) {
            if (e51Var.f24484r.N0() >= ((d51Var.f24177w + 1) - ((d51Var.v + 1) * 10)) - 1) {
                e51 e51Var2 = d51Var.f24178x;
                if (e51Var2.G && !d51Var.f24175r && !d51Var.f24176s) {
                    d51Var.f24175r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = d51Var.f24174n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(e51Var2.f24479a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(d51Var, 17));
                }
            }
        }
    }
}
