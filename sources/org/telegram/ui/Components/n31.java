package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n31 implements wv0 {
    public final TLRPC.InputStickerSet f36208a;
    public final t31 f36209b;

    public n31(t31 t31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f36209b = t31Var;
        this.f36208a = inputStickerSet;
    }

    @Override
    public final void a() {
        t31 t31Var = this.f36209b;
        v4.g0 adapter = t31Var.f38229n.getAdapter();
        s31 s31Var = t31Var.f38231s;
        TLRPC.InputStickerSet inputStickerSet = this.f36208a;
        int i7 = 0;
        if (adapter == s31Var) {
            while (i7 < s31Var.f37885e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) s31Var.f37885e.get(i7);
                if (stickerSetCovered.set.f26983id == inputStickerSet.f26976id) {
                    s31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.d2 d2Var = t31Var.f38232w;
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
