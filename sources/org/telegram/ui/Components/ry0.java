package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ry0 extends s4.y {
    public int f30665e;
    public final yy0 f30666f;

    public ry0(yy0 yy0Var) {
        this.f30666f = yy0Var;
        this.d = 15;
        this.f30665e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10 = d1Var.f47786f;
        if (i10 != 3 && i10 == d1Var2.f47786f) {
            yy0 yy0Var = this.f30666f;
            if (yy0Var.S == null) {
                return false;
            }
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            yy0Var.S.documents.add(b11, yy0Var.S.documents.remove(b10));
            yy0Var.d.p(b10, b11);
            this.f30665e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        yy0 yy0Var = this.f30666f;
        if (i10 == 0 && yy0Var.f33482f != null && this.f30665e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f30665e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(yy0Var.f33482f, "").document;
            this.f30665e = -1;
            yy0Var.f33482f = null;
        } else if (i10 == 2) {
            yy0Var.f33482f = ((org.telegram.ui.Cells.f8) d1Var.f47782a).getSticker();
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2, int i10, int i11, int i12) {
    }
}
