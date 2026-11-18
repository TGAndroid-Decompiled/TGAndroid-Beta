package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.gw0 {
    public final View f49676a;
    public final TLRPC.StickerSetCovered f49677b;
    public final o f49678c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f49678c = oVar;
        this.f49676a = view;
        this.f49677b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ng0 ng0Var = ((org.telegram.ui.Cells.v) this.f49676a).f32057f;
        if (ng0Var != null) {
            ng0Var.a(true, true);
        }
        a0.h hVar = this.f49678c.f50362a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f49677b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f28430id);
    }
}
