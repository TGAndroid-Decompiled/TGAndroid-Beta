package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class w51 implements my0 {
    public final TLRPC.InputStickerSet f32010a;
    public final b61 f32011b;

    public w51(b61 b61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f32011b = b61Var;
        this.f32010a = inputStickerSet;
    }

    @Override
    public final void a() {
        b61 b61Var = this.f32011b;
        s4.g0 adapter = b61Var.f24816n.getAdapter();
        a61 a61Var = b61Var.f24818s;
        TLRPC.InputStickerSet inputStickerSet = this.f32010a;
        int i10 = 0;
        if (adapter == a61Var) {
            while (i10 < a61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) a61Var.e.get(i10);
                if (stickerSetCovered.set.f20299id == inputStickerSet.f20292id) {
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
            if (stickerSetCovered2.set.f20299id == inputStickerSet.f20292id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
