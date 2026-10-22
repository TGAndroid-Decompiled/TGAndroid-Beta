package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.oy0 {
    public final View f39375a;
    public final TLRPC.StickerSetCovered f39376b;
    public final p f39377c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39377c = pVar;
        this.f39375a = view;
        this.f39376b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ui0 ui0Var = ((org.telegram.ui.Cells.w) this.f39375a).f23678f;
        if (ui0Var != null) {
            ui0Var.a(true, true);
        }
        a0.h hVar = this.f39377c.f40024a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39376b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20306id);
    }
}
