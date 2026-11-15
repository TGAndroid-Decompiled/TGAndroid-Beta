package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class w2 implements View.OnClickListener {
    public final int f41232a;
    public final org.telegram.ui.ActionBar.u2 f41233b;

    public w2(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.f41232a = i7;
        this.f41233b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41232a) {
            case 0:
                this.f41233b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f41233b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f41233b.dismiss();
                return;
            default:
                this.f41233b.dismiss();
                return;
        }
    }
}
