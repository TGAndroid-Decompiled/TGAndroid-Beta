package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ly0 extends s4.x {
    public int e;
    public final sy0 f28470f;

    public ly0(sy0 sy0Var) {
        this.f28470f = sy0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = b1Var.f46345f;
        if (i10 != 3 && i10 == b1Var2.f46345f) {
            sy0 sy0Var = this.f28470f;
            if (sy0Var.S == null) {
                return false;
            }
            int b10 = b1Var.b();
            int b11 = b1Var2.b();
            sy0Var.S.documents.add(b11, sy0Var.S.documents.remove(b10));
            sy0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        sy0 sy0Var = this.f28470f;
        if (i10 == 0 && sy0Var.f30641f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(sy0Var.f30641f, "").document;
            this.e = -1;
            sy0Var.f30641f = null;
        } else if (i10 == 2) {
            sy0Var.f30641f = ((org.telegram.ui.Cells.e8) b1Var.f46342a).getSticker();
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2, int i10, int i11, int i12) {
    }
}
