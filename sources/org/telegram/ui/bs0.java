package org.telegram.ui;

import android.util.FloatProperty;
public final class bs0 extends FloatProperty {
    public bs0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((dv0) obj).f32725a);
    }

    @Override
    public final void setValue(Object obj, float f7) {
        ((dv0) obj).b(f7);
    }
}
