package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class v51 extends s4.s0 {
    public final c61 f31576a;

    public v51(c61 c61Var) {
        this.f31576a = c61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.f31576a.f25242y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c61 c61Var = this.f31576a;
        b61 b61Var = c61Var.f25239s;
        s51 s51Var = c61Var.f25237n;
        s4.s0 s0Var = c61Var.f25242y;
        if (s0Var != null) {
            s0Var.b(s51Var, i10, i11);
        }
        if (i11 > 0 && s51Var.getAdapter() == b61Var && c61Var.J && !b61Var.f24809r && !b61Var.f24810s) {
            if (c61Var.f25238r.N0() >= ((b61Var.f24811w + 1) - ((b61Var.v + 1) * 10)) - 1) {
                c61 c61Var2 = b61Var.f24812x;
                if (c61Var2.J && !b61Var.f24809r && !b61Var.f24810s) {
                    b61Var.f24809r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = b61Var.f24808n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(c61Var2.f25232a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(b61Var, 17));
                }
            }
        }
    }
}
