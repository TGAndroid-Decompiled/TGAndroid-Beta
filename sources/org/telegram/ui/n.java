package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.dy0 {
    public final View f35709a;
    public final TLRPC.StickerSetCovered f35710b;
    public final q f35711c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35711c = qVar;
        this.f35709a = view;
        this.f35710b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ii0 ii0Var = ((org.telegram.ui.Cells.w) this.f35709a).f21712f;
        if (ii0Var != null) {
            ii0Var.a(true, true);
        }
        a0.i iVar = this.f35711c.f36709a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35710b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18362id);
    }
}
