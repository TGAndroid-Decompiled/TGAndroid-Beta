package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c61 implements qy0 {
    public final TLRPC.InputStickerSet f25235a;
    public final h61 f25236b;

    public c61(h61 h61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f25236b = h61Var;
        this.f25235a = inputStickerSet;
    }

    @Override
    public final void a() {
        h61 h61Var = this.f25236b;
        s4.g0 adapter = h61Var.f26882n.getAdapter();
        g61 g61Var = h61Var.f26884s;
        TLRPC.InputStickerSet inputStickerSet = this.f25235a;
        int i10 = 0;
        if (adapter == g61Var) {
            while (i10 < g61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) g61Var.e.get(i10);
                if (stickerSetCovered.set.f20371id == inputStickerSet.f20364id) {
                    g61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = h61Var.v;
        ArrayList arrayList = e2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20371id == inputStickerSet.f20364id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
