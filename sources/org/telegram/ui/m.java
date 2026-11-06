package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.wv0 {
    public final View f47610a;
    public final TLRPC.StickerSetCovered f47611b;
    public final o f47612c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f47612c = oVar;
        this.f47610a = view;
        this.f47611b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ag0 ag0Var = ((org.telegram.ui.Cells.v) this.f47610a).f30602f;
        if (ag0Var != null) {
            ag0Var.a(true, true);
        }
        a0.h hVar = this.f47612c.f48180a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f47611b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f26980id);
    }
}
