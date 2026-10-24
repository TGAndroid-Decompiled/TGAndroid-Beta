package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class i30 implements Runnable {
    public final int f27265a;
    public final Context f27266b;

    public i30(Context context, int i10) {
        this.f27265a = i10;
        this.f27266b = context;
    }

    @Override
    public final void run() {
        switch (this.f27265a) {
            case 0:
                g30.j(this.f27266b);
                return;
            case 1:
                pf.d.r(this.f27266b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f27266b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).u0(new PremiumPreviewFragment(0, sg.j0.E1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f27266b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).u0(new PremiumPreviewFragment(0, sg.j0.E1(9)));
                    return;
                }
                return;
        }
    }
}
