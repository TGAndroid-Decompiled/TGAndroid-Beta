package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.s21;
import org.telegram.ui.su0;
public final class c1 extends Property {
    public final int f22199a;

    public c1(Class cls, String str, int i10) {
        super(cls, str);
        this.f22199a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22199a) {
            case 0:
                return Float.valueOf(((t1) obj).Ae);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((fl0) obj).v);
            case 3:
                return Float.valueOf(((s21) obj).h);
            default:
                return Float.valueOf(((su0) obj).f41804a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f22199a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((fl0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                s21 s21Var = (s21) obj;
                s21Var.h = ((Float) obj2).floatValue();
                s21Var.invalidate();
                return;
            default:
                ((su0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
