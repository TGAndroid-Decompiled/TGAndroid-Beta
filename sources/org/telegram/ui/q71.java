package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class q71 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final z71 f41711a;

    public q71(z71 z71Var) {
        this.f41711a = z71Var;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i9 = defaultWindowInsets.d;
        z71 z71Var = this.f41711a;
        z71Var.O = i9;
        z71Var.f45062c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10849b, 0, z71Var.O + z71Var.P);
        return r0.m1.f46928b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(z71.T(this.f41711a, (org.telegram.ui.Components.l41) obj, (View) obj2));
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z71.d0(this.f41711a, (org.telegram.ui.Components.l41) obj);
    }
}
