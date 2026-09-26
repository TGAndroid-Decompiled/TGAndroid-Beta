package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m51 implements dy0 {
    public final TLRPC.InputStickerSet f26365a;
    public final r51 f26366b;

    public m51(r51 r51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f26366b = r51Var;
        this.f26365a = inputStickerSet;
    }

    @Override
    public final void a() {
        r51 r51Var = this.f26366b;
        s4.h0 adapter = r51Var.f27875n.getAdapter();
        q51 q51Var = r51Var.f27877s;
        TLRPC.InputStickerSet inputStickerSet = this.f26365a;
        int i10 = 0;
        if (adapter == q51Var) {
            while (i10 < q51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) q51Var.e.get(i10);
                if (stickerSetCovered.set.f18362id == inputStickerSet.f18355id) {
                    q51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.g2 g2Var = r51Var.v;
        ArrayList arrayList = g2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f18362id == inputStickerSet.f18355id) {
                g2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
