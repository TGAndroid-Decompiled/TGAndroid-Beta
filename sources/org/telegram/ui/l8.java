package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class l8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.yk0 {
    public final l9 f35277a;

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        return this.f35277a.onInsetsInternal(view, m1Var);
    }

    @Override
    public void a() {
        this.f35277a.f0();
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l9.X(this.f35277a, (org.telegram.ui.Components.x51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.x51) obj).G;
        if (obj6 instanceof h9) {
            this.f35277a.e0(((h9) obj6).f34106c, (g9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
