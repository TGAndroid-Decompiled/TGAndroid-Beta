package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.ny0 {
    public final View f39366a;
    public final TLRPC.StickerSetCovered f39367b;
    public final p f39368c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39368c = pVar;
        this.f39366a = view;
        this.f39367b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ti0 ti0Var = ((org.telegram.ui.Cells.w) this.f39366a).f23672f;
        if (ti0Var != null) {
            ti0Var.a(true, true);
        }
        a0.h hVar = this.f39368c.f40015a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39367b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20300id);
    }
}
