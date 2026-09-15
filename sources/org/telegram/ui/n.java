package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.tx0 {
    public final View f35847a;
    public final TLRPC.StickerSetCovered f35848b;
    public final p f35849c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35849c = pVar;
        this.f35847a = view;
        this.f35848b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.xh0 xh0Var = ((org.telegram.ui.Cells.w) this.f35847a).f21493f;
        if (xh0Var != null) {
            xh0Var.a(true, true);
        }
        a0.i iVar = this.f35849c.f36373a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35848b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18139id);
    }
}
