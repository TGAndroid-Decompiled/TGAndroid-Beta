package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class nx0 extends s4.x {
    public int f28911e;
    public final ux0 f28912f;

    public nx0(ux0 ux0Var) {
        this.f28912f = ux0Var;
        this.d = 15;
        this.f28911e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f45770f;
        if (i10 != 3 && i10 == c1Var2.f45770f) {
            ux0 ux0Var = this.f28912f;
            if (ux0Var.S == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            ux0Var.S.documents.add(b11, ux0Var.S.documents.remove(b10));
            ux0Var.d.p(b10, b11);
            this.f28911e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ux0 ux0Var = this.f28912f;
        if (i10 == 0 && ux0Var.f31026f != null && this.f28911e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f28911e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(ux0Var.f31026f, "").document;
            this.f28911e = -1;
            ux0Var.f31026f = null;
        } else if (i10 == 2) {
            ux0Var.f31026f = ((org.telegram.ui.Cells.f8) c1Var.f45766a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
