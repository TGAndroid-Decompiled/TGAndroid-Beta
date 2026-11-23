package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.iw0 {
    public final View f49731a;
    public final TLRPC.StickerSetCovered f49732b;
    public final o f49733c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f49733c = oVar;
        this.f49731a = view;
        this.f49732b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.pg0 pg0Var = ((org.telegram.ui.Cells.v) this.f49731a).f32088f;
        if (pg0Var != null) {
            pg0Var.a(true, true);
        }
        a0.h hVar = this.f49733c.f50377a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f49732b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f28461id);
    }
}
