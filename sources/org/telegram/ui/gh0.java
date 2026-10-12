package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class gh0 implements Runnable {
    public final int f36400a;
    public final kh0 f36401b;

    public gh0(kh0 kh0Var, int i10) {
        this.f36400a = i10;
        this.f36401b = kh0Var;
    }

    @Override
    public final void run() {
        ph.b[] bVarArr;
        switch (this.f36400a) {
            case 0:
                kh0.b0(this.f36401b);
                return;
            case 1:
                kh0 kh0Var = this.f36401b;
                kh0Var.getClass();
                n9.m0(kh0Var);
                return;
            case 2:
                kh0.c0(this.f36401b);
                return;
            case 3:
                kh0.a0(this.f36401b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f36401b.P);
                return;
            case 5:
                kh0 kh0Var2 = this.f36401b;
                kh0Var2.getClass();
                new ik0(kh0Var2.getParentActivity(), kh0Var2).show();
                return;
            case 6:
                kh0 kh0Var3 = this.f36401b;
                kh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                kh0Var3.presentFragment(new n9(bundle));
                return;
            default:
                kh0 kh0Var4 = this.f36401b;
                if (kh0Var4.getParentActivity() != null && (bVarArr = kh0Var4.K) != null) {
                    ph.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (kh0Var4.f37391b.getWidth() - ((bVar.getX() + kh0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    di.d4 d4Var = new di.d4(kh0Var4.getParentActivity(), 3);
                    kh0Var4.P = d4Var;
                    d4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-kh0Var4.L));
                    kh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    kh0Var4.P.p(false);
                    kh0Var4.P.i();
                    kh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    kh0Var4.P.l(1.0f, (-width) + 7.33f);
                    kh0Var4.f37391b.addView(kh0Var4.P, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 72.0f, -1, 87));
                    di.d4 d4Var2 = kh0Var4.P;
                    d4Var2.f6801l0 = new gh0(kh0Var4, 4);
                    d4Var2.d = 8000L;
                    d4Var2.u();
                    org.telegram.ui.Components.w40.f30790r.b();
                    return;
                }
                return;
        }
    }
}
