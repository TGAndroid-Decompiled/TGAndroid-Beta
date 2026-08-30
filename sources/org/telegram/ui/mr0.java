package org.telegram.ui;

import android.util.FloatProperty;
public final class mr0 extends FloatProperty {
    public mr0() {
        super("progress");
    }

    @Override
    public final Float get(Object obj) {
        return Float.valueOf(((qu0) obj).f37844a);
    }

    @Override
    public final void setValue(Object obj, float f10) {
        ((qu0) obj).b(f10);
    }
}
