package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class g81 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final p81 f37122a;

    public g81(p81 p81Var) {
        this.f37122a = p81Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.d;
        p81 p81Var = this.f37122a;
        p81Var.P = i10;
        p81Var.f39949c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f7758b, 0, p81Var.P + p81Var.Q);
        return r0.m1.f46451b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(p81.U(this.f37122a, (org.telegram.ui.Components.j51) obj, (View) obj2));
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p81.e0(this.f37122a, (org.telegram.ui.Components.j51) obj);
    }
}
