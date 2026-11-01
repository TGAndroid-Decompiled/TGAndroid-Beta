package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class y2 implements View.OnClickListener {
    public final int f32699a;
    public final org.telegram.ui.ActionBar.z2 f32700b;

    public y2(org.telegram.ui.ActionBar.z2 z2Var, int i10) {
        this.f32699a = i10;
        this.f32700b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32699a) {
            case 0:
                this.f32700b.dismiss();
                return;
            case 1:
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(new PremiumPreviewFragment(0, "contact"));
                    this.f32700b.dismiss();
                    return;
                }
                return;
            case 2:
                this.f32700b.dismiss();
                return;
            default:
                this.f32700b.dismiss();
                return;
        }
    }
}
