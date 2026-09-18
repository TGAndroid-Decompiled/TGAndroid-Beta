package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o51 implements fy0 {
    public final TLRPC.InputStickerSet f26865a;
    public final t51 f26866b;

    public o51(t51 t51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f26866b = t51Var;
        this.f26865a = inputStickerSet;
    }

    @Override
    public final void a() {
        t51 t51Var = this.f26866b;
        s4.h0 adapter = t51Var.f28327n.getAdapter();
        s51 s51Var = t51Var.f28329s;
        TLRPC.InputStickerSet inputStickerSet = this.f26865a;
        int i10 = 0;
        if (adapter == s51Var) {
            while (i10 < s51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) s51Var.e.get(i10);
                if (stickerSetCovered.set.f18323id == inputStickerSet.f18316id) {
                    s51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = t51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f18323id == inputStickerSet.f18316id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
