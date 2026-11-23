package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.hw0 {
    public final View f49912a;
    public final TLRPC.StickerSetCovered f49913b;
    public final o f49914c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f49914c = oVar;
        this.f49912a = view;
        this.f49913b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.og0 og0Var = ((org.telegram.ui.Cells.v) this.f49912a).f32137f;
        if (og0Var != null) {
            og0Var.a(true, true);
        }
        a0.h hVar = this.f49914c.f50461a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f49913b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f28519id);
    }
}
