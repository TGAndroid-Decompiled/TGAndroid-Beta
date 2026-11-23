package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.dr0;
public final class h1 extends Property {
    public final int f30688a;

    public h1(Class cls, String str, int i7) {
        super(cls, str);
        this.f30688a = i7;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30688a) {
            case 0:
                return Float.valueOf(((r1) obj).f31465kd);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((xi0) obj).f42096w);
            case 3:
                return Float.valueOf(((i01) obj).h);
            default:
                return Float.valueOf(((dr0) obj).f46996a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f30688a) {
            case 0:
                ((r1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((xi0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                i01 i01Var = (i01) obj;
                i01Var.h = ((Float) obj2).floatValue();
                i01Var.invalidate();
                return;
            default:
                ((dr0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
