package org.telegram.ui.Components;

import android.util.Property;
public abstract class l6 extends Property {
    public final int f30383a;

    public l6(String str, int i9) {
        super(Float.class, str);
        this.f30383a = i9;
        switch (i9) {
            case 1:
                super(Integer.class, str);
                return;
            default:
                return;
        }
    }

    public abstract void a(int i9, Object obj);

    public abstract void b(Object obj, float f10);

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f30383a) {
            case 0:
                b(obj, ((Float) obj2).floatValue());
                return;
            default:
                a(((Integer) obj2).intValue(), obj);
                return;
        }
    }
}
