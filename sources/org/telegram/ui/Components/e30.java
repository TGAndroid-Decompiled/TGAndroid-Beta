package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e30 implements Runnable {
    public final int f26430a;
    public final Context f26431b;

    public e30(Context context, int i10) {
        this.f26430a = i10;
        this.f26431b = context;
    }

    @Override
    public final void run() {
        switch (this.f26430a) {
            case 0:
                c30.j(this.f26431b);
                return;
            case 1:
                af.g.s(this.f26431b, LocaleController.getString(R.string.StarsTOSLink));
                return;
            case 2:
                Activity findActivity = AndroidUtilities.findActivity(this.f26431b);
                if (findActivity instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity).p0(new PremiumPreviewFragment(0, fg.v0.A1(10)));
                    return;
                }
                return;
            default:
                Activity findActivity2 = AndroidUtilities.findActivity(this.f26431b);
                if (findActivity2 instanceof LaunchActivity) {
                    ((LaunchActivity) findActivity2).p0(new PremiumPreviewFragment(0, fg.v0.A1(9)));
                    return;
                }
                return;
        }
    }
}
