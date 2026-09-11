package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y41 implements sx0 {
    public final TLRPC.InputStickerSet f32842a;
    public final d51 f32843b;

    public y41(d51 d51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f32843b = d51Var;
        this.f32842a = inputStickerSet;
    }

    @Override
    public final void a() {
        d51 d51Var = this.f32843b;
        s4.h0 adapter = d51Var.f25234n.getAdapter();
        c51 c51Var = d51Var.f25236s;
        TLRPC.InputStickerSet inputStickerSet = this.f32842a;
        int i10 = 0;
        if (adapter == c51Var) {
            while (i10 < c51Var.f24896e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c51Var.f24896e.get(i10);
                if (stickerSetCovered.set.f19896id == inputStickerSet.f19889id) {
                    c51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.f2 f2Var = d51Var.v;
        ArrayList arrayList = f2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f19896id == inputStickerSet.f19889id) {
                f2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
