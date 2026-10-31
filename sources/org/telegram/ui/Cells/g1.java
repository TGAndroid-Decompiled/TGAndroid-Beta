package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.ms0;
public final class g1 extends Property {
    public final int f21909a;

    public g1(Class cls, String str, int i10) {
        super(cls, str);
        this.f21909a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f21909a) {
            case 0:
                return Float.valueOf(((q1) obj).Uc);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((mj0) obj).f28536w);
            case 3:
                return Float.valueOf(((b11) obj).h);
            default:
                return Float.valueOf(((ms0) obj).f39756a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f21909a) {
            case 0:
                ((q1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((mj0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            case 3:
                b11 b11Var = (b11) obj;
                b11Var.h = ((Float) obj2).floatValue();
                b11Var.invalidate();
                return;
            default:
                ((ms0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
