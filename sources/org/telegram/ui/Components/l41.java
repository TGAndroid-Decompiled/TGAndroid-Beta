package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class l41 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final m41 f35529a;

    @Override
    public Boolean a(w31 w31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f35529a.c0(w31Var, view));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f35529a.b0((w31) obj, (View) obj2);
    }
}
