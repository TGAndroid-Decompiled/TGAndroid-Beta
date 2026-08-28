package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pu extends f2.x {
    public final dv f31761c;

    public pu(dv dvVar) {
        this.f31761c = dvVar;
    }

    @Override
    public final int i(int i9) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        dv dvVar = this.f31761c;
        f2.y yVar = dvVar.f27823y;
        nu nuVar = dvVar.f27816e;
        kh.w wVar = dvVar.h;
        if (wVar.getAdapter() != null && wVar.getAdapter().j(i9) == 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar.f26910c;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i10].size();
                if (nuVar.f26910c.length > 1) {
                    size = Math.min(yVar.J * 2, size);
                }
                i11 += size + 2;
                if (i9 < i11) {
                    break;
                }
                i10++;
            }
            ArrayList arrayList = nuVar.f26909b;
            if (arrayList != null && i10 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) nuVar.f26909b.get(i10);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return yVar.J;
    }
}
