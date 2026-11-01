package org.telegram.ui;

import android.util.FloatProperty;
public final class np0 extends FloatProperty {
    public np0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((ls0) obj).f39366a);
    }

    public final void setValue(Object obj, float f7) {
        ((ls0) obj).b(f7);
    }
}
