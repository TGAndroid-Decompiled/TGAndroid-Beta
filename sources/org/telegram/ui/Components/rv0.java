package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class rv0 extends v4.x {
    public int f37742e;
    public final yv0 f37743f;

    public rv0(yv0 yv0Var) {
        this.f37743f = yv0Var;
        this.d = 15;
        this.f37742e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 == d1Var2.f57056f) {
            yv0 yv0Var = this.f37743f;
            if (yv0Var.M1 == null) {
                return false;
            }
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            yv0Var.M1.documents.add(b11, yv0Var.M1.documents.remove(b10));
            yv0Var.n1.j(b10, b11);
            this.f37742e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        yv0 yv0Var = this.f37743f;
        if (i7 == 0 && yv0Var.f40752p1 != null && this.f37742e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f37742e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ui.a0(yv0Var.f40752p1, "").document;
            this.f37742e = -1;
            yv0Var.f40752p1 = null;
        } else if (i7 == 2) {
            yv0Var.f40752p1 = ((org.telegram.ui.Cells.z7) d1Var.f57052a).getSticker();
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2, int i7, int i10, int i11) {
    }
}
