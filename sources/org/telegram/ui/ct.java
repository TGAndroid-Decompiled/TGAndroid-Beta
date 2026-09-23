package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ct implements View.OnClickListener {
    public final int f32401a;
    public final pt f32402b;

    public ct(pt ptVar, int i10) {
        this.f32401a = i10;
        this.f32402b = ptVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32401a) {
            case 0:
                pt ptVar = this.f32402b;
                ptVar.K = false;
                ptVar.f36206z.invalidate();
                ptVar.n();
                return;
            case 1:
                pt ptVar2 = this.f32402b;
                Activity activity = ptVar2.f36203w;
                if (activity instanceof LaunchActivity) {
                    LaunchActivity launchActivity = (LaunchActivity) activity;
                    if (launchActivity.O() != null && launchActivity.O().getLastFragment() != null) {
                        launchActivity.O().getLastFragment().dismissCurrentDialog();
                    }
                    launchActivity.p0(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(5)));
                }
                ptVar2.K = false;
                ptVar2.f36206z.invalidate();
                ptVar2.n();
                return;
            case 2:
                pt ptVar3 = this.f32402b;
                nt ntVar = ptVar3.f36193l;
                if (ntVar != null) {
                    ntVar.K();
                }
                ptVar3.p();
                return;
            default:
                pt ptVar4 = this.f32402b;
                nt ntVar2 = ptVar4.f36193l;
                if (ntVar2 != null) {
                    ntVar2.s();
                }
                ptVar4.p();
                return;
        }
    }
}
