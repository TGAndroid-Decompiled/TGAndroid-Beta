package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.iw0 {
    public final View f49697a;
    public final TLRPC.StickerSetCovered f49698b;
    public final o f49699c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f49699c = oVar;
        this.f49697a = view;
        this.f49698b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.pg0 pg0Var = ((org.telegram.ui.Cells.v) this.f49697a).f32054f;
        if (pg0Var != null) {
            pg0Var.a(true, true);
        }
        a0.h hVar = this.f49699c.f50376a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f49698b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f28425id);
    }
}
