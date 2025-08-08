package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.FloatPropertyCompat;

public class SimpleFloatPropertyCompat extends FloatPropertyCompat {
    private Getter getter;
    private float multiplier;
    private Setter setter;

    public interface Getter {
        float get(Object obj);
    }

    public interface Setter {
        void set(Object obj, float f);
    }

    public SimpleFloatPropertyCompat(String str, Getter getter, Setter setter) {
        super(str);
        this.multiplier = 1.0f;
        this.getter = getter;
        this.setter = setter;
    }

    public SimpleFloatPropertyCompat setMultiplier(float f) {
        this.multiplier = f;
        return this;
    }

    @Override
    public float getValue(Object obj) {
        return this.getter.get(obj) * this.multiplier;
    }

    @Override
    public void setValue(Object obj, float f) {
        this.setter.set(obj, f / this.multiplier);
    }
}
