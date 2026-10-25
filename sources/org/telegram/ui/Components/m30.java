package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class m30 implements Runnable {
    public final int f30372a;
    public final Context f30373b;

    public m30(Context context, int i10) {
        this.f30372a = i10;
        this.f30373b = context;
    }

    @Override
    public final void run() {
        switch (this.f30372a) {
            case 0:
                k30.j(this.f30373b);
                return;
            case 1:
                qf.d.r(this.f30373b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f30373b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).u0(new PremiumPreviewFragment(0, tg.j0.E1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f30373b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).u0(new PremiumPreviewFragment(0, tg.j0.E1(9)));
                    return;
                }
                return;
        }
    }
}
