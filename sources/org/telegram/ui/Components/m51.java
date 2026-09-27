package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m51 extends s4.s0 {
    public final t51 f26359a;

    public m51(t51 t51Var) {
        this.f26359a = t51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f26359a.f28493y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t51 t51Var = this.f26359a;
        s51 s51Var = t51Var.f28490s;
        j51 j51Var = t51Var.f28488n;
        s4.s0 s0Var = t51Var.f28493y;
        if (s0Var != null) {
            s0Var.b(j51Var, i10, i11);
        }
        if (i11 > 0 && j51Var.getAdapter() == s51Var && t51Var.J && !s51Var.f28168r && !s51Var.f28169s) {
            if (t51Var.f28489r.N0() >= ((s51Var.f28170w + 1) - ((s51Var.v + 1) * 10)) - 1) {
                t51 t51Var2 = s51Var.f28171x;
                if (t51Var2.J && !s51Var.f28168r && !s51Var.f28169s) {
                    s51Var.f28168r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = s51Var.f28167n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(t51Var2.f28484a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(s51Var, 17));
                }
            }
        }
    }
}
