package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;

public final class xw0 extends f2.e0 {

    public int f34723e;

    public final ex0 f34724f;

    public xw0(ex0 ex0Var) {
        this.f34724f = ex0Var;
        this.d = 15;
        this.f34723e = -1;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int i10 = o1Var.f5793f;
        if (i10 == 3 || i10 != o1Var2.f5793f) {
            return false;
        }
        ex0 ex0Var = this.f34724f;
        if (ex0Var.O == null) {
            return false;
        }
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        ex0Var.O.documents.add(iB2, ex0Var.O.documents.remove(iB));
        ex0Var.d.p(iB, iB2);
        this.f34723e = iB2;
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        ex0 ex0Var = this.f34724f;
        if (i10 != 0 || ex0Var.f28178f == null || this.f34723e <= 0) {
            if (i10 == 2) {
                ex0Var.f28178f = ((org.telegram.ui.Cells.a8) o1Var.f5789a).getSticker();
            }
        } else {
            TLRPC.TL_stickers_changeStickerPosition tL_stickers_changeStickerPosition = new TLRPC.TL_stickers_changeStickerPosition();
            tL_stickers_changeStickerPosition.position = this.f34723e;
            tL_stickers_changeStickerPosition.sticker = MediaDataController.getInputStickerSetItem(ex0Var.f28178f, "").document;
            this.f34723e = -1;
            ex0Var.f28178f = null;
        }
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }

    @Override
    public final void o(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2, int i10, int i11, int i12) {
    }
}
