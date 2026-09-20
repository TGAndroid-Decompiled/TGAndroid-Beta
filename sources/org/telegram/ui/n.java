package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.ey0 {
    public final View f35857a;
    public final TLRPC.StickerSetCovered f35858b;
    public final p f35859c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35859c = pVar;
        this.f35857a = view;
        this.f35858b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.hi0 hi0Var = ((org.telegram.ui.Cells.w) this.f35857a).f21709f;
        if (hi0Var != null) {
            hi0Var.a(true, true);
        }
        a0.i iVar = this.f35859c.f36408a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35858b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18355id);
    }
}
