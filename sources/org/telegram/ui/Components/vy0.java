package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class vy0 extends s4.y {
    public int e;
    public final cz0 f34304f;

    public vy0(cz0 cz0Var) {
        this.f34304f = cz0Var;
        this.d = 15;
        this.e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int i10 = e1Var.f47741f;
        if (i10 != 3 && i10 == e1Var2.f47741f) {
            cz0 cz0Var = this.f34304f;
            if (cz0Var.S == null) {
                return false;
            }
            int b10 = e1Var.b();
            int b11 = e1Var2.b();
            cz0Var.S.documents.add(b11, cz0Var.S.documents.remove(b10));
            cz0Var.d.p(b10, b11);
            this.e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        cz0 cz0Var = this.f34304f;
        if (i10 == 0 && cz0Var.f27295f != null && this.e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(cz0Var.f27295f, "").document;
            this.e = -1;
            cz0Var.f27295f = null;
        } else if (i10 == 2) {
            cz0Var.f27295f = ((org.telegram.ui.Cells.i8) e1Var.f47738a).getSticker();
        }
    }

    @Override
    public final void q(s4.e1 e1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2, int i10, int i11, int i12) {
    }
}
