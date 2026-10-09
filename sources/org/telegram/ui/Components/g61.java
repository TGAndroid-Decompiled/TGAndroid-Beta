package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class g61 implements vy0 {
    public final TLRPC.InputStickerSet f26609a;
    public final l61 f26610b;

    public g61(l61 l61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f26610b = l61Var;
        this.f26609a = inputStickerSet;
    }

    @Override
    public final void a() {
        l61 l61Var = this.f26610b;
        s4.i0 adapter = l61Var.f28308n.getAdapter();
        k61 k61Var = l61Var.f28310s;
        TLRPC.InputStickerSet inputStickerSet = this.f26609a;
        int i10 = 0;
        if (adapter == k61Var) {
            while (i10 < k61Var.f27856e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) k61Var.f27856e.get(i10);
                if (stickerSetCovered.set.f20065id == inputStickerSet.f20058id) {
                    k61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.f2 f2Var = l61Var.v;
        ArrayList arrayList = f2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20065id == inputStickerSet.f20058id) {
                f2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
