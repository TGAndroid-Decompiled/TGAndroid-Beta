package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.vy0 {
    public final View f40036a;
    public final TLRPC.StickerSetCovered f40037b;
    public final q f40038c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40038c = qVar;
        this.f40036a = view;
        this.f40037b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.cj0 cj0Var = ((org.telegram.ui.Cells.w) this.f40036a).f23574f;
        if (cj0Var != null) {
            cj0Var.a(true, true);
        }
        a0.i iVar = this.f40038c.f40936a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40037b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20065id);
    }
}
