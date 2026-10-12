package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l61 implements bz0 {
    public final TLRPC.InputStickerSet f28045a;
    public final q61 f28046b;

    public l61(q61 q61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f28046b = q61Var;
        this.f28045a = inputStickerSet;
    }

    @Override
    public final void a() {
        q61 q61Var = this.f28046b;
        s4.i0 adapter = q61Var.f29720n.getAdapter();
        p61 p61Var = q61Var.f29722s;
        TLRPC.InputStickerSet inputStickerSet = this.f28045a;
        int i10 = 0;
        if (adapter == p61Var) {
            while (i10 < p61Var.f29431e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p61Var.f29431e.get(i10);
                if (stickerSetCovered.set.f19830id == inputStickerSet.f19823id) {
                    p61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.f2 f2Var = q61Var.v;
        ArrayList arrayList = f2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f19830id == inputStickerSet.f19823id) {
                f2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
