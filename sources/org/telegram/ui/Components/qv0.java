package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class qv0 extends u4.x {
    public int f37548e;
    public final xv0 f37549f;

    public qv0(xv0 xv0Var) {
        this.f37549f = xv0Var;
        this.d = 15;
        this.f37548e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 == d1Var2.f55544f) {
            xv0 xv0Var = this.f37549f;
            if (xv0Var.K1 == null) {
                return false;
            }
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            xv0Var.K1.documents.add(b11, xv0Var.K1.documents.remove(b10));
            xv0Var.f40517l1.j(b10, b11);
            this.f37548e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(u4.d1 d1Var, int i3) {
        xv0 xv0Var = this.f37549f;
        if (i3 == 0 && xv0Var.f40520n1 != null && this.f37548e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f37548e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.li.a0(xv0Var.f40520n1, "").document;
            this.f37548e = -1;
            xv0Var.f40520n1 = null;
        } else if (i3 == 2) {
            xv0Var.f40520n1 = ((org.telegram.ui.Cells.y7) d1Var.f55540a).getSticker();
        }
    }

    @Override
    public final void q(u4.d1 d1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2, int i3, int i10, int i11) {
    }
}
