package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l31 extends v4.s0 {
    public final t31 f35529a;

    public l31(t31 t31Var) {
        this.f35529a = t31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.s0 s0Var = this.f35529a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        t31 t31Var = this.f35529a;
        s31 s31Var = t31Var.f38157s;
        i31 i31Var = t31Var.f38155n;
        v4.s0 s0Var = t31Var.D;
        if (s0Var != null) {
            s0Var.b(i31Var, i7, i10);
        }
        if (i10 > 0 && i31Var.getAdapter() == s31Var && t31Var.J && !s31Var.f37851r && !s31Var.f37852s) {
            if (t31Var.f38156r.N0() >= ((s31Var.f37854x + 1) - ((s31Var.f37853w + 1) * 10)) - 1) {
                t31 t31Var2 = s31Var.f37855y;
                if (t31Var2.J && !s31Var.f37851r && !s31Var.f37852s) {
                    s31Var.f37851r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = s31Var.f37850n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(t31Var2.f38150a).sendRequest(tL_messages_getOldFeaturedStickers, new w1(s31Var, 16));
                }
            }
        }
    }
}
