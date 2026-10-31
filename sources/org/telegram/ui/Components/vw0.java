package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class vw0 extends s4.w {
    public int e;
    public final cx0 f31852f;

    public vw0(cx0 cx0Var) {
        this.f31852f = cx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f47901f;
        if (i10 != 3 && i10 == c1Var2.f47901f) {
            cx0 cx0Var = this.f31852f;
            if (cx0Var.J1 == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            cx0Var.J1.documents.add(b11, cx0Var.J1.documents.remove(b10));
            cx0Var.f25208k1.j(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        cx0 cx0Var = this.f31852f;
        if (i10 == 0 && cx0Var.f25211m1 != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ui.a0(cx0Var.f25211m1, "").document;
            this.e = -1;
            cx0Var.f25211m1 = null;
        } else if (i10 == 2) {
            cx0Var.f25211m1 = ((org.telegram.ui.Cells.d8) c1Var.f47898a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
