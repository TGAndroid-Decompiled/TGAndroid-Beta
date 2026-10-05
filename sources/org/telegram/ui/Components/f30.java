package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class f30 implements Runnable {
    public final int f26306a;
    public final Context f26307b;

    public f30(Context context, int i10) {
        this.f26306a = i10;
        this.f26307b = context;
    }

    @Override
    public final void run() {
        switch (this.f26306a) {
            case 0:
                d30.j(this.f26307b);
                return;
            case 1:
                nf.f.s(this.f26307b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f26307b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, rg.k0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f26307b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, rg.k0.A1(9)));
                    return;
                }
                return;
        }
    }
}
