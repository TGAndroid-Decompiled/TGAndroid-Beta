package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p implements org.telegram.ui.Components.wx0 {
    public final View f39881a;
    public final TLRPC.StickerSetCovered f39882b;
    public final r f39883c;

    public p(r rVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39883c = rVar;
        this.f39881a = view;
        this.f39882b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.gi0 gi0Var = ((org.telegram.ui.Cells.w) this.f39881a).f24338f;
        if (gi0Var != null) {
            gi0Var.a(true, true);
        }
        a0.h hVar = this.f39883c.f40725a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39882b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f20870id);
    }
}
