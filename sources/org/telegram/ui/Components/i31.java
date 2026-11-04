package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i31 implements vv0 {
    public final TLRPC.InputStickerSet f34583a;
    public final n31 f34584b;

    public i31(n31 n31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f34584b = n31Var;
        this.f34583a = inputStickerSet;
    }

    @Override
    public final void a() {
        n31 n31Var = this.f34584b;
        u4.h0 adapter = n31Var.f36359n.getAdapter();
        m31 m31Var = n31Var.f36361s;
        TLRPC.InputStickerSet inputStickerSet = this.f34583a;
        int i3 = 0;
        if (adapter == m31Var) {
            while (i3 < m31Var.f35990e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) m31Var.f35990e.get(i3);
                if (stickerSetCovered.set.f27028id == inputStickerSet.f27021id) {
                    m31Var.F(stickerSetCovered, null);
                    return;
                }
                i3++;
            }
            return;
        }
        kg.y1 y1Var = n31Var.f36362w;
        ArrayList arrayList = y1Var.F;
        while (i3 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i3);
            if (stickerSetCovered2.set.f27028id == inputStickerSet.f27021id) {
                y1Var.F(stickerSetCovered2, null);
                return;
            }
            i3++;
        }
    }
}
