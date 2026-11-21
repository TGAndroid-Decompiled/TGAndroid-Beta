package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d41 extends v4.u0 {
    public final k41 f34386a;

    public d41(k41 k41Var) {
        this.f34386a = k41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.u0 u0Var = this.f34386a.E;
        if (u0Var != null) {
            u0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        k41 k41Var = this.f34386a;
        j41 j41Var = k41Var.f36772s;
        a41 a41Var = k41Var.f36770n;
        v4.u0 u0Var = k41Var.E;
        if (u0Var != null) {
            u0Var.b(a41Var, i7, i10);
        }
        if (i10 > 0 && a41Var.getAdapter() == j41Var && k41Var.K && !j41Var.f36403r && !j41Var.f36404s) {
            if (k41Var.f36771r.N0() >= ((j41Var.f36406x + 1) - ((j41Var.f36405w + 1) * 10)) - 1) {
                k41 k41Var2 = j41Var.f36407y;
                if (k41Var2.K && !j41Var.f36403r && !j41Var.f36404s) {
                    j41Var.f36403r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = j41Var.f36402n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(k41Var2.f36765a).sendRequest(tL_messages_getOldFeaturedStickers, new f2(j41Var, 16));
                }
            }
        }
    }
}
