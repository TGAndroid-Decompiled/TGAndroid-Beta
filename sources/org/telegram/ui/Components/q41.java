package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q41 implements ax0 {
    public final TLRPC.InputStickerSet f29531a;
    public final w41 f29532b;

    public q41(w41 w41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f29532b = w41Var;
        this.f29531a = inputStickerSet;
    }

    @Override
    public final void a() {
        w41 w41Var = this.f29532b;
        s4.g0 adapter = w41Var.f31999n.getAdapter();
        v41 v41Var = w41Var.f32001s;
        TLRPC.InputStickerSet inputStickerSet = this.f29531a;
        int i10 = 0;
        if (adapter == v41Var) {
            while (i10 < v41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) v41Var.e.get(i10);
                if (stickerSetCovered.set.f19820id == inputStickerSet.f19813id) {
                    v41Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        zf.o1 o1Var = w41Var.f32002w;
        ArrayList arrayList = o1Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f19820id == inputStickerSet.f19813id) {
                o1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
