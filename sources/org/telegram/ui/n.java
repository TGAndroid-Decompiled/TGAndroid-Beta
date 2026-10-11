package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.wy0 {
    public final View f40132a;
    public final TLRPC.StickerSetCovered f40133b;
    public final p f40134c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40134c = pVar;
        this.f40132a = view;
        this.f40133b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.dj0 dj0Var = ((org.telegram.ui.Cells.w) this.f40132a).f23602f;
        if (dj0Var != null) {
            dj0Var.a(true, true);
        }
        a0.i iVar = this.f40134c.f40702a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40133b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20095id);
    }
}
