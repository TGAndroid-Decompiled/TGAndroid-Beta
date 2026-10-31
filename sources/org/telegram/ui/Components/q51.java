package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class q51 implements org.telegram.messenger.o20, org.telegram.messenger.p20 {
    public final r51 f29537a;

    @Override
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(this.f29537a.b0(a51Var, view));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        this.f29537a.a0((a51) obj, (View) obj2);
    }
}
