package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y41 implements vx0 {
    public final TLRPC.InputStickerSet f33320a;
    public final d51 f33321b;

    public y41(d51 d51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f33321b = d51Var;
        this.f33320a = inputStickerSet;
    }

    @Override
    public final void a() {
        d51 d51Var = this.f33321b;
        f2.p0 adapter = d51Var.f26191n.getAdapter();
        c51 c51Var = d51Var.f26193s;
        TLRPC.InputStickerSet inputStickerSet = this.f33320a;
        int i10 = 0;
        if (adapter == c51Var) {
            while (i10 < c51Var.f25774e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c51Var.f25774e.get(i10);
                if (stickerSetCovered.set.f20872id == inputStickerSet.f20865id) {
                    c51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        uf.m1 m1Var = d51Var.v;
        ArrayList arrayList = m1Var.B;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20872id == inputStickerSet.f20865id) {
                m1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
