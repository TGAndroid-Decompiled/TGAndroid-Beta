package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class et implements View.OnClickListener {
    public final int f36091a;
    public final rt f36092b;

    public et(rt rtVar, int i10) {
        this.f36091a = i10;
        this.f36092b = rtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36091a) {
            case 0:
                rt rtVar = this.f36092b;
                rtVar.K = false;
                rtVar.f40290z.invalidate();
                rtVar.n();
                return;
            case 1:
                rt rtVar2 = this.f36092b;
                Activity activity = rtVar2.f40287w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                rtVar2.K = false;
                rtVar2.f40290z.invalidate();
                rtVar2.n();
                return;
            case 2:
                rt rtVar3 = this.f36092b;
                pt ptVar = rtVar3.f40277l;
                if (ptVar != null) {
                    ptVar.K();
                }
                rtVar3.p();
                return;
            default:
                rt rtVar4 = this.f36092b;
                pt ptVar2 = rtVar4.f40277l;
                if (ptVar2 != null) {
                    ptVar2.s();
                }
                rtVar4.p();
                return;
        }
    }
}
