package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.t21;
import org.telegram.ui.tu0;
public final class c1 extends Property {
    public final int f22198a;

    public c1(Class cls, String str, int i10) {
        super(cls, str);
        this.f22198a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f22198a) {
            case 0:
                return Float.valueOf(((t1) obj).Ae);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((gl0) obj).v);
            case 3:
                return Float.valueOf(((t21) obj).h);
            default:
                return Float.valueOf(((tu0) obj).f42076a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f22198a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((gl0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                t21 t21Var = (t21) obj;
                t21Var.h = ((Float) obj2).floatValue();
                t21Var.invalidate();
                return;
            default:
                ((tu0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
