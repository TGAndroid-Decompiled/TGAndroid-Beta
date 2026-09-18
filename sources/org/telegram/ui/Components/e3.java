package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class e3 implements View.OnClickListener {
    public final int f23769a;
    public final org.telegram.ui.ActionBar.f3 f23770b;

    public e3(org.telegram.ui.ActionBar.f3 f3Var, int i10) {
        this.f23769a = i10;
        this.f23770b = f3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23769a) {
            case 0:
                this.f23770b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f23770b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f23770b.dismiss();
                return;
            default:
                this.f23770b.dismiss();
                return;
        }
    }
}
