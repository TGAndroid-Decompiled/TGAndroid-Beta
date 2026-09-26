package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class yx0 extends s4.x {
    public int e;
    public final fy0 f30721f;

    public yx0(fy0 fy0Var) {
        this.f30721f = fy0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f42963f;
        if (i10 != 3 && i10 == c1Var2.f42963f) {
            fy0 fy0Var = this.f30721f;
            if (fy0Var.S == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            fy0Var.S.documents.add(b11, fy0Var.S.documents.remove(b10));
            fy0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        fy0 fy0Var = this.f30721f;
        if (i10 == 0 && fy0Var.f24292f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(fy0Var.f24292f, "").document;
            this.e = -1;
            fy0Var.f24292f = null;
        } else if (i10 == 2) {
            fy0Var.f24292f = ((org.telegram.ui.Cells.f8) c1Var.f42960a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
