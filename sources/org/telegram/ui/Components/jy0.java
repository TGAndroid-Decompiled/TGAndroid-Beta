package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class jy0 extends s4.x {
    public int f27919e;
    public final qy0 f27920f;

    public jy0(qy0 qy0Var) {
        this.f27920f = qy0Var;
        this.d = 15;
        this.f27919e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f46535f;
        if (i10 != 3 && i10 == c1Var2.f46535f) {
            qy0 qy0Var = this.f27920f;
            if (qy0Var.S == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            qy0Var.S.documents.add(b11, qy0Var.S.documents.remove(b10));
            qy0Var.d.p(b10, b11);
            this.f27919e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        qy0 qy0Var = this.f27920f;
        if (i10 == 0 && qy0Var.f30200f != null && this.f27919e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f27919e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(qy0Var.f30200f, "").document;
            this.f27919e = -1;
            qy0Var.f30200f = null;
        } else if (i10 == 2) {
            qy0Var.f30200f = ((org.telegram.ui.Cells.f8) c1Var.f46531a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
