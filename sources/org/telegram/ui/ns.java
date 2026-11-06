package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ns implements Comparator {
    public final int f48129a;
    public final Object f48130b;

    public ns(Object obj, int i7) {
        this.f48129a = i7;
        this.f48130b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f48129a) {
            case 0:
                return ((Comparator) this.f48130b).compare(((ms) obj).f47870a, ((ms) obj2).f47870a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f48130b;
                int i7 = longSparseIntArray.get(((Long) obj).longValue());
                int i10 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i7 > i10) {
                    return 1;
                }
                if (i7 < i10) {
                    return -1;
                }
                return 0;
            case 2:
                org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) this.f48130b;
                org.telegram.messenger.ed edVar2 = (org.telegram.messenger.ed) obj;
                org.telegram.messenger.ed edVar3 = (org.telegram.messenger.ed) obj2;
                if (edVar2 != edVar) {
                    if (edVar3 != edVar) {
                        int i11 = edVar2.f22182k;
                        int i12 = edVar3.f22182k;
                        if (i11 == i12) {
                            return edVar2.f22174a.compareTo(edVar3.f22174a);
                        }
                        if (i11 <= i12) {
                            if (i11 >= i12) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f48130b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
