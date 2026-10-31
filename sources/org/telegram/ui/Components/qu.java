package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qu extends g.o {
    public final cv f29751c;

    public qu(cv cvVar) {
        this.f29751c = cvVar;
    }

    @Override
    public final int i(int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        cv cvVar = this.f29751c;
        s4.r rVar = cvVar.f25172u1;
        ou ouVar = cvVar.l1;
        org.telegram.ui.g3 g3Var = cvVar.f25165n1;
        if (g3Var.getAdapter() != null && g3Var.getAdapter().d(i10) == 1) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = ouVar.f24466c;
                if (i11 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i11].size();
                if (ouVar.f24466c.length > 1) {
                    size = Math.min(rVar.J * 2, size);
                }
                i12 += size + 2;
                if (i10 < i12) {
                    break;
                }
                i11++;
            }
            ArrayList arrayList = ouVar.f24465b;
            if (arrayList != null && i11 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) ouVar.f24465b.get(i11);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return rVar.J;
    }
}
