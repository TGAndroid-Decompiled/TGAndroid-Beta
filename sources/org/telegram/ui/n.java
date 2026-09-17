package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.sx0 {
    public final View f38795a;
    public final TLRPC.StickerSetCovered f38796b;
    public final p f38797c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38797c = pVar;
        this.f38795a = view;
        this.f38796b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.xh0 xh0Var = ((org.telegram.ui.Cells.w) this.f38795a).f23394f;
        if (xh0Var != null) {
            xh0Var.a(true, true);
        }
        a0.i iVar = this.f38797c.f39367a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38796b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f19896id);
    }
}
