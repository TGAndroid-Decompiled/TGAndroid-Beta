package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class rv0 extends v4.x {
    public int f37858e;
    public final yv0 f37859f;

    public rv0(yv0 yv0Var) {
        this.f37859f = yv0Var;
        this.d = 15;
        this.f37858e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int i7 = d1Var.f56931f;
        if (i7 != 3 && i7 == d1Var2.f56931f) {
            yv0 yv0Var = this.f37859f;
            if (yv0Var.J1 == null) {
                return false;
            }
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            yv0Var.J1.documents.add(b11, yv0Var.J1.documents.remove(b10));
            yv0Var.f40732k1.j(b10, b11);
            this.f37858e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        yv0 yv0Var = this.f37859f;
        if (i7 == 0 && yv0Var.f40735m1 != null && this.f37858e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f37858e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ui.a0(yv0Var.f40735m1, "").document;
            this.f37858e = -1;
            yv0Var.f40735m1 = null;
        } else if (i7 == 2) {
            yv0Var.f40735m1 = ((org.telegram.ui.Cells.z7) d1Var.f56927a).getSticker();
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2, int i7, int i10, int i11) {
    }
}
