package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class m41 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final n41 f35887a;

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f35887a.c0(x31Var, view));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f35887a.b0((x31) obj, (View) obj2);
    }
}
