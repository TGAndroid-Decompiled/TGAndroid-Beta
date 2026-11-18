package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class kd implements Runnable {
    public final int f36739a;
    public final org.telegram.ui.ActionBar.h2 f36740b;

    public kd(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f36739a = i7;
        this.f36740b = h2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f36739a;
        org.telegram.ui.ActionBar.h2 h2Var = this.f36740b;
        switch (i7) {
            case 0:
                int i10 = ChatActivityEnterView.f32538n7;
                if (h2Var != null) {
                    new ug.z0(h2Var, 11, false).show();
                    return;
                } else if (h2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) h2Var.getContext()).t0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                h2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                h2Var.presentFragment(themeActivity);
                return;
        }
    }
}
