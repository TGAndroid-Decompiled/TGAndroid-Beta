package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class g41 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final h41 f33853a;

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f33853a.c0(r31Var, view));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f33853a.b0((r31) obj, (View) obj2);
    }
}
