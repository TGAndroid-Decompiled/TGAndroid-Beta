package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class a3 implements View.OnClickListener {
    public final int f23275a;
    public final org.telegram.ui.ActionBar.g3 f23276b;

    public a3(org.telegram.ui.ActionBar.g3 g3Var, int i10) {
        this.f23275a = i10;
        this.f23276b = g3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23275a) {
            case 0:
                this.f23276b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f23276b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f23276b.dismiss();
                return;
            default:
                this.f23276b.dismiss();
                return;
        }
    }
}
