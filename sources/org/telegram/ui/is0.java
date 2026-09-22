package org.telegram.ui;

import android.util.FloatProperty;
public final class is0 extends FloatProperty {
    public is0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((kv0) obj).f35265a);
    }

    @Override
    public final void setValue(Object obj, float f7) {
        ((kv0) obj).b(f7);
    }
}
