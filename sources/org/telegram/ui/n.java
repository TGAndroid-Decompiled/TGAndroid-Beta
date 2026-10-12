package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.bz0 {
    public final View f40160a;
    public final TLRPC.StickerSetCovered f40161b;
    public final q f40162c;

    public n(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40162c = qVar;
        this.f40160a = view;
        this.f40161b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ej0 ej0Var = ((org.telegram.ui.Cells.w) this.f40160a).f23336f;
        if (ej0Var != null) {
            ej0Var.a(true, true);
        }
        a0.i iVar = this.f40162c.f41121a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40161b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f19829id);
    }
}
