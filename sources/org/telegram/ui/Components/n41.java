package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n41 implements lx0 {
    public final TLRPC.InputStickerSet f30843a;
    public final s41 f30844b;

    public n41(s41 s41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f30844b = s41Var;
        this.f30843a = inputStickerSet;
    }

    @Override
    public final void a() {
        s41 s41Var = this.f30844b;
        f2.p0 adapter = s41Var.f32485n.getAdapter();
        r41 r41Var = s41Var.f32487s;
        TLRPC.InputStickerSet inputStickerSet = this.f30843a;
        int i10 = 0;
        if (adapter == r41Var) {
            while (i10 < r41Var.f32172e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) r41Var.f32172e.get(i10);
                if (stickerSetCovered.set.f22419id == inputStickerSet.f22412id) {
                    r41Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        rf.m1 m1Var = s41Var.v;
        ArrayList arrayList = m1Var.A;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f22419id == inputStickerSet.f22412id) {
                m1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
