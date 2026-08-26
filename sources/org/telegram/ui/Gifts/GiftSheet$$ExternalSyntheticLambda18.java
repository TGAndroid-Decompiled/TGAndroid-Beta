package org.telegram.ui.Gifts;

import android.content.Context;
import androidx.credentials.CredentialManager$$ExternalSyntheticLambda0;
import androidx.profileinstaller.Encoding;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.Stars.ExplainStarsSheet;

public final class GiftSheet$$ExternalSyntheticLambda18 implements Runnable {
    public final int $r8$classId;
    public final Context f$0;

    public GiftSheet$$ExternalSyntheticLambda18(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                new ExplainStarsSheet(this.f$0).show();
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new GiftSheet$$ExternalSyntheticLambda18(this.f$0, 2));
                break;
            case 2:
                Encoding.writeProfile(this.f$0, new CredentialManager$$ExternalSyntheticLambda0(), Encoding.EMPTY_DIAGNOSTICS, false);
                break;
            case 3:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 4:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 5:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 6:
                new ExplainStarsSheet(this.f$0).show();
                break;
            case 7:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            case 8:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 9:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 10:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
            case 11:
                new ExplainStarsSheet(this.f$0).show();
                break;
            default:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
        }
    }
}
