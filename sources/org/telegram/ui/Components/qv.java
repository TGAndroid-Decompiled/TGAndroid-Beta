package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qv extends g.o {
    public final ew f28371c;

    public qv(ew ewVar) {
        this.f28371c = ewVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        ew ewVar = this.f28371c;
        s4.s sVar = ewVar.f24504y;
        ov ovVar = ewVar.e;
        di.v vVar = ewVar.h;
        if (vVar.getAdapter() != null && vVar.getAdapter().j(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = ovVar.f23559c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (ovVar.f23559c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = ovVar.f23558b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ovVar.f23558b.get(i11);
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
