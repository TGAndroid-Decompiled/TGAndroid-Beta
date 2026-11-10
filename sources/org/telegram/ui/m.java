package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.wv0 {
    public final View f47761a;
    public final TLRPC.StickerSetCovered f47762b;
    public final o f47763c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f47763c = oVar;
        this.f47761a = view;
        this.f47762b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ag0 ag0Var = ((org.telegram.ui.Cells.v) this.f47761a).f30621f;
        if (ag0Var != null) {
            ag0Var.a(true, true);
        }
        a0.h hVar = this.f47763c.f48339a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f47762b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f26987id);
    }
}
