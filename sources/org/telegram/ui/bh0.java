package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bh0 implements Runnable {
    public final int f36332a;
    public final fh0 f36333b;

    public bh0(fh0 fh0Var, int i10) {
        this.f36332a = i10;
        this.f36333b = fh0Var;
    }

    @Override
    public final void run() {
        oh.b[] bVarArr;
        switch (this.f36332a) {
            case 0:
                fh0.b0(this.f36333b);
                return;
            case 1:
                fh0 fh0Var = this.f36333b;
                fh0Var.getClass();
                j9.m0(fh0Var);
                return;
            case 2:
                fh0.c0(this.f36333b);
                return;
            case 3:
                fh0.a0(this.f36333b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f36333b.P);
                return;
            case 5:
                fh0 fh0Var2 = this.f36333b;
                fh0Var2.getClass();
                new dk0(fh0Var2.getParentActivity(), fh0Var2).show();
                return;
            case 6:
                fh0 fh0Var3 = this.f36333b;
                fh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                fh0Var3.presentFragment(new j9(bundle));
                return;
            default:
                fh0 fh0Var4 = this.f36333b;
                if (fh0Var4.getParentActivity() != null && (bVarArr = fh0Var4.K) != null) {
                    oh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (fh0Var4.f36684b.getWidth() - ((bVar.getX() + fh0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ci.d4 d4Var = new ci.d4(fh0Var4.getParentActivity(), 3);
                    fh0Var4.P = d4Var;
                    d4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-fh0Var4.L));
                    fh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    fh0Var4.P.p(false);
                    fh0Var4.P.i();
                    fh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    fh0Var4.P.l(1.0f, (-width) + 7.33f);
                    fh0Var4.f36684b.addView(fh0Var4.P, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 72.0f, -1, 87));
                    ci.d4 d4Var2 = fh0Var4.P;
                    d4Var2.f4918l0 = new bh0(fh0Var4, 4);
                    d4Var2.d = 8000L;
                    d4Var2.u();
                    org.telegram.ui.Components.a50.f24603r.b();
                    return;
                }
                return;
        }
    }
}
