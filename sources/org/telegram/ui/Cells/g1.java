package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.er0;
public final class g1 extends Property {
    public final int f29144a;

    public g1(Class cls, String str, int i7) {
        super(cls, str);
        this.f29144a = i7;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f29144a) {
            case 0:
                return Float.valueOf(((q1) obj).Wc);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((ji0) obj).f35065w);
            case 3:
                return Float.valueOf(((yz0) obj).h);
            default:
                return Float.valueOf(((er0) obj).f45492a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f29144a) {
            case 0:
                ((q1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((ji0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                yz0 yz0Var = (yz0) obj;
                yz0Var.h = ((Float) obj2).floatValue();
                yz0Var.invalidate();
                return;
            default:
                ((er0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
