package org.telegram.ui;

import java.util.HashMap;
import org.telegram.messenger.LocaleController;

public final class LaunchActivity$$ExternalSyntheticLambda43 implements Runnable {
    public final int $r8$classId;
    public final LaunchActivity f$0;
    public final HashMap f$1;
    public final LocaleController.LocaleInfo[] f$2;
    public final String f$3;

    public LaunchActivity$$ExternalSyntheticLambda43(LaunchActivity launchActivity, HashMap map, LocaleController.LocaleInfo[] localeInfoArr, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
        this.f$1 = map;
        this.f$2 = localeInfoArr;
        this.f$3 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showLanguageAlert$175(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$showLanguageAlert$173(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
