package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class iy0 extends s4.x {
    public int e;
    public final py0 f27388f;

    public iy0(py0 py0Var) {
        this.f27388f = py0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = b1Var.f45915f;
        if (i10 != 3 && i10 == b1Var2.f45915f) {
            py0 py0Var = this.f27388f;
            if (py0Var.S == null) {
                return false;
            }
            int b10 = b1Var.b();
            int b11 = b1Var2.b();
            py0Var.S.documents.add(b11, py0Var.S.documents.remove(b10));
            py0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        py0 py0Var = this.f27388f;
        if (i10 == 0 && py0Var.f29422f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(py0Var.f29422f, "").document;
            this.e = -1;
            py0Var.f29422f = null;
        } else if (i10 == 2) {
            py0Var.f29422f = ((org.telegram.ui.Cells.e8) b1Var.f45912a).getSticker();
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2, int i10, int i11, int i12) {
    }
}
