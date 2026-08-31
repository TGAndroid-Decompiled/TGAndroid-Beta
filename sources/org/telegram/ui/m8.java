package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class m8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.zk0 {
    public final l9 f38993a;

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        return this.f38993a.onInsetsInternal(view, m1Var);
    }

    @Override
    public void d() {
        this.f38993a.f0();
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l9.X(this.f38993a, (org.telegram.ui.Components.j51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.j51) obj).G;
        if (obj6 instanceof h9) {
            this.f38993a.e0(((h9) obj6).f37370c, (g9) view);
            z4 = true;
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
