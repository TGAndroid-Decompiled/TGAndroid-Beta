package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class t30 implements Runnable {
    public final int f30966a;
    public final Context f30967b;

    public t30(Context context, int i10) {
        this.f30966a = i10;
        this.f30967b = context;
    }

    @Override
    public final void run() {
        switch (this.f30966a) {
            case 0:
                r30.j(this.f30967b);
                return;
            case 1:
                of.f.s(this.f30967b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f30967b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, rg.j0.B1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f30967b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, rg.j0.B1(9)));
                    return;
                }
                return;
        }
    }
}
