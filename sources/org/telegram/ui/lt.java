package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class lt implements View.OnClickListener {
    public final int f38086a;
    public final xt f38087b;

    public lt(xt xtVar, int i10) {
        this.f38086a = i10;
        this.f38087b = xtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38086a) {
            case 0:
                xt xtVar = this.f38087b;
                xtVar.K = false;
                xtVar.f41956z.invalidate();
                xtVar.n();
                return;
            case 1:
                xt xtVar2 = this.f38087b;
                Activity activity = xtVar2.f41953w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                xtVar2.K = false;
                xtVar2.f41956z.invalidate();
                xtVar2.n();
                return;
            case 2:
                xt xtVar3 = this.f38087b;
                vt vtVar = xtVar3.f41943l;
                if (vtVar != null) {
                    vtVar.K();
                }
                xtVar3.p();
                return;
            default:
                xt xtVar4 = this.f38087b;
                vt vtVar2 = xtVar4.f41943l;
                if (vtVar2 != null) {
                    vtVar2.r();
                }
                xtVar4.p();
                return;
        }
    }
}
