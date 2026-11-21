package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.iw0 {
    public final View f49727a;
    public final TLRPC.StickerSetCovered f49728b;
    public final o f49729c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f49729c = oVar;
        this.f49727a = view;
        this.f49728b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.pg0 pg0Var = ((org.telegram.ui.Cells.v) this.f49727a).f32085f;
        if (pg0Var != null) {
            pg0Var.a(true, true);
        }
        a0.h hVar = this.f49729c.f50373a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f49728b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f28458id);
    }
}
