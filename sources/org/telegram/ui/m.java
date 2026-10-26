package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.az0 {
    public final View f41413a;
    public final TLRPC.StickerSetCovered f41414b;
    public final o f41415c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f41415c = oVar;
        this.f41413a = view;
        this.f41414b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.wi0 wi0Var = ((org.telegram.ui.Cells.v) this.f41413a).f25494f;
        if (wi0Var != null) {
            wi0Var.a(true, true);
        }
        a0.h hVar = this.f41415c.f42043a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f41414b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f22054id);
    }
}
