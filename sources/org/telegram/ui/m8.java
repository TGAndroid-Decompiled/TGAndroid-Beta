package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class m8 implements li.h, r0.n, li.i, Utilities.Callback5, Utilities.Callback5Return {
    public final n9 f35547a;

    public m8(n9 n9Var) {
        this.f35547a = n9Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.f35547a.onInsetsInternal(view, l1Var);
    }

    @Override
    public int g() {
        n9 n9Var = this.f35547a;
        n9Var.getClass();
        return n9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7);
    }

    @Override
    public void j(int i10) {
        n9.V(this.f35547a, i10);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n9.Y(this.f35547a, (org.telegram.ui.Components.x51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.x51) obj).G;
        if (obj6 instanceof j9) {
            this.f35547a.h0(((j9) obj6).f34671c, (i9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
