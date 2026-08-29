package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class d3 implements View.OnClickListener {
    public final int f27646a;
    public final org.telegram.ui.ActionBar.f3 f27647b;

    public d3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f27646a = i10;
        this.f27647b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27646a) {
            case 0:
                this.f27647b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f27647b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f27647b.dismiss();
                return;
            default:
                this.f27647b.dismiss();
                return;
        }
    }
}
