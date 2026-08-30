package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m41 implements r0.o, org.telegram.ui.ActionBar.c2 {
    public final int f36185a;
    public final p41 f36186b;

    public m41(p41 p41Var, int i10) {
        this.f36185a = i10;
        this.f36186b = p41Var;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        p41 p41Var = this.f36186b;
        p41Var.e = defaultWindowInsets;
        p41Var.f37175c.setPadding(defaultWindowInsets.f7213a, defaultWindowInsets.f7214b, defaultWindowInsets.f7215c, defaultWindowInsets.d);
        p41Var.f37173b.requestLayout();
        return r0.m1.f43129b;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36185a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f36186b.Z;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    return;
                }
                return;
            default:
                p41 p41Var = this.f36186b;
                org.telegram.ui.ActionBar.d2 d2Var3 = p41Var.Z;
                if (d2Var3 != null) {
                    d2Var3.dismiss();
                    p41Var.Z = null;
                }
                p41Var.dismiss();
                return;
        }
    }
}
