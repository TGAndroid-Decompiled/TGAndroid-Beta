package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class av extends f2.v {
    public final ov f25375c;

    public av(ov ovVar) {
        this.f25375c = ovVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        ov ovVar = this.f25375c;
        f2.w wVar = ovVar.f29907y;
        yu yuVar = ovVar.f29900e;
        org.telegram.ui.k3 k3Var = ovVar.h;
        if (k3Var.getAdapter() != null && k3Var.getAdapter().j(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = yuVar.f28884c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (yuVar.f28884c.length > 1) {
                    size = Math.min(wVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = yuVar.f28883b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) yuVar.f28883b.get(i11);
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
