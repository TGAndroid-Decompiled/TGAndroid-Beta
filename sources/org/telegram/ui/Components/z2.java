package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class z2 implements View.OnClickListener {
    public final int f35165a;
    public final org.telegram.ui.ActionBar.f3 f35166b;

    public z2(org.telegram.ui.ActionBar.f3 f3Var, int i9) {
        this.f35165a = i9;
        this.f35166b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35165a) {
            case 0:
                this.f35166b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f35166b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f35166b.dismiss();
                return;
            default:
                this.f35166b.dismiss();
                return;
        }
    }
}
