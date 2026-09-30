package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e3 implements View.OnClickListener {
    public final int f23832a;
    public final org.telegram.ui.ActionBar.e3 f23833b;

    public e3(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f23832a = i10;
        this.f23833b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23832a) {
            case 0:
                this.f23833b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f23833b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f23833b.dismiss();
                return;
            default:
                this.f23833b.dismiss();
                return;
        }
    }
}
