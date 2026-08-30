package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p implements org.telegram.ui.Components.vx0 {
    public final View f37136a;
    public final TLRPC.StickerSetCovered f37137b;
    public final r f37138c;

    public p(r rVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f37138c = rVar;
        this.f37136a = view;
        this.f37137b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ei0 ei0Var = ((org.telegram.ui.Cells.w) this.f37136a).f22522f;
        if (ei0Var != null) {
            ei0Var.a(true, true);
        }
        a0.h hVar = this.f37138c.f37882a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f37137b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f19211id);
    }
}
