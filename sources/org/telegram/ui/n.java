package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.ey0 {
    public final View f35708a;
    public final TLRPC.StickerSetCovered f35709b;
    public final q f35710c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35710c = qVar;
        this.f35708a = view;
        this.f35709b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ji0 ji0Var = ((org.telegram.ui.Cells.w) this.f35708a).f21712f;
        if (ji0Var != null) {
            ji0Var.a(true, true);
        }
        a0.i iVar = this.f35710c.f36708a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35709b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18362id);
    }
}
