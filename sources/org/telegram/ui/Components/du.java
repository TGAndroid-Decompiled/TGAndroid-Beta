package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class du extends g.p {
    public final pu f33192c;

    public du(pu puVar) {
        this.f33192c = puVar;
    }

    @Override
    public final int i(int i3) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        pu puVar = this.f33192c;
        u4.s sVar = puVar.f37250v1;
        bu buVar = puVar.m1;
        gi.v vVar = puVar.f37243o1;
        if (vVar.getAdapter() != null && vVar.getAdapter().d(i3) == 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = buVar.f36623c;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i10].size();
                if (buVar.f36623c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                i11 += size + 2;
                if (i3 < i11) {
                    break;
                }
                i10++;
            }
            ArrayList arrayList = buVar.f36622b;
            if (arrayList != null && i10 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) buVar.f36622b.get(i10);
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
