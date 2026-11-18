package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class bw0 extends v4.y {
    public int f33799e;
    public final iw0 f33800f;

    public bw0(iw0 iw0Var) {
        this.f33800f = iw0Var;
        this.d = 15;
        this.f33799e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int i7 = f1Var.f59126f;
        if (i7 != 3 && i7 == f1Var2.f59126f) {
            iw0 iw0Var = this.f33800f;
            if (iw0Var.N1 == null) {
                return false;
            }
            int b10 = f1Var.b();
            int b11 = f1Var2.b();
            iw0Var.N1.documents.add(b11, iw0Var.N1.documents.remove(b10));
            iw0Var.f36247o1.j(b10, b11);
            this.f33799e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        iw0 iw0Var = this.f33800f;
        if (i7 == 0 && iw0Var.f36251q1 != null && this.f33799e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f33799e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ri.c0(iw0Var.f36251q1, "").document;
            this.f33799e = -1;
            iw0Var.f36251q1 = null;
        } else if (i7 == 2) {
            iw0Var.f36251q1 = ((org.telegram.ui.Cells.z7) f1Var.f59122a).getSticker();
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2, int i7, int i10, int i11) {
    }
}
