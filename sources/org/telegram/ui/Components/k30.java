package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class k30 implements Runnable {
    public final int f27852a;
    public final Context f27853b;

    public k30(Context context, int i10) {
        this.f27852a = i10;
        this.f27853b = context;
    }

    @Override
    public final void run() {
        switch (this.f27852a) {
            case 0:
                i30.j(this.f27853b);
                return;
            case 1:
                pf.d.r(this.f27853b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f27853b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).u0(new PremiumPreviewFragment(0, sg.j0.E1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f27853b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).u0(new PremiumPreviewFragment(0, sg.j0.E1(9)));
                    return;
                }
                return;
        }
    }
}
