package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d61 implements ry0 {
    public final TLRPC.InputStickerSet f25510a;
    public final i61 f25511b;

    public d61(i61 i61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f25511b = i61Var;
        this.f25510a = inputStickerSet;
    }

    @Override
    public final void a() {
        i61 i61Var = this.f25511b;
        s4.g0 adapter = i61Var.f27223n.getAdapter();
        h61 h61Var = i61Var.f27225s;
        TLRPC.InputStickerSet inputStickerSet = this.f25510a;
        int i10 = 0;
        if (adapter == h61Var) {
            while (i10 < h61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) h61Var.e.get(i10);
                if (stickerSetCovered.set.f20370id == inputStickerSet.f20363id) {
                    h61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = i61Var.v;
        ArrayList arrayList = e2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20370id == inputStickerSet.f20363id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
