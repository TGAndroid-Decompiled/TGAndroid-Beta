package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m31 implements wv0 {
    public final TLRPC.InputStickerSet f35837a;
    public final s31 f35838b;

    public m31(s31 s31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f35838b = s31Var;
        this.f35837a = inputStickerSet;
    }

    @Override
    public final void a() {
        s31 s31Var = this.f35838b;
        v4.g0 adapter = s31Var.f37872n.getAdapter();
        r31 r31Var = s31Var.f37874s;
        TLRPC.InputStickerSet inputStickerSet = this.f35837a;
        int i7 = 0;
        if (adapter == r31Var) {
            while (i7 < r31Var.f37523e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) r31Var.f37523e.get(i7);
                if (stickerSetCovered.set.f26979id == inputStickerSet.f26972id) {
                    r31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.d2 d2Var = s31Var.f37875w;
        ArrayList arrayList = d2Var.E;
        while (i7 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i7);
            if (stickerSetCovered2.set.f26979id == inputStickerSet.f26972id) {
                d2Var.F(stickerSetCovered2, null);
                return;
            }
            i7++;
        }
    }
}
