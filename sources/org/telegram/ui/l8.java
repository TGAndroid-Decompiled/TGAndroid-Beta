package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class l8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.al0 {
    public final l9 f35362a;

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.f35362a.onInsetsInternal(view, l1Var);
    }

    @Override
    public void a() {
        this.f35362a.f0();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l9.X(this.f35362a, (org.telegram.ui.Components.y51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.y51) obj).G;
        if (obj6 instanceof h9) {
            this.f35362a.e0(((h9) obj6).f34163c, (g9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
