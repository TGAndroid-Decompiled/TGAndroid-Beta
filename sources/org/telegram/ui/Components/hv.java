package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hv extends g.p {
    public final vv f24945c;

    public hv(vv vvVar) {
        this.f24945c = vvVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        vv vvVar = this.f24945c;
        s4.s sVar = vvVar.f29733y;
        fv fvVar = vvVar.e;
        ci.v vVar = vvVar.h;
        if (vVar.getAdapter() != null && vVar.getAdapter().j(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = fvVar.f28354c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (fvVar.f28354c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = fvVar.f28353b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) fvVar.f28353b.get(i11);
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
