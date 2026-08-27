package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

public final class p20 implements Runnable {

    public final int f31483a;

    public final Context f31484b;

    public p20(Context context, int i10) {
        this.f31483a = i10;
        this.f31484b = context;
    }

    @Override
    public final void run() {
        switch (this.f31483a) {
            case 0:
                n20.j(this.f31484b);
                break;
            case 1:
                we.e.s(this.f31484b, LocaleController.getString(R.string.StarsTOSLink));
                break;
            case 2:
                Activity activityFindActivity = AndroidUtilities.findActivity(this.f31484b);
                if (activityFindActivity instanceof LaunchActivity) {
                    ((LaunchActivity) activityFindActivity).p0(new PremiumPreviewFragment(0, ag.i1.A1(10)));
                }
                break;
            default:
                Activity activityFindActivity2 = AndroidUtilities.findActivity(this.f31484b);
                if (activityFindActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) activityFindActivity2).p0(new PremiumPreviewFragment(0, ag.i1.A1(9)));
                }
                break;
        }
    }
}
