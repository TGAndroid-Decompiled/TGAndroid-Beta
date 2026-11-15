package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class q41 implements org.telegram.messenger.x10, org.telegram.messenger.y10 {
    public final r41 f38519a;

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f38519a.c0(b41Var, view));
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f38519a.b0((b41) obj, (View) obj2);
    }
}
