package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.wv0 {
    public final View f47607a;
    public final TLRPC.StickerSetCovered f47608b;
    public final o f47609c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f47609c = oVar;
        this.f47607a = view;
        this.f47608b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ag0 ag0Var = ((org.telegram.ui.Cells.v) this.f47607a).f30606f;
        if (ag0Var != null) {
            ag0Var.a(true, true);
        }
        a0.h hVar = this.f47609c.f48180a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f47608b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f26983id);
    }
}
