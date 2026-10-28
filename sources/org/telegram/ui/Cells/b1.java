package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.zu0;
public final class b1 extends Property {
    public final int f23895a;

    public b1(Class cls, String str, int i10) {
        super(cls, str);
        this.f23895a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f23895a) {
            case 0:
                return Float.valueOf(((s1) obj).Be);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((gl0) obj).v);
            case 3:
                return Float.valueOf(((c31) obj).h);
            default:
                return Float.valueOf(((zu0) obj).f46365a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f23895a) {
            case 0:
                ((s1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((gl0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                c31 c31Var = (c31) obj;
                c31Var.h = ((Float) obj2).floatValue();
                c31Var.invalidate();
                return;
            default:
                ((zu0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
