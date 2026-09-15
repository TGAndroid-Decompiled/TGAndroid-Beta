package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ox0 extends s4.x {
    public int e;
    public final vx0 f26905f;

    public ox0(vx0 vx0Var) {
        this.f26905f = vx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f42678f;
        if (i10 != 3 && i10 == c1Var2.f42678f) {
            vx0 vx0Var = this.f26905f;
            if (vx0Var.S == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            vx0Var.S.documents.add(b11, vx0Var.S.documents.remove(b10));
            vx0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        vx0 vx0Var = this.f26905f;
        if (i10 == 0 && vx0Var.f29461f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(vx0Var.f29461f, "").document;
            this.e = -1;
            vx0Var.f29461f = null;
        } else if (i10 == 2) {
            vx0Var.f29461f = ((org.telegram.ui.Cells.f8) c1Var.f42675a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
