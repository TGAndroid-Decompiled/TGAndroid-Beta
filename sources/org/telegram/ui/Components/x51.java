package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x51 implements ny0 {
    public final TLRPC.InputStickerSet f32316a;
    public final c61 f32317b;

    public x51(c61 c61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f32317b = c61Var;
        this.f32316a = inputStickerSet;
    }

    @Override
    public final void a() {
        c61 c61Var = this.f32317b;
        s4.g0 adapter = c61Var.f25094n.getAdapter();
        b61 b61Var = c61Var.f25096s;
        TLRPC.InputStickerSet inputStickerSet = this.f32316a;
        int i10 = 0;
        if (adapter == b61Var) {
            while (i10 < b61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) b61Var.e.get(i10);
                if (stickerSetCovered.set.f20302id == inputStickerSet.f20295id) {
                    b61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = c61Var.v;
        ArrayList arrayList = e2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20302id == inputStickerSet.f20295id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
