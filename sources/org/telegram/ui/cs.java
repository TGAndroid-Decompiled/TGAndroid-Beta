package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class cs implements View.OnClickListener {
    public final int f46863a;
    public final ns f46864b;

    public cs(ns nsVar, int i7) {
        this.f46863a = i7;
        this.f46864b = nsVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46863a) {
            case 0:
                ns nsVar = this.f46864b;
                nsVar.K = false;
                nsVar.f50427z.invalidate();
                nsVar.m();
                return;
            case 1:
                ns nsVar2 = this.f46864b;
                Activity activity = nsVar2.f50424w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                nsVar2.K = false;
                nsVar2.f50427z.invalidate();
                nsVar2.m();
                return;
            case 2:
                ns nsVar3 = this.f46864b;
                ls lsVar = nsVar3.f50414l;
                if (lsVar != null) {
                    lsVar.J();
                }
                nsVar3.o();
                return;
            default:
                ns nsVar4 = this.f46864b;
                ls lsVar2 = nsVar4.f50414l;
                if (lsVar2 != null) {
                    lsVar2.q();
                }
                nsVar4.o();
                return;
        }
    }
}
