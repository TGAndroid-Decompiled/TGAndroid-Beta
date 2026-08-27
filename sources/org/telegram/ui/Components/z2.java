package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

public final class z2 implements View.OnClickListener {

    public final int f35133a;

    public final org.telegram.ui.ActionBar.e3 f35134b;

    public z2(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f35133a = i10;
        this.f35134b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35133a) {
            case 0:
                this.f35134b.dismiss();
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                if (n2VarR != null) {
                    n2VarR.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f35134b.dismiss();
                }
                break;
            case 2:
                this.f35134b.dismiss();
                break;
            default:
                this.f35134b.dismiss();
                break;
        }
    }
}
