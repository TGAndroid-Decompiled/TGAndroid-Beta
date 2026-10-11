package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.xy0 {
    public final View f40098a;
    public final TLRPC.StickerSetCovered f40099b;
    public final p f40100c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40100c = pVar;
        this.f40098a = view;
        this.f40099b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ej0 ej0Var = ((org.telegram.ui.Cells.w) this.f40098a).f23566f;
        if (ej0Var != null) {
            ej0Var.a(true, true);
        }
        a0.i iVar = this.f40100c.f40668a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40099b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20059id);
    }
}
