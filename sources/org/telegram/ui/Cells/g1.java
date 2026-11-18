package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.cr0;
public final class g1 extends Property {
    public final int f30642a;

    public g1(Class cls, String str, int i7) {
        super(cls, str);
        this.f30642a = i7;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30642a) {
            case 0:
                return Float.valueOf(((q1) obj).f31418kd);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((vi0) obj).f40678w);
            case 3:
                return Float.valueOf(((g01) obj).h);
            default:
                return Float.valueOf(((cr0) obj).f46619a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f30642a) {
            case 0:
                ((q1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((vi0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                g01 g01Var = (g01) obj;
                g01Var.h = ((Float) obj2).floatValue();
                g01Var.invalidate();
                return;
            default:
                ((cr0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
