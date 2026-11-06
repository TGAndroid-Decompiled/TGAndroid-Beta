package org.telegram.ui.Components;

import android.view.View;
import java.io.Serializable;
public final class hi implements org.telegram.messenger.a20, org.telegram.messenger.b20 {
    public final ni f34352a;

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        this.f34352a.Q(r31Var, view);
        return Boolean.TRUE;
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        this.f34352a.Q((r31) obj, (View) obj2);
    }
}
