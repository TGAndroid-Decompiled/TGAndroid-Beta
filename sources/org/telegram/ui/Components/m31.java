package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m31 extends v4.s0 {
    public final u31 f35937a;

    public m31(u31 u31Var) {
        this.f35937a = u31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.s0 s0Var = this.f35937a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        u31 u31Var = this.f35937a;
        t31 t31Var = u31Var.f38585s;
        j31 j31Var = u31Var.f38583n;
        v4.s0 s0Var = u31Var.D;
        if (s0Var != null) {
            s0Var.b(j31Var, i7, i10);
        }
        if (i10 > 0 && j31Var.getAdapter() == t31Var && u31Var.J && !t31Var.f38267r && !t31Var.f38268s) {
            if (u31Var.f38584r.N0() >= ((t31Var.f38270x + 1) - ((t31Var.f38269w + 1) * 10)) - 1) {
                u31 u31Var2 = t31Var.f38271y;
                if (u31Var2.J && !t31Var.f38267r && !t31Var.f38268s) {
                    t31Var.f38267r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = t31Var.f38266n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(u31Var2.f38578a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(t31Var, 16));
                }
            }
        }
    }
}
