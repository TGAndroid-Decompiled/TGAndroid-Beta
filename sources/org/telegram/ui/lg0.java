package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class lg0 implements Runnable {
    public final int f41267a;
    public final pg0 f41268b;

    public lg0(pg0 pg0Var, int i10) {
        this.f41267a = i10;
        this.f41268b = pg0Var;
    }

    @Override
    public final void run() {
        qh.b[] bVarArr;
        switch (this.f41267a) {
            case 0:
                pg0 pg0Var = this.f41268b;
                pg0Var.getClass();
                new oj0(pg0Var.getParentActivity(), pg0Var).show();
                return;
            case 1:
                pg0 pg0Var2 = this.f41268b;
                pg0Var2.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                pg0Var2.presentFragment(new o9(bundle));
                return;
            case 2:
                pg0 pg0Var3 = this.f41268b;
                if (pg0Var3.getParentActivity() != null && (bVarArr = pg0Var3.J) != null) {
                    qh.b bVar = bVarArr[3];
                    float width = ((bVar.getWidth() / 2.0f) + (pg0Var3.f44131b.getWidth() - ((bVar.getX() + pg0Var3.E.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    fi.v3 v3Var = new fi.v3(pg0Var3.getParentActivity(), 3);
                    pg0Var3.O = v3Var;
                    v3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-pg0Var3.K));
                    pg0Var3.O.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    pg0Var3.O.p(false);
                    pg0Var3.O.i(true);
                    pg0Var3.O.s(LocaleController.getString(R.string.SwitchAccountHint));
                    pg0Var3.O.l(1.0f, (-width) + 7.33f);
                    pg0Var3.f44131b.addView(pg0Var3.O, org.telegram.ui.Components.gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.v3 v3Var2 = pg0Var3.O;
                    v3Var2.f11798l0 = new lg0(pg0Var3, 3);
                    v3Var2.d = 8000L;
                    v3Var2.u();
                    org.telegram.ui.Components.u40.f33242r.b();
                    return;
                }
                return;
            case 3:
                AndroidUtilities.removeFromParent(this.f41268b.O);
                return;
            default:
                pg0.Z(this.f41268b);
                return;
        }
    }
}
