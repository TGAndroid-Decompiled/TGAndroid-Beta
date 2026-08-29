package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class p implements org.telegram.ui.Components.lx0 {
    public final View f41255a;
    public final TLRPC.StickerSetCovered f41256b;
    public final r f41257c;

    public p(r rVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f41257c = rVar;
        this.f41255a = view;
        this.f41256b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.th0 th0Var = ((org.telegram.ui.Cells.w) this.f41255a).f25853f;
        if (th0Var != null) {
            th0Var.a(true, true);
        }
        a0.h hVar = this.f41257c.f41816a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f41256b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f22419id);
    }
}
