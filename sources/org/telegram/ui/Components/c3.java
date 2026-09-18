package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class c3 implements View.OnClickListener {
    public final int f22920a;
    public final org.telegram.ui.ActionBar.g3 f22921b;

    public c3(org.telegram.ui.ActionBar.g3 g3Var, int i10) {
        this.f22920a = i10;
        this.f22921b = g3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f22920a) {
            case 0:
                this.f22921b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f22921b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f22921b.dismiss();
                return;
            default:
                this.f22921b.dismiss();
                return;
        }
    }
}
