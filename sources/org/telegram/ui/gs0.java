package org.telegram.ui;

import android.util.FloatProperty;
public final class gs0 extends FloatProperty {
    public gs0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((lv0) obj).f34786a);
    }

    @Override
    public final void setValue(Object obj, float f7) {
        ((lv0) obj).b(f7);
    }
}
