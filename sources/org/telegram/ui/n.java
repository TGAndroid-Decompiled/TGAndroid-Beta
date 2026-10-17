package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.my0 {
    public final View f39281a;
    public final TLRPC.StickerSetCovered f39282b;
    public final p f39283c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39283c = pVar;
        this.f39281a = view;
        this.f39282b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ti0 ti0Var = ((org.telegram.ui.Cells.w) this.f39281a).f23671f;
        if (ti0Var != null) {
            ti0Var.a(true, true);
        }
        a0.h hVar = this.f39283c.f39907a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39282b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20299id);
    }
}
