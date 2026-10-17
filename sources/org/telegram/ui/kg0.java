package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kg0 implements Runnable {
    public final int f38517a;
    public final pg0 f38518b;

    public kg0(pg0 pg0Var, int i10) {
        this.f38517a = i10;
        this.f38518b = pg0Var;
    }

    @Override
    public final void run() {
        ph.b[] bVarArr;
        switch (this.f38517a) {
            case 0:
                pg0.b0(this.f38518b);
                return;
            case 1:
                pg0 pg0Var = this.f38518b;
                pg0Var.getClass();
                m9.m0(pg0Var);
                return;
            case 2:
                pg0.c0(this.f38518b);
                return;
            case 3:
                pg0.a0(this.f38518b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f38518b.P);
                return;
            case 5:
                pg0 pg0Var2 = this.f38518b;
                pg0Var2.getClass();
                new oj0(pg0Var2.getParentActivity(), pg0Var2).show();
                return;
            case 6:
                pg0 pg0Var3 = this.f38518b;
                pg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                pg0Var3.presentFragment(new m9(bundle));
                return;
            default:
                pg0 pg0Var4 = this.f38518b;
                if (pg0Var4.getParentActivity() != null && (bVarArr = pg0Var4.K) != null) {
                    ph.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (pg0Var4.f40426b.getWidth() - ((bVar.getX() + pg0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(pg0Var4.getParentActivity(), 3);
                    pg0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-pg0Var4.L));
                    pg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    pg0Var4.P.p(false);
                    pg0Var4.P.i(true);
                    pg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    pg0Var4.P.l(1.0f, (-width) + 7.33f);
                    pg0Var4.f40426b.addView(pg0Var4.P, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 72.0f, -1, 87));
                    ei.x3 x3Var2 = pg0Var4.P;
                    x3Var2.f10081l0 = new kg0(pg0Var4, 4);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.f30185r.b();
                    return;
                }
                return;
        }
    }
}
