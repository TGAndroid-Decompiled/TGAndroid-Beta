package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class w2 implements View.OnClickListener {
    public final int f39860a;
    public final org.telegram.ui.ActionBar.t2 f39861b;

    public w2(org.telegram.ui.ActionBar.t2 t2Var, int i3) {
        this.f39860a = i3;
        this.f39861b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39860a) {
            case 0:
                this.f39861b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f39861b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f39861b.dismiss();
                return;
            default:
                this.f39861b.dismiss();
                return;
        }
    }
}
