package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class at implements View.OnClickListener {
    public final int f32230a;
    public final nt f32231b;

    public at(nt ntVar, int i10) {
        this.f32230a = i10;
        this.f32231b = ntVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32230a) {
            case 0:
                nt ntVar = this.f32231b;
                ntVar.K = false;
                ntVar.f35998z.invalidate();
                ntVar.n();
                return;
            case 1:
                nt ntVar2 = this.f32231b;
                Activity activity = ntVar2.f35995w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ntVar2.K = false;
                ntVar2.f35998z.invalidate();
                ntVar2.n();
                return;
            case 2:
                nt ntVar3 = this.f32231b;
                lt ltVar = ntVar3.f35985l;
                if (ltVar != null) {
                    ltVar.K();
                }
                ntVar3.p();
                return;
            default:
                nt ntVar4 = this.f32231b;
                lt ltVar2 = ntVar4.f35985l;
                if (ltVar2 != null) {
                    ltVar2.s();
                }
                ntVar4.p();
                return;
        }
    }
}
