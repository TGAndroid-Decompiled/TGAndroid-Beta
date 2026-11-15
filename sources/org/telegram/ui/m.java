package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.zv0 {
    public final View f49079a;
    public final TLRPC.StickerSetCovered f49080b;
    public final o f49081c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f49081c = oVar;
        this.f49079a = view;
        this.f49080b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.dg0 dg0Var = ((org.telegram.ui.Cells.v) this.f49079a).f31776f;
        if (dg0Var != null) {
            dg0Var.a(true, true);
        }
        a0.h hVar = this.f49081c.f49726a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f49080b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f28078id);
    }
}
