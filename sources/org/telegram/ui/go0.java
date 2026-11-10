package org.telegram.ui;

import android.util.FloatProperty;
public final class go0 extends FloatProperty {
    public go0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((fr0) obj).f45829a);
    }

    public final void setValue(Object obj, float f10) {
        ((fr0) obj).b(f10);
    }
}
