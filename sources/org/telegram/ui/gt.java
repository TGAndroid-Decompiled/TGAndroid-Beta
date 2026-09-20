package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class gt implements View.OnClickListener {
    public final int f33972a;
    public final st f33973b;

    public gt(st stVar, int i10) {
        this.f33972a = i10;
        this.f33973b = stVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33972a) {
            case 0:
                st stVar = this.f33973b;
                stVar.K = false;
                stVar.f37550z.invalidate();
                stVar.n();
                return;
            case 1:
                st stVar2 = this.f33973b;
                Activity activity = stVar2.f37547w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                stVar2.K = false;
                stVar2.f37550z.invalidate();
                stVar2.n();
                return;
            case 2:
                st stVar3 = this.f33973b;
                qt qtVar = stVar3.f37537l;
                if (qtVar != null) {
                    qtVar.K();
                }
                stVar3.p();
                return;
            default:
                st stVar4 = this.f33973b;
                qt qtVar2 = stVar4.f37537l;
                if (qtVar2 != null) {
                    qtVar2.r();
                }
                stVar4.p();
                return;
        }
    }
}
