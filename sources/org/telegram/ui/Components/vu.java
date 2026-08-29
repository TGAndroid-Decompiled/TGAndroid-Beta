package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vu extends f2.v {
    public final jv f34181c;

    public vu(jv jvVar) {
        this.f34181c = jvVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        jv jvVar = this.f34181c;
        f2.w wVar = jvVar.f29832y;
        tu tuVar = jvVar.f29825e;
        nh.v vVar = jvVar.h;
        if (vVar.getAdapter() != null && vVar.getAdapter().j(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = tuVar.f29001c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (tuVar.f29001c.length > 1) {
                    size = Math.min(wVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = tuVar.f29000b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tuVar.f29000b.get(i11);
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
