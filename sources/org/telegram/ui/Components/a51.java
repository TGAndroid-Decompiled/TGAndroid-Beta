package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class a51 implements org.telegram.messenger.v10, org.telegram.messenger.w10 {
    public final b51 f33250a;

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f33250a.c0(l41Var, view));
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f33250a.b0((l41) obj, (View) obj2);
    }
}
