package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.dy0 {
    public final View f35710a;
    public final TLRPC.StickerSetCovered f35711b;
    public final q f35712c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35712c = qVar;
        this.f35710a = view;
        this.f35711b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ii0 ii0Var = ((org.telegram.ui.Cells.w) this.f35710a).f21713f;
        if (ii0Var != null) {
            ii0Var.a(true, true);
        }
        a0.i iVar = this.f35712c.f36710a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35711b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18363id);
    }
}
