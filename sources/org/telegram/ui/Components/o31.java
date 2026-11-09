package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o31 implements xv0 {
    public final TLRPC.InputStickerSet f36614a;
    public final u31 f36615b;

    public o31(u31 u31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f36615b = u31Var;
        this.f36614a = inputStickerSet;
    }

    @Override
    public final void a() {
        u31 u31Var = this.f36615b;
        v4.g0 adapter = u31Var.f38583n.getAdapter();
        t31 t31Var = u31Var.f38585s;
        TLRPC.InputStickerSet inputStickerSet = this.f36614a;
        int i7 = 0;
        if (adapter == t31Var) {
            while (i7 < t31Var.f38264e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) t31Var.f38264e.get(i7);
                if (stickerSetCovered.set.f26983id == inputStickerSet.f26976id) {
                    t31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.d2 d2Var = u31Var.f38586w;
        ArrayList arrayList = d2Var.E;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.f26983id == inputStickerSet.f26976id) {
                d2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
