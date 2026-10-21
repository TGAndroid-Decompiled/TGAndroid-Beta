package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y51 implements oy0 {
    public final TLRPC.InputStickerSet f32575a;
    public final d61 f32576b;

    public y51(d61 d61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f32576b = d61Var;
        this.f32575a = inputStickerSet;
    }

    @Override
    public final void a() {
        d61 d61Var = this.f32576b;
        s4.g0 adapter = d61Var.f25351n.getAdapter();
        c61 c61Var = d61Var.f25353s;
        TLRPC.InputStickerSet inputStickerSet = this.f32575a;
        int i10 = 0;
        if (adapter == c61Var) {
            while (i10 < c61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c61Var.e.get(i10);
                if (stickerSetCovered.set.f20303id == inputStickerSet.f20296id) {
                    c61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = d61Var.v;
        ArrayList arrayList = e2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20303id == inputStickerSet.f20296id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
