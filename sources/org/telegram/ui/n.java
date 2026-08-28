package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.ax0 {
    public final View f40560a;
    public final TLRPC.StickerSetCovered f40561b;
    public final p f40562c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40562c = pVar;
        this.f40560a = view;
        this.f40561b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.jh0 jh0Var = ((org.telegram.ui.Cells.w) this.f40560a).f25819f;
        if (jh0Var != null) {
            jh0Var.a(true, true);
        }
        a0.h hVar = this.f40562c.f41286a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40561b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f22407id);
    }
}
