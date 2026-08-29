package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class i8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.nk0 {
    public final h9 f39143a;

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return this.f39143a.onInsetsInternal(view, m1Var);
    }

    @Override
    public void a() {
        this.f39143a.f0();
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h9.X(this.f39143a, (org.telegram.ui.Components.w41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.w41) obj).G;
        if (obj6 instanceof d9) {
            this.f39143a.e0(((d9) obj6).f37412c, (c9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
