package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.qy0 {
    public final View f39417a;
    public final TLRPC.StickerSetCovered f39418b;
    public final o f39419c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39419c = oVar;
        this.f39417a = view;
        this.f39418b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.wi0 wi0Var = ((org.telegram.ui.Cells.v) this.f39417a).f23750f;
        if (wi0Var != null) {
            wi0Var.a(true, true);
        }
        a0.h hVar = this.f39419c.f40030a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39418b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20371id);
    }
}
