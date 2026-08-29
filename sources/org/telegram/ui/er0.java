package org.telegram.ui;

import android.util.FloatProperty;
public final class er0 extends FloatProperty {
    public er0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((gu0) obj).f38666a);
    }

    @Override
    public final void setValue(Object obj, float f9) {
        ((gu0) obj).b(f9);
    }
}
