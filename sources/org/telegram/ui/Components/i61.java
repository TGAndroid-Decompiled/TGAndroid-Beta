package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i61 implements xy0 {
    public final TLRPC.InputStickerSet f27199a;
    public final n61 f27200b;

    public i61(n61 n61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f27200b = n61Var;
        this.f27199a = inputStickerSet;
    }

    @Override
    public final void a() {
        n61 n61Var = this.f27200b;
        s4.i0 adapter = n61Var.f28981n.getAdapter();
        m61 m61Var = n61Var.f28983s;
        TLRPC.InputStickerSet inputStickerSet = this.f27199a;
        int i10 = 0;
        if (adapter == m61Var) {
            while (i10 < m61Var.f28572e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) m61Var.f28572e.get(i10);
                if (stickerSetCovered.set.f20059id == inputStickerSet.f20052id) {
                    m61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.f2 f2Var = n61Var.v;
        ArrayList arrayList = f2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20059id == inputStickerSet.f20052id) {
                f2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
