package org.telegram.ui;

import android.util.FloatProperty;
public final class hs0 extends FloatProperty {
    public hs0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((lv0) obj).f39730a);
    }

    public final void setValue(Object obj, float f7) {
        ((lv0) obj).b(f7);
    }
}
