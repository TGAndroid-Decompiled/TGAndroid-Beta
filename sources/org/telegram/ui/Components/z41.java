package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z41 implements tx0 {
    public final TLRPC.InputStickerSet f30476a;
    public final e51 f30477b;

    public z41(e51 e51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f30477b = e51Var;
        this.f30476a = inputStickerSet;
    }

    @Override
    public final void a() {
        e51 e51Var = this.f30477b;
        s4.h0 adapter = e51Var.f23546n.getAdapter();
        d51 d51Var = e51Var.f23548s;
        TLRPC.InputStickerSet inputStickerSet = this.f30476a;
        int i10 = 0;
        if (adapter == d51Var) {
            while (i10 < d51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) d51Var.e.get(i10);
                if (stickerSetCovered.set.f18139id == inputStickerSet.f18132id) {
                    d51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = e51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f18139id == inputStickerSet.f18132id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
