package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n31 implements wv0 {
    public final TLRPC.InputStickerSet f36192a;
    public final t31 f36193b;

    public n31(t31 t31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f36193b = t31Var;
        this.f36192a = inputStickerSet;
    }

    @Override
    public final void a() {
        t31 t31Var = this.f36193b;
        v4.g0 adapter = t31Var.f38201n.getAdapter();
        s31 s31Var = t31Var.f38203s;
        TLRPC.InputStickerSet inputStickerSet = this.f36192a;
        int i7 = 0;
        if (adapter == s31Var) {
            while (i7 < s31Var.f37869e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) s31Var.f37869e.get(i7);
                if (stickerSetCovered.set.f26980id == inputStickerSet.f26973id) {
                    s31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.d2 d2Var = t31Var.f38204w;
        ArrayList arrayList = d2Var.E;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.f26980id == inputStickerSet.f26973id) {
                d2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
