package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class r51 implements org.telegram.messenger.p20, org.telegram.messenger.q20 {
    public final s51 f29895a;

    @Override
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.valueOf(this.f29895a.c0(b51Var, view));
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        this.f29895a.b0((b51) obj, (View) obj2);
    }
}
