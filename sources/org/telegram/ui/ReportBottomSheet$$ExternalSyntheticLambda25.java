package org.telegram.ui;

import android.app.Activity;
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda29;

public final class ReportBottomSheet$$ExternalSyntheticLambda25 implements Runnable {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final Activity f$1;
    public final Theme.ResourcesProvider f$2;
    public final ShareAlert$$ExternalSyntheticLambda29 f$3;

    public ReportBottomSheet$$ExternalSyntheticLambda25(BaseFragment baseFragment, Activity activity, Theme.ResourcesProvider resourcesProvider, ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = activity;
        this.f$2 = resourcesProvider;
        this.f$3 = shareAlert$$ExternalSyntheticLambda29;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BulletinFactory.of(this.f$0).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ActivityCompat$$ExternalSyntheticLambda0(this.f$1, 4), this.f$2)).show();
                AndroidUtilities.runOnUIThread(this.f$3);
                break;
            case 1:
                BulletinFactory.of(this.f$0).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ActivityCompat$$ExternalSyntheticLambda0(this.f$1, 3), this.f$2)).show();
                AndroidUtilities.runOnUIThread(this.f$3);
                break;
            default:
                BulletinFactory.of(this.f$0).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ActivityCompat$$ExternalSyntheticLambda0(this.f$1, 6), this.f$2)).show();
                AndroidUtilities.runOnUIThread(this.f$3);
                break;
        }
    }
}
