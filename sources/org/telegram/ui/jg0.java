package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jg0 implements Runnable {
    public final int f38136a;
    public final og0 f38137b;

    public jg0(og0 og0Var, int i10) {
        this.f38136a = i10;
        this.f38137b = og0Var;
    }

    @Override
    public final void run() {
        ph.b[] bVarArr;
        switch (this.f38136a) {
            case 0:
                og0.b0(this.f38137b);
                return;
            case 1:
                og0 og0Var = this.f38137b;
                og0Var.getClass();
                m9.m0(og0Var);
                return;
            case 2:
                og0.c0(this.f38137b);
                return;
            case 3:
                og0.a0(this.f38137b);
                return;
            case 4:
                AndroidUtilities.removeFromParent(this.f38137b.P);
                return;
            case 5:
                og0 og0Var2 = this.f38137b;
                og0Var2.getClass();
                new oj0(og0Var2.getParentActivity(), og0Var2).show();
                return;
            case 6:
                og0 og0Var3 = this.f38137b;
                og0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                og0Var3.presentFragment(new m9(bundle));
                return;
            default:
                og0 og0Var4 = this.f38137b;
                if (og0Var4.getParentActivity() != null && (bVarArr = og0Var4.K) != null) {
                    ph.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (og0Var4.f40395b.getWidth() - ((bVar.getX() + og0Var4.F.getX()) + bVar.getWidth()))) / AndroidUtilities.density;
                    ei.x3 x3Var = new ei.x3(og0Var4.getParentActivity(), 3);
                    og0Var4.P = x3Var;
                    x3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-og0Var4.L));
                    og0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    og0Var4.P.p(false);
                    og0Var4.P.i(true);
                    og0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    og0Var4.P.l(1.0f, (-width) + 7.33f);
                    og0Var4.f40395b.addView(og0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ei.x3 x3Var2 = og0Var4.P;
                    x3Var2.f10081l0 = new jg0(og0Var4, 4);
                    x3Var2.d = 8000L;
                    x3Var2.u();
                    org.telegram.ui.Components.s40.f30186r.b();
                    return;
                }
                return;
        }
    }
}
