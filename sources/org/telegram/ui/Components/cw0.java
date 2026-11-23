package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
public final class cw0 extends v4.y {
    public int f34155e;
    public final jw0 f34156f;

    public cw0(jw0 jw0Var) {
        this.f34156f = jw0Var;
        this.d = 15;
        this.f34155e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 == f1Var2.f59249f) {
            jw0 jw0Var = this.f34156f;
            if (jw0Var.N1 == null) {
                return false;
            }
            int b10 = f1Var.b();
            int b11 = f1Var2.b();
            jw0Var.N1.documents.add(b11, jw0Var.N1.documents.remove(b10));
            jw0Var.f36541o1.j(b10, b11);
            this.f34155e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        jw0 jw0Var = this.f34156f;
        if (i7 == 0 && jw0Var.f36545q1 != null && this.f34155e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f34155e;
            tL_stickers_changeStickerPosition.sticker = org.telegram.messenger.ri.c0(jw0Var.f36545q1, "").document;
            this.f34155e = -1;
            jw0Var.f36545q1 = null;
        } else if (i7 == 2) {
            jw0Var.f36545q1 = ((org.telegram.ui.Cells.z7) f1Var.f59245a).getSticker();
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2, int i7, int i10, int i11) {
    }
}
