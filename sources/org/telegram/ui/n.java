package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class n implements org.telegram.ui.Components.ux0 {
    public final View f35910a;
    public final TLRPC.StickerSetCovered f35911b;
    public final p f35912c;

    public n(p pVar, View view, TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35912c = pVar;
        this.f35910a = view;
        this.f35911b = stickerSetCovered;
    }

    @Override
    public final void a() {
        org.telegram.ui.Components.yh0 yh0Var = ((org.telegram.ui.Cells.w) this.f35910a).f21503f;
        if (yh0Var != null) {
            yh0Var.a(true, true);
        }
        a0.i iVar = this.f35912c.f36465a;
        TLRPC.StickerSetCovered stickerSetCovered = this.f35911b;
        iVar.k(stickerSetCovered, stickerSetCovered.set.f18148id);
    }
}
