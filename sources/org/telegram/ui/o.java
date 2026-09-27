package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o implements org.telegram.ui.Components.fy0 {
    public final View f36114a;
    public final TLRPC.StickerSetCovered f36115b;
    public final r f36116c;

    public o(r rVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f36116c = rVar;
        this.f36114a = view;
        this.f36115b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ki0 ki0Var = ((org.telegram.ui.Cells.w) this.f36114a).f21715f;
        if (ki0Var != null) {
            ki0Var.a(true, true);
        }
        a0.i iVar = this.f36116c.f36932a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f36115b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18356id);
    }
}
