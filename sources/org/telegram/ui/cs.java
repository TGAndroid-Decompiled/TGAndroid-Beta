package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class cs implements View.OnClickListener {
    public final int f46208a;
    public final ns f46209b;

    public cs(ns nsVar, int i7) {
        this.f46208a = i7;
        this.f46209b = nsVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46208a) {
            case 0:
                ns nsVar = this.f46209b;
                nsVar.K = false;
                nsVar.f49669z.invalidate();
                nsVar.m();
                return;
            case 1:
                ns nsVar2 = this.f46209b;
                Activity activity = nsVar2.f49666w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                nsVar2.K = false;
                nsVar2.f49669z.invalidate();
                nsVar2.m();
                return;
            case 2:
                ns nsVar3 = this.f46209b;
                ls lsVar = nsVar3.f49656l;
                if (lsVar != null) {
                    lsVar.K();
                }
                nsVar3.o();
                return;
            default:
                ns nsVar4 = this.f46209b;
                ls lsVar2 = nsVar4.f49656l;
                if (lsVar2 != null) {
                    lsVar2.q();
                }
                nsVar4.o();
                return;
        }
    }
}
