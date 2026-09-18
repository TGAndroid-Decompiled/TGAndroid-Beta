package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.fy0 {
    public final View f35782a;
    public final TLRPC.StickerSetCovered f35783b;
    public final p f35784c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35784c = pVar;
        this.f35782a = view;
        this.f35783b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.ii0 ii0Var = ((org.telegram.ui.Cells.w) this.f35782a).f21677f;
        if (ii0Var != null) {
            ii0Var.a(true, true);
        }
        a0.i iVar = this.f35784c.f36280a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35783b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18323id);
    }
}
