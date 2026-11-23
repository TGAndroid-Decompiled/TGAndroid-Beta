package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class dw0 extends v4.x {
    public int f34584e;
    public final kw0 f34585f;

    public dw0(kw0 kw0Var) {
        this.f34585f = kw0Var;
        this.d = 15;
        this.f34584e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        int i7 = e1Var.f59115f;
        if (i7 != 3 && i7 == e1Var2.f59115f) {
            kw0 kw0Var = this.f34585f;
            if (kw0Var.N1 == null) {
                return false;
            }
            int b10 = e1Var.b();
            int b11 = e1Var2.b();
            kw0Var.N1.documents.add(b11, kw0Var.N1.documents.remove(b10));
            kw0Var.f36975o1.j(b10, b11);
            this.f34584e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        kw0 kw0Var = this.f34585f;
        if (i7 == 0 && kw0Var.f36979q1 != null && this.f34584e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f34584e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.si.c0(kw0Var.f36979q1, "").document;
            this.f34584e = -1;
            kw0Var.f36979q1 = null;
        } else if (i7 == 2) {
            kw0Var.f36979q1 = ((org.telegram.ui.Cells.a8) e1Var.f59111a).getSticker();
        }
    }

    @Override
    public final void q(v4.e1 e1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2, int i7, int i10, int i11) {
    }
}
