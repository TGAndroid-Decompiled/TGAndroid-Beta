package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class su extends g.p {
    public final ev f39690c;

    public su(ev evVar) {
        this.f39690c = evVar;
    }

    @Override
    public final int i(int i7) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        ev evVar = this.f39690c;
        v4.t tVar = evVar.f35001y1;
        qu quVar = evVar.f34992p1;
        hi.x xVar = evVar.f34994r1;
        if (xVar.getAdapter() != null && xVar.getAdapter().d(i7) == 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = quVar.f34305c;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i10].size();
                if (quVar.f34305c.length > 1) {
                    size = Math.min(tVar.J * 2, size);
                }
                i11 += size + 2;
                if (i7 < i11) {
                    break;
                }
                i10++;
            }
            ArrayList arrayList = quVar.f34304b;
            if (arrayList != null && i10 < arrayList.size()) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) quVar.f34304b.get(i10);
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && !stickerSet.emojis) {
                return 8;
            }
            return 5;
        }
        return tVar.J;
    }
}
