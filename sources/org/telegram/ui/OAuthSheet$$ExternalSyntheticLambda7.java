package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.Theme;

public final class OAuthSheet$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Context f$0;

    public OAuthSheet$$ExternalSyntheticLambda7(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$0(this.f$0);
                break;
            case 1:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 2:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 3:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 4:
                Theme.createChatResources(this.f$0);
                break;
            case 5:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 6:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 7:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 8:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 9:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 10:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            default:
                WebAppDisclaimerAlert.lambda$show$0(this.f$0);
                break;
        }
    }
}
