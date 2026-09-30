package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.fy0 {
    public final View f35713a;
    public final TLRPC.StickerSetCovered f35714b;
    public final q f35715c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35715c = qVar;
        this.f35713a = view;
        this.f35714b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ki0 ki0Var = ((org.telegram.ui.Cells.w) this.f35713a).f21714f;
        if (ki0Var != null) {
            ki0Var.a(true, true);
        }
        a0.i iVar = this.f35715c.f36710a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35714b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18364id);
    }
}
