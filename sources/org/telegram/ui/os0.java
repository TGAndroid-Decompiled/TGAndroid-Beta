package org.telegram.ui;

import android.util.FloatProperty;
public final class os0 extends FloatProperty {
    public os0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((rv0) obj).f39875a);
    }

    public final void setValue(Object obj, float f7) {
        ((rv0) obj).b(f7);
    }
}
