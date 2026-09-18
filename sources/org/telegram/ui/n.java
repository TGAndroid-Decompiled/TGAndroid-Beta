package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.ux0 {
    public final View f35915a;
    public final TLRPC.StickerSetCovered f35916b;
    public final p f35917c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35917c = pVar;
        this.f35915a = view;
        this.f35916b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.yh0 yh0Var = ((org.telegram.ui.Cells.w) this.f35915a).f21504f;
        if (yh0Var != null) {
            yh0Var.a(true, true);
        }
        a0.i iVar = this.f35917c.f36470a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35916b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18148id);
    }
}
