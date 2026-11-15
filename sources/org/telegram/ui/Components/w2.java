package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class w2 implements View.OnClickListener {
    public final int f41229a;
    public final org.telegram.ui.ActionBar.u2 f41230b;

    public w2(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.f41229a = i7;
        this.f41230b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41229a) {
            case 0:
                this.f41230b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f41230b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f41230b.dismiss();
                return;
            default:
                this.f41230b.dismiss();
                return;
        }
    }
}
