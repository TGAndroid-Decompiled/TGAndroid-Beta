package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.my0 {
    public final View f39307a;
    public final TLRPC.StickerSetCovered f39308b;
    public final p f39309c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39309c = pVar;
        this.f39307a = view;
        this.f39308b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ti0 ti0Var = ((org.telegram.ui.Cells.w) this.f39307a).f23678f;
        if (ti0Var != null) {
            ti0Var.a(true, true);
        }
        a0.h hVar = this.f39309c.f39926a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39308b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20306id);
    }
}
