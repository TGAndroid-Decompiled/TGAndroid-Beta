package org.telegram.ui;

import android.util.FloatProperty;
public final class do0 extends FloatProperty {
    public do0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((cr0) obj).f44878a);
    }

    public final void setValue(Object obj, float f10) {
        ((cr0) obj).b(f10);
    }
}
