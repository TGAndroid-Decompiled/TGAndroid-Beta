package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class y20 implements Runnable {
    public final int f34902a;
    public final Context f34903b;

    public y20(Context context, int i10) {
        this.f34902a = i10;
        this.f34903b = context;
    }

    @Override
    public final void run() {
        switch (this.f34902a) {
            case 0:
                w20.j(this.f34903b);
                return;
            case 1:
                ye.d.s(this.f34903b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f34903b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, cg.v0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f34903b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, cg.v0.A1(9)));
                    return;
                }
                return;
        }
    }
}
