package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class jt implements View.OnClickListener {
    public final int f34935a;
    public final ut f34936b;

    public jt(ut utVar, int i10) {
        this.f34935a = i10;
        this.f34936b = utVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34935a) {
            case 0:
                ut utVar = this.f34936b;
                utVar.K = false;
                utVar.f38226z.invalidate();
                utVar.n();
                return;
            case 1:
                ut utVar2 = this.f34936b;
                Activity activity = utVar2.f38223w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                utVar2.K = false;
                utVar2.f38226z.invalidate();
                utVar2.n();
                return;
            case 2:
                ut utVar3 = this.f34936b;
                st stVar = utVar3.f38213l;
                if (stVar != null) {
                    stVar.K();
                }
                utVar3.p();
                return;
            default:
                ut utVar4 = this.f34936b;
                st stVar2 = utVar4.f38213l;
                if (stVar2 != null) {
                    stVar2.r();
                }
                utVar4.p();
                return;
        }
    }
}
