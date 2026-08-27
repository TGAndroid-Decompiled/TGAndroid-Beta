package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class e41 implements cx0 {

    public final TLRPC.InputStickerSet f27946a;

    public final j41 f27947b;

    public e41(j41 j41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f27947b = j41Var;
        this.f27946a = inputStickerSet;
    }

    @Override
    public final void a() {
        j41 j41Var = this.f27947b;
        f2.q0 adapter = j41Var.f29585n.getAdapter();
        i41 i41Var = j41Var.f29587s;
        TLRPC.InputStickerSet inputStickerSet = this.f27946a;
        int i10 = 0;
        if (adapter == i41Var) {
            while (i10 < i41Var.f29218e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) i41Var.f29218e.get(i10);
                if (stickerSetCovered.set.f22407id == inputStickerSet.f22400id) {
                    i41Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        pf.l1 l1Var = j41Var.v;
        ArrayList arrayList = l1Var.A;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f22407id == inputStickerSet.f22400id) {
                l1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
