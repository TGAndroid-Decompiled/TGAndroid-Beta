package org.telegram.ui;

import android.util.FloatProperty;
public final class pp0 extends FloatProperty {
    public pp0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((ms0) obj).f39756a);
    }

    public final void setValue(Object obj, float f7) {
        ((ms0) obj).b(f7);
    }
}
