package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x51 implements oy0 {
    public final TLRPC.InputStickerSet f32720a;
    public final c61 f32721b;

    public x51(c61 c61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f32721b = c61Var;
        this.f32720a = inputStickerSet;
    }

    @Override
    public final void a() {
        c61 c61Var = this.f32721b;
        s4.h0 adapter = c61Var.f25231n.getAdapter();
        b61 b61Var = c61Var.f25233s;
        TLRPC.InputStickerSet inputStickerSet = this.f32720a;
        int i10 = 0;
        if (adapter == b61Var) {
            while (i10 < b61Var.f24801e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) b61Var.f24801e.get(i10);
                if (stickerSetCovered.set.f20064id == inputStickerSet.f20057id) {
                    b61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = c61Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20064id == inputStickerSet.f20057id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
