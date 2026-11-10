package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class cs implements View.OnClickListener {
    public final int f44781a;
    public final ns f44782b;

    public cs(ns nsVar, int i7) {
        this.f44781a = i7;
        this.f44782b = nsVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44781a) {
            case 0:
                ns nsVar = this.f44782b;
                nsVar.K = false;
                nsVar.f48280z.invalidate();
                nsVar.m();
                return;
            case 1:
                ns nsVar2 = this.f44782b;
                Activity activity = nsVar2.f48277w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                nsVar2.K = false;
                nsVar2.f48280z.invalidate();
                nsVar2.m();
                return;
            case 2:
                ns nsVar3 = this.f44782b;
                ls lsVar = nsVar3.f48267l;
                if (lsVar != null) {
                    lsVar.K();
                }
                nsVar3.o();
                return;
            default:
                ns nsVar4 = this.f44782b;
                ls lsVar2 = nsVar4.f48267l;
                if (lsVar2 != null) {
                    lsVar2.r();
                }
                nsVar4.o();
                return;
        }
    }
}
