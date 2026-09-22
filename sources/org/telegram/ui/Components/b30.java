package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class b30 implements Runnable {
    public final int f22824a;
    public final Context f22825b;

    public b30(Context context, int i10) {
        this.f22824a = i10;
        this.f22825b = context;
    }

    @Override
    public final void run() {
        switch (this.f22824a) {
            case 0:
                z20.j(this.f22825b);
                return;
            case 1:
                nf.f.s(this.f22825b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f22825b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, rg.j0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f22825b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, rg.j0.A1(9)));
                    return;
                }
                return;
        }
    }
}
