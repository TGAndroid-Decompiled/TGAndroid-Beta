package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class c3 implements View.OnClickListener {
    public final int f22941a;
    public final org.telegram.ui.ActionBar.f3 f22942b;

    public c3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f22941a = i10;
        this.f22942b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22941a) {
            case 0:
                this.f22942b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f22942b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f22942b.dismiss();
                return;
            default:
                this.f22942b.dismiss();
                return;
        }
    }
}
