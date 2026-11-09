package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class n41 implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final o41 f36249a;

    @Override
    public Boolean a(y31 y31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.valueOf(this.f36249a.c0(y31Var, view));
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f36249a.b0((y31) obj, (View) obj2);
    }
}
