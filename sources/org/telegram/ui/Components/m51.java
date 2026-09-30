package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m51 extends s4.s0 {
    public final t51 f26302a;

    public m51(t51 t51Var) {
        this.f26302a = t51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f26302a.f28475y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t51 t51Var = this.f26302a;
        s51 s51Var = t51Var.f28472s;
        j51 j51Var = t51Var.f28470n;
        s4.s0 s0Var = t51Var.f28475y;
        if (s0Var != null) {
            s0Var.b(j51Var, i10, i11);
        }
        if (i11 > 0 && j51Var.getAdapter() == s51Var && t51Var.J && !s51Var.f28130r && !s51Var.f28131s) {
            if (t51Var.f28471r.N0() >= ((s51Var.f28132w + 1) - ((s51Var.v + 1) * 10)) - 1) {
                t51 t51Var2 = s51Var.f28133x;
                if (t51Var2.J && !s51Var.f28130r && !s51Var.f28131s) {
                    s51Var.f28130r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = s51Var.f28129n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(t51Var2.f28466a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(s51Var, 17));
                }
            }
        }
    }
}
