package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.sx0 {
    public final View f38794a;
    public final TLRPC.StickerSetCovered f38795b;
    public final p f38796c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38796c = pVar;
        this.f38794a = view;
        this.f38795b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.xh0 xh0Var = ((org.telegram.ui.Cells.w) this.f38794a).f23393f;
        if (xh0Var != null) {
            xh0Var.a(true, true);
        }
        a0.i iVar = this.f38796c.f39366a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38795b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f19896id);
    }
}
