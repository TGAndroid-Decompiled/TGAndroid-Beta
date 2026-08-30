package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yu extends f2.v {
    public final mv f31100c;

    public yu(mv mvVar) {
        this.f31100c = mvVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        mv mvVar = this.f31100c;
        f2.w wVar = mvVar.f27131y;
        wu wuVar = mvVar.e;
        org.telegram.ui.k3 k3Var = mvVar.h;
        if (k3Var.getAdapter() != null && k3Var.getAdapter().j(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = wuVar.f26050c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (wuVar.f26050c.length > 1) {
                    size = Math.min(wVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = wuVar.f26049b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) wuVar.f26049b.get(i11);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return wVar.J;
    }
}
