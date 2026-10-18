package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class hy0 extends s4.x {
    public int e;
    public final oy0 f26973f;

    public hy0(oy0 oy0Var) {
        this.f26973f = oy0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = b1Var.f45961f;
        if (i10 != 3 && i10 == b1Var2.f45961f) {
            oy0 oy0Var = this.f26973f;
            if (oy0Var.S == null) {
                return false;
            }
            int b10 = b1Var.b();
            int b11 = b1Var2.b();
            oy0Var.S.documents.add(b11, oy0Var.S.documents.remove(b10));
            oy0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        oy0 oy0Var = this.f26973f;
        if (i10 == 0 && oy0Var.f29094f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(oy0Var.f29094f, "").document;
            this.e = -1;
            oy0Var.f29094f = null;
        } else if (i10 == 2) {
            oy0Var.f29094f = ((org.telegram.ui.Cells.e8) b1Var.f45958a).getSticker();
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2, int i10, int i11, int i12) {
    }
}
