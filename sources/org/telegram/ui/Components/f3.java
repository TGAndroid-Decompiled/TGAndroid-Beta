package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class f3 implements View.OnClickListener {
    public final int f26065a;
    public final org.telegram.ui.ActionBar.f3 f26066b;

    public f3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f26065a = i10;
        this.f26066b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26065a) {
            case 0:
                this.f26066b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f26066b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f26066b.dismiss();
                return;
            default:
                this.f26066b.dismiss();
                return;
        }
    }
}
