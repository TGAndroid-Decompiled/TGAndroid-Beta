package org.telegram.ui;

import android.util.FloatProperty;
public final class ns0 extends FloatProperty {
    public ns0() {
        super("progress");
    }

    @Override
    public final Object get(Object obj) {
        return Float.valueOf(((qv0) obj).f39224a);
    }

    public final void setValue(Object obj, float f7) {
        ((qv0) obj).b(f7);
    }
}
