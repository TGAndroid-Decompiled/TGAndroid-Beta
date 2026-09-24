package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.dy0 {
    public final View f35696a;
    public final TLRPC.StickerSetCovered f35697b;
    public final q f35698c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35698c = qVar;
        this.f35696a = view;
        this.f35697b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ii0 ii0Var = ((org.telegram.ui.Cells.w) this.f35696a).f21698f;
        if (ii0Var != null) {
            ii0Var.a(true, true);
        }
        a0.i iVar = this.f35698c.f36694a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35697b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18348id);
    }
}
