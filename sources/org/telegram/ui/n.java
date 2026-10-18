package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.my0 {
    public final View f39266a;
    public final TLRPC.StickerSetCovered f39267b;
    public final p f39268c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39268c = pVar;
        this.f39266a = view;
        this.f39267b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ti0 ti0Var = ((org.telegram.ui.Cells.w) this.f39266a).f23671f;
        if (ti0Var != null) {
            ti0Var.a(true, true);
        }
        a0.h hVar = this.f39268c.f39887a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39267b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20299id);
    }
}
