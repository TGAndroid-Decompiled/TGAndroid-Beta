package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.wv0 {
    public final View f47611a;
    public final TLRPC.StickerSetCovered f47612b;
    public final o f47613c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f47613c = oVar;
        this.f47611a = view;
        this.f47612b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ag0 ag0Var = ((org.telegram.ui.Cells.v) this.f47611a).f30601f;
        if (ag0Var != null) {
            ag0Var.a(true, true);
        }
        a0.h hVar = this.f47613c.f48181a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f47612b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f26979id);
    }
}
