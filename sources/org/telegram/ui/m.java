package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m implements org.telegram.ui.Components.gw0 {
    public final View f49717a;
    public final TLRPC.StickerSetCovered f49718b;
    public final o f49719c;

    public m(o oVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f49719c = oVar;
        this.f49717a = view;
        this.f49718b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ng0 ng0Var = ((org.telegram.ui.Cells.v) this.f49717a).f32144f;
        if (ng0Var != null) {
            ng0Var.a(true, true);
        }
        a0.h hVar = this.f49719c.f50378a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f49718b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f28432id);
    }
}
