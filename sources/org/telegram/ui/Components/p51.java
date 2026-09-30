package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p51 implements gy0 {
    public final TLRPC.InputStickerSet f27246a;
    public final u51 f27247b;

    public p51(u51 u51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f27247b = u51Var;
        this.f27246a = inputStickerSet;
    }

    @Override
    public final void a() {
        u51 u51Var = this.f27247b;
        s4.h0 adapter = u51Var.f28767n.getAdapter();
        t51 t51Var = u51Var.f28769s;
        TLRPC.InputStickerSet inputStickerSet = this.f27246a;
        int i10 = 0;
        if (adapter == t51Var) {
            while (i10 < t51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) t51Var.e.get(i10);
                if (stickerSetCovered.set.f18379id == inputStickerSet.f18372id) {
                    t51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = u51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f18379id == inputStickerSet.f18372id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
