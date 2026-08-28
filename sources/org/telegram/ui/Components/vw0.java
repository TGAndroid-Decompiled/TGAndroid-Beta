package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class vw0 extends f2.g0 {
    public int f34010e;
    public final cx0 f34011f;

    public vw0(cx0 cx0Var) {
        this.f34011f = cx0Var;
        this.d = 15;
        this.f34010e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 == q1Var2.f5505f) {
            cx0 cx0Var = this.f34011f;
            if (cx0Var.O == null) {
                return false;
            }
            int b10 = q1Var.b();
            int b11 = q1Var2.b();
            cx0Var.O.documents.add(b11, cx0Var.O.documents.remove(b10));
            cx0Var.d.p(b10, b11);
            this.f34010e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        cx0 cx0Var = this.f34011f;
        if (i9 == 0 && cx0Var.f27578f != null && this.f34010e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f34010e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(cx0Var.f27578f, "").document;
            this.f34010e = -1;
            cx0Var.f27578f = null;
        } else if (i9 == 2) {
            cx0Var.f27578f = ((org.telegram.ui.Cells.d8) q1Var.f5501a).getSticker();
        }
    }

    @Override
    public final void q(f2.q1 q1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2, int i9, int i10, int i11) {
    }
}
