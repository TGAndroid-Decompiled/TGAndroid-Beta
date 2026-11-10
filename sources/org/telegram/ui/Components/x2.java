package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class x2 implements View.OnClickListener {
    public final int f40134a;
    public final org.telegram.ui.ActionBar.w2 f40135b;

    public x2(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f40134a = i7;
        this.f40135b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40134a) {
            case 0:
                this.f40135b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f40135b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f40135b.dismiss();
                return;
            default:
                this.f40135b.dismiss();
                return;
        }
    }
}
