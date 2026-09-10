package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class l30 implements Runnable {
    public final int f24861a;
    public final Context f24862b;

    public l30(Context context, int i10) {
        this.f24861a = i10;
        this.f24862b = context;
    }

    @Override
    public final void run() {
        switch (this.f24861a) {
            case 0:
                j30.j(this.f24862b);
                return;
            case 1:
                nf.f.s(this.f24862b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f24862b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, qg.k0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f24862b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, qg.k0.A1(9)));
                    return;
                }
                return;
        }
    }
}
