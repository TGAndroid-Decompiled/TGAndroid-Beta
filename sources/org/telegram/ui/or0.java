package org.telegram.ui;

import android.util.FloatProperty;
public final class or0 extends FloatProperty {
    public or0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((qu0) obj).f40972a);
    }

    public final void setValue(Object obj, float f7) {
        ((qu0) obj).b(f7);
    }
}
