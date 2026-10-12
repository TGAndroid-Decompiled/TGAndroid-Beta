package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class g3 implements View.OnClickListener {
    public final int f25169a;
    public final org.telegram.ui.ActionBar.e3 f25170b;

    public g3(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f25169a = i10;
        this.f25170b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25169a) {
            case 0:
                this.f25170b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f25170b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f25170b.dismiss();
                return;
            default:
                this.f25170b.dismiss();
                return;
        }
    }
}
