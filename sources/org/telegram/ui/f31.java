package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class f31 implements org.telegram.messenger.v10, org.telegram.messenger.w10, r0.m {
    public final o31 f47396a;

    public f31(o31 o31Var) {
        this.f47396a = o31Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.d;
        o31 o31Var = this.f47396a;
        o31Var.f50432d0 = i7;
        int i10 = I0.f15890b;
        if (o31Var.Q != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = o31Var.Q.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                o31Var.Q.setLayoutParams(layoutParams);
            }
        }
        ri.a.e(o31Var.f50430c, i10, i7, org.telegram.messenger.g0.L(12.0f), o31Var.f50434e0);
        return r0.l1.f56257b;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(o31.Z(this.f47396a, l41Var, view));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        o31.h0(this.f47396a, (org.telegram.ui.Components.l41) obj);
    }
}
