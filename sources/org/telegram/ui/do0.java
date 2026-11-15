package org.telegram.ui;

import android.util.FloatProperty;
public final class do0 extends FloatProperty {
    public do0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((ar0) obj).f45492a);
    }

    public final void setValue(Object obj, float f10) {
        ((ar0) obj).b(f10);
    }
}
