package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class p51 implements gy0 {
    public final TLRPC.InputStickerSet f27265a;
    public final u51 f27266b;

    public p51(u51 u51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f27266b = u51Var;
        this.f27265a = inputStickerSet;
    }

    @Override
    public final void a() {
        u51 u51Var = this.f27266b;
        s4.h0 adapter = u51Var.f28671n.getAdapter();
        t51 t51Var = u51Var.f28673s;
        TLRPC.InputStickerSet inputStickerSet = this.f27265a;
        int i10 = 0;
        if (adapter == t51Var) {
            while (i10 < t51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) t51Var.e.get(i10);
                if (stickerSetCovered.set.f18370id == inputStickerSet.f18363id) {
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
            if (stickerSetCovered2.set.f18370id == inputStickerSet.f18363id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
