package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.oy0 {
    public final View f38792a;
    public final TLRPC.StickerSetCovered f38793b;
    public final q f38794c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38794c = qVar;
        this.f38792a = view;
        this.f38793b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ki0 ki0Var = ((org.telegram.ui.Cells.w) this.f38792a).f23590f;
        if (ki0Var != null) {
            ki0Var.a(true, true);
        }
        a0.i iVar = this.f38794c.f39566a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38793b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20069id);
    }
}
