package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ku extends g.p {
    public final wu f36615c;

    public ku(wu wuVar) {
        this.f36615c = wuVar;
    }

    @Override
    public final int i(int i7) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        wu wuVar = this.f36615c;
        v4.s sVar = wuVar.f41460y1;
        iu iuVar = wuVar.f41451p1;
        hi.v vVar = wuVar.f41453r1;
        if (vVar.getAdapter() != null && vVar.getAdapter().d(i7) == 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = iuVar.f40162c;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i10].size();
                if (iuVar.f40162c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                i11 += size + 2;
                if (i7 < i11) {
                    break;
                }
                i10++;
            }
            ArrayList arrayList = iuVar.f40161b;
            if (arrayList != null && i10 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) iuVar.f40161b.get(i10);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return sVar.J;
    }
}
