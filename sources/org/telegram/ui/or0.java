package org.telegram.ui;

import android.util.FloatProperty;
public final class or0 extends FloatProperty {
    public or0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((su0) obj).f41369a);
    }

    @Override
    public final void setValue(Object obj, float f10) {
        ((su0) obj).b(f10);
    }
}
