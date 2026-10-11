package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class dt implements View.OnClickListener {
    public final int f37091a;
    public final qt f37092b;

    public dt(qt qtVar, int i10) {
        this.f37091a = i10;
        this.f37092b = qtVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37091a) {
            case 0:
                qt qtVar = this.f37092b;
                qtVar.K = false;
                qtVar.f41257z.invalidate();
                qtVar.n();
                return;
            case 1:
                qt qtVar2 = this.f37092b;
                Activity activity = qtVar2.f41254w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                qtVar2.K = false;
                qtVar2.f41257z.invalidate();
                qtVar2.n();
                return;
            case 2:
                qt qtVar3 = this.f37092b;
                ot otVar = qtVar3.f41244l;
                if (otVar != null) {
                    otVar.K();
                }
                qtVar3.p();
                return;
            default:
                qt qtVar4 = this.f37092b;
                ot otVar2 = qtVar4.f41244l;
                if (otVar2 != null) {
                    otVar2.s();
                }
                qtVar4.p();
                return;
        }
    }
}
