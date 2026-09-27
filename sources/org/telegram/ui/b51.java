package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b51 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f32242a;
    public final e51 f32243b;

    public b51(e51 e51Var, int i10) {
        this.f32242a = i10;
        this.f32243b = e51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        e51 e51Var = this.f32243b;
        e51Var.e = defaultWindowInsets;
        e51Var.f33140c.setPadding(defaultWindowInsets.f10579a, defaultWindowInsets.f10580b, defaultWindowInsets.f10581c, defaultWindowInsets.d);
        e51Var.f33138b.requestLayout();
        return r0.l1.f42184b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f32242a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f32243b.f33141c0;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    return;
                }
                return;
            default:
                e51 e51Var = this.f32243b;
                org.telegram.ui.ActionBar.c2 c2Var3 = e51Var.f33141c0;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    e51Var.f33141c0 = null;
                }
                e51Var.dismiss();
                return;
        }
    }
}
