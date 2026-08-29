package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jg0 implements Runnable {
    public final int f39544a;
    public final ng0 f39545b;

    public jg0(ng0 ng0Var, int i10) {
        this.f39544a = i10;
        this.f39545b = ng0Var;
    }

    @Override
    public final void run() {
        zg.b[] bVarArr;
        switch (this.f39544a) {
            case 0:
                ng0.b0(this.f39545b);
                return;
            case 1:
                ng0 ng0Var = this.f39545b;
                ng0Var.getClass();
                h9.m0(ng0Var);
                return;
            case 2:
                ng0.c0(this.f39545b);
                return;
            case 3:
                ng0.a0(this.f39545b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f39545b.M);
                return;
            case 5:
                ng0 ng0Var2 = this.f39545b;
                ng0Var2.getClass();
                new kj0(ng0Var2.getParentActivity(), ng0Var2).show();
                return;
            case 6:
                ng0 ng0Var3 = this.f39545b;
                ng0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ng0Var3.presentFragment(new h9(bundle));
                return;
            default:
                ng0 ng0Var4 = this.f39545b;
                if (ng0Var4.getParentActivity() != null && (bVarArr = ng0Var4.G) != null) {
                    zg.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (ng0Var4.f43593b.getWidth() - ((bVar.getX() + ng0Var4.B.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    nh.t3 t3Var = new nh.t3(ng0Var4.getParentActivity(), 3);
                    ng0Var4.M = t3Var;
                    t3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-ng0Var4.H));
                    ng0Var4.M.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ng0Var4.M.q(false);
                    ng0Var4.M.i();
                    ng0Var4.M.t(LocaleController.getString(R.string.SwitchAccountHint));
                    ng0Var4.M.m(1.0f, (-width) + 7.33f);
                    ng0Var4.f43593b.addView(ng0Var4.M, i7.f6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    nh.t3 t3Var2 = ng0Var4.M;
                    t3Var2.f18597h0 = new jg0(ng0Var4, 4);
                    t3Var2.d = 8000L;
                    t3Var2.v();
                    org.telegram.ui.Components.h40.f29056r.b();
                    return;
                }
                return;
        }
    }
}
