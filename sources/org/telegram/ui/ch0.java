package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ch0 implements Runnable {
    public final int f32782a;
    public final gh0 f32783b;

    public ch0(gh0 gh0Var, int i10) {
        this.f32782a = i10;
        this.f32783b = gh0Var;
    }

    @Override
    public final void run() {
        oh.b[] bVarArr;
        switch (this.f32782a) {
            case 0:
                gh0.b0(this.f32783b);
                return;
            case 1:
                gh0 gh0Var = this.f32783b;
                gh0Var.getClass();
                l9.m0(gh0Var);
                return;
            case 2:
                gh0.c0(this.f32783b);
                return;
            case 3:
                gh0.a0(this.f32783b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f32783b.P);
                return;
            case 5:
                gh0 gh0Var2 = this.f32783b;
                gh0Var2.getClass();
                new fk0(gh0Var2.getParentActivity(), gh0Var2).show();
                return;
            case 6:
                gh0 gh0Var3 = this.f32783b;
                gh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                gh0Var3.presentFragment(new l9(bundle));
                return;
            default:
                gh0 gh0Var4 = this.f32783b;
                if (gh0Var4.getParentActivity() != null && (bVarArr = gh0Var4.K) != null) {
                    oh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (gh0Var4.f32122b.getWidth() - ((bVar.getX() + gh0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ci.f4 f4Var = new ci.f4(gh0Var4.getParentActivity(), 3);
                    gh0Var4.P = f4Var;
                    f4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-gh0Var4.L));
                    gh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    gh0Var4.P.p(false);
                    gh0Var4.P.i();
                    gh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    gh0Var4.P.l(1.0f, (-width) + 7.33f);
                    gh0Var4.f32122b.addView(gh0Var4.P, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.f4 f4Var2 = gh0Var4.P;
                    f4Var2.f4637l0 = new ch0(gh0Var4, 4);
                    f4Var2.d = 8000L;
                    f4Var2.u();
                    org.telegram.ui.Components.j40.f25274r.b();
                    return;
                }
                return;
        }
    }
}
