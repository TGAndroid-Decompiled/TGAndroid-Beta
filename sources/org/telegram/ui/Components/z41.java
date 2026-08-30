package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class z41 implements vx0 {
    public final TLRPC.InputStickerSet f31237a;
    public final e51 f31238b;

    public z41(e51 e51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f31238b = e51Var;
        this.f31237a = inputStickerSet;
    }

    @Override
    public final void a() {
        e51 e51Var = this.f31238b;
        f2.o0 adapter = e51Var.f24470n.getAdapter();
        d51 d51Var = e51Var.f24472s;
        TLRPC.InputStickerSet inputStickerSet = this.f31237a;
        int i10 = 0;
        if (adapter == d51Var) {
            while (i10 < d51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) d51Var.e.get(i10);
                if (stickerSetCovered.set.f19211id == inputStickerSet.f19204id) {
                    d51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        tf.m1 m1Var = e51Var.v;
        ArrayList arrayList = m1Var.B;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f19211id == inputStickerSet.f19204id) {
                m1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
