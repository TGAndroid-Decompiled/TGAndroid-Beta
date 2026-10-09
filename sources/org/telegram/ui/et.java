package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class et implements View.OnClickListener {
    public final int f37332a;
    public final rt f37333b;

    public et(rt rtVar, int i10) {
        this.f37332a = i10;
        this.f37333b = rtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37332a) {
            case 0:
                rt rtVar = this.f37333b;
                rtVar.K = false;
                rtVar.f41509z.invalidate();
                rtVar.n();
                return;
            case 1:
                rt rtVar2 = this.f37333b;
                Activity activity = rtVar2.f41506w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.m0(5)));
                }
                rtVar2.K = false;
                rtVar2.f41509z.invalidate();
                rtVar2.n();
                return;
            case 2:
                rt rtVar3 = this.f37333b;
                pt ptVar = rtVar3.f41496l;
                if (ptVar != null) {
                    ptVar.K();
                }
                rtVar3.p();
                return;
            default:
                rt rtVar4 = this.f37333b;
                pt ptVar2 = rtVar4.f41496l;
                if (ptVar2 != null) {
                    ptVar2.s();
                }
                rtVar4.p();
                return;
        }
    }
}
