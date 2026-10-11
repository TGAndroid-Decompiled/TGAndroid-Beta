package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class t30 implements Runnable {
    public final int f31046a;
    public final Context f31047b;

    public t30(Context context, int i10) {
        this.f31046a = i10;
        this.f31047b = context;
    }

    @Override
    public final void run() {
        switch (this.f31046a) {
            case 0:
                r30.j(this.f31047b);
                return;
            case 1:
                of.f.s(this.f31047b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f31047b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, rg.j0.B1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f31047b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, rg.j0.B1(9)));
                    return;
                }
                return;
        }
    }
}
