package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jg0 implements Runnable {
    public final int f39498a;
    public final ng0 f39499b;

    public jg0(ng0 ng0Var, int i9) {
        this.f39498a = i9;
        this.f39499b = ng0Var;
    }

    @Override
    public final void run() {
        wg.b[] bVarArr;
        switch (this.f39498a) {
            case 0:
                ng0.a0(this.f39499b);
                return;
            case 1:
                ng0 ng0Var = this.f39499b;
                ng0Var.getClass();
                i9.l0(ng0Var);
                return;
            case 2:
                ng0.b0(this.f39499b);
                return;
            case 3:
                ng0.Z(this.f39499b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f39499b.M);
                return;
            case 5:
                ng0 ng0Var2 = this.f39499b;
                ng0Var2.getClass();
                new nj0(ng0Var2.getParentActivity(), ng0Var2).show();
                return;
            case 6:
                ng0 ng0Var3 = this.f39499b;
                ng0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ng0Var3.presentFragment(new i9(bundle));
                return;
            default:
                ng0 ng0Var4 = this.f39499b;
                if (ng0Var4.getParentActivity() != null && (bVarArr = ng0Var4.G) != null) {
                    wg.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (ng0Var4.f42998b.getWidth() - ((bVar.getX() + ng0Var4.B.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    kh.x3 x3Var = new kh.x3(ng0Var4.getParentActivity(), 3);
                    ng0Var4.M = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-ng0Var4.H));
                    ng0Var4.M.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ng0Var4.M.q(false);
                    ng0Var4.M.i();
                    ng0Var4.M.t(LocaleController.getString(R.string.SwitchAccountHint));
                    ng0Var4.M.m(1.0f, (-width) + 7.33f);
                    ng0Var4.f42998b.addView(ng0Var4.M, g7.e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    kh.x3 x3Var2 = ng0Var4.M;
                    x3Var2.f16352h0 = new jg0(ng0Var4, 4);
                    x3Var2.d = 8000L;
                    x3Var2.v();
                    org.telegram.ui.Components.t30.f32611r.b();
                    return;
                }
                return;
        }
    }
}
