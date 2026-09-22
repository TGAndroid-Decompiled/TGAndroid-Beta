package org.telegram.ui;

import android.util.FloatProperty;
public final class hs0 extends FloatProperty {
    public hs0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((kv0) obj).f35264a);
    }

    @Override
    public final void setValue(Object obj, float f7) {
        ((kv0) obj).b(f7);
    }
}
