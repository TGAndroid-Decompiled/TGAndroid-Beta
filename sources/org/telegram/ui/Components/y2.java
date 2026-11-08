package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class y2 implements View.OnClickListener {
    public final int f40536a;
    public final org.telegram.ui.ActionBar.v2 f40537b;

    public y2(org.telegram.ui.ActionBar.v2 v2Var, int i7) {
        this.f40536a = i7;
        this.f40537b = v2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40536a) {
            case 0:
                this.f40537b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f40537b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f40537b.dismiss();
                return;
            default:
                this.f40537b.dismiss();
                return;
        }
    }
}
