package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bh0 implements Runnable {
    public final int f32379a;
    public final fh0 f32380b;

    public bh0(fh0 fh0Var, int i10) {
        this.f32379a = i10;
        this.f32380b = fh0Var;
    }

    @Override
    public final void run() {
        oh.b[] bVarArr;
        switch (this.f32379a) {
            case 0:
                fh0.a0(this.f32380b);
                return;
            case 1:
                fh0 fh0Var = this.f32380b;
                fh0Var.getClass();
                l9.m0(fh0Var);
                return;
            case 2:
                fh0.c0(this.f32380b);
                return;
            case 3:
                fh0.Z(this.f32380b);
                return;
            case 4:
                fh0 fh0Var2 = this.f32380b;
                fh0Var2.getClass();
                new ek0(fh0Var2.getParentActivity(), fh0Var2).show();
                return;
            case 5:
                fh0 fh0Var3 = this.f32380b;
                fh0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                fh0Var3.presentFragment(new l9(bundle));
                return;
            case 6:
                fh0 fh0Var4 = this.f32380b;
                if (fh0Var4.getParentActivity() != null && (bVarArr = fh0Var4.K) != null) {
                    oh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (fh0Var4.f39827b.getWidth() - ((bVar.getX() + fh0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ci.f4 f4Var = new ci.f4(fh0Var4.getParentActivity(), 3);
                    fh0Var4.P = f4Var;
                    f4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-fh0Var4.L));
                    fh0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    fh0Var4.P.p(false);
                    fh0Var4.P.i();
                    fh0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    fh0Var4.P.l(1.0f, (-width) + 7.33f);
                    fh0Var4.f39827b.addView(fh0Var4.P, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.f4 f4Var2 = fh0Var4.P;
                    f4Var2.f4638l0 = new bh0(fh0Var4, 7);
                    f4Var2.d = 8000L;
                    f4Var2.u();
                    org.telegram.ui.Components.j40.f25164r.b();
                    return;
                }
                return;
            default:
                AndroidUtilities.removeFromParent(this.f32380b.P);
                return;
        }
    }
}
