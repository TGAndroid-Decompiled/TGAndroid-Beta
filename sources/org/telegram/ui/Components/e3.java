package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e3 implements View.OnClickListener {
    public final int f34555a;
    public final org.telegram.ui.ActionBar.w2 f34556b;

    public e3(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f34555a = i7;
        this.f34556b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34555a) {
            case 0:
                this.f34556b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f34556b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f34556b.dismiss();
                return;
            default:
                this.f34556b.dismiss();
                return;
        }
    }
}
