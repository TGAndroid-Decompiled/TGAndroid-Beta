package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.tx0 {
    public final View f35850a;
    public final TLRPC.StickerSetCovered f35851b;
    public final p f35852c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35852c = pVar;
        this.f35850a = view;
        this.f35851b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.xh0 xh0Var = ((org.telegram.ui.Cells.w) this.f35850a).f21480f;
        if (xh0Var != null) {
            xh0Var.a(true, true);
        }
        a0.i iVar = this.f35852c.f36379a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35851b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18136id);
    }
}
