package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k61 implements az0 {
    public final TLRPC.InputStickerSet f29820a;
    public final p61 f29821b;

    public k61(p61 p61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f29821b = p61Var;
        this.f29820a = inputStickerSet;
    }

    @Override
    public final void a() {
        p61 p61Var = this.f29821b;
        s4.h0 adapter = p61Var.f31453n.getAdapter();
        o61 o61Var = p61Var.f31455s;
        TLRPC.InputStickerSet inputStickerSet = this.f29820a;
        int i10 = 0;
        if (adapter == o61Var) {
            while (i10 < o61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) o61Var.e.get(i10);
                if (stickerSetCovered.set.f22054id == inputStickerSet.f22047id) {
                    o61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        ig.d2 d2Var = p61Var.v;
        ArrayList arrayList = d2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f22054id == inputStickerSet.f22047id) {
                d2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
