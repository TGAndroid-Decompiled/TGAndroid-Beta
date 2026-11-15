package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.ar0;
public final class g1 extends Property {
    public final int f30313a;

    public g1(Class cls, String str, int i7) {
        super(cls, str);
        this.f30313a = i7;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f30313a) {
            case 0:
                return Float.valueOf(((q1) obj).f31046kd);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((mi0) obj).f37296w);
            case 3:
                return Float.valueOf(((zz0) obj).h);
            default:
                return Float.valueOf(((ar0) obj).f45492a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f30313a) {
            case 0:
                ((q1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((mi0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                zz0 zz0Var = (zz0) obj;
                zz0Var.h = ((Float) obj2).floatValue();
                zz0Var.invalidate();
                return;
            default:
                ((ar0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
