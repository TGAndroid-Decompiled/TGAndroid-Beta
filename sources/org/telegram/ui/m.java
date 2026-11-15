package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.zv0 {
    public final View f49083a;
    public final TLRPC.StickerSetCovered f49084b;
    public final o f49085c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f49085c = oVar;
        this.f49083a = view;
        this.f49084b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.dg0 dg0Var = ((org.telegram.ui.Cells.v) this.f49083a).f31776f;
        if (dg0Var != null) {
            dg0Var.a(true, true);
        }
        a0.h hVar = this.f49085c.f49736a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f49084b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f28078id);
    }
}
