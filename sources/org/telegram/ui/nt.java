package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class nt implements Comparator {
    public final int f39972a;
    public final Object f39973b;

    public nt(Object obj, int i10) {
        this.f39972a = i10;
        this.f39973b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f39972a) {
            case 0:
                return ((Comparator) this.f39973b).compare(((mt) obj).f39611a, ((mt) obj2).f39611a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f39973b;
                int i10 = longSparseIntArray.get(((Long) obj).longValue());
                int i11 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i10 > i11) {
                    return 1;
                }
                if (i10 < i11) {
                    return -1;
                }
                return 0;
            case 2:
                org.telegram.messenger.ad adVar = (org.telegram.messenger.ad) this.f39973b;
                org.telegram.messenger.ad adVar2 = (org.telegram.messenger.ad) obj;
                org.telegram.messenger.ad adVar3 = (org.telegram.messenger.ad) obj2;
                if (adVar2 != adVar) {
                    if (adVar3 != adVar) {
                        int i12 = adVar2.f14598k;
                        int i13 = adVar3.f14598k;
                        if (i12 == i13) {
                            return adVar2.f14591a.compareTo(adVar3.f14591a);
                        }
                        if (i12 <= i13) {
                            if (i12 >= i13) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f39973b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
