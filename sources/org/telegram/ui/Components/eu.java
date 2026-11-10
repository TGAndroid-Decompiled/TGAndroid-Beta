package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class eu extends g.p {
    public final qu f33333c;

    public eu(qu quVar) {
        this.f33333c = quVar;
    }

    @Override
    public final int i(int i7) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        qu quVar = this.f33333c;
        v4.s sVar = quVar.f37406x1;
        cu cuVar = quVar.f37397o1;
        fi.v vVar = quVar.f37399q1;
        if (vVar.getAdapter() != null && vVar.getAdapter().d(i7) == 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = cuVar.f36691c;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i10].size();
                if (cuVar.f36691c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                i11 += size + 2;
                if (i7 < i11) {
                    break;
                }
                i10++;
            }
            ArrayList arrayList = cuVar.f36690b;
            if (arrayList != null && i10 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) cuVar.f36690b.get(i10);
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
