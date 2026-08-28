package org.telegram.ui;

import android.util.FloatProperty;
public final class er0 extends FloatProperty {
    public er0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((iu0) obj).f39285a);
    }

    @Override
    public final void setValue(Object obj, float f10) {
        ((iu0) obj).b(f10);
    }
}
