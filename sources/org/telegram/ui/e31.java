package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class e31 implements org.telegram.messenger.u10, org.telegram.messenger.v10, r0.m {
    public final n31 f47311a;

    public e31(n31 n31Var) {
        this.f47311a = n31Var;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.n41 n41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(n31.Z(this.f47311a, n41Var, view));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        n31.h0(this.f47311a, (org.telegram.ui.Components.n41) obj);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.d;
        n31 n31Var = this.f47311a;
        n31Var.f50194d0 = i7;
        int i10 = I0.f15979b;
        if (n31Var.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = n31Var.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                n31Var.Q.setLayoutParams(layoutParams);
            }
        }
        ri.a.e(n31Var.f50192c, i10, i7, org.telegram.messenger.g0.L(12.0f), n31Var.f50196e0);
        return r0.l1.f56380b;
    }
}
