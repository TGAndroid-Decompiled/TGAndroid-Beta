package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l41 extends f2.a1 {
    public final s41 f30228a;

    public l41(s41 s41Var) {
        this.f30228a = s41Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        f2.a1 a1Var = this.f30228a.f32490y;
        if (a1Var != null) {
            a1Var.a(recyclerView, i10);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s41 s41Var = this.f30228a;
        r41 r41Var = s41Var.f32487s;
        i41 i41Var = s41Var.f32485n;
        f2.a1 a1Var = s41Var.f32490y;
        if (a1Var != null) {
            a1Var.b(i41Var, i10, i11);
        }
        if (i11 > 0 && i41Var.getAdapter() == r41Var && s41Var.F && !r41Var.f32175r && !r41Var.f32176s) {
            if (s41Var.f32486r.N0() >= ((r41Var.f32177w + 1) - ((r41Var.v + 1) * 10)) - 1) {
                s41 s41Var2 = r41Var.f32178x;
                if (s41Var2.F && !r41Var.f32175r && !r41Var.f32176s) {
                    r41Var.f32175r = true;
                    TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
                    tL_messages_getOldFeaturedStickers.offset = r41Var.f32174n.size();
                    tL_messages_getOldFeaturedStickers.limit = 40;
                    ConnectionsManager.getInstance(s41Var2.f32480a).sendRequest(tL_messages_getOldFeaturedStickers, new a2(r41Var, 17));
                }
            }
        }
    }
}
