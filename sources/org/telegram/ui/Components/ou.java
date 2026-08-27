package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class ou extends f2.w {

    public final cv f31409c;

    public ou(cv cvVar) {
        this.f31409c = cvVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.StickerSet stickerSet;
        cv cvVar = this.f31409c;
        f2.x xVar = cvVar.f27556y;
        mu muVar = cvVar.f27549e;
        lh.w wVar = cvVar.h;
        if (wVar.getAdapter() == null || wVar.getAdapter().j(i10) != 1) {
            return xVar.J;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = muVar.f35361c;
            if (i11 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i11].size();
            if (muVar.f35361c.length > 1) {
                size = Math.min(xVar.J * 2, size);
            }
            i12 += size + 2;
            if (i10 < i12) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = muVar.f35360b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i11 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) muVar.f35360b.get(i11);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
