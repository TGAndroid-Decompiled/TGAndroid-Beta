package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.sy0 {
    public final View f38098a;
    public final TLRPC.StickerSetCovered f38099b;
    public final p f38100c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38100c = pVar;
        this.f38098a = view;
        this.f38099b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.yi0 yi0Var = ((org.telegram.ui.Cells.w) this.f38098a).f22291f;
        if (yi0Var != null) {
            yi0Var.a(true, true);
        }
        a0.h hVar = this.f38100c.f38772a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38099b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f18943id);
    }
}
