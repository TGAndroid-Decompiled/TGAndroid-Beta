package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.bz0 {
    public final View f41283a;
    public final TLRPC.StickerSetCovered f41284b;
    public final o f41285c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f41285c = oVar;
        this.f41283a = view;
        this.f41284b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.xi0 xi0Var = ((org.telegram.ui.Cells.v) this.f41283a).f25496f;
        if (xi0Var != null) {
            xi0Var.a(true, true);
        }
        a0.h hVar = this.f41285c.f41928a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f41284b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f22055id);
    }
}
