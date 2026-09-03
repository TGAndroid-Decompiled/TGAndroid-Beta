package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xu extends f2.v {
    public final lv f30716c;

    public xu(lv lvVar) {
        this.f30716c = lvVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        lv lvVar = this.f30716c;
        f2.w wVar = lvVar.f26886y;
        vu vuVar = lvVar.e;
        org.telegram.ui.m3 m3Var = lvVar.h;
        if (m3Var.getAdapter() != null && m3Var.getAdapter().j(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = vuVar.f25776c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (vuVar.f25776c.length > 1) {
                    size = Math.min(wVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = vuVar.f25775b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) vuVar.f25775b.get(i11);
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
