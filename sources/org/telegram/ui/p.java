package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p implements org.telegram.ui.Components.vx0 {
    public final View f36907a;
    public final TLRPC.StickerSetCovered f36908b;
    public final r f36909c;

    public p(r rVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f36909c = rVar;
        this.f36907a = view;
        this.f36908b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.fi0 fi0Var = ((org.telegram.ui.Cells.w) this.f36907a).f22486f;
        if (fi0Var != null) {
            fi0Var.a(true, true);
        }
        a0.h hVar = this.f36909c.f37658a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f36908b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f19186id);
    }
}
