package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class i8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.ul0 {
    public final i9 f38602a;

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return this.f38602a.onInsetsInternal(view, k1Var);
    }

    @Override
    public void a() {
        this.f38602a.f0();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        i9.X(this.f38602a, (org.telegram.ui.Components.r61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.r61) obj).G;
        if (obj6 instanceof e9) {
            this.f38602a.e0(((e9) obj6).f37241c, (d9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
