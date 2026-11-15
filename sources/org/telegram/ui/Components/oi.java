package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class oi implements org.telegram.messenger.x10, org.telegram.messenger.y10 {
    public final vi f37957a;

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        this.f37957a.R(b41Var, view);
        return Boolean.TRUE;
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f37957a.R((b41) obj, (View) obj2);
    }
}
