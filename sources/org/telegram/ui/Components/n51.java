package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n51 implements ey0 {
    public final TLRPC.InputStickerSet f26674a;
    public final s51 f26675b;

    public n51(s51 s51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f26675b = s51Var;
        this.f26674a = inputStickerSet;
    }

    @Override
    public final void a() {
        s51 s51Var = this.f26675b;
        s4.h0 adapter = s51Var.f28164n.getAdapter();
        r51 r51Var = s51Var.f28166s;
        TLRPC.InputStickerSet inputStickerSet = this.f26674a;
        int i10 = 0;
        if (adapter == r51Var) {
            while (i10 < r51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) r51Var.e.get(i10);
                if (stickerSetCovered.set.f18362id == inputStickerSet.f18355id) {
                    r51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = s51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f18362id == inputStickerSet.f18355id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
