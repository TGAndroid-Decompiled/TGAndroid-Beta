package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class mg0 implements Runnable {
    public final int f39588a;
    public final qg0 f39589b;

    public mg0(qg0 qg0Var, int i10) {
        this.f39588a = i10;
        this.f39589b = qg0Var;
    }

    @Override
    public final void run() {
        ph.b[] bVarArr;
        switch (this.f39588a) {
            case 0:
                qg0 qg0Var = this.f39589b;
                qg0Var.getClass();
                m9.l0(qg0Var);
                return;
            case 1:
                qg0.c0(this.f39589b);
                return;
            case 2:
                qg0.a0(this.f39589b);
                return;
            case 3:
                AndroidUtilities.removeFromParent(this.f39589b.P);
                return;
            case 4:
                qg0 qg0Var2 = this.f39589b;
                qg0Var2.getClass();
                new qj0(qg0Var2.getParentActivity(), qg0Var2).show();
                return;
            case 5:
                qg0 qg0Var3 = this.f39589b;
                qg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                qg0Var3.presentFragment(new m9(bundle));
                return;
            case 6:
                qg0 qg0Var4 = this.f39589b;
                if (qg0Var4.getParentActivity() != null && (bVarArr = qg0Var4.K) != null) {
                    ph.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (qg0Var4.f42050b.getWidth() - ((bVar.getX() + qg0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(qg0Var4.getParentActivity(), 3);
                    qg0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-qg0Var4.L));
                    qg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    qg0Var4.P.p(false);
                    qg0Var4.P.i(true);
                    qg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    qg0Var4.P.l(1.0f, (-width) + 7.33f);
                    qg0Var4.f42050b.addView(qg0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ei.x3 x3Var2 = qg0Var4.P;
                    x3Var2.f10097l0 = new mg0(qg0Var4, 3);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.q40.f29795r.b();
                    return;
                }
                return;
            default:
                qg0.b0(this.f39589b);
                return;
        }
    }
}
