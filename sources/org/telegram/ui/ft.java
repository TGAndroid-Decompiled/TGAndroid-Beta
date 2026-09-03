package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ft implements View.OnClickListener {
    public final int f34220a;
    public final rt f34221b;

    public ft(rt rtVar, int i10) {
        this.f34220a = i10;
        this.f34221b = rtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34220a) {
            case 0:
                rt rtVar = this.f34221b;
                rtVar.K = false;
                rtVar.f38053z.invalidate();
                rtVar.n();
                return;
            case 1:
                rt rtVar2 = this.f34221b;
                Activity activity = rtVar2.f38050w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                rtVar2.K = false;
                rtVar2.f38053z.invalidate();
                rtVar2.n();
                return;
            case 2:
                rt rtVar3 = this.f34221b;
                pt ptVar = rtVar3.f38040l;
                if (ptVar != null) {
                    ptVar.K();
                }
                rtVar3.p();
                return;
            default:
                rt rtVar4 = this.f34221b;
                pt ptVar2 = rtVar4.f38040l;
                if (ptVar2 != null) {
                    ptVar2.r();
                }
                rtVar4.p();
                return;
        }
    }
}
