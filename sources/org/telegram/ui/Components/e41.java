package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class e41 implements hw0 {
    public final TLRPC.InputStickerSet f34570a;
    public final j41 f34571b;

    public e41(j41 j41Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f34571b = j41Var;
        this.f34570a = inputStickerSet;
    }

    @Override
    public final void a() {
        j41 j41Var = this.f34571b;
        v4.i0 adapter = j41Var.f36265n.getAdapter();
        i41 i41Var = j41Var.f36267s;
        TLRPC.InputStickerSet inputStickerSet = this.f34570a;
        int i7 = 0;
        if (adapter == i41Var) {
            while (i7 < i41Var.f35906e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) i41Var.f35906e.get(i7);
                if (stickerSetCovered.set.f28519id == inputStickerSet.f28512id) {
                    i41Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.c2 c2Var = j41Var.f36268w;
        ArrayList arrayList = c2Var.F;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.f28519id == inputStickerSet.f28512id) {
                c2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
