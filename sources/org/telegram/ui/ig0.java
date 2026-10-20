package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ig0 implements Runnable {
    public final int f37967a;
    public final ng0 f37968b;

    public ig0(ng0 ng0Var, int i10) {
        this.f37967a = i10;
        this.f37968b = ng0Var;
    }

    @Override
    public final void run() {
        ph.b[] bVarArr;
        switch (this.f37967a) {
            case 0:
                ng0.b0(this.f37968b);
                return;
            case 1:
                ng0 ng0Var = this.f37968b;
                ng0Var.getClass();
                m9.m0(ng0Var);
                return;
            case 2:
                ng0.c0(this.f37968b);
                return;
            case 3:
                ng0.a0(this.f37968b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f37968b.P);
                return;
            case 5:
                ng0 ng0Var2 = this.f37968b;
                ng0Var2.getClass();
                new mj0(ng0Var2.getParentActivity(), ng0Var2).show();
                return;
            case 6:
                ng0 ng0Var3 = this.f37968b;
                ng0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ng0Var3.presentFragment(new m9(bundle));
                return;
            default:
                ng0 ng0Var4 = this.f37968b;
                if (ng0Var4.getParentActivity() != null && (bVarArr = ng0Var4.K) != null) {
                    ph.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (ng0Var4.f39887b.getWidth() - ((bVar.getX() + ng0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(ng0Var4.getParentActivity(), 3);
                    ng0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-ng0Var4.L));
                    ng0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ng0Var4.P.p(false);
                    ng0Var4.P.i(true);
                    ng0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    ng0Var4.P.l(1.0f, (-width) + 7.33f);
                    ng0Var4.f39887b.addView(ng0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ei.x3 x3Var2 = ng0Var4.P;
                    x3Var2.f10080l0 = new ig0(ng0Var4, 4);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.f30194r.b();
                    return;
                }
                return;
        }
    }
}
