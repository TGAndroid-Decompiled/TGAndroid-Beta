package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final x81 f35453a;

    public n81(x81 x81Var) {
        this.f35453a = x81Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        x81 x81Var = this.f35453a;
        x81Var.S = i10;
        x81Var.f39210c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10577b, 0, x81Var.S + x81Var.T);
        return r0.l1.f41806b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(x81.U(this.f35453a, (org.telegram.ui.Components.h51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x81.f0(this.f35453a, (org.telegram.ui.Components.h51) obj);
    }
}
