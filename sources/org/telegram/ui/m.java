package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.ry0 {
    public final View f39349a;
    public final TLRPC.StickerSetCovered f39350b;
    public final o f39351c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39351c = oVar;
        this.f39349a = view;
        this.f39350b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.xi0 xi0Var = ((org.telegram.ui.Cells.v) this.f39349a).f23749f;
        if (xi0Var != null) {
            xi0Var.a(true, true);
        }
        a0.h hVar = this.f39351c.f40017a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39350b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20370id);
    }
}
