package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ls implements Comparator {
    public final int f47428a;
    public final Object f47429b;

    public ls(Object obj, int i3) {
        this.f47428a = i3;
        this.f47429b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f47428a) {
            case 0:
                return ((Comparator) this.f47429b).compare(((ks) obj).f47004a, ((ks) obj2).f47004a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f47429b;
                int i3 = longSparseIntArray.get(((Long) obj).longValue());
                int i10 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i3 > i10) {
                    return 1;
                }
                if (i3 < i10) {
                    return -1;
                }
                return 0;
            case 2:
                org.telegram.messenger.yc ycVar = (org.telegram.messenger.yc) this.f47429b;
                org.telegram.messenger.yc ycVar2 = (org.telegram.messenger.yc) obj;
                org.telegram.messenger.yc ycVar3 = (org.telegram.messenger.yc) obj2;
                if (ycVar2 != ycVar) {
                    if (ycVar3 != ycVar) {
                        int i11 = ycVar2.f26569k;
                        int i12 = ycVar3.f26569k;
                        if (i11 == i12) {
                            return ycVar2.f26561a.compareTo(ycVar3.f26561a);
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
                StickersActivity stickersActivity = (StickersActivity) this.f47429b;
                int indexOf = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
