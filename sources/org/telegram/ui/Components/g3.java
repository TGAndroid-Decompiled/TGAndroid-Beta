package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class g3 implements View.OnClickListener {
    public final int f28366a;
    public final org.telegram.ui.ActionBar.k3 f28367b;

    public g3(org.telegram.ui.ActionBar.k3 k3Var, int i10) {
        this.f28366a = i10;
        this.f28367b = k3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28366a) {
            case 0:
                this.f28367b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f28367b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f28367b.dismiss();
                return;
            default:
                this.f28367b.dismiss();
                return;
        }
    }
}
