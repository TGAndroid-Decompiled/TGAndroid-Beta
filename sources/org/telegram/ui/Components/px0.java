package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class px0 extends s4.x {
    public int e;
    public final wx0 f27153f;

    public px0(wx0 wx0Var) {
        this.f27153f = wx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f42705f;
        if (i10 != 3 && i10 == c1Var2.f42705f) {
            wx0 wx0Var = this.f27153f;
            if (wx0Var.S == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            wx0Var.S.documents.add(b11, wx0Var.S.documents.remove(b10));
            wx0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        wx0 wx0Var = this.f27153f;
        if (i10 == 0 && wx0Var.f29776f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(wx0Var.f29776f, "").document;
            this.e = -1;
            wx0Var.f29776f = null;
        } else if (i10 == 2) {
            wx0Var.f29776f = ((org.telegram.ui.Cells.f8) c1Var.f42702a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
