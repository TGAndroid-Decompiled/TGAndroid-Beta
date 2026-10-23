package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y51 implements oy0 {
    public final TLRPC.InputStickerSet f32579a;
    public final d61 f32580b;

    public y51(d61 d61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f32580b = d61Var;
        this.f32579a = inputStickerSet;
    }

    @Override
    public final void a() {
        d61 d61Var = this.f32580b;
        s4.g0 adapter = d61Var.f25355n.getAdapter();
        c61 c61Var = d61Var.f25357s;
        TLRPC.InputStickerSet inputStickerSet = this.f32579a;
        int i10 = 0;
        if (adapter == c61Var) {
            while (i10 < c61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c61Var.e.get(i10);
                if (stickerSetCovered.set.f20307id == inputStickerSet.f20300id) {
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
            if (stickerSetCovered2.set.f20307id == inputStickerSet.f20300id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
