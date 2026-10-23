package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e3 implements View.OnClickListener {
    public final int f25810a;
    public final org.telegram.ui.ActionBar.h3 f25811b;

    public e3(org.telegram.ui.ActionBar.h3 h3Var, int i10) {
        this.f25810a = i10;
        this.f25811b = h3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25810a) {
            case 0:
                this.f25811b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f25811b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f25811b.dismiss();
                return;
            default:
                this.f25811b.dismiss();
                return;
        }
    }
}
