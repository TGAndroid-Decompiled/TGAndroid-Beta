package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class b31 implements org.telegram.messenger.x10, org.telegram.messenger.y10, r0.m {
    public final k31 f45576a;

    public b31(k31 k31Var) {
        this.f45576a = k31Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        k31 k31Var = this.f45576a;
        k31Var.f48567d0 = i7;
        int i10 = I0.f15575b;
        if (k31Var.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = k31Var.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                k31Var.Q.setLayoutParams(layoutParams);
            }
        }
        ri.a.e(k31Var.f48565c, i10, i7, org.telegram.messenger.g0.L(12.0f), k31Var.f48569e0);
        return r0.k1.f55681b;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(k31.Z(this.f45576a, b41Var, view));
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        k31.h0(this.f45576a, (org.telegram.ui.Components.b41) obj);
    }
}
