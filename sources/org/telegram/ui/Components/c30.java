package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class c30 implements Runnable {
    public final int f23828a;
    public final Context f23829b;

    public c30(Context context, int i10) {
        this.f23828a = i10;
        this.f23829b = context;
    }

    @Override
    public final void run() {
        switch (this.f23828a) {
            case 0:
                a30.j(this.f23829b);
                return;
            case 1:
                af.g.s(this.f23829b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f23829b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, eg.v0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f23829b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, eg.v0.A1(9)));
                    return;
                }
                return;
        }
    }
}
