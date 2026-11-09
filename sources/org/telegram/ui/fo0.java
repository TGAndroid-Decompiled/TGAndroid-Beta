package org.telegram.ui;

import android.util.FloatProperty;
public final class fo0 extends FloatProperty {
    public fo0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((er0) obj).f45492a);
    }

    public final void setValue(Object obj, float f10) {
        ((er0) obj).b(f10);
    }
}
