package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c41 implements gw0 {
    public final TLRPC.InputStickerSet f33887a;
    public final h41 f33888b;

    public c41(h41 h41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f33888b = h41Var;
        this.f33887a = inputStickerSet;
    }

    @Override
    public final void a() {
        h41 h41Var = this.f33888b;
        v4.i0 adapter = h41Var.f35719n.getAdapter();
        g41 g41Var = h41Var.f35721s;
        TLRPC.InputStickerSet inputStickerSet = this.f33887a;
        int i7 = 0;
        if (adapter == g41Var) {
            while (i7 < g41Var.f35328e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) g41Var.f35328e.get(i7);
                if (stickerSetCovered.set.f28430id == inputStickerSet.f28423id) {
                    g41Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = h41Var.f35722w;
        ArrayList arrayList = c2Var.F;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.f28430id == inputStickerSet.f28423id) {
                c2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
