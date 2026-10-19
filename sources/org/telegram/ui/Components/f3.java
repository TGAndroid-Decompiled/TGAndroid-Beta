package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class f3 implements View.OnClickListener {
    public final int f26092a;
    public final org.telegram.ui.ActionBar.f3 f26093b;

    public f3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f26092a = i10;
        this.f26093b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26092a) {
            case 0:
                this.f26093b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f26093b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f26093b.dismiss();
                return;
            default:
                this.f26093b.dismiss();
                return;
        }
    }
}
