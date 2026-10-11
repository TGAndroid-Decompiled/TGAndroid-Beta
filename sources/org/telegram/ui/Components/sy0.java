package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class sy0 extends s4.y {
    public int f30906e;
    public final zy0 f30907f;

    public sy0(zy0 zy0Var) {
        this.f30907f = zy0Var;
        this.d = 15;
        this.f30906e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10 = d1Var.f47752f;
        if (i10 != 3 && i10 == d1Var2.f47752f) {
            zy0 zy0Var = this.f30907f;
            if (zy0Var.S == null) {
                return false;
            }
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            zy0Var.S.documents.add(b11, zy0Var.S.documents.remove(b10));
            zy0Var.d.p(b10, b11);
            this.f30906e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        zy0 zy0Var = this.f30907f;
        if (i10 == 0 && zy0Var.f33696f != null && this.f30906e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f30906e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(zy0Var.f33696f, "").document;
            this.f30906e = -1;
            zy0Var.f33696f = null;
        } else if (i10 == 2) {
            zy0Var.f33696f = ((org.telegram.ui.Cells.f8) d1Var.f47748a).getSticker();
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2, int i10, int i11, int i12) {
    }
}
