package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.az0 {
    public final View f41410a;
    public final TLRPC.StickerSetCovered f41411b;
    public final o f41412c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f41412c = oVar;
        this.f41410a = view;
        this.f41411b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.wi0 wi0Var = ((org.telegram.ui.Cells.v) this.f41410a).f25492f;
        if (wi0Var != null) {
            wi0Var.a(true, true);
        }
        a0.h hVar = this.f41412c.f42040a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f41411b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f22054id);
    }
}
