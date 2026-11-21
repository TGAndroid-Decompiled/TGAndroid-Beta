package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class dw0 extends v4.y {
    public int f34599e;
    public final kw0 f34600f;

    public dw0(kw0 kw0Var) {
        this.f34600f = kw0Var;
        this.d = 15;
        this.f34599e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int i7 = f1Var.f59165f;
        if (i7 != 3 && i7 == f1Var2.f59165f) {
            kw0 kw0Var = this.f34600f;
            if (kw0Var.N1 == null) {
                return false;
            }
            int b10 = f1Var.b();
            int b11 = f1Var2.b();
            kw0Var.N1.documents.add(b11, kw0Var.N1.documents.remove(b10));
            kw0Var.f37016o1.j(b10, b11);
            this.f34599e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        kw0 kw0Var = this.f34600f;
        if (i7 == 0 && kw0Var.f37020q1 != null && this.f34599e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f34599e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ri.c0(kw0Var.f37020q1, "").document;
            this.f34599e = -1;
            kw0Var.f37020q1 = null;
        } else if (i7 == 2) {
            kw0Var.f37020q1 = ((org.telegram.ui.Cells.a8) f1Var.f59161a).getSticker();
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2, int i7, int i10, int i11) {
    }
}
