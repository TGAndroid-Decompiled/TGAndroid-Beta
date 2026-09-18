package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a51 implements ux0 {
    public final TLRPC.InputStickerSet f22328a;
    public final f51 f22329b;

    public a51(f51 f51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f22329b = f51Var;
        this.f22328a = inputStickerSet;
    }

    @Override
    public final void a() {
        f51 f51Var = this.f22329b;
        s4.h0 adapter = f51Var.f23785n.getAdapter();
        e51 e51Var = f51Var.f23787s;
        TLRPC.InputStickerSet inputStickerSet = this.f22328a;
        int i10 = 0;
        if (adapter == e51Var) {
            while (i10 < e51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) e51Var.e.get(i10);
                if (stickerSetCovered.set.f18148id == inputStickerSet.f18141id) {
                    e51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = f51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f18148id == inputStickerSet.f18141id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
