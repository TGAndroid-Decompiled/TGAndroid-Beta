package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import androidx.profileinstaller.Encoding;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.browser.Browser;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Stars.ExplainStarsSheet;

public final class OAuthSheet$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Context f$0;

    public OAuthSheet$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Activity activityFindActivity = AndroidUtilities.findActivity(this.f$0);
                if (activityFindActivity == null) {
                    activityFindActivity = LaunchActivity.instance;
                }
                if (activityFindActivity != null && !activityFindActivity.isFinishing()) {
                    activityFindActivity.moveTaskToBack(true);
                    break;
                }
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new OAuthSheet$$ExternalSyntheticLambda0(this.f$0, 2));
                break;
            case 2:
                Encoding.writeProfile(this.f$0, new LinkManager$$ExternalSyntheticLambda9(1), Encoding.EMPTY_DIAGNOSTICS, false);
                break;
            case 3:
                GroupCallPip.updateVisibility(this.f$0);
                break;
            case 4:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 5:
                Activity activityFindActivity2 = AndroidUtilities.findActivity(this.f$0);
                if (activityFindActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activityFindActivity2).presentFragment(new PremiumPreviewFragment(0, LimitReachedBottomSheet.limitTypeToServerString(9)));
                }
                break;
            case 6:
                Activity activityFindActivity3 = AndroidUtilities.findActivity(this.f$0);
                if (activityFindActivity3 instanceof LaunchActivity) {
                    ((LaunchActivity) activityFindActivity3).presentFragment(new PremiumPreviewFragment(0, LimitReachedBottomSheet.limitTypeToServerString(10)));
                }
                break;
            case 7:
                Theme.createChatResources(this.f$0);
                break;
            case 8:
                new ExplainStarsSheet(this.f$0).show();
                break;
            case 9:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 10:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 11:
                Browser.openUrl(this.f$0, "https://promote.telegram.org/guidelines");
                break;
            case 12:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 13:
                new ExplainStarsSheet(this.f$0).show();
                break;
            case 14:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 15:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 16:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.PaidContentInfoLink));
                break;
            case 17:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsSubscribeInfoLink));
                break;
            case 18:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.StarsReactionTermsLink));
                break;
            case 19:
                new ExplainStarsSheet(this.f$0).show();
                break;
            case 20:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.WebAppDisclaimerUrl));
                break;
            default:
                Browser.openUrl(this.f$0, LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfoLink));
                break;
        }
    }
}
