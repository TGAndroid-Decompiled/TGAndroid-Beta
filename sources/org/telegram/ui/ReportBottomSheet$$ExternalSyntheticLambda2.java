package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.video.VideoAds$$ExternalSyntheticLambda14;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ShareAlert;

public final class ReportBottomSheet$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final VideoAds$$ExternalSyntheticLambda14 f$0;
    public final BulletinFactory f$1;
    public final Context f$2;
    public final ShareAlert.AnonymousClass3 f$3;

    public ReportBottomSheet$$ExternalSyntheticLambda2(VideoAds$$ExternalSyntheticLambda14 videoAds$$ExternalSyntheticLambda14, BulletinFactory bulletinFactory, Context context, ShareAlert.AnonymousClass3 anonymousClass3, int i) {
        this.$r8$classId = i;
        this.f$0 = videoAds$$ExternalSyntheticLambda14;
        this.f$1 = bulletinFactory;
        this.f$2 = context;
        this.f$3 = anonymousClass3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run();
                this.f$1.createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda0(this.f$2, 9), this.f$3)).show();
                break;
            case 1:
                this.f$0.run();
                this.f$1.createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda0(this.f$2, 10), this.f$3)).show();
                break;
            default:
                this.f$0.run();
                this.f$1.createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new OAuthSheet$$ExternalSyntheticLambda0(this.f$2, 11), this.f$3)).show();
                break;
        }
    }
}
