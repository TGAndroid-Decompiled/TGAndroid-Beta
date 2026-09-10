package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class k8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.xk0 {
    public final k9 f34257a;

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.f34257a.onInsetsInternal(view, l1Var);
    }

    @Override
    public void a() {
        this.f34257a.f0();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        k9.X(this.f34257a, (org.telegram.ui.Components.v51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.v51) obj).G;
        if (obj6 instanceof g9) {
            this.f34257a.e0(((g9) obj6).f33046c, (f9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
