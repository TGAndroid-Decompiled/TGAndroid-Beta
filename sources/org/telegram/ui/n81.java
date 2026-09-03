package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class n81 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final w81 f36409a;

    public n81(w81 w81Var) {
        this.f36409a = w81Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.d;
        w81 w81Var = this.f36409a;
        w81Var.P = i10;
        w81Var.f39311c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f7197b, 0, w81Var.P + w81Var.Q);
        return r0.m1.f43153b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(w81.U(this.f36409a, (org.telegram.ui.Components.i51) obj, (View) obj2));
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w81.e0(this.f36409a, (org.telegram.ui.Components.i51) obj);
    }
}
