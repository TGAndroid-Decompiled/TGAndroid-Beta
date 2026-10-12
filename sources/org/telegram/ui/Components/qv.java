package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qv extends g.o {
    public final ew f28685c;

    public qv(ew ewVar) {
        this.f28685c = ewVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        ew ewVar = this.f28685c;
        s4.s sVar = ewVar.f24810y;
        ov ovVar = ewVar.e;
        di.v vVar = ewVar.h;
        if (vVar.getAdapter() != null && vVar.getAdapter().j(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = ovVar.f23864c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (ovVar.f23864c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = ovVar.f23863b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ovVar.f23863b.get(i11);
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
