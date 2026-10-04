package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.oy0 {
    public final View f38787a;
    public final TLRPC.StickerSetCovered f38788b;
    public final q f38789c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38789c = qVar;
        this.f38787a = view;
        this.f38788b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ki0 ki0Var = ((org.telegram.ui.Cells.w) this.f38787a).f23586f;
        if (ki0Var != null) {
            ki0Var.a(true, true);
        }
        a0.i iVar = this.f38789c.f39561a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38788b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20065id);
    }
}
