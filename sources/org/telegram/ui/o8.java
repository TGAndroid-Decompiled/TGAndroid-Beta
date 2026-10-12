package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class o8 implements r0.o, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.ol0 {
    public final n9 f38882a;

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.f38882a.onInsetsInternal(view, l1Var);
    }

    @Override
    public void c() {
        this.f38882a.f0();
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n9.X(this.f38882a, (org.telegram.ui.Components.l61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.l61) obj).G;
        if (obj6 instanceof j9) {
            this.f38882a.e0(((j9) obj6).f37320c, (i9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
