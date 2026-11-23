package org.telegram.ui;

import android.util.FloatProperty;
public final class ho0 extends FloatProperty {
    public ho0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((dr0) obj).f46996a);
    }

    public final void setValue(Object obj, float f10) {
        ((dr0) obj).b(f10);
    }
}
