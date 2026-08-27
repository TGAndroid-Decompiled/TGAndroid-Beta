package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

public final class ot implements Comparator {

    public final int f41163a;

    public final Object f41164b;

    public ot(Object obj, int i10) {
        this.f41163a = i10;
        this.f41164b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f41163a) {
            case 0:
                return ((Comparator) this.f41164b).compare(((nt) obj).f40915a, ((nt) obj2).f40915a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.f41164b;
                int i10 = longSparseIntArray.get(((Long) obj).longValue());
                int i11 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i10 > i11) {
                    return 1;
                }
                return i10 < i11 ? -1 : 0;
            case 2:
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.f41164b;
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
                StickersActivity stickersActivity = (StickersActivity) this.f41164b;
                int iIndexOf = stickersActivity.f36192e.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int iIndexOf2 = stickersActivity.f36192e.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (iIndexOf < 0 || iIndexOf2 < 0) {
                    return 0;
                }
                return iIndexOf - iIndexOf2;
        }
    }
}
