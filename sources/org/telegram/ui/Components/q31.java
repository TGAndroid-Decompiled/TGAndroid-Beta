package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class q31 extends v4.t0 {
    public final x31 f38479a;

    public q31(x31 x31Var) {
        this.f38479a = x31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.t0 t0Var = this.f38479a.E;
        if (t0Var != null) {
            t0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        x31 x31Var = this.f38479a;
        w31 w31Var = x31Var.f41551s;
        n31 n31Var = x31Var.f41549n;
        v4.t0 t0Var = x31Var.E;
        if (t0Var != null) {
            t0Var.b(n31Var, i7, i10);
        }
        if (i10 > 0 && n31Var.getAdapter() == w31Var && x31Var.K && !w31Var.f41247r && !w31Var.f41248s) {
            if (x31Var.f41550r.N0() >= ((w31Var.f41250x + 1) - ((w31Var.f41249w + 1) * 10)) - 1) {
                x31 x31Var2 = w31Var.f41251y;
                if (x31Var2.K && !w31Var.f41247r && !w31Var.f41248s) {
                    w31Var.f41247r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = w31Var.f41246n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(x31Var2.f41544a).sendRequest(tL_messages_getOldFeaturedStickers, new v1(w31Var, 16));
                }
            }
        }
    }
}
