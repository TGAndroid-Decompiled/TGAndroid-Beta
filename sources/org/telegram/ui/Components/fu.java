package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fu extends g.p {
    public final ru f33644c;

    public fu(ru ruVar) {
        this.f33644c = ruVar;
    }

    @Override
    public final int i(int i7) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        ru ruVar = this.f33644c;
        v4.s sVar = ruVar.f37785u1;
        du duVar = ruVar.l1;
        fi.v vVar = ruVar.n1;
        if (vVar.getAdapter() != null && vVar.getAdapter().d(i7) == 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = duVar.f37103c;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i10].size();
                if (duVar.f37103c.length > 1) {
                    size = Math.min(sVar.J * 2, size);
                }
                i11 += size + 2;
                if (i7 < i11) {
                    break;
                }
                i10++;
            }
            ArrayList arrayList = duVar.f37102b;
            if (arrayList != null && i10 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) duVar.f37102b.get(i10);
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
