package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class tv0 extends v4.x {
    public int f39814e;
    public final bw0 f39815f;

    public tv0(bw0 bw0Var) {
        this.f39815f = bw0Var;
        this.d = 15;
        this.f39814e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        int i7 = e1Var.f58539f;
        if (i7 != 3 && i7 == e1Var2.f58539f) {
            bw0 bw0Var = this.f39815f;
            if (bw0Var.N1 == null) {
                return false;
            }
            int b10 = e1Var.b();
            int b11 = e1Var2.b();
            bw0Var.N1.documents.add(b11, bw0Var.N1.documents.remove(b10));
            bw0Var.f33413o1.j(b10, b11);
            this.f39814e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        bw0 bw0Var = this.f39815f;
        if (i7 == 0 && bw0Var.f33417q1 != null && this.f39814e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f39814e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.si.a0(bw0Var.f33417q1, "").document;
            this.f39814e = -1;
            bw0Var.f33417q1 = null;
        } else if (i7 == 2) {
            bw0Var.f33417q1 = ((org.telegram.ui.Cells.y7) e1Var.f58535a).getSticker();
        }
    }

    @Override
    public final void q(v4.e1 e1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2, int i7, int i10, int i11) {
    }
}
