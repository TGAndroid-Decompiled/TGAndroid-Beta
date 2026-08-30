package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class dt implements View.OnClickListener {
    public final int f33797a;
    public final pt f33798b;

    public dt(pt ptVar, int i10) {
        this.f33797a = i10;
        this.f33798b = ptVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33797a) {
            case 0:
                pt ptVar = this.f33798b;
                ptVar.K = false;
                ptVar.f37537z.invalidate();
                ptVar.n();
                return;
            case 1:
                pt ptVar2 = this.f33798b;
                Activity activity = ptVar2.f37534w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ptVar2.K = false;
                ptVar2.f37537z.invalidate();
                ptVar2.n();
                return;
            case 2:
                pt ptVar3 = this.f33798b;
                nt ntVar = ptVar3.f37524l;
                if (ntVar != null) {
                    ntVar.K();
                }
                ptVar3.p();
                return;
            default:
                pt ptVar4 = this.f33798b;
                nt ntVar2 = ptVar4.f37524l;
                if (ntVar2 != null) {
                    ntVar2.r();
                }
                ptVar4.p();
                return;
        }
    }
}
