package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class qy0 extends s4.y {
    public int f30302e;
    public final xy0 f30303f;

    public qy0(xy0 xy0Var) {
        this.f30303f = xy0Var;
        this.d = 15;
        this.f30302e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10 = d1Var.f47660f;
        if (i10 != 3 && i10 == d1Var2.f47660f) {
            xy0 xy0Var = this.f30303f;
            if (xy0Var.S == null) {
                return false;
            }
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            xy0Var.S.documents.add(b11, xy0Var.S.documents.remove(b10));
            xy0Var.d.p(b10, b11);
            this.f30302e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        xy0 xy0Var = this.f30303f;
        if (i10 == 0 && xy0Var.f33030f != null && this.f30302e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f30302e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(xy0Var.f33030f, "").document;
            this.f30302e = -1;
            xy0Var.f33030f = null;
        } else if (i10 == 2) {
            xy0Var.f33030f = ((org.telegram.ui.Cells.f8) d1Var.f47656a).getSticker();
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2, int i10, int i11, int i12) {
    }
}
