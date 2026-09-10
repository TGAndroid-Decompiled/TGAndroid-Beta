package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.support.LongSparseIntArray;
public final class yg implements Comparator {
    public final int f17081a;
    public final LongSparseIntArray f17082b;

    public yg(LongSparseIntArray longSparseIntArray, int i10) {
        this.f17081a = i10;
        this.f17082b = longSparseIntArray;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$checkLoadedRemoteFilters$68;
        int lambda$resetDialogs$94;
        Long l4 = (Long) obj;
        Long l10 = (Long) obj2;
        switch (this.f17081a) {
            case 0:
                lambda$checkLoadedRemoteFilters$68 = MessagesStorage.lambda$checkLoadedRemoteFilters$68(this.f17082b, l4, l10);
                return lambda$checkLoadedRemoteFilters$68;
            default:
                lambda$resetDialogs$94 = MessagesStorage.lambda$resetDialogs$94(this.f17082b, l4, l10);
                return lambda$resetDialogs$94;
        }
    }
}
