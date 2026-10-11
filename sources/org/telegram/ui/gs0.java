package org.telegram.ui;

import android.util.FloatProperty;
public final class gs0 extends FloatProperty {
    public gs0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((kv0) obj).f39427a);
    }

    public final void setValue(Object obj, float f7) {
        ((kv0) obj).b(f7);
    }
}
