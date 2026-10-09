package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.vy0 {
    public final View f40038a;
    public final TLRPC.StickerSetCovered f40039b;
    public final q f40040c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40040c = qVar;
        this.f40038a = view;
        this.f40039b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.cj0 cj0Var = ((org.telegram.ui.Cells.w) this.f40038a).f23574f;
        if (cj0Var != null) {
            cj0Var.a(true, true);
        }
        a0.i iVar = this.f40040c.f40938a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40039b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20065id);
    }
}
