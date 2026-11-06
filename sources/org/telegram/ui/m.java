package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.wv0 {
    public final View f47584a;
    public final TLRPC.StickerSetCovered f47585b;
    public final o f47586c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f47586c = oVar;
        this.f47584a = view;
        this.f47585b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ag0 ag0Var = ((org.telegram.ui.Cells.v) this.f47584a).f30601f;
        if (ag0Var != null) {
            ag0Var.a(true, true);
        }
        a0.h hVar = this.f47586c.f48152a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f47585b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f26979id);
    }
}
