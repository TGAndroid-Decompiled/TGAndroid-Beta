package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f41 implements iw0 {
    public final TLRPC.InputStickerSet f35087a;
    public final k41 f35088b;

    public f41(k41 k41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f35088b = k41Var;
        this.f35087a = inputStickerSet;
    }

    @Override
    public final void a() {
        k41 k41Var = this.f35088b;
        v4.i0 adapter = k41Var.f36770n.getAdapter();
        j41 j41Var = k41Var.f36772s;
        TLRPC.InputStickerSet inputStickerSet = this.f35087a;
        int i7 = 0;
        if (adapter == j41Var) {
            while (i7 < j41Var.f36400e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) j41Var.f36400e.get(i7);
                if (stickerSetCovered.set.f28458id == inputStickerSet.f28451id) {
                    j41Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = k41Var.f36773w;
        ArrayList arrayList = c2Var.F;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.f28458id == inputStickerSet.f28451id) {
                c2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
