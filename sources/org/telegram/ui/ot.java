package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ot implements Comparator {
    public final int f40380a;
    public final Object f40381b;

    public ot(Object obj, int i10) {
        this.f40380a = i10;
        this.f40381b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f40380a) {
            case 0:
                return ((Comparator) this.f40381b).compare(((nt) obj).f40047a, ((nt) obj2).f40047a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f40381b;
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
                org.telegram.messenger.zc zcVar = (org.telegram.messenger.zc) this.f40381b;
                org.telegram.messenger.zc zcVar2 = (org.telegram.messenger.zc) obj;
                org.telegram.messenger.zc zcVar3 = (org.telegram.messenger.zc) obj2;
                if (zcVar2 != zcVar) {
                    if (zcVar3 != zcVar) {
                        int i12 = zcVar2.f19502k;
                        int i13 = zcVar3.f19502k;
                        if (i12 == i13) {
                            return zcVar2.f19495a.compareTo(zcVar3.f19495a);
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
                StickersActivity stickersActivity = (StickersActivity) this.f40381b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
