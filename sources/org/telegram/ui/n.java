package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.ny0 {
    public final View f39370a;
    public final TLRPC.StickerSetCovered f39371b;
    public final p f39372c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39372c = pVar;
        this.f39370a = view;
        this.f39371b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ti0 ti0Var = ((org.telegram.ui.Cells.w) this.f39370a).f23674f;
        if (ti0Var != null) {
            ti0Var.a(true, true);
        }
        a0.h hVar = this.f39372c.f40024a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39371b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20302id);
    }
}
