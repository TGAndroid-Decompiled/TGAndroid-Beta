package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class k30 implements Runnable {
    public final int f27692a;
    public final Context f27693b;

    public k30(Context context, int i10) {
        this.f27692a = i10;
        this.f27693b = context;
    }

    @Override
    public final void run() {
        switch (this.f27692a) {
            case 0:
                i30.j(this.f27693b);
                return;
            case 1:
                pf.d.r(this.f27693b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f27693b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).t0(new PremiumPreviewFragment(0, sg.k0.B1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f27693b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).t0(new PremiumPreviewFragment(0, sg.k0.B1(9)));
                    return;
                }
                return;
        }
    }
}
