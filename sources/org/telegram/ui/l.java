package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class l implements org.telegram.ui.Components.ax0 {
    public final View f39002a;
    public final TLRPC.StickerSetCovered f39003b;
    public final n f39004c;

    public l(n nVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f39004c = nVar;
        this.f39002a = view;
        this.f39003b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Cells.v) this.f39002a).f23161f;
        if (ch0Var != null) {
            ch0Var.a(true, true);
        }
        a0.h hVar = this.f39004c.f39798a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f39003b;
        hVar.k(stickerSetCovered, stickerSetCovered.set.f19820id);
    }
}
