package org.telegram.ui;

import android.util.FloatProperty;
public final class go0 extends FloatProperty {
    public go0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((cr0) obj).f46855a);
    }

    public final void setValue(Object obj, float f10) {
        ((cr0) obj).b(f10);
    }
}
