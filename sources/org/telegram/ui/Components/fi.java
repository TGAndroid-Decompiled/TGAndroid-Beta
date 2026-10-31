package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class fi implements org.telegram.messenger.o20, org.telegram.messenger.p20 {
    public final mi f26069a;

    @Override
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        this.f26069a.P(a51Var, view);
        return Boolean.TRUE;
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        this.f26069a.P((a51) obj, (View) obj2);
    }
}
