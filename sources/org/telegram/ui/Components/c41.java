package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class c41 extends f2.b1 {

    public final j41 f27320a;

    public c41(j41 j41Var) {
        this.f27320a = j41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        f2.b1 b1Var = this.f27320a.f29590y;
        if (b1Var != null) {
            b1Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j41 j41Var = this.f27320a;
        i41 i41Var = j41Var.f29587s;
        z31 z31Var = j41Var.f29585n;
        f2.b1 b1Var = j41Var.f29590y;
        if (b1Var != null) {
            b1Var.b(z31Var, i10, i11);
        }
        if (i11 <= 0 || z31Var.getAdapter() != i41Var || !j41Var.F || i41Var.f29221r || i41Var.f29222s) {
            return;
        }
        if (j41Var.f29586r.N0() >= ((i41Var.f29223w + 1) - ((i41Var.v + 1) * 10)) - 1) {
            j41 j41Var2 = i41Var.f29224x;
            if (!j41Var2.F || i41Var.f29221r || i41Var.f29222s) {
                return;
            }
            i41Var.f29221r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = i41Var.f29220n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(j41Var2.f29580a).sendRequest(tL_messages_getOldFeaturedStickers, new w1(i41Var, 17));
        }
    }
}
