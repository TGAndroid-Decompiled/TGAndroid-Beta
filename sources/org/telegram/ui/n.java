package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.oy0 {
    public final View f39372a;
    public final TLRPC.StickerSetCovered f39373b;
    public final p f39374c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39374c = pVar;
        this.f39372a = view;
        this.f39373b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ui0 ui0Var = ((org.telegram.ui.Cells.w) this.f39372a).f23675f;
        if (ui0Var != null) {
            ui0Var.a(true, true);
        }
        a0.h hVar = this.f39374c.f40021a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39373b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20303id);
    }
}
