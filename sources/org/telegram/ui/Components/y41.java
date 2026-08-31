package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class y41 extends f2.a1 {
    public final f51 f33305a;

    public y41(f51 f51Var) {
        this.f33305a = f51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        f2.a1 a1Var = this.f33305a.f26767y;
        if (a1Var != null) {
            a1Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f51 f51Var = this.f33305a;
        e51 e51Var = f51Var.f26764s;
        v41 v41Var = f51Var.f26762n;
        f2.a1 a1Var = f51Var.f26767y;
        if (a1Var != null) {
            a1Var.b(v41Var, i10, i11);
        }
        if (i11 > 0 && v41Var.getAdapter() == e51Var && f51Var.G && !e51Var.f26440r && !e51Var.f26441s) {
            if (f51Var.f26763r.N0() >= ((e51Var.f26442w + 1) - ((e51Var.v + 1) * 10)) - 1) {
                f51 f51Var2 = e51Var.f26443x;
                if (f51Var2.G && !e51Var.f26440r && !e51Var.f26441s) {
                    e51Var.f26440r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = e51Var.f26439n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(f51Var2.f26757a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(e51Var, 17));
                }
            }
        }
    }
}
