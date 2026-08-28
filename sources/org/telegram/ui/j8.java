package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class j8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.ck0 {
    public final i9 f39396a;

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        return this.f39396a.onInsetsInternal(view, m1Var);
    }

    @Override
    public void b() {
        this.f39396a.e0();
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        i9.W(this.f39396a, (org.telegram.ui.Components.l41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.l41) obj).G;
        if (obj6 instanceof e9) {
            this.f39396a.d0(((e9) obj6).f37858c, (d9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
