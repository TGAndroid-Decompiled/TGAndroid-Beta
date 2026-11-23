package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f41 implements iw0 {
    public final TLRPC.InputStickerSet f35089a;
    public final k41 f35090b;

    public f41(k41 k41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f35090b = k41Var;
        this.f35089a = inputStickerSet;
    }

    @Override
    public final void a() {
        k41 k41Var = this.f35090b;
        v4.i0 adapter = k41Var.f36772n.getAdapter();
        j41 j41Var = k41Var.f36774s;
        TLRPC.InputStickerSet inputStickerSet = this.f35089a;
        int i7 = 0;
        if (adapter == j41Var) {
            while (i7 < j41Var.f36394e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) j41Var.f36394e.get(i7);
                if (stickerSetCovered.set.f28461id == inputStickerSet.f28454id) {
                    j41Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = k41Var.f36775w;
        ArrayList arrayList = c2Var.F;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.f28461id == inputStickerSet.f28454id) {
                c2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
