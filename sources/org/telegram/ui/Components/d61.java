package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d61 implements sy0 {
    public final TLRPC.InputStickerSet f23997a;
    public final i61 f23998b;

    public d61(i61 i61Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f23998b = i61Var;
        this.f23997a = inputStickerSet;
    }

    @Override
    public final void a() {
        i61 i61Var = this.f23998b;
        s4.g0 adapter = i61Var.f25565n.getAdapter();
        h61 h61Var = i61Var.f25567s;
        TLRPC.InputStickerSet inputStickerSet = this.f23997a;
        int i10 = 0;
        if (adapter == h61Var) {
            while (i10 < h61Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) h61Var.e.get(i10);
                if (stickerSetCovered.set.f18943id == inputStickerSet.f18936id) {
                    h61Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        hg.e2 e2Var = i61Var.v;
        ArrayList arrayList = e2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f18943id == inputStickerSet.f18936id) {
                e2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
