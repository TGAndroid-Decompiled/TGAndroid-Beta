package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ns implements Comparator {
    public final int f48128a;
    public final Object f48129b;

    public ns(Object obj, int i7) {
        this.f48128a = i7;
        this.f48129b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f48128a) {
            case 0:
                return ((Comparator) this.f48129b).compare(((ms) obj).f47869a, ((ms) obj2).f47869a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f48129b;
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
                org.telegram.messenger.fd fdVar = (org.telegram.messenger.fd) this.f48129b;
                org.telegram.messenger.fd fdVar2 = (org.telegram.messenger.fd) obj;
                org.telegram.messenger.fd fdVar3 = (org.telegram.messenger.fd) obj2;
                if (fdVar2 != fdVar) {
                    if (fdVar3 != fdVar) {
                        int i11 = fdVar2.f22404k;
                        int i12 = fdVar3.f22404k;
                        if (i11 == i12) {
                            return fdVar2.f22396a.compareTo(fdVar3.f22396a);
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
                StickersActivity stickersActivity = (StickersActivity) this.f48129b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
