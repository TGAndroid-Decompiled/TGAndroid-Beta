package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class g3 implements View.OnClickListener {
    public final int f28394a;
    public final org.telegram.ui.ActionBar.k3 f28395b;

    public g3(org.telegram.ui.ActionBar.k3 k3Var, int i10) {
        this.f28394a = i10;
        this.f28395b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28394a) {
            case 0:
                this.f28395b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f28395b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f28395b.dismiss();
                return;
            default:
                this.f28395b.dismiss();
                return;
        }
    }
}
