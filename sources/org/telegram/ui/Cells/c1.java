package org.telegram.ui.Cells;

import android.util.Property;
import android.view.View;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.mv0;
public final class c1 extends Property {
    public final int f19861a;

    public c1(Class cls, String str, int i10) {
        super(cls, str);
        this.f19861a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f19861a) {
            case 0:
                return Float.valueOf(((t1) obj).Ae);
            case 1:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 2:
                return Float.valueOf(((gk0) obj).v);
            default:
                return Float.valueOf(((mv0) obj).f35895a);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f19861a) {
            case 0:
                ((t1) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 1:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 2:
                ((gk0) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                ((mv0) obj).b(((Float) obj2).floatValue());
                return;
        }
    }
}
