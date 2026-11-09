package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class sv0 extends v4.x {
    public int f38158e;
    public final zv0 f38159f;

    public sv0(zv0 zv0Var) {
        this.f38159f = zv0Var;
        this.d = 15;
        this.f38158e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int i7 = d1Var.f57060f;
        if (i7 != 3 && i7 == d1Var2.f57060f) {
            zv0 zv0Var = this.f38159f;
            if (zv0Var.J1 == null) {
                return false;
            }
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            zv0Var.J1.documents.add(b11, zv0Var.J1.documents.remove(b10));
            zv0Var.f41155k1.j(b10, b11);
            this.f38158e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        zv0 zv0Var = this.f38159f;
        if (i7 == 0 && zv0Var.f41158m1 != null && this.f38158e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f38158e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ui.a0(zv0Var.f41158m1, "").document;
            this.f38158e = -1;
            zv0Var.f41158m1 = null;
        } else if (i7 == 2) {
            zv0Var.f41158m1 = ((org.telegram.ui.Cells.z7) d1Var.f57056a).getSticker();
        }
    }

    @Override
    public final void q(v4.d1 d1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2, int i7, int i10, int i11) {
    }
}
