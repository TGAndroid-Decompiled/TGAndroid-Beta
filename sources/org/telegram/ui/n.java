package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.sx0 {
    public final View f35410a;
    public final TLRPC.StickerSetCovered f35411b;
    public final p f35412c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35412c = pVar;
        this.f35410a = view;
        this.f35411b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.yh0 yh0Var = ((org.telegram.ui.Cells.w) this.f35410a).f21463f;
        if (yh0Var != null) {
            yh0Var.a(true, true);
        }
        a0.i iVar = this.f35412c.f35978a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35411b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18110id);
    }
}
