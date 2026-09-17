package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class jt implements View.OnClickListener {
    public final int f34930a;
    public final ut f34931b;

    public jt(ut utVar, int i10) {
        this.f34930a = i10;
        this.f34931b = utVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34930a) {
            case 0:
                ut utVar = this.f34931b;
                utVar.K = false;
                utVar.f38221z.invalidate();
                utVar.n();
                return;
            case 1:
                ut utVar2 = this.f34931b;
                Activity activity = utVar2.f38218w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                utVar2.K = false;
                utVar2.f38221z.invalidate();
                utVar2.n();
                return;
            case 2:
                ut utVar3 = this.f34931b;
                st stVar = utVar3.f38208l;
                if (stVar != null) {
                    stVar.K();
                }
                utVar3.p();
                return;
            default:
                ut utVar4 = this.f34931b;
                st stVar2 = utVar4.f38208l;
                if (stVar2 != null) {
                    stVar2.r();
                }
                utVar4.p();
                return;
        }
    }
}
