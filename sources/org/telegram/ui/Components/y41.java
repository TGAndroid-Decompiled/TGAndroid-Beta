package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y41 extends s4.s0 {
    public final f51 f30122a;

    public y41(f51 f51Var) {
        this.f30122a = f51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f30122a.f23790y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f51 f51Var = this.f30122a;
        e51 e51Var = f51Var.f23787s;
        v41 v41Var = f51Var.f23785n;
        s4.s0 s0Var = f51Var.f23790y;
        if (s0Var != null) {
            s0Var.b(v41Var, i10, i11);
        }
        if (i11 > 0 && v41Var.getAdapter() == e51Var && f51Var.J && !e51Var.f23493r && !e51Var.f23494s) {
            if (f51Var.f23786r.N0() >= ((e51Var.f23495w + 1) - ((e51Var.v + 1) * 10)) - 1) {
                f51 f51Var2 = e51Var.f23496x;
                if (f51Var2.J && !e51Var.f23493r && !e51Var.f23494s) {
                    e51Var.f23493r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = e51Var.f23492n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(f51Var2.f23781a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(e51Var, 17));
                }
            }
        }
    }
}
