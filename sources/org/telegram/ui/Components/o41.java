package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class o41 extends s4.s0 {
    public final w41 f28972a;

    public o41(w41 w41Var) {
        this.f28972a = w41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f28972a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        w41 w41Var = this.f28972a;
        v41 v41Var = w41Var.f32001s;
        l41 l41Var = w41Var.f31999n;
        s4.s0 s0Var = w41Var.D;
        if (s0Var != null) {
            s0Var.b(l41Var, i10, i11);
        }
        if (i11 > 0 && l41Var.getAdapter() == v41Var && w41Var.J && !v41Var.f31135r && !v41Var.f31136s) {
            if (w41Var.f32000r.N0() >= ((v41Var.f31138x + 1) - ((v41Var.f31137w + 1) * 10)) - 1) {
                w41 w41Var2 = v41Var.f31139y;
                if (w41Var2.J && !v41Var.f31135r && !v41Var.f31136s) {
                    v41Var.f31135r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = v41Var.f31134n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(w41Var2.f31995a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(v41Var, 16));
                }
            }
        }
    }
}
