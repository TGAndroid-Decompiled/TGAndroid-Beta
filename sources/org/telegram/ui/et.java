package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class et implements View.OnClickListener {
    public final int f36578a;
    public final qt f36579b;

    public et(qt qtVar, int i10) {
        this.f36578a = i10;
        this.f36579b = qtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36578a) {
            case 0:
                qt qtVar = this.f36579b;
                qtVar.K = false;
                qtVar.f40670z.invalidate();
                qtVar.n();
                return;
            case 1:
                qt qtVar2 = this.f36579b;
                Activity activity = qtVar2.f40667w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                qtVar2.K = false;
                qtVar2.f40670z.invalidate();
                qtVar2.n();
                return;
            case 2:
                qt qtVar3 = this.f36579b;
                ot otVar = qtVar3.f40657l;
                if (otVar != null) {
                    otVar.K();
                }
                qtVar3.p();
                return;
            default:
                qt qtVar4 = this.f36579b;
                ot otVar2 = qtVar4.f40657l;
                if (otVar2 != null) {
                    otVar2.q();
                }
                qtVar4.p();
                return;
        }
    }
}
