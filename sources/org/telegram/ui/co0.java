package org.telegram.ui;

import android.util.FloatProperty;
public final class co0 extends FloatProperty {
    public co0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((br0) obj).f44450a);
    }

    public final void setValue(Object obj, float f10) {
        ((br0) obj).b(f10);
    }
}
