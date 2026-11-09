package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.xv0 {
    public final View f47710a;
    public final TLRPC.StickerSetCovered f47711b;
    public final o f47712c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f47712c = oVar;
        this.f47710a = view;
        this.f47711b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.bg0 bg0Var = ((org.telegram.ui.Cells.v) this.f47710a).f30610f;
        if (bg0Var != null) {
            bg0Var.a(true, true);
        }
        a0.h hVar = this.f47712c.f48264a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f47711b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f26983id);
    }
}
