package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class f81 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final o81 f34187a;

    public f81(o81 o81Var) {
        this.f34187a = o81Var;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.d;
        o81 o81Var = this.f34187a;
        o81Var.P = i10;
        o81Var.f36816c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f7214b, 0, o81Var.P + o81Var.Q);
        return r0.m1.f43129b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(o81.U(this.f34187a, (org.telegram.ui.Components.i51) obj, (View) obj2));
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o81.e0(this.f34187a, (org.telegram.ui.Components.i51) obj);
    }
}
