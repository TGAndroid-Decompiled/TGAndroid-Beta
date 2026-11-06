package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k31 extends v4.s0 {
    public final s31 f35125a;

    public k31(s31 s31Var) {
        this.f35125a = s31Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        v4.s0 s0Var = this.f35125a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i7);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        s31 s31Var = this.f35125a;
        r31 r31Var = s31Var.f37874s;
        h31 h31Var = s31Var.f37872n;
        v4.s0 s0Var = s31Var.D;
        if (s0Var != null) {
            s0Var.b(h31Var, i7, i10);
        }
        if (i10 > 0 && h31Var.getAdapter() == r31Var && s31Var.J && !r31Var.f37526r && !r31Var.f37527s) {
            if (s31Var.f37873r.N0() >= ((r31Var.f37529x + 1) - ((r31Var.f37528w + 1) * 10)) - 1) {
                s31 s31Var2 = r31Var.f37530y;
                if (s31Var2.J && !r31Var.f37526r && !r31Var.f37527s) {
                    r31Var.f37526r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = r31Var.f37525n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(s31Var2.f37867a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(r31Var, 16));
                }
            }
        }
    }
}
