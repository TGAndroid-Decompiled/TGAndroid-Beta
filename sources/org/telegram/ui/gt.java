package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class gt implements View.OnClickListener {
    public final int f36776a;
    public final st f36777b;

    public gt(st stVar, int i10) {
        this.f36776a = i10;
        this.f36777b = stVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36776a) {
            case 0:
                st stVar = this.f36777b;
                stVar.K = false;
                stVar.f40552z.invalidate();
                stVar.n();
                return;
            case 1:
                st stVar2 = this.f36777b;
                Activity activity = stVar2.f40549w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                stVar2.K = false;
                stVar2.f40552z.invalidate();
                stVar2.n();
                return;
            case 2:
                st stVar3 = this.f36777b;
                qt qtVar = stVar3.f40539l;
                if (qtVar != null) {
                    qtVar.K();
                }
                stVar3.p();
                return;
            default:
                st stVar4 = this.f36777b;
                qt qtVar2 = stVar4.f40539l;
                if (qtVar2 != null) {
                    qtVar2.q();
                }
                stVar4.p();
                return;
        }
    }
}
