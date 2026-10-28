package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ng0 implements Runnable {
    public final int f41797a;
    public final rg0 f41798b;

    public ng0(rg0 rg0Var, int i10) {
        this.f41797a = i10;
        this.f41798b = rg0Var;
    }

    @Override
    public final void run() {
        qh.b[] bVarArr;
        switch (this.f41797a) {
            case 0:
                rg0 rg0Var = this.f41798b;
                rg0Var.getClass();
                new qj0(rg0Var.getParentActivity(), rg0Var).show();
                return;
            case 1:
                rg0 rg0Var2 = this.f41798b;
                rg0Var2.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                rg0Var2.presentFragment(new o9(bundle));
                return;
            case 2:
                rg0 rg0Var3 = this.f41798b;
                if (rg0Var3.getParentActivity() != null && (bVarArr = rg0Var3.J) != null) {
                    qh.b bVar = bVarArr[3];
                    float width = ((bVar.getWidth() / 2.0f) + (rg0Var3.f45000b.getWidth() - ((bVar.getX() + rg0Var3.E.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    fi.v3 v3Var = new fi.v3(rg0Var3.getParentActivity(), 3);
                    rg0Var3.O = v3Var;
                    v3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-rg0Var3.K));
                    rg0Var3.O.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    rg0Var3.O.p(false);
                    rg0Var3.O.i(true);
                    rg0Var3.O.s(LocaleController.getString(R.string.SwitchAccountHint));
                    rg0Var3.O.l(1.0f, (-width) + 7.33f);
                    rg0Var3.f45000b.addView(rg0Var3.O, org.telegram.ui.Components.kb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.v3 v3Var2 = rg0Var3.O;
                    v3Var2.f11797l0 = new ng0(rg0Var3, 3);
                    v3Var2.d = 8000L;
                    v3Var2.u();
                    org.telegram.ui.Components.u40.f33224r.b();
                    return;
                }
                return;
            case 3:
                AndroidUtilities.removeFromParent(this.f41798b.O);
                return;
            default:
                rg0.Z(this.f41798b);
                return;
        }
    }
}
