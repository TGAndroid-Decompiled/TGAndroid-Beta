package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class g31 extends u4.t0 {
    public final n31 f33951a;

    public g31(n31 n31Var) {
        this.f33951a = n31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        u4.t0 t0Var = this.f33951a.E;
        if (t0Var != null) {
            t0Var.a(recyclerView, i3);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        n31 n31Var = this.f33951a;
        m31 m31Var = n31Var.f36361s;
        d31 d31Var = n31Var.f36359n;
        u4.t0 t0Var = n31Var.E;
        if (t0Var != null) {
            t0Var.b(d31Var, i3, i10);
        }
        if (i10 > 0 && d31Var.getAdapter() == m31Var && n31Var.K && !m31Var.f35993r && !m31Var.f35994s) {
            if (n31Var.f36360r.N0() >= ((m31Var.f35996x + 1) - ((m31Var.f35995w + 1) * 10)) - 1) {
                n31 n31Var2 = m31Var.f35997y;
                if (n31Var2.K && !m31Var.f35993r && !m31Var.f35994s) {
                    m31Var.f35993r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = m31Var.f35992n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(n31Var2.f36354a).sendRequest(tL_messages_getOldFeaturedStickers, new w1(m31Var, 16));
                }
            }
        }
    }
}
