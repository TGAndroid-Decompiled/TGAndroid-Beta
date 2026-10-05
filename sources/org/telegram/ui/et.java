package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class et implements View.OnClickListener {
    public final int f36112a;
    public final rt f36113b;

    public et(rt rtVar, int i10) {
        this.f36112a = i10;
        this.f36113b = rtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36112a) {
            case 0:
                rt rtVar = this.f36113b;
                rtVar.K = false;
                rtVar.f40265z.invalidate();
                rtVar.n();
                return;
            case 1:
                rt rtVar2 = this.f36113b;
                Activity activity = rtVar2.f40262w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                rtVar2.K = false;
                rtVar2.f40265z.invalidate();
                rtVar2.n();
                return;
            case 2:
                rt rtVar3 = this.f36113b;
                pt ptVar = rtVar3.f40252l;
                if (ptVar != null) {
                    ptVar.K();
                }
                rtVar3.p();
                return;
            default:
                rt rtVar4 = this.f36113b;
                pt ptVar2 = rtVar4.f40252l;
                if (ptVar2 != null) {
                    ptVar2.s();
                }
                rtVar4.p();
                return;
        }
    }
}
