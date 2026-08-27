package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;

public final class k8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.ek0 {

    public final j9 f39647a;

    public k8(j9 j9Var) {
        this.f39647a = j9Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return this.f39647a.onInsetsInternal(view, m1Var);
    }

    @Override
    public void b() {
        this.f39647a.f0();
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        j9.X(this.f39647a, (org.telegram.ui.Components.n41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.n41) obj).G;
        if (obj6 instanceof f9) {
            this.f39647a.e0(((f9) obj6).f38009c, (e9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
