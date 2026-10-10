package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class j8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.tl0 {
    public final j9 f38900a;

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return this.f38900a.onInsetsInternal(view, k1Var);
    }

    @Override
    public void a() {
        this.f38900a.f0();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        j9.X(this.f38900a, (org.telegram.ui.Components.q61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.q61) obj).G;
        if (obj6 instanceof f9) {
            this.f38900a.e0(((f9) obj6).f37532c, (e9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
