package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ng0 implements Runnable {
    public final int f39869a;
    public final rg0 f39870b;

    public ng0(rg0 rg0Var, int i10) {
        this.f39869a = i10;
        this.f39870b = rg0Var;
    }

    @Override
    public final void run() {
        ph.b[] bVarArr;
        switch (this.f39869a) {
            case 0:
                rg0 rg0Var = this.f39870b;
                rg0Var.getClass();
                m9.l0(rg0Var);
                return;
            case 1:
                rg0.c0(this.f39870b);
                return;
            case 2:
                rg0.a0(this.f39870b);
                return;
            case 3:
                AndroidUtilities.removeFromParent(this.f39870b.P);
                return;
            case 4:
                rg0 rg0Var2 = this.f39870b;
                rg0Var2.getClass();
                new rj0(rg0Var2.getParentActivity(), rg0Var2).show();
                return;
            case 5:
                rg0 rg0Var3 = this.f39870b;
                rg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                rg0Var3.presentFragment(new m9(bundle));
                return;
            case 6:
                rg0 rg0Var4 = this.f39870b;
                if (rg0Var4.getParentActivity() != null && (bVarArr = rg0Var4.K) != null) {
                    ph.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (rg0Var4.f42432b.getWidth() - ((bVar.getX() + rg0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(rg0Var4.getParentActivity(), 3);
                    rg0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-rg0Var4.L));
                    rg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    rg0Var4.P.p(false);
                    rg0Var4.P.i(true);
                    rg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    rg0Var4.P.l(1.0f, (-width) + 7.33f);
                    rg0Var4.f42432b.addView(rg0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ei.x3 x3Var2 = rg0Var4.P;
                    x3Var2.f10097l0 = new ng0(rg0Var4, 3);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.f30374r.b();
                    return;
                }
                return;
            default:
                rg0.b0(this.f39870b);
                return;
        }
    }
}
