package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a51 implements wx0 {
    public final TLRPC.InputStickerSet f25162a;
    public final f51 f25163b;

    public a51(f51 f51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f25163b = f51Var;
        this.f25162a = inputStickerSet;
    }

    @Override
    public final void a() {
        f51 f51Var = this.f25163b;
        f2.p0 adapter = f51Var.f26762n.getAdapter();
        e51 e51Var = f51Var.f26764s;
        TLRPC.InputStickerSet inputStickerSet = this.f25162a;
        int i10 = 0;
        if (adapter == e51Var) {
            while (i10 < e51Var.f26437e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) e51Var.f26437e.get(i10);
                if (stickerSetCovered.set.f20870id == inputStickerSet.f20863id) {
                    e51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        uf.m1 m1Var = f51Var.v;
        ArrayList arrayList = m1Var.B;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f20870id == inputStickerSet.f20863id) {
                m1Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
