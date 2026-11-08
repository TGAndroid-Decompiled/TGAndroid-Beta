package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
public final class c31 implements org.telegram.messenger.a20, org.telegram.messenger.b20, r0.m {
    public final m31 f44536a;

    public c31(m31 m31Var) {
        this.f44536a = m31Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        m31 m31Var = this.f44536a;
        m31Var.f47643c0 = i7;
        int i10 = I0.f15121b;
        if (m31Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            ViewGroup.LayoutParams layoutParams = m31Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                m31Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.e(m31Var.f47642c, i10, i7, org.telegram.messenger.g0.L(12.0f), m31Var.f47644d0);
        return r0.k1.f54201b;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(m31.Z(this.f44536a, x31Var, view));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        m31.h0(this.f44536a, (org.telegram.ui.Components.x31) obj);
    }
}
