package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class px0 extends f2.d0 {
    public int e;
    public final xx0 f28012f;

    public px0(xx0 xx0Var) {
        this.f28012f = xx0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        int i10 = l1Var.f5788f;
        if (i10 != 3 && i10 == l1Var2.f5788f) {
            xx0 xx0Var = this.f28012f;
            if (xx0Var.P == null) {
                return false;
            }
            int b10 = l1Var.b();
            int b11 = l1Var2.b();
            xx0Var.P.documents.add(b11, xx0Var.P.documents.remove(b10));
            xx0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.l1 l1Var, int i10) {
        xx0 xx0Var = this.f28012f;
        if (i10 == 0 && xx0Var.f30774f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(xx0Var.f30774f, "").document;
            this.e = -1;
            xx0Var.f30774f = null;
        } else if (i10 == 2) {
            xx0Var.f30774f = ((org.telegram.ui.Cells.d8) l1Var.f5785a).getSticker();
        }
    }

    @Override
    public final void q(f2.l1 l1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2, int i10, int i11, int i12) {
    }
}
