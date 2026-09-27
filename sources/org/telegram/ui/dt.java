package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class dt implements View.OnClickListener {
    public final int f33030a;
    public final qt f33031b;

    public dt(qt qtVar, int i10) {
        this.f33030a = i10;
        this.f33031b = qtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33030a) {
            case 0:
                qt qtVar = this.f33031b;
                qtVar.K = false;
                qtVar.f36909z.invalidate();
                qtVar.n();
                return;
            case 1:
                qt qtVar2 = this.f33031b;
                Activity activity = qtVar2.f36906w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                qtVar2.K = false;
                qtVar2.f36909z.invalidate();
                qtVar2.n();
                return;
            case 2:
                qt qtVar3 = this.f33031b;
                ot otVar = qtVar3.f36896l;
                if (otVar != null) {
                    otVar.K();
                }
                qtVar3.p();
                return;
            default:
                qt qtVar4 = this.f33031b;
                ot otVar2 = qtVar4.f36896l;
                if (otVar2 != null) {
                    otVar2.s();
                }
                qtVar4.p();
                return;
        }
    }
}
