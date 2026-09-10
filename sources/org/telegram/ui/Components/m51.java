package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m51 implements fy0 {
    public final TLRPC.InputStickerSet f25164a;
    public final r51 f25165b;

    public m51(r51 r51Var, TLRPC.InputStickerSet inputStickerSet) {
        this.f25165b = r51Var;
        this.f25164a = inputStickerSet;
    }

    @Override
    public final void a() {
        r51 r51Var = this.f25165b;
        s4.h0 adapter = r51Var.f26593n.getAdapter();
        q51 q51Var = r51Var.f26595s;
        TLRPC.InputStickerSet inputStickerSet = this.f25164a;
        int i10 = 0;
        if (adapter == q51Var) {
            while (i10 < q51Var.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) q51Var.e.get(i10);
                if (stickerSetCovered.set.f17222id == inputStickerSet.f17215id) {
                    q51Var.F(stickerSetCovered, null);
                    return;
                }
                i10++;
            }
            return;
        }
        fg.h2 h2Var = r51Var.v;
        ArrayList arrayList = h2Var.E;
        while (i10 < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i10);
            if (stickerSetCovered2.set.f17222id == inputStickerSet.f17215id) {
                h2Var.F(stickerSetCovered2, null);
                return;
            }
            i10++;
        }
    }
}
