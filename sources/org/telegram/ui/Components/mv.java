package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mv extends g.o {
    public final aw f28602c;

    public mv(aw awVar) {
        this.f28602c = awVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        aw awVar = this.f28602c;
        s4.s sVar = awVar.f24733y;
        jv jvVar = awVar.e;
        ei.v vVar = awVar.h;
        if (vVar.getAdapter() != null && vVar.getAdapter().j(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = jvVar.f32488c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (jvVar.f32488c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = jvVar.f32487b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) jvVar.f32487b.get(i11);
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
