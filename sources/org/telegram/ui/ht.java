package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ht implements View.OnClickListener {
    public final int f33456a;
    public final tt f33457b;

    public ht(tt ttVar, int i10) {
        this.f33456a = i10;
        this.f33457b = ttVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33456a) {
            case 0:
                tt ttVar = this.f33457b;
                ttVar.K = false;
                ttVar.f37039z.invalidate();
                ttVar.n();
                return;
            case 1:
                tt ttVar2 = this.f33457b;
                Activity activity = ttVar2.f37036w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ttVar2.K = false;
                ttVar2.f37039z.invalidate();
                ttVar2.n();
                return;
            case 2:
                tt ttVar3 = this.f33457b;
                rt rtVar = ttVar3.f37026l;
                if (rtVar != null) {
                    rtVar.J();
                }
                ttVar3.p();
                return;
            default:
                tt ttVar4 = this.f33457b;
                rt rtVar2 = ttVar4.f37026l;
                if (rtVar2 != null) {
                    rtVar2.q();
                }
                ttVar4.p();
                return;
        }
    }
}
