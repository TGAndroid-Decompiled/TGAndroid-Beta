package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.py0 {
    public final View f38778a;
    public final TLRPC.StickerSetCovered f38779b;
    public final q f38780c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38780c = qVar;
        this.f38778a = view;
        this.f38779b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ki0 ki0Var = ((org.telegram.ui.Cells.w) this.f38778a).f23593f;
        if (ki0Var != null) {
            ki0Var.a(true, true);
        }
        a0.i iVar = this.f38780c.f39650a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f38779b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20074id);
    }
}
