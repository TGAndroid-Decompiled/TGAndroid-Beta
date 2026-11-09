package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class e31 implements org.telegram.messenger.a20, org.telegram.messenger.b20, r0.m {
    public final n31 f45172a;

    public e31(n31 n31Var) {
        this.f45172a = n31Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        n31 n31Var = this.f45172a;
        n31Var.f48079c0 = i7;
        int i10 = I0.f15121b;
        if (n31Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = n31Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                n31Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.e(n31Var.f48078c, i10, i7, org.telegram.messenger.g0.L(12.0f), n31Var.f48080d0);
        return r0.k1.f54213b;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.y31 y31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(n31.Z(this.f45172a, y31Var, view));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        n31.h0(this.f45172a, (org.telegram.ui.Components.y31) obj);
    }
}
