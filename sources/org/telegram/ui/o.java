package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

public final class o implements org.telegram.ui.Components.cx0 {

    public final View f40962a;

    public final TLRPC.StickerSetCovered f40963b;

    public final q f40964c;

    public o(q qVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f40964c = qVar;
        this.f40962a = view;
        this.f40963b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.lh0 lh0Var = ((org.telegram.ui.Cells.w) this.f40962a).f25837f;
        if (lh0Var != null) {
            lh0Var.a(true, true);
        }
        a0.h hVar = this.f40964c.f41457a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f40963b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f22407id);
    }
}
