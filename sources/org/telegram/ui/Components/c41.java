package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c41 extends v4.u0 {
    public final j41 f33926a;

    public c41(j41 j41Var) {
        this.f33926a = j41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.u0 u0Var = this.f33926a.E;
        if (u0Var != null) {
            u0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        j41 j41Var = this.f33926a;
        i41 i41Var = j41Var.f36267s;
        z31 z31Var = j41Var.f36265n;
        v4.u0 u0Var = j41Var.E;
        if (u0Var != null) {
            u0Var.b(z31Var, i7, i10);
        }
        if (i10 > 0 && z31Var.getAdapter() == i41Var && j41Var.K && !i41Var.f35909r && !i41Var.f35910s) {
            if (j41Var.f36266r.N0() >= ((i41Var.f35912x + 1) - ((i41Var.f35911w + 1) * 10)) - 1) {
                j41 j41Var2 = i41Var.f35913y;
                if (j41Var2.K && !i41Var.f35909r && !i41Var.f35910s) {
                    i41Var.f35909r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = i41Var.f35908n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(j41Var2.f36260a).sendRequest(tL_messages_getOldFeaturedStickers, new e2(i41Var, 16));
                }
            }
        }
    }
}
