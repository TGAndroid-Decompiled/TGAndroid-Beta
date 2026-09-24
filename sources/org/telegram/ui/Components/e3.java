package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e3 implements View.OnClickListener {
    public final int f23790a;
    public final org.telegram.ui.ActionBar.e3 f23791b;

    public e3(org.telegram.ui.ActionBar.e3 e3Var, int i10) {
        this.f23790a = i10;
        this.f23791b = e3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23790a) {
            case 0:
                this.f23791b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f23791b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f23791b.dismiss();
                return;
            default:
                this.f23791b.dismiss();
                return;
        }
    }
}
