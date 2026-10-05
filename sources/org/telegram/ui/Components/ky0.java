package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ky0 extends s4.x {
    public int f28305e;
    public final ry0 f28306f;

    public ky0(ry0 ry0Var) {
        this.f28306f = ry0Var;
        this.d = 15;
        this.f28305e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f46542f;
        if (i10 != 3 && i10 == c1Var2.f46542f) {
            ry0 ry0Var = this.f28306f;
            if (ry0Var.S == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            ry0Var.S.documents.add(b11, ry0Var.S.documents.remove(b10));
            ry0Var.d.p(b10, b11);
            this.f28305e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ry0 ry0Var = this.f28306f;
        if (i10 == 0 && ry0Var.f30615f != null && this.f28305e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f28305e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(ry0Var.f30615f, "").document;
            this.f28305e = -1;
            ry0Var.f30615f = null;
        } else if (i10 == 2) {
            ry0Var.f30615f = ((org.telegram.ui.Cells.f8) c1Var.f46538a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
