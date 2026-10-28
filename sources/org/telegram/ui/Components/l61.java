package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l61 implements bz0 {
    public final TLRPC.InputStickerSet f30124a;
    public final q61 f30125b;

    public l61(q61 q61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f30125b = q61Var;
        this.f30124a = inputStickerSet;
    }

    @Override
    public final void a() {
        q61 q61Var = this.f30125b;
        s4.h0 adapter = q61Var.f31807n.getAdapter();
        p61 p61Var = q61Var.f31809s;
        TLRPC.InputStickerSet inputStickerSet = this.f30124a;
        int i10 = 0;
        if (adapter == p61Var) {
            while (i10 < p61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p61Var.e.get(i10);
                if (stickerSetCovered.set.f22055id == inputStickerSet.f22048id) {
                    p61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        ig.d2 d2Var = q61Var.v;
        ArrayList arrayList = d2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f22055id == inputStickerSet.f22048id) {
                d2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
