package org.telegram.ui.Components;

import android.util.Property;
public abstract class k6 extends Property {
    public final int f35186a;

    public k6(String str, int i7) {
        super(Float.class, str);
        this.f35186a = i7;
        switch (i7) {
            case 1:
                super(Integer.class, str);
                return;
            default:
                return;
        }
    }

    public void a(Object obj, Float f10) {
        c(obj, f10.floatValue());
    }

    public abstract void b(int i7, Object obj);

    public abstract void c(Object obj, float f10);

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f35186a) {
            case 0:
                c(obj, ((Float) obj2).floatValue());
                return;
            default:
                b(((Integer) obj2).intValue(), obj);
                return;
        }
    }
}
