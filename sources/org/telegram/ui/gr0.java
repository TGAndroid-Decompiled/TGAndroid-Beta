package org.telegram.ui;

import android.util.FloatProperty;

public final class gr0 extends FloatProperty {
    public gr0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((ju0) obj).f39502a);
    }

    @Override
    public final void setValue(Object obj, float f10) {
        ((ju0) obj).b(f10);
    }
}
