package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class n8 implements r0.n, Utilities.Callback5, Utilities.Callback5Return, org.telegram.ui.Components.ol0 {
    public final m9 f39812a;

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        return this.f39812a.onInsetsInternal(view, k1Var);
    }

    @Override
    public void a() {
        this.f39812a.e0();
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m9.W(this.f39812a, (org.telegram.ui.Components.m61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.m61) obj).G;
        if (obj6 instanceof i9) {
            this.f39812a.d0(((i9) obj6).f38104c, (h9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
