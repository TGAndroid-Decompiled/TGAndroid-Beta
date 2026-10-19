package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hg0 implements Runnable {
    public final int f37616a;
    public final mg0 f37617b;

    public hg0(mg0 mg0Var, int i10) {
        this.f37616a = i10;
        this.f37617b = mg0Var;
    }

    @Override
    public final void run() {
        ph.b[] bVarArr;
        switch (this.f37616a) {
            case 0:
                mg0.b0(this.f37617b);
                return;
            case 1:
                mg0 mg0Var = this.f37617b;
                mg0Var.getClass();
                m9.m0(mg0Var);
                return;
            case 2:
                mg0.c0(this.f37617b);
                return;
            case 3:
                mg0.a0(this.f37617b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f37617b.P);
                return;
            case 5:
                mg0 mg0Var2 = this.f37617b;
                mg0Var2.getClass();
                new mj0(mg0Var2.getParentActivity(), mg0Var2).show();
                return;
            case 6:
                mg0 mg0Var3 = this.f37617b;
                mg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                mg0Var3.presentFragment(new m9(bundle));
                return;
            default:
                mg0 mg0Var4 = this.f37617b;
                if (mg0Var4.getParentActivity() != null && (bVarArr = mg0Var4.K) != null) {
                    ph.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (mg0Var4.f39887b.getWidth() - ((bVar.getX() + mg0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(mg0Var4.getParentActivity(), 3);
                    mg0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-mg0Var4.L));
                    mg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    mg0Var4.P.p(false);
                    mg0Var4.P.i(true);
                    mg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    mg0Var4.P.l(1.0f, (-width) + 7.33f);
                    mg0Var4.f39887b.addView(mg0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ei.x3 x3Var2 = mg0Var4.P;
                    x3Var2.f10082l0 = new hg0(mg0Var4, 4);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.f30167r.b();
                    return;
                }
                return;
        }
    }
}
