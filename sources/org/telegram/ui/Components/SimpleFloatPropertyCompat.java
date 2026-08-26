package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.FloatPropertyCompat;

public final class SimpleFloatPropertyCompat extends FloatPropertyCompat {
    public final Getter getter;
    public float multiplier = 1.0f;
    public final Setter setter;

    public interface Getter {
        float get(Object obj);
    }

    public interface Setter {
        void set(Object obj, float f);
    }

    public SimpleFloatPropertyCompat(Getter getter, Setter setter) {
        this.getter = getter;
        this.setter = setter;
    }

    @Override
    public final float getValue(Object obj) {
        return this.getter.get(obj) * this.multiplier;
    }

    @Override
    public final void setValue(Object obj, float f) {
        this.setter.set(obj, f / this.multiplier);
    }
}
