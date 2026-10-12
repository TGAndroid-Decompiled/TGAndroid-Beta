package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class wy0 extends s4.y {
    public int f32580e;
    public final dz0 f32581f;

    public wy0(dz0 dz0Var) {
        this.f32581f = dz0Var;
        this.d = 15;
        this.f32580e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int i10 = d1Var.f47893f;
        if (i10 != 3 && i10 == d1Var2.f47893f) {
            dz0 dz0Var = this.f32581f;
            if (dz0Var.S == null) {
                return false;
            }
            int b10 = d1Var.b();
            int b11 = d1Var2.b();
            dz0Var.S.documents.add(b11, dz0Var.S.documents.remove(b10));
            dz0Var.d.p(b10, b11);
            this.f32580e = b11;
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        dz0 dz0Var = this.f32581f;
        if (i10 == 0 && dz0Var.f25485f != null && this.f32580e > 0) {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f32580e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(dz0Var.f25485f, "").document;
            this.f32580e = -1;
            dz0Var.f25485f = null;
        } else if (i10 == 2) {
            dz0Var.f25485f = ((org.telegram.ui.Cells.f8) d1Var.f47889a).getSticker();
        }
    }

    @Override
    public final void q(s4.d1 d1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2, int i10, int i11, int i12) {
    }
}
