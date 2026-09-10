package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ay0 extends s4.x {
    public int e;
    public final hy0 f21657f;

    public ay0(hy0 hy0Var) {
        this.f21657f = hy0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10 = c1Var.f41613f;
        if (i10 != 3 && i10 == c1Var2.f41613f) {
            hy0 hy0Var = this.f21657f;
            if (hy0Var.S == null) {
                return false;
            }
            int b10 = c1Var.b();
            int b11 = c1Var2.b();
            hy0Var.S.documents.add(b11, hy0Var.S.documents.remove(b10));
            hy0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        hy0 hy0Var = this.f21657f;
        if (i10 == 0 && hy0Var.f23810f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(hy0Var.f23810f, "").document;
            this.e = -1;
            hy0Var.f23810f = null;
        } else if (i10 == 2) {
            hy0Var.f23810f = ((org.telegram.ui.Cells.g8) c1Var.f41610a).getSticker();
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}
