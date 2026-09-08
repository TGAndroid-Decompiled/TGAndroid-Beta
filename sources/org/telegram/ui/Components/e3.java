package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e3 implements View.OnClickListener {
    public final int f25557a;
    public final org.telegram.ui.ActionBar.f3 f25558b;

    public e3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f25557a = i10;
        this.f25558b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25557a) {
            case 0:
                this.f25558b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f25558b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f25558b.dismiss();
                return;
            default:
                this.f25558b.dismiss();
                return;
        }
    }
}
