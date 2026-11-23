package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class yi implements org.telegram.messenger.w10, org.telegram.messenger.x10 {
    public final ej f42418a;

    @Override
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        this.f42418a.R(o41Var, view);
        return Boolean.TRUE;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f42418a.R((o41) obj, (View) obj2);
    }
}
