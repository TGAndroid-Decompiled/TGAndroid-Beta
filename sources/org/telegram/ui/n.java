package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.gy0 {
    public final View f35820a;
    public final TLRPC.StickerSetCovered f35821b;
    public final q f35822c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35822c = qVar;
        this.f35820a = view;
        this.f35821b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.li0 li0Var = ((org.telegram.ui.Cells.w) this.f35820a).f21734f;
        if (li0Var != null) {
            li0Var.a(true, true);
        }
        a0.i iVar = this.f35822c.f36809a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35821b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18379id);
    }
}
