package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.gy0 {
    public final View f35878a;
    public final TLRPC.StickerSetCovered f35879b;
    public final p f35880c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35880c = pVar;
        this.f35878a = view;
        this.f35879b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ki0 ki0Var = ((org.telegram.ui.Cells.w) this.f35878a).f21724f;
        if (ki0Var != null) {
            ki0Var.a(true, true);
        }
        a0.i iVar = this.f35880c.f36435a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35879b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18370id);
    }
}
