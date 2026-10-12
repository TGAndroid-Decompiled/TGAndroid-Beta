package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.bz0 {
    public final View f40163a;
    public final TLRPC.StickerSetCovered f40164b;
    public final q f40165c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40165c = qVar;
        this.f40163a = view;
        this.f40164b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.fj0 fj0Var = ((org.telegram.ui.Cells.w) this.f40163a).f23337f;
        if (fj0Var != null) {
            fj0Var.a(true, true);
        }
        a0.i iVar = this.f40165c.f41123a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40164b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f19830id);
    }
}
