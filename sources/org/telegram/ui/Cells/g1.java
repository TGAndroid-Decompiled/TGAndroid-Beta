package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.ls0;
public final class g1 extends Property {
    public final int f21910a;

    public g1(Class cls, String str, int i10) {
        super(cls, str);
        this.f21910a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21910a) {
            case 0:
                return Float.valueOf(((q1) obj).Uc);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((nj0) obj).f28897w);
            case 3:
                return Float.valueOf(((c11) obj).h);
            default:
                return Float.valueOf(((ls0) obj).f39366a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f21910a) {
            case 0:
                ((q1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((nj0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                c11 c11Var = (c11) obj;
                c11Var.h = ((Float) obj2).floatValue();
                c11Var.invalidate();
                return;
            default:
                ((ls0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
