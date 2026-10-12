package org.telegram.ui;

import android.util.FloatProperty;
public final class js0 extends FloatProperty {
    public js0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((nv0) obj).f40487a);
    }

    public final void setValue(Object obj, float f7) {
        ((nv0) obj).b(f7);
    }
}
