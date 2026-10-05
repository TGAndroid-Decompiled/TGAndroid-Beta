package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y51 implements py0 {
    public final TLRPC.InputStickerSet f33221a;
    public final d61 f33222b;

    public y51(d61 d61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f33222b = d61Var;
        this.f33221a = inputStickerSet;
    }

    @Override
    public final void a() {
        d61 d61Var = this.f33222b;
        s4.h0 adapter = d61Var.f25688n.getAdapter();
        c61 c61Var = d61Var.f25690s;
        TLRPC.InputStickerSet inputStickerSet = this.f33221a;
        int i10 = 0;
        if (adapter == c61Var) {
            while (i10 < c61Var.f25276e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c61Var.f25276e.get(i10);
                if (stickerSetCovered.set.f20074id == inputStickerSet.f20067id) {
                    c61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = d61Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20074id == inputStickerSet.f20067id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
