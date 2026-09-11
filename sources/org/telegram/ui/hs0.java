package org.telegram.ui;

import android.util.FloatProperty;
public final class hs0 extends FloatProperty {
    public hs0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((jv0) obj).f37846a);
    }

    @Override
    public final void setValue(Object obj, float f7) {
        ((jv0) obj).b(f7);
    }
}
