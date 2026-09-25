package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class c30 implements Runnable {
    public final int f23173a;
    public final Context f23174b;

    public c30(Context context, int i10) {
        this.f23173a = i10;
        this.f23174b = context;
    }

    @Override
    public final void run() {
        switch (this.f23173a) {
            case 0:
                a30.j(this.f23174b);
                return;
            case 1:
                nf.f.s(this.f23174b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f23174b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, rg.j0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f23174b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, rg.j0.A1(9)));
                    return;
                }
                return;
        }
    }
}
