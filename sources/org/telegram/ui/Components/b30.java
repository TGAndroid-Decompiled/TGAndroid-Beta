package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class b30 implements Runnable {
    public final int f24531a;
    public final Context f24532b;

    public b30(Context context, int i10) {
        this.f24531a = i10;
        this.f24532b = context;
    }

    @Override
    public final void run() {
        switch (this.f24531a) {
            case 0:
                z20.j(this.f24532b);
                return;
            case 1:
                of.f.s(this.f24532b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f24532b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, sg.k0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f24532b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, sg.k0.A1(9)));
                    return;
                }
                return;
        }
    }
}
