package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class gt implements View.OnClickListener {
    public final int f33988a;
    public final st f33989b;

    public gt(st stVar, int i10) {
        this.f33988a = i10;
        this.f33989b = stVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33988a) {
            case 0:
                st stVar = this.f33989b;
                stVar.K = false;
                stVar.f37574z.invalidate();
                stVar.n();
                return;
            case 1:
                st stVar2 = this.f33989b;
                Activity activity = stVar2.f37571w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                stVar2.K = false;
                stVar2.f37574z.invalidate();
                stVar2.n();
                return;
            case 2:
                st stVar3 = this.f33989b;
                qt qtVar = stVar3.f37561l;
                if (qtVar != null) {
                    qtVar.K();
                }
                stVar3.p();
                return;
            default:
                st stVar4 = this.f33989b;
                qt qtVar2 = stVar4.f37561l;
                if (qtVar2 != null) {
                    qtVar2.r();
                }
                stVar4.p();
                return;
        }
    }
}
