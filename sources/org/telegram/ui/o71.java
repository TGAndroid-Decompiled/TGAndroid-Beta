package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class o71 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {

    public final x71 f41026a;

    public o71(x71 x71Var) {
        this.f41026a = x71Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.d;
        x71 x71Var = this.f41026a;
        x71Var.O = i10;
        x71Var.f44306c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10490b, 0, x71Var.O + x71Var.P);
        return r0.m1.f46618b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(x71.U(this.f41026a, (org.telegram.ui.Components.n41) obj, (View) obj2));
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x71.e0(this.f41026a, (org.telegram.ui.Components.n41) obj);
    }
}
