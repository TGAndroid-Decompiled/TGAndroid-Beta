package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e3 implements View.OnClickListener {
    public final int f34588a;
    public final org.telegram.ui.ActionBar.x2 f34589b;

    public e3(org.telegram.ui.ActionBar.x2 x2Var, int i7) {
        this.f34588a = i7;
        this.f34589b = x2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34588a) {
            case 0:
                this.f34589b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f34589b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f34589b.dismiss();
                return;
            default:
                this.f34589b.dismiss();
                return;
        }
    }
}
