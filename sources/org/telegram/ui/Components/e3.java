package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e3 implements View.OnClickListener {
    public final int f25900a;
    public final org.telegram.ui.ActionBar.f3 f25901b;

    public e3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f25900a = i10;
        this.f25901b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25900a) {
            case 0:
                this.f25901b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f25901b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f25901b.dismiss();
                return;
            default:
                this.f25901b.dismiss();
                return;
        }
    }
}
