package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l61 implements bz0 {
    public final TLRPC.InputStickerSet f28060a;
    public final q61 f28061b;

    public l61(q61 q61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f28061b = q61Var;
        this.f28060a = inputStickerSet;
    }

    @Override
    public final void a() {
        q61 q61Var = this.f28061b;
        s4.i0 adapter = q61Var.f29742n.getAdapter();
        p61 p61Var = q61Var.f29744s;
        TLRPC.InputStickerSet inputStickerSet = this.f28060a;
        int i10 = 0;
        if (adapter == p61Var) {
            while (i10 < p61Var.f29428e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) p61Var.f29428e.get(i10);
                if (stickerSetCovered.set.f19829id == inputStickerSet.f19822id) {
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
            if (stickerSetCovered2.set.f19829id == inputStickerSet.f19822id) {
                f2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
