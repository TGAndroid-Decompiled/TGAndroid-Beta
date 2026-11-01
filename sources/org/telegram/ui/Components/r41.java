package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class r41 implements bx0 {
    public final TLRPC.InputStickerSet f29889a;
    public final x41 f29890b;

    public r41(x41 x41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f29890b = x41Var;
        this.f29889a = inputStickerSet;
    }

    @Override
    public final void a() {
        x41 x41Var = this.f29890b;
        s4.g0 adapter = x41Var.f32415n.getAdapter();
        w41 w41Var = x41Var.f32417s;
        TLRPC.InputStickerSet inputStickerSet = this.f29889a;
        int i10 = 0;
        if (adapter == w41Var) {
            while (i10 < w41Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) w41Var.e.get(i10);
                if (stickerSetCovered.set.f19821id == inputStickerSet.f19814id) {
                    w41Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        zf.o1 o1Var = x41Var.f32418w;
        ArrayList arrayList = o1Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f19821id == inputStickerSet.f19814id) {
                o1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
