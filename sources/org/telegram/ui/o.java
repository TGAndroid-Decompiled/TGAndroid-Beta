package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o implements org.telegram.ui.Components.fy0 {
    public final View f35368a;
    public final TLRPC.StickerSetCovered f35369b;
    public final q f35370c;

    public o(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35370c = qVar;
        this.f35368a = view;
        this.f35369b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.hi0 hi0Var = ((org.telegram.ui.Cells.w) this.f35368a).f20578f;
        if (hi0Var != null) {
            hi0Var.a(true, true);
        }
        a0.i iVar = this.f35370c.f35937a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35369b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f17222id);
    }
}
