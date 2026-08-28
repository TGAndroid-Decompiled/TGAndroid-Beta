package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
public final class id implements Runnable {
    public final int f29416a;
    public final org.telegram.ui.ActionBar.o2 f29417b;

    public id(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f29416a = i9;
        this.f29417b = o2Var;
    }

    @Override
    public final void run() {
        int i9 = this.f29416a;
        org.telegram.ui.ActionBar.o2 o2Var = this.f29417b;
        switch (i9) {
            case 0:
                int i10 = ChatActivityEnterView.f26074i5;
                if (o2Var != null) {
                    new zf.x0(o2Var, 11, false).show();
                    return;
                } else if (o2Var.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) o2Var.getContext()).p0(new PremiumPreviewFragment(0, null));
                    return;
                } else {
                    return;
                }
            case 1:
                o2Var.presentFragment(new StickersActivity(0, null));
                return;
            default:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.P0 = true;
                o2Var.presentFragment(themeActivity);
                return;
        }
    }
}
