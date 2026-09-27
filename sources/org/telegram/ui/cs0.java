package org.telegram.ui;

import android.util.FloatProperty;
public final class cs0 extends FloatProperty {
    public cs0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((fv0) obj).f33637a);
    }

    @Override
    public final void setValue(Object obj, float f7) {
        ((fv0) obj).b(f7);
    }
}
