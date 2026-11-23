package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pu extends g.p {
    public final bv f38586c;

    public pu(bv bvVar) {
        this.f38586c = bvVar;
    }

    @Override
    public final int i(int i7) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        bv bvVar = this.f38586c;
        v4.t tVar = bvVar.f33827y1;
        nu nuVar = bvVar.f33818p1;
        hi.e0 e0Var = bvVar.f33820r1;
        if (e0Var.getAdapter() != null && e0Var.getAdapter().d(i7) == 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar.f43044c;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i10].size();
                if (nuVar.f43044c.length > 1) {
                    size = Math.min(tVar.J * 2, size);
                }
                i11 += size + 2;
                if (i7 < i11) {
                    break;
                }
                i10++;
            }
            ArrayList arrayList = nuVar.f43043b;
            if (arrayList != null && i10 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.f43043b.get(i10);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return tVar.J;
    }
}
