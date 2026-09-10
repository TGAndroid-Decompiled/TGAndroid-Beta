package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.TranslateController;
public final class zk implements Comparator {
    public final int f17187a;
    public final Object f17188b;

    public zk(Object obj, int i10) {
        this.f17187a = i10;
        this.f17188b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$getMusicDialogsSortedByVisibleOrder$1;
        int lambda$getLocales$3;
        int lambda$getLanguages$1;
        switch (this.f17187a) {
            case 0:
                lambda$getMusicDialogsSortedByVisibleOrder$1 = TelegramMediaSession.lambda$getMusicDialogsSortedByVisibleOrder$1((HashMap) this.f17188b, (Long) obj, (Long) obj2);
                return lambda$getMusicDialogsSortedByVisibleOrder$1;
            case 1:
                lambda$getLocales$3 = TranslateController.lambda$getLocales$3((LocaleController.LocaleInfo) this.f17188b, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
                return lambda$getLocales$3;
            default:
                lambda$getLanguages$1 = TranslateController.lambda$getLanguages$1((Collator) this.f17188b, (TranslateController.Language) obj, (TranslateController.Language) obj2);
                return lambda$getLanguages$1;
        }
    }
}
