package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.wy0 {
    public final View f40082a;
    public final TLRPC.StickerSetCovered f40083b;
    public final q f40084c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40084c = qVar;
        this.f40082a = view;
        this.f40083b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.dj0 dj0Var = ((org.telegram.ui.Cells.w) this.f40082a).f23578f;
        if (dj0Var != null) {
            dj0Var.a(true, true);
        }
        a0.i iVar = this.f40084c.f40982a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40083b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f20069id);
    }
}
