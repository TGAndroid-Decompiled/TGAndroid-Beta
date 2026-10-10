package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class g3 implements View.OnClickListener {
    public final int f26587a;
    public final org.telegram.ui.ActionBar.f3 f26588b;

    public g3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f26587a = i10;
        this.f26588b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26587a) {
            case 0:
                this.f26588b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f26588b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f26588b.dismiss();
                return;
            default:
                this.f26588b.dismiss();
                return;
        }
    }
}
