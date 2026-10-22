package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class jy0 extends s4.x {
    public int e;
    public final qy0 f27681f;

    public jy0(qy0 qy0Var) {
        this.f27681f = qy0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int i10 = b1Var.f45923f;
        if (i10 != 3 && i10 == b1Var2.f45923f) {
            qy0 qy0Var = this.f27681f;
            if (qy0Var.S == null) {
                return false;
            }
            int b10 = b1Var.b();
            int b11 = b1Var2.b();
            qy0Var.S.documents.add(b11, qy0Var.S.documents.remove(b10));
            qy0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        qy0 qy0Var = this.f27681f;
        if (i10 == 0 && qy0Var.f29754f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(qy0Var.f29754f, "").document;
            this.e = -1;
            qy0Var.f29754f = null;
        } else if (i10 == 2) {
            qy0Var.f29754f = ((org.telegram.ui.Cells.e8) b1Var.f45920a).getSticker();
        }
    }

    @Override
    public final void q(s4.b1 b1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2, int i10, int i11, int i12) {
    }
}
