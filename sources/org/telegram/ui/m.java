package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.vv0 {
    public final View f47472a;
    public final TLRPC.StickerSetCovered f47473b;
    public final o f47474c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f47474c = oVar;
        this.f47472a = view;
        this.f47473b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.dg0 dg0Var = ((org.telegram.ui.Cells.v) this.f47472a).f30700f;
        if (dg0Var != null) {
            dg0Var.a(true, true);
        }
        a0.h hVar = this.f47474c.f48149a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f47473b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f27028id);
    }
}
