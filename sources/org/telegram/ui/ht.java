package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ht implements View.OnClickListener {
    public final int f38520a;
    public final ut f38521b;

    public ht(ut utVar, int i10) {
        this.f38520a = i10;
        this.f38521b = utVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38520a) {
            case 0:
                ut utVar = this.f38521b;
                utVar.K = false;
                utVar.f42591z.invalidate();
                utVar.n();
                return;
            case 1:
                ut utVar2 = this.f38521b;
                Activity activity = utVar2.f42588w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                utVar2.K = false;
                utVar2.f42591z.invalidate();
                utVar2.n();
                return;
            case 2:
                ut utVar3 = this.f38521b;
                st stVar = utVar3.f42578l;
                if (stVar != null) {
                    stVar.K();
                }
                utVar3.p();
                return;
            default:
                ut utVar4 = this.f38521b;
                st stVar2 = utVar4.f42578l;
                if (stVar2 != null) {
                    stVar2.s();
                }
                utVar4.p();
                return;
        }
    }
}
