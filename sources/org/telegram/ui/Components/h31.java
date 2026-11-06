package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h31 implements wv0 {
    public final TLRPC.InputStickerSet f34207a;
    public final n31 f34208b;

    public h31(n31 n31Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f34208b = n31Var;
        this.f34207a = inputStickerSet;
    }

    @Override
    public final void a() {
        n31 n31Var = this.f34208b;
        v4.g0 adapter = n31Var.f36236n.getAdapter();
        m31 m31Var = n31Var.f36238s;
        TLRPC.InputStickerSet inputStickerSet = this.f34207a;
        int i7 = 0;
        if (adapter == m31Var) {
            while (i7 < m31Var.f35860e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) m31Var.f35860e.get(i7);
                if (stickerSetCovered.set.f26979id == inputStickerSet.f26972id) {
                    m31Var.F(stickerSetCovered, null);
                    return;
                }
                i7++;
            }
            return;
        }
        jg.d2 d2Var = n31Var.f36239w;
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
