package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class o8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.xk0 {
    public final n9 f36682a;

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return this.f36682a.onInsetsInternal(view, m1Var);
    }

    @Override
    public void e() {
        this.f36682a.f0();
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n9.X(this.f36682a, (org.telegram.ui.Components.i51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.i51) obj).G;
        if (obj6 instanceof j9) {
            this.f36682a.e0(((j9) obj6).f35123c, (i9) view);
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
