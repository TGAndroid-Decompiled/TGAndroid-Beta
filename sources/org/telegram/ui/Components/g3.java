package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class g3 implements View.OnClickListener {
    public final int f26240a;
    public final org.telegram.ui.ActionBar.e3 f26241b;

    public g3(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f26240a = i10;
        this.f26241b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26240a) {
            case 0:
                this.f26241b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f26241b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f26241b.dismiss();
                return;
            default:
                this.f26241b.dismiss();
                return;
        }
    }
}
