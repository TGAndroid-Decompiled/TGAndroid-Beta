package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class a3 implements View.OnClickListener {
    public final int f23303a;
    public final org.telegram.ui.ActionBar.g3 f23304b;

    public a3(org.telegram.ui.ActionBar.g3 g3Var, int i10) {
        this.f23303a = i10;
        this.f23304b = g3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23303a) {
            case 0:
                this.f23304b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f23304b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f23304b.dismiss();
                return;
            default:
                this.f23304b.dismiss();
                return;
        }
    }
}
