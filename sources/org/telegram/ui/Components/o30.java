package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class o30 implements Runnable {
    public final int f27821a;
    public final Context f27822b;

    public o30(Context context, int i10) {
        this.f27821a = i10;
        this.f27822b = context;
    }

    @Override
    public final void run() {
        switch (this.f27821a) {
            case 0:
                m30.j(this.f27822b);
                return;
            case 1:
                pf.d.s(this.f27822b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f27822b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, sg.j0.B1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f27822b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, sg.j0.B1(9)));
                    return;
                }
                return;
        }
    }
}
