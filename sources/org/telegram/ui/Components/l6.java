package org.telegram.ui.Components;

import android.util.Property;

public abstract class l6 extends Property {

    public final int f30301a;

    public l6(String str, int i10) {
        super(Float.class, str);
        this.f30301a = i10;
        switch (i10) {
            case 1:
                super(Integer.class, str);
                break;
            default:
                break;
        }
    }

    public void a(Object obj, Float f10) {
        c(obj, f10.floatValue());
    }

    public abstract void b(int i10, Object obj);

    public abstract void c(Object obj, float f10);

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f30301a) {
            case 0:
                c(obj, ((Float) obj2).floatValue());
                break;
            default:
                b(((Integer) obj2).intValue(), obj);
                break;
        }
    }
}
