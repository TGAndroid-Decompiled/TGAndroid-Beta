package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l implements org.telegram.ui.Components.bx0 {
    public final View f39036a;
    public final TLRPC.StickerSetCovered f39037b;
    public final n f39038c;

    public l(n nVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39038c = nVar;
        this.f39036a = view;
        this.f39037b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.dh0 dh0Var = ((org.telegram.ui.Cells.v) this.f39036a).f23162f;
        if (dh0Var != null) {
            dh0Var.a(true, true);
        }
        a0.h hVar = this.f39038c.f39648a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39037b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f19821id);
    }
}
