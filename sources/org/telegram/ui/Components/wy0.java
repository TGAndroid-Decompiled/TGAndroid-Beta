package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class wy0 extends s4.y {
    public int e;
    public final dz0 f34607f;

    public wy0(dz0 dz0Var) {
        this.f34607f = dz0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int i10 = e1Var.f47776f;
        if (i10 != 3 && i10 == e1Var2.f47776f) {
            dz0 dz0Var = this.f34607f;
            if (dz0Var.S == null) {
                return false;
            }
            int b10 = e1Var.b();
            int b11 = e1Var2.b();
            dz0Var.S.documents.add(b11, dz0Var.S.documents.remove(b10));
            dz0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        dz0 dz0Var = this.f34607f;
        if (i10 == 0 && dz0Var.f27585f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(dz0Var.f27585f, "").document;
            this.e = -1;
            dz0Var.f27585f = null;
        } else if (i10 == 2) {
            dz0Var.f27585f = ((org.telegram.ui.Cells.i8) e1Var.f47773a).getSticker();
        }
    }

    @Override
    public final void q(s4.e1 e1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2, int i10, int i11, int i12) {
    }
}
