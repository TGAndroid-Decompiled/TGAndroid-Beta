package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class c51 implements org.telegram.messenger.u10, org.telegram.messenger.v10 {
    public final d51 f33928a;

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f33928a.c0(n41Var, view));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f33928a.b0((n41) obj, (View) obj2);
    }
}
