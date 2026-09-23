package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class c30 implements Runnable {
    public final int f22903a;
    public final Context f22904b;

    public c30(Context context, int i10) {
        this.f22903a = i10;
        this.f22904b = context;
    }

    @Override
    public final void run() {
        switch (this.f22903a) {
            case 0:
                a30.j(this.f22904b);
                return;
            case 1:
                nf.f.s(this.f22904b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f22904b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, rg.j0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f22904b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, rg.j0.A1(9)));
                    return;
                }
                return;
        }
    }
}
