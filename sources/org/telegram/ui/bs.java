package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class bs implements View.OnClickListener {
    public final int f44109a;
    public final ms f44110b;

    public bs(ms msVar, int i7) {
        this.f44109a = i7;
        this.f44110b = msVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44109a) {
            case 0:
                ms msVar = this.f44110b;
                msVar.K = false;
                msVar.f47983z.invalidate();
                msVar.m();
                return;
            case 1:
                ms msVar2 = this.f44110b;
                Activity activity = msVar2.f47980w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.M() != null && launchActivity.M().getLastFragment() != null) {
                        launchActivity.M().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.t0(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(5)));
                }
                msVar2.K = false;
                msVar2.f47983z.invalidate();
                msVar2.m();
                return;
            case 2:
                ms msVar3 = this.f44110b;
                ks ksVar = msVar3.f47970l;
                if (ksVar != null) {
                    ksVar.K();
                }
                msVar3.o();
                return;
            default:
                ms msVar4 = this.f44110b;
                ks ksVar2 = msVar4.f47970l;
                if (ksVar2 != null) {
                    ksVar2.r();
                }
                msVar4.o();
                return;
        }
    }
}
