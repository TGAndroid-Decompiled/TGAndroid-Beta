package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.oy0 {
    public final View f39376a;
    public final TLRPC.StickerSetCovered f39377b;
    public final p f39378c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39378c = pVar;
        this.f39376a = view;
        this.f39377b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ui0 ui0Var = ((org.telegram.ui.Cells.w) this.f39376a).f23679f;
        if (ui0Var != null) {
            ui0Var.a(true, true);
        }
        a0.h hVar = this.f39378c.f40025a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39377b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20307id);
    }
}
