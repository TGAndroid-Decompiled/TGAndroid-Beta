package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ah0 implements Runnable {
    public final int f31834a;
    public final eh0 f31835b;

    public ah0(eh0 eh0Var, int i10) {
        this.f31834a = i10;
        this.f31835b = eh0Var;
    }

    @Override
    public final void run() {
        oh.b[] bVarArr;
        switch (this.f31834a) {
            case 0:
                eh0.a0(this.f31835b);
                return;
            case 1:
                eh0 eh0Var = this.f31835b;
                eh0Var.getClass();
                k9.m0(eh0Var);
                return;
            case 2:
                eh0.c0(this.f31835b);
                return;
            case 3:
                eh0.Z(this.f31835b);
                return;
            case 4:
                eh0 eh0Var2 = this.f31835b;
                eh0Var2.getClass();
                new ck0(eh0Var2.getParentActivity(), eh0Var2).show();
                return;
            case 5:
                eh0 eh0Var3 = this.f31835b;
                eh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                eh0Var3.presentFragment(new k9(bundle));
                return;
            case 6:
                eh0 eh0Var4 = this.f31835b;
                if (eh0Var4.getParentActivity() != null && (bVarArr = eh0Var4.K) != null) {
                    oh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (eh0Var4.f31846b.getWidth() - ((bVar.getX() + eh0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ci.f4 f4Var = new ci.f4(eh0Var4.getParentActivity(), 3);
                    eh0Var4.Q = f4Var;
                    f4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-eh0Var4.L));
                    eh0Var4.Q.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    eh0Var4.Q.p(false);
                    eh0Var4.Q.i();
                    eh0Var4.Q.s(LocaleController.getString(R.string.SwitchAccountHint));
                    eh0Var4.Q.l(1.0f, (-width) + 7.33f);
                    eh0Var4.f31846b.addView(eh0Var4.Q, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.f4 f4Var2 = eh0Var4.Q;
                    f4Var2.f4633l0 = new ah0(eh0Var4, 7);
                    f4Var2.d = 8000L;
                    f4Var2.u();
                    org.telegram.ui.Components.j40.f25222r.b();
                    return;
                }
                return;
            default:
                AndroidUtilities.removeFromParent(this.f31835b.Q);
                return;
        }
    }
}
