package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.sx0 {
    public final View f38822a;
    public final TLRPC.StickerSetCovered f38823b;
    public final p f38824c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38824c = pVar;
        this.f38822a = view;
        this.f38823b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.xh0 xh0Var = ((org.telegram.ui.Cells.w) this.f38822a).f23421f;
        if (xh0Var != null) {
            xh0Var.a(true, true);
        }
        a0.i iVar = this.f38824c.f39394a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38823b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f19923id);
    }
}
