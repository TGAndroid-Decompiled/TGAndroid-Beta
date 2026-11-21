package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class d51 implements org.telegram.messenger.v10, org.telegram.messenger.w10 {
    public final e51 f34388a;

    @Override
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f34388a.c0(o41Var, view));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f34388a.b0((o41) obj, (View) obj2);
    }
}
