package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class l20 implements Runnable {
    public final int f30306a;
    public final Context f30307b;

    public l20(Context context, int i9) {
        this.f30306a = i9;
        this.f30307b = context;
    }

    @Override
    public final void run() {
        switch (this.f30306a) {
            case 0:
                j20.j(this.f30307b);
                return;
            case 1:
                ve.e.s(this.f30307b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f30307b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, zf.j0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f30307b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, zf.j0.A1(9)));
                    return;
                }
                return;
        }
    }
}
