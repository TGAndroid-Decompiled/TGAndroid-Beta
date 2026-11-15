package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class s31 implements zv0 {
    public final TLRPC.InputStickerSet f39181a;
    public final x31 f39182b;

    public s31(x31 x31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f39182b = x31Var;
        this.f39181a = inputStickerSet;
    }

    @Override
    public final void a() {
        x31 x31Var = this.f39182b;
        v4.h0 adapter = x31Var.f41549n.getAdapter();
        w31 w31Var = x31Var.f41551s;
        TLRPC.InputStickerSet inputStickerSet = this.f39181a;
        int i7 = 0;
        if (adapter == w31Var) {
            while (i7 < w31Var.f41244e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) w31Var.f41244e.get(i7);
                if (stickerSetCovered.set.f28078id == inputStickerSet.f28071id) {
                    w31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = x31Var.f41552w;
        ArrayList arrayList = c2Var.F;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.f28078id == inputStickerSet.f28071id) {
                c2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
