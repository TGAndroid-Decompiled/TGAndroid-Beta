package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p implements org.telegram.ui.Components.vx0 {
    public final View f39838a;
    public final TLRPC.StickerSetCovered f39839b;
    public final r f39840c;

    public p(r rVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39840c = rVar;
        this.f39838a = view;
        this.f39839b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.gi0 gi0Var = ((org.telegram.ui.Cells.w) this.f39838a).f24340f;
        if (gi0Var != null) {
            gi0Var.a(true, true);
        }
        a0.h hVar = this.f39840c.f40722a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39839b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20872id);
    }
}
