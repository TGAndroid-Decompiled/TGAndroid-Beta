package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class f30 implements Runnable {
    public final int f26258a;
    public final Context f26259b;

    public f30(Context context, int i10) {
        this.f26258a = i10;
        this.f26259b = context;
    }

    @Override
    public final void run() {
        switch (this.f26258a) {
            case 0:
                d30.j(this.f26259b);
                return;
            case 1:
                nf.f.s(this.f26259b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f26259b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, rg.k0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f26259b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, rg.k0.A1(9)));
                    return;
                }
                return;
        }
    }
}
