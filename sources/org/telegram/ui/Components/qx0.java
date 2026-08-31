package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class qx0 extends f2.e0 {
    public int f30518e;
    public final yx0 f30519f;

    public qx0(yx0 yx0Var) {
        this.f30519f = yx0Var;
        this.d = 15;
        this.f30518e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 == m1Var2.f5879f) {
            yx0 yx0Var = this.f30519f;
            if (yx0Var.P == null) {
                return false;
            }
            int b10 = m1Var.b();
            int b11 = m1Var2.b();
            yx0Var.P.documents.add(b11, yx0Var.P.documents.remove(b10));
            yx0Var.d.p(b10, b11);
            this.f30518e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        yx0 yx0Var = this.f30519f;
        if (i10 == 0 && yx0Var.f33622f != null && this.f30518e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f30518e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(yx0Var.f33622f, "").document;
            this.f30518e = -1;
            yx0Var.f33622f = null;
        } else if (i10 == 2) {
            yx0Var.f33622f = ((org.telegram.ui.Cells.d8) m1Var.f5875a).getSticker();
        }
    }

    @Override
    public final void q(f2.m1 m1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2, int i10, int i11, int i12) {
    }
}
