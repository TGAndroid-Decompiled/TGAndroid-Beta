package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class et implements View.OnClickListener {
    public final int f37378a;
    public final rt f37379b;

    public et(rt rtVar, int i10) {
        this.f37378a = i10;
        this.f37379b = rtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37378a) {
            case 0:
                rt rtVar = this.f37379b;
                rtVar.K = false;
                rtVar.f41555z.invalidate();
                rtVar.n();
                return;
            case 1:
                rt rtVar2 = this.f37379b;
                Activity activity = rtVar2.f41552w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                rtVar2.K = false;
                rtVar2.f41555z.invalidate();
                rtVar2.n();
                return;
            case 2:
                rt rtVar3 = this.f37379b;
                pt ptVar = rtVar3.f41542l;
                if (ptVar != null) {
                    ptVar.K();
                }
                rtVar3.p();
                return;
            default:
                rt rtVar4 = this.f37379b;
                pt ptVar2 = rtVar4.f41542l;
                if (ptVar2 != null) {
                    ptVar2.s();
                }
                rtVar4.p();
                return;
        }
    }
}
