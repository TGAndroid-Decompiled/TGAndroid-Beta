package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class mt implements Comparator {
    public final int f40516a;
    public final Object f40517b;

    public mt(Object obj, int i9) {
        this.f40516a = i9;
        this.f40517b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f40516a) {
            case 0:
                return ((Comparator) this.f40517b).compare(((lt) obj).f40225a, ((lt) obj2).f40225a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f40517b;
                int i9 = longSparseIntArray.get(((Long) obj).longValue());
                int i10 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i9 > i10) {
                    return 1;
                }
                if (i9 < i10) {
                    return -1;
                }
                return 0;
            case 2:
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.f40517b;
                LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) obj;
                LocaleController.LocaleInfo localeInfo3 = (LocaleController.LocaleInfo) obj2;
                if (localeInfo2 != localeInfo) {
                    if (localeInfo3 != localeInfo) {
                        int i11 = localeInfo2.serverIndex;
                        int i12 = localeInfo3.serverIndex;
                        if (i11 == i12) {
                            return localeInfo2.name.compareTo(localeInfo3.name);
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
                StickersActivity stickersActivity = (StickersActivity) this.f40517b;
                int indexOf = stickersActivity.f36189e.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.f36189e.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf >= 0 && indexOf2 >= 0) {
                    return indexOf - indexOf2;
                }
                return 0;
        }
    }
}
