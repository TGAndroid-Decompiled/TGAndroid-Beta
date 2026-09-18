package org.telegram.ui.Components;

import android.util.Property;
public abstract class r6 extends Property {
    public final int f27836a;

    public r6(String str, int i10) {
        super(Float.class, str);
        this.f27836a = i10;
        switch (i10) {
            case 1:
                super(Integer.class, str);
                return;
            default:
                return;
        }
    }

    public void a(Object obj, Float f7) {
        c(obj, f7.floatValue());
    }

    public abstract void b(int i10, Object obj);

    public abstract void c(Object obj, float f7);

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f27836a) {
            case 0:
                c(obj, ((Float) obj2).floatValue());
                return;
            default:
                b(((Integer) obj2).intValue(), obj);
                return;
        }
    }
}
