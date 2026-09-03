package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class px0 extends f2.e0 {
    public int f30229e;
    public final xx0 f30230f;

    public px0(xx0 xx0Var) {
        this.f30230f = xx0Var;
        this.d = 15;
        this.f30229e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 == m1Var2.f5879f) {
            xx0 xx0Var = this.f30230f;
            if (xx0Var.P == null) {
                return false;
            }
            int b10 = m1Var.b();
            int b11 = m1Var2.b();
            xx0Var.P.documents.add(b11, xx0Var.P.documents.remove(b10));
            xx0Var.d.p(b10, b11);
            this.f30229e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        xx0 xx0Var = this.f30230f;
        if (i10 == 0 && xx0Var.f33228f != null && this.f30229e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f30229e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(xx0Var.f33228f, "").document;
            this.f30229e = -1;
            xx0Var.f33228f = null;
        } else if (i10 == 2) {
            xx0Var.f33228f = ((org.telegram.ui.Cells.d8) m1Var.f5875a).getSticker();
        }
    }

    @Override
    public final void q(f2.m1 m1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2, int i10, int i11, int i12) {
    }
}
