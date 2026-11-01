package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class ww0 extends s4.w {
    public int e;
    public final dx0 f32330f;

    public ww0(dx0 dx0Var) {
        this.f32330f = dx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f47912f;
        if (i10 != 3 && i10 == c1Var2.f47912f) {
            dx0 dx0Var = this.f32330f;
            if (dx0Var.J1 == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            dx0Var.J1.documents.add(b11, dx0Var.J1.documents.remove(b10));
            dx0Var.f25621k1.j(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        dx0 dx0Var = this.f32330f;
        if (i10 == 0 && dx0Var.f25624m1 != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.vi.a0(dx0Var.f25624m1, "").document;
            this.e = -1;
            dx0Var.f25624m1 = null;
        } else if (i10 == 2) {
            dx0Var.f25624m1 = ((org.telegram.ui.Cells.d8) c1Var.f47909a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
