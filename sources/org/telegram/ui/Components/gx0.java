package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class gx0 extends f2.d0 {
    public int f29008e;
    public final nx0 f29009f;

    public gx0(nx0 nx0Var) {
        this.f29009f = nx0Var;
        this.d = 15;
        this.f29008e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 == n1Var2.f6436f) {
            nx0 nx0Var = this.f29009f;
            if (nx0Var.O == null) {
                return false;
            }
            int b10 = n1Var.b();
            int b11 = n1Var2.b();
            nx0Var.O.documents.add(b11, nx0Var.O.documents.remove(b10));
            nx0Var.d.p(b10, b11);
            this.f29008e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        nx0 nx0Var = this.f29009f;
        if (i10 == 0 && nx0Var.f31176f != null && this.f29008e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f29008e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(nx0Var.f31176f, "").document;
            this.f29008e = -1;
            nx0Var.f31176f = null;
        } else if (i10 == 2) {
            nx0Var.f31176f = ((org.telegram.ui.Cells.b8) n1Var.f6432a).getSticker();
        }
    }

    @Override
    public final void q(f2.n1 n1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2, int i10, int i11, int i12) {
    }
}
