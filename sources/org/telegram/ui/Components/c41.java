package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c41 implements ax0 {
    public final TLRPC.InputStickerSet f27364a;
    public final h41 f27365b;

    public c41(h41 h41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f27365b = h41Var;
        this.f27364a = inputStickerSet;
    }

    @Override
    public final void a() {
        h41 h41Var = this.f27365b;
        f2.r0 adapter = h41Var.f28972n.getAdapter();
        g41 g41Var = h41Var.f28974s;
        TLRPC.InputStickerSet inputStickerSet = this.f27364a;
        int i9 = 0;
        if (adapter == g41Var) {
            while (i9 < g41Var.f28644e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) g41Var.f28644e.get(i9);
                if (stickerSetCovered.set.f22407id == inputStickerSet.f22400id) {
                    g41Var.F(stickerSetCovered, null);
                    return;
                }
                i9++;
            }
            return;
        }
        of.y1 y1Var = h41Var.v;
        ArrayList arrayList = y1Var.A;
        while (i9 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i9);
            if (stickerSetCovered2.set.f22407id == inputStickerSet.f22400id) {
                y1Var.F(stickerSetCovered2, null);
                return;
            }
            i9++;
        }
    }
}
