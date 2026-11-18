package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class wi implements org.telegram.messenger.v10, org.telegram.messenger.w10 {
    public final cj f41719a;

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        this.f41719a.R(l41Var, view);
        return Boolean.TRUE;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f41719a.R((l41) obj, (View) obj2);
    }
}
