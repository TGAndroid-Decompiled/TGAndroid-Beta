package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class my0 extends s4.x {
    public int e;
    public final ty0 f27535f;

    public my0(ty0 ty0Var) {
        this.f27535f = ty0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = b1Var.f44841f;
        if (i10 != 3 && i10 == b1Var2.f44841f) {
            ty0 ty0Var = this.f27535f;
            if (ty0Var.S == null) {
                return false;
            }
            int b10 = b1Var.b();
            int b11 = b1Var2.b();
            ty0Var.S.documents.add(b11, ty0Var.S.documents.remove(b10));
            ty0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        ty0 ty0Var = this.f27535f;
        if (i10 == 0 && ty0Var.f29508f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(ty0Var.f29508f, "").document;
            this.e = -1;
            ty0Var.f29508f = null;
        } else if (i10 == 2) {
            ty0Var.f29508f = ((org.telegram.ui.Cells.f8) b1Var.f44838a).getSticker();
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2, int i10, int i11, int i12) {
    }
}
