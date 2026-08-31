package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class a3 implements View.OnClickListener {
    public final int f25142a;
    public final org.telegram.ui.ActionBar.h3 f25143b;

    public a3(org.telegram.ui.ActionBar.h3 h3Var, int i10) {
        this.f25142a = i10;
        this.f25143b = h3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25142a) {
            case 0:
                this.f25143b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f25143b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f25143b.dismiss();
                return;
            default:
                this.f25143b.dismiss();
                return;
        }
    }
}
