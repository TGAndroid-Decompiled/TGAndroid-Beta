package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class f3 implements View.OnClickListener {
    public final int f35043a;
    public final org.telegram.ui.ActionBar.w2 f35044b;

    public f3(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f35043a = i7;
        this.f35044b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35043a) {
            case 0:
                this.f35044b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f35044b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f35044b.dismiss();
                return;
            default:
                this.f35044b.dismiss();
                return;
        }
    }
}
