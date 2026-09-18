package org.telegram.ui;

import android.util.FloatProperty;
public final class ks0 extends FloatProperty {
    public ks0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((mv0) obj).f35895a);
    }

    @Override
    public final void setValue(Object obj, float f7) {
        ((mv0) obj).b(f7);
    }
}
