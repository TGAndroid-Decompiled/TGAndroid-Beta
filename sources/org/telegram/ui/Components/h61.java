package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class h61 implements wy0 {
    public final TLRPC.InputStickerSet f26985a;
    public final m61 f26986b;

    public h61(m61 m61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f26986b = m61Var;
        this.f26985a = inputStickerSet;
    }

    @Override
    public final void a() {
        m61 m61Var = this.f26986b;
        s4.i0 adapter = m61Var.f28761n.getAdapter();
        l61 l61Var = m61Var.f28763s;
        TLRPC.InputStickerSet inputStickerSet = this.f26985a;
        int i10 = 0;
        if (adapter == l61Var) {
            while (i10 < l61Var.f28212e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) l61Var.f28212e.get(i10);
                if (stickerSetCovered.set.f20095id == inputStickerSet.f20088id) {
                    l61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        gg.f2 f2Var = m61Var.v;
        ArrayList arrayList = f2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20095id == inputStickerSet.f20088id) {
                f2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
