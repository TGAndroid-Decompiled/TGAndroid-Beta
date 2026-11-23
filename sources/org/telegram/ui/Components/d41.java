package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d41 extends v4.t0 {
    public final k41 f34344a;

    public d41(k41 k41Var) {
        this.f34344a = k41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.t0 t0Var = this.f34344a.E;
        if (t0Var != null) {
            t0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        k41 k41Var = this.f34344a;
        j41 j41Var = k41Var.f36740s;
        a41 a41Var = k41Var.f36738n;
        v4.t0 t0Var = k41Var.E;
        if (t0Var != null) {
            t0Var.b(a41Var, i7, i10);
        }
        if (i10 > 0 && a41Var.getAdapter() == j41Var && k41Var.K && !j41Var.f36356r && !j41Var.f36357s) {
            if (k41Var.f36739r.N0() >= ((j41Var.f36359x + 1) - ((j41Var.f36358w + 1) * 10)) - 1) {
                k41 k41Var2 = j41Var.f36360y;
                if (k41Var2.K && !j41Var.f36356r && !j41Var.f36357s) {
                    j41Var.f36356r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = j41Var.f36355n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(k41Var2.f36733a).sendRequest(tL_messages_getOldFeaturedStickers, new f2(j41Var, 16));
                }
            }
        }
    }
}
