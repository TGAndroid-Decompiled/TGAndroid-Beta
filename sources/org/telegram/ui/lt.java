package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class lt implements View.OnClickListener {
    public final int f37821a;
    public final xt f37822b;

    public lt(xt xtVar, int i10) {
        this.f37821a = i10;
        this.f37822b = xtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37821a) {
            case 0:
                xt xtVar = this.f37822b;
                xtVar.K = false;
                xtVar.f41660z.invalidate();
                xtVar.n();
                return;
            case 1:
                xt xtVar2 = this.f37822b;
                Activity activity = xtVar2.f41657w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                xtVar2.K = false;
                xtVar2.f41660z.invalidate();
                xtVar2.n();
                return;
            case 2:
                xt xtVar3 = this.f37822b;
                vt vtVar = xtVar3.f41647l;
                if (vtVar != null) {
                    vtVar.K();
                }
                xtVar3.p();
                return;
            default:
                xt xtVar4 = this.f37822b;
                vt vtVar2 = xtVar4.f41647l;
                if (vtVar2 != null) {
                    vtVar2.r();
                }
                xtVar4.p();
                return;
        }
    }
}
