package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y41 implements sx0 {
    public final TLRPC.InputStickerSet f30158a;
    public final d51 f30159b;

    public y41(d51 d51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f30159b = d51Var;
        this.f30158a = inputStickerSet;
    }

    @Override
    public final void a() {
        d51 d51Var = this.f30159b;
        s4.h0 adapter = d51Var.f23244n.getAdapter();
        c51 c51Var = d51Var.f23246s;
        TLRPC.InputStickerSet inputStickerSet = this.f30158a;
        int i10 = 0;
        if (adapter == c51Var) {
            while (i10 < c51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c51Var.e.get(i10);
                if (stickerSetCovered.set.f18110id == inputStickerSet.f18103id) {
                    c51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = d51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f18110id == inputStickerSet.f18103id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
