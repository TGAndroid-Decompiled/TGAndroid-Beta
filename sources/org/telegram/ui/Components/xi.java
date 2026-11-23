package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class xi implements org.telegram.messenger.u10, org.telegram.messenger.v10 {
    public final dj f42006a;

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        this.f42006a.R(n41Var, view);
        return Boolean.TRUE;
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f42006a.R((n41) obj, (View) obj2);
    }
}
