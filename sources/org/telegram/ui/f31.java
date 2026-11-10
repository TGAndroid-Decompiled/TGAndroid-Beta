package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class f31 implements org.telegram.messenger.a20, org.telegram.messenger.b20, r0.m {
    public final o31 f45498a;

    public f31(o31 o31Var) {
        this.f45498a = o31Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        o31 o31Var = this.f45498a;
        o31Var.f48413c0 = i7;
        int i10 = I0.f15123b;
        if (o31Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = o31Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                o31Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.e(o31Var.f48412c, i10, i7, org.telegram.messenger.g0.L(12.0f), o31Var.f48414d0);
        return r0.k1.f54212b;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(o31.Z(this.f45498a, x31Var, view));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        o31.h0(this.f45498a, (org.telegram.ui.Components.x31) obj);
    }
}
