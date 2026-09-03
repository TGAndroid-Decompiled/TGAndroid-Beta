package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class d30 implements Runnable {
    public final int f24138a;
    public final Context f24139b;

    public d30(Context context, int i10) {
        this.f24138a = i10;
        this.f24139b = context;
    }

    @Override
    public final void run() {
        switch (this.f24138a) {
            case 0:
                b30.j(this.f24139b);
                return;
            case 1:
                ze.d.s(this.f24139b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f24139b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, eg.v0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f24139b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, eg.v0.A1(9)));
                    return;
                }
                return;
        }
    }
}
