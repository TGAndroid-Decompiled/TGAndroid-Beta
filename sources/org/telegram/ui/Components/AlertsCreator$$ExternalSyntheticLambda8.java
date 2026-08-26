package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CacheControlActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;

public final class AlertsCreator$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final long f$1;
    public final long f$2;
    public final Utilities.Callback f$3;
    public final long f$4;

    public AlertsCreator$$ExternalSyntheticLambda8(int i, long j, long j2, Utilities.Callback callback, long j3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = callback;
        this.f$4 = j3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Utilities.Callback callback = this.f$3;
                long j = this.f$4;
                int i = this.f$0;
                AlertsCreator$$ExternalSyntheticLambda8 alertsCreator$$ExternalSyntheticLambda8 = new AlertsCreator$$ExternalSyntheticLambda8(i, this.f$1, this.f$2, callback, j, 1);
                if (!StarsController.getInstance(i, false).balanceLoaded) {
                    StarsController starsController = StarsController.getInstance(i, false);
                    starsController.balanceLoaded = false;
                    starsController.getBalance(false, true, alertsCreator$$ExternalSyntheticLambda8);
                    starsController.balanceLoaded = true;
                } else {
                    alertsCreator$$ExternalSyntheticLambda8.run();
                }
                break;
            default:
                int i2 = this.f$0;
                long j2 = StarsController.getInstance(i2, false).getBalance().amount;
                Utilities.Callback callback2 = this.f$3;
                long j3 = this.f$1;
                long j4 = this.f$4;
                if (j2 >= j3) {
                    callback2.run(Long.valueOf(j4));
                    break;
                } else {
                    Activity activity = AndroidUtilities.getActivity();
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    Theme.ResourcesProvider darkThemeResourceProvider = (PhotoViewer.getInstance().isVisible() || (safeLastFragment != null && safeLastFragment.hasShownSheet())) ? new DarkThemeResourceProvider() : safeLastFragment != null ? safeLastFragment.getResourceProvider() : null;
                    if (activity != null) {
                        long j5 = this.f$2;
                        new StarsIntroActivity.StarsNeededSheet(activity, darkThemeResourceProvider, j3, 13, DialogObject.getShortName(i2, j5), new CacheControlActivity$$ExternalSyntheticLambda9(j4, 1, callback2), j5).show();
                        break;
                    }
                }
                break;
        }
    }
}
