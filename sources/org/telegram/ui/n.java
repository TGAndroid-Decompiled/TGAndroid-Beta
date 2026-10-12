package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.ry0 {
    public final View f38385a;
    public final TLRPC.StickerSetCovered f38386b;
    public final p f38387c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38387c = pVar;
        this.f38385a = view;
        this.f38386b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.yi0 yi0Var = ((org.telegram.ui.Cells.w) this.f38385a).f22594f;
        if (yi0Var != null) {
            yi0Var.a(true, true);
        }
        a0.h hVar = this.f38387c.f39067a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38386b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f19243id);
    }
}
