package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.sx0 {
    public final View f38821a;
    public final TLRPC.StickerSetCovered f38822b;
    public final p f38823c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38823c = pVar;
        this.f38821a = view;
        this.f38822b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.xh0 xh0Var = ((org.telegram.ui.Cells.w) this.f38821a).f23420f;
        if (xh0Var != null) {
            xh0Var.a(true, true);
        }
        a0.i iVar = this.f38823c.f39393a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38822b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f19923id);
    }
}
