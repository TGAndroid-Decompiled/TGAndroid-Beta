package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class o71 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final x71 f39794a;

    public o71(x71 x71Var) {
        this.f39794a = x71Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        x71 x71Var = this.f39794a;
        x71Var.S = i10;
        x71Var.f43127c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f12284b, 0, x71Var.S + x71Var.T);
        return r0.k1.f44837b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(x71.U(this.f39794a, (org.telegram.ui.Components.h61) obj, (View) obj2));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x71.f0(this.f39794a, (org.telegram.ui.Components.h61) obj);
    }
}
