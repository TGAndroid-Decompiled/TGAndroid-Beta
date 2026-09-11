package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class nx0 extends s4.x {
    public int f28884e;
    public final ux0 f28885f;

    public nx0(ux0 ux0Var) {
        this.f28885f = ux0Var;
        this.d = 15;
        this.f28884e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f45742f;
        if (i10 != 3 && i10 == c1Var2.f45742f) {
            ux0 ux0Var = this.f28885f;
            if (ux0Var.S == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            ux0Var.S.documents.add(b11, ux0Var.S.documents.remove(b10));
            ux0Var.d.p(b10, b11);
            this.f28884e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ux0 ux0Var = this.f28885f;
        if (i10 == 0 && ux0Var.f30999f != null && this.f28884e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f28884e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(ux0Var.f30999f, "").document;
            this.f28884e = -1;
            ux0Var.f30999f = null;
        } else if (i10 == 2) {
            ux0Var.f30999f = ((org.telegram.ui.Cells.f8) c1Var.f45738a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
