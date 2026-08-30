package org.telegram.ui.Components;

import android.util.Property;
public abstract class m6 extends Property {
    public final int f26950a;

    public m6(String str, int i10) {
        super(Float.class, str);
        this.f26950a = i10;
        switch (i10) {
            case 1:
                super(Integer.class, str);
                return;
            default:
                return;
        }
    }

    public abstract void a(int i10, Object obj);

    public abstract void b(Object obj, float f10);

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f26950a) {
            case 0:
                b(obj, ((Float) obj2).floatValue());
                return;
            default:
                a(((Integer) obj2).intValue(), obj);
                return;
        }
    }
}
