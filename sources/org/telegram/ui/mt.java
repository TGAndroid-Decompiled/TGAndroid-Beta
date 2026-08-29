package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class mt implements Comparator {
    public final int f40633a;
    public final Object f40634b;

    public mt(Object obj, int i10) {
        this.f40633a = i10;
        this.f40634b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f40633a) {
            case 0:
                return ((Comparator) this.f40634b).compare(((lt) obj).f40272a, ((lt) obj2).f40272a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f40634b;
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
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.f40634b;
                LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) obj;
                LocaleController.LocaleInfo localeInfo3 = (LocaleController.LocaleInfo) obj2;
                if (localeInfo2 != localeInfo) {
                    if (localeInfo3 != localeInfo) {
                        int i12 = localeInfo2.serverIndex;
                        int i13 = localeInfo3.serverIndex;
                        if (i12 == i13) {
                            return localeInfo2.name.compareTo(localeInfo3.name);
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
                StickersActivity stickersActivity = (StickersActivity) this.f40634b;
                int indexOf = stickersActivity.f36254e.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.f36254e.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
