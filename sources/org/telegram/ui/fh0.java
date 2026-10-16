package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fh0 implements Runnable {
    public final int f35534a;
    public final jh0 f35535b;

    public fh0(jh0 jh0Var, int i10) {
        this.f35534a = i10;
        this.f35535b = jh0Var;
    }

    @Override
    public final void run() {
        ph.b[] bVarArr;
        switch (this.f35534a) {
            case 0:
                jh0.b0(this.f35535b);
                return;
            case 1:
                jh0 jh0Var = this.f35535b;
                jh0Var.getClass();
                n9.m0(jh0Var);
                return;
            case 2:
                jh0.c0(this.f35535b);
                return;
            case 3:
                jh0.a0(this.f35535b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f35535b.P);
                return;
            case 5:
                jh0 jh0Var2 = this.f35535b;
                jh0Var2.getClass();
                new hk0(jh0Var2.getParentActivity(), jh0Var2).show();
                return;
            case 6:
                jh0 jh0Var3 = this.f35535b;
                jh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                jh0Var3.presentFragment(new n9(bundle));
                return;
            default:
                jh0 jh0Var4 = this.f35535b;
                if (jh0Var4.getParentActivity() != null && (bVarArr = jh0Var4.K) != null) {
                    ph.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (jh0Var4.f37071b.getWidth() - ((bVar.getX() + jh0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    di.d4 d4Var = new di.d4(jh0Var4.getParentActivity(), 3);
                    jh0Var4.P = d4Var;
                    d4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-jh0Var4.L));
                    jh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    jh0Var4.P.p(false);
                    jh0Var4.P.i();
                    jh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    jh0Var4.P.l(1.0f, (-width) + 7.33f);
                    jh0Var4.f37071b.addView(jh0Var4.P, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 72.0f, -1, 87));
                    di.d4 d4Var2 = jh0Var4.P;
                    d4Var2.f6804l0 = new fh0(jh0Var4, 4);
                    d4Var2.d = 8000L;
                    d4Var2.u();
                    org.telegram.ui.Components.w40.f30465r.b();
                    return;
                }
                return;
        }
    }
}
