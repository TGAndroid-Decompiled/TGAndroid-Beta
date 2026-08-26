package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

public final class StickersActivity$$ExternalSyntheticLambda10 implements Comparator {
    public final int $r8$classId;
    public final Object f$0;

    public StickersActivity$$ExternalSyntheticLambda10(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((StickersActivity) this.f$0).lambda$whenReordered$4((TLRPC.TL_messages_stickerSet) obj, (TLRPC.TL_messages_stickerSet) obj2);
            case 1:
                return CountrySelectActivity.CountryAdapter.lambda$new$0((Comparator) this.f$0, (CountrySelectActivity.Country) obj, (CountrySelectActivity.Country) obj2);
            case 2:
                return FilterCreateActivity.lambda$saveFilterToServer$25((LongSparseIntArray) this.f$0, (Long) obj, (Long) obj2);
            case 3:
                return LanguageSelectActivity.lambda$fillLanguages$8((LocaleController.LocaleInfo) this.f$0, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
            default:
                return ((ProfileActivity.SearchAdapter) this.f$0).lambda$updateSearchArray$0(obj, obj2);
        }
    }
}
