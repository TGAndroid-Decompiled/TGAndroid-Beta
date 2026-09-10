package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bh0 implements Runnable {
    public final int f31263a;
    public final fh0 f31264b;

    public bh0(fh0 fh0Var, int i10) {
        this.f31263a = i10;
        this.f31264b = fh0Var;
    }

    @Override
    public final void run() {
        nh.b[] bVarArr;
        switch (this.f31263a) {
            case 0:
                fh0.b0(this.f31264b);
                return;
            case 1:
                fh0 fh0Var = this.f31264b;
                fh0Var.getClass();
                k9.m0(fh0Var);
                return;
            case 2:
                fh0.c0(this.f31264b);
                return;
            case 3:
                fh0.a0(this.f31264b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f31264b.Q);
                return;
            case 5:
                fh0 fh0Var2 = this.f31264b;
                fh0Var2.getClass();
                new ek0(fh0Var2.getParentActivity(), fh0Var2).show();
                return;
            case 6:
                fh0 fh0Var3 = this.f31264b;
                fh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                fh0Var3.presentFragment(new k9(bundle));
                return;
            default:
                fh0 fh0Var4 = this.f31264b;
                if (fh0Var4.getParentActivity() != null && (bVarArr = fh0Var4.K) != null) {
                    nh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (fh0Var4.f33116b.getWidth() - ((bVar.getX() + fh0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    bi.x4 x4Var = new bi.x4(fh0Var4.getParentActivity(), 3);
                    fh0Var4.Q = x4Var;
                    x4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-fh0Var4.L));
                    fh0Var4.Q.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    fh0Var4.Q.p(false);
                    fh0Var4.Q.i();
                    fh0Var4.Q.s(LocaleController.getString(R.string.SwitchAccountHint));
                    fh0Var4.Q.l(1.0f, (-width) + 7.33f);
                    fh0Var4.f33116b.addView(fh0Var4.Q, w7.a6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    bi.x4 x4Var2 = fh0Var4.Q;
                    x4Var2.f3890l0 = new bh0(fh0Var4, 4);
                    x4Var2.d = 8000L;
                    x4Var2.u();
                    org.telegram.ui.Components.t40.f27309r.b();
                    return;
                }
                return;
        }
    }
}
