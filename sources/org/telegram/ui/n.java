package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.oy0 {
    public final View f38786a;
    public final TLRPC.StickerSetCovered f38787b;
    public final q f38788c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38788c = qVar;
        this.f38786a = view;
        this.f38787b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ki0 ki0Var = ((org.telegram.ui.Cells.w) this.f38786a).f23585f;
        if (ki0Var != null) {
            ki0Var.a(true, true);
        }
        a0.i iVar = this.f38788c.f39560a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38787b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20064id);
    }
}
