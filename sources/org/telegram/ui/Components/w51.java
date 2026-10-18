package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w51 implements my0 {
    public final TLRPC.InputStickerSet f32017a;
    public final b61 f32018b;

    public w51(b61 b61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f32018b = b61Var;
        this.f32017a = inputStickerSet;
    }

    @Override
    public final void a() {
        b61 b61Var = this.f32018b;
        s4.g0 adapter = b61Var.f24823n.getAdapter();
        a61 a61Var = b61Var.f24825s;
        TLRPC.InputStickerSet inputStickerSet = this.f32017a;
        int i10 = 0;
        if (adapter == a61Var) {
            while (i10 < a61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) a61Var.e.get(i10);
                if (stickerSetCovered.set.f20306id == inputStickerSet.f20299id) {
                    a61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = b61Var.v;
        ArrayList arrayList = e2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20306id == inputStickerSet.f20299id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
